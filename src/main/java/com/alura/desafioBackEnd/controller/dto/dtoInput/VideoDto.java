package com.alura.desafioBackEnd.controller.dto.dtoInput;

import com.alura.desafioBackEnd.model.Video;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class VideoDto {
    @NotNull
    private String titulo;
    @NotBlank
    private String descricao;
    @NotBlank
    private String url;

    public Video converter(VideoDto videoDto) {
     return new Video(titulo, descricao ,url);
    }
}
