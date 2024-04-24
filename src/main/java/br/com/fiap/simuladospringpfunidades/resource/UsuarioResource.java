package br.com.fiap.simuladospringpfunidades.resource;

import br.com.fiap.simuladospringpfunidades.dto.request.ChefeRequest;
import br.com.fiap.simuladospringpfunidades.dto.request.UsuarioRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.ChefeResponse;
import br.com.fiap.simuladospringpfunidades.dto.response.UsuarioResponse;
import br.com.fiap.simuladospringpfunidades.entity.Tipo;
import br.com.fiap.simuladospringpfunidades.entity.Usuario;
import br.com.fiap.simuladospringpfunidades.repository.UsuarioRepository;
import br.com.fiap.simuladospringpfunidades.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource implements ResourceDTO<UsuarioRequest, UsuarioResponse>{

    @GetMapping
    public Collection<UsuarioResponse> findAll(
            @RequestParam(name = "username", required = false) String username,
            @RequestParam(name = "pessoaID", required = false) Long pessoaID,
            @RequestParam(name = "nome", required = false) String nome,
            @RequestParam(name = "sobrenome", required = false) String sobrenome,
            @RequestParam(name = "dtnasci", required = false) LocalDate dtnasci,
            @RequestParam(name = "tipo", required = false) Tipo tipo,
            @RequestParam(name = "email", required = false) String email
    ) {
        return List.of();
    }

    @Override
    public ResponseEntity<UsuarioResponse> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UsuarioResponse> save(UsuarioRequest r) {
        return null;
    }
}