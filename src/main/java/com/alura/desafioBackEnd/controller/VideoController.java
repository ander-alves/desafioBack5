package com.alura.desafioBackEnd.controller;

import com.alura.desafioBackEnd.domain.service.VideoService;
import com.alura.desafioBackEnd.domain.service.model.Video;
import com.alura.desafioBackEnd.domain.service.repository.VideoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/videos")
public class VideoController {

    private VideoRepository videoRepository;

    private VideoService service;

    @GetMapping
    public List<Video> findAll() {
        return videoRepository.findAll();
    }

    @GetMapping("/{videoId}")
    public Optional<Video> findById(@PathVariable Long videoId) {
        return videoRepository.findById(videoId);
    }

}
