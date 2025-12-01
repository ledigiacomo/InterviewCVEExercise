package com.sas.example.vulnerable.controller;

import com.sas.example.vulnerable.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.Yaml;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final ObjectMapper objectMapper;
    private final Yaml yaml;
    private Map<Long, User> users = new HashMap<>();
    private Long nextId = 1L;

    public UserController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        this.yaml = new Yaml();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        user.setId(nextId++);
        users.put(user.getId(), user);
        return user;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @PostMapping("/parse-yaml")
    public Map<String, Object> parseYaml(@RequestBody String yamlContent) {
        // Uses vulnerable SnakeYAML version
        return yaml.load(yamlContent);
    }
}