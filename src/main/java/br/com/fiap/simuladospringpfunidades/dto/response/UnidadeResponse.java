package br.com.fiap.simuladospringpfunidades.dto.response;

import br.com.fiap.simuladospringpfunidades.entity.Unidade;

public record UnidadeResponse(

        Long id,
        String nome,
        String sigla,
        String descricao,
        UnidadeResponse macro
) {
}
