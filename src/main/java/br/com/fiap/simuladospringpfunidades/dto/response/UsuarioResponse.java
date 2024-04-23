package br.com.fiap.simuladospringpfunidades.dto.response;

import br.com.fiap.simuladospringpfunidades.entity.Pessoa;

public record UsuarioResponse(

        Long id,
        String username,
        String password,
        Pessoa pessoa
) {
}
