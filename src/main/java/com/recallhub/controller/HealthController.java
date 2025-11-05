package com.recallhub.controller;

import java.time.LocalDateTime;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "RecallHub is running!";
    }
    @GetMapping("/health-json")
    public Map<String, String> json() {
        return Map.of(
                "status", "ok",
                "time", LocalDateTime.now().toString()
                );
    }

}
