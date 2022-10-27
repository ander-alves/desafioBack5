package com.alura.desafioBackEnd.controller.dto;

import com.alura.desafioBackEnd.model.Video;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class VideoResponseDTO {

    private String titulo;
    private String descricao;
    private String url;


    public VideoResponseDTO(Video video) {
        this.descricao = video.getDescricao();
        this.titulo = video.getTitulo();
        this.url = video.getUrl();
    }

    public static List<VideoResponseDTO> converter(List<Video> videos) {
        return videos.stream().map(VideoResponseDTO::new).collect(Collectors.toList());
    }
}
