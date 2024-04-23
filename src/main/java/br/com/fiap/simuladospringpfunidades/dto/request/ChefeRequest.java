package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record ChefeRequest(


        Boolean substituto,

        @Valid
        @NotNull(message = "A unidade deve ser informada")
        AbstractRequest unidade,

        @NotNull(message = "O inicio deve ser informado")
        LocalDateTime inicio,

        @NotNull(message = "O fim deve ser informado")
        LocalDateTime fim,

        @Valid
        @NotNull(message = "O usuário deve ser informado")
        AbstractRequest usuario
) {
}
