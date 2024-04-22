package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record UsuarioRequest(

        @NotNull(message = "Username é Obrigatório")
        String username,

        @Pattern(
                message = "A senha não atende aos requisitos",
                regexp = "/^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,16}$/"
        )
        String password,

        @Valid
        @NotNull(message = "A pessoa deve ser informada")
        AbstractRequest pessoa
) {
}
