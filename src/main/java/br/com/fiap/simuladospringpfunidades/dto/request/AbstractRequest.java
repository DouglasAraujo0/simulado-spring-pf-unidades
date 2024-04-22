package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record AbstractRequest(

        @Positive(message = "O id deve ser um número positivo")
        @NotNull(message = "O id deve ser informado")
        Long id
) {
}
