package br.com.fiap.simuladospringpfunidades.dto.response;

import java.time.LocalDateTime;

public record ChefeResponse(

        Long id,
        Boolean substituto,
        UsuarioResponse usuario,
        UnidadeResponse unidade,
        LocalDateTime inicio,
        LocalDateTime fim
) {
}
