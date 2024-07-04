package com.pastebin.controller;

import com.pastebin.model.TextFragment;
import com.pastebin.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/texts")
public class TextController {

    @Autowired
    private TextRepository textRepository;

    @GetMapping
    public List<TextFragment> getAllTexts() {
        return textRepository.findAll();
    }

    @PostMapping
    public TextFragment createText(@RequestBody TextFragment textFragment) {
        return textRepository.save(textFragment);
    }

    @GetMapping("/{id}")
    public TextFragment getTextById(@PathVariable Long id) {
        return textRepository.findById(id).orElse(null);
    }
}