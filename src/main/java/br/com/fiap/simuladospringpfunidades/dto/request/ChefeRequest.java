package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record ChefeRequest(


        Boolean substituto,

        @Valid
        @NotNull(message = "A unidade deve ser informada")
        AbstractRequest unidade,

        @Valid
        @NotNull(message = "O inicio deve ser informado")
        AbstractRequest inicio,

        @Valid
        @NotNull(message = "O fim deve ser informado")
        AbstractRequest fim,

        @Valid
        @NotNull(message = "O usuário deve ser informado")
        AbstractRequest usuario
) {
}
