package com.alura.desafioBackEnd.domain.service;

import com.alura.desafioBackEnd.domain.service.model.Video;
import com.alura.desafioBackEnd.domain.service.repository.VideoRepository;
import org.springframework.stereotype.Service;

@Service
public class VideoService {
    VideoRepository videoRepository;

    public Video save (Video video) {
        return videoRepository.save(video);
    }

}
