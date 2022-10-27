package com.alura.desafioBackEnd.controller;

import com.alura.desafioBackEnd.controller.dto.VideoResponseDTO;
import com.alura.desafioBackEnd.controller.dto.dtoInput.VideoDto;
import com.alura.desafioBackEnd.model.Video;
import com.alura.desafioBackEnd.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideoController {

    @Autowired
    VideoRepository videoRepository;

    @GetMapping
    public List<VideoResponseDTO> findAll (String nomeVideo) {
        List<Video> videos = videoRepository.findAll();
          return VideoResponseDTO.converter(videos);
//        Neste Caso, usando um if consigo utilizar uma variavel para consulta por nome/descricao
//        if (nomeVideo == null) {
//            List<Video> videos = videoRepository.findAll();
//            return VideoResponseDTO.converter(videos);
//        } else {
//            List<Video> videos = videoRepository.findByTitulo(nomeVideo);
//            return VideoResponseDTO.converter(videos);
//        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Video save(@RequestBody @Valid VideoDto videoDto) {
        Video video = videoDto.converter(videoDto);
        return videoRepository.save(video);
    }

}
