package com.example.europe_map_app.service;

import com.example.europe_map_app.model.Country;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Service
public class TranslationService {

    @Async
    public CompletableFuture<Map<String, Country>> getTranslationsAsync(String word) {
        // Simulate async processing
        return CompletableFuture.completedFuture(getTranslations(word));
    }

    public Map<String, Country> getTranslations(String word) {
        Map<String, Country> translations = new HashMap<>();

        // Mock translations with coordinates
        translations.put("Germany", new Country("Germany", "germany-flag.png", "Hallo", 500, 300));
        translations.put("France", new Country("France", "france-flag.png", "Bonjour", 400, 350));
        // Add more countries as needed

        return translations;
    }
}
