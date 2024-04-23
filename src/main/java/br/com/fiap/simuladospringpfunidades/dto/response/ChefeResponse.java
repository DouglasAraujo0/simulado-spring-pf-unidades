package br.com.fiap.simuladospringpfunidades.dto.response;

import br.com.fiap.simuladospringpfunidades.entity.Unidade;
import br.com.fiap.simuladospringpfunidades.entity.Usuario;

import java.time.LocalDateTime;

public record ChefeResponse(

        Long id,
        Boolean substituto,
        Usuario usuario,
        Unidade unidade,
        LocalDateTime inicio,
        LocalDateTime fim
) {
}
