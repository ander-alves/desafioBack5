package com.alura.desafioBackEnd.controller.dto.dtoInput;

import com.alura.desafioBackEnd.model.Video;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VideoDto {
    private String titulo;
    private String descricao;
    private String url;

    public Video converter(VideoDto videoDto) {
     return new Video(titulo, descricao ,url);
    }
}
