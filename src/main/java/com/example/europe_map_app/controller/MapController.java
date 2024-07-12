package com.example.europe_map_app.controller;

import com.example.europe_map_app.model.Country;
import com.example.europe_map_app.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Controller
public class MapController {

    @Autowired
    private TranslationService translationService;

    @GetMapping("/")
    public String getMap(@RequestParam(value = "word", required = false) String word, Model model) throws ExecutionException, InterruptedException {
        if (word == null || word.trim().isEmpty()) {
            // If word is empty, return the view without fetching translations
            return "map";
        }

        CompletableFuture<Map<String, Country>> translationsFuture = translationService.getTranslationsAsync(word);
        try {
            Map<String, Country> translations = translationsFuture.get(); // Blocking call to wait for async result
            model.addAttribute("translations", translations);
        } catch (InterruptedException | ExecutionException e) {
            // Handle exception
            model.addAttribute("error", "Error fetching translations: " + e.getMessage());
        }
        return "map";
    }
}
