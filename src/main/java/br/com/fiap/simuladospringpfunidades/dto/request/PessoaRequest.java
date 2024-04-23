package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record PessoaRequest(

        @Size(min = 2, max = 25)
        @NotNull(message = "O nome deve ser informado")
        String nome,

        @Size(min = 3, max = 255)
        String sobrenome,

        @NotNull(message = "Email inválido")
        String email,

        @PastOrPresent(message = "Não pode ser data no futuro!")
        LocalDate nascimento
) {
}
