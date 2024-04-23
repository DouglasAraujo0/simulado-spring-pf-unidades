package br.com.fiap.simuladospringpfunidades.dto.request;

import br.com.fiap.simuladospringpfunidades.entity.Unidade;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UnidadeRequest(

        @Size(min = 2, max = 25)
        @NotNull(message = "Nome é Obrigatório")
        String nome,

        @NotNull(message = "Sigla é Obrigatória")
        String sigla,

        @NotNull(message = "Descrição é Obrigatório")
        String descricao,

        @Valid
        @NotNull(message = "O macro é campo obrigatorio")
        AbstractRequest macro
) {
}
