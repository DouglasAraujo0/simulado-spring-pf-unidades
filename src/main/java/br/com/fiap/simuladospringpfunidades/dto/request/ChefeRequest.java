package br.com.fiap.simuladospringpfunidades.dto.request;

import br.com.fiap.simuladospringpfunidades.entity.Unidade;
import br.com.fiap.simuladospringpfunidades.entity.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDateTime;

public record ChefeRequest(


        Boolean substituto,

        @Valid
        @NotNull(message = "Usuário é Obrigatório")
        AbstractRequest usuario,

        @Valid
        @NotNull(message = "A unidade deve ser informada")
        AbstractRequest unidade,

        LocalDateTime inicio,

        LocalDateTime fim
) {
}
