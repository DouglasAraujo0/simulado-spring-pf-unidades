package br.com.fiap.simuladospringpfunidades.dto.request;

import br.com.fiap.simuladospringpfunidades.entity.Unidade;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UnidadeRequest(

        @Size(min = 2, max = 25)
        @NotNull(message = "Nome é Obrigatório")
        String nome,

        @Size(min = 3, max = 255)
        String sigla,

        @Size(min = 3, max = 255)
        String descricao,

        @Valid
        AbstractRequest macro

) {
}
