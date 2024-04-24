package br.com.fiap.simuladospringpfunidades.resource;

import br.com.fiap.simuladospringpfunidades.dto.request.ChefeRequest;
import br.com.fiap.simuladospringpfunidades.dto.request.UnidadeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.ChefeResponse;
import br.com.fiap.simuladospringpfunidades.dto.response.UnidadeResponse;
import br.com.fiap.simuladospringpfunidades.entity.Unidade;
import br.com.fiap.simuladospringpfunidades.repository.UnidadeRepository;
import br.com.fiap.simuladospringpfunidades.service.UnidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/unidade")
public class UnidadeResource implements ResourceDTO<UnidadeRequest, UnidadeResponse>{

    @GetMapping
    public Collection<UnidadeResponse> findAll(
            @RequestParam(name = "nome", required = false) String nome,
            @RequestParam(name = "silga", required = false) String sigla,
            @RequestParam(name = "macro", required = false) Long macroID
    ) {
        return List.of();
    }

    @Override
    public ResponseEntity<UnidadeResponse> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UnidadeResponse> save(UnidadeRequest r) {
        return null;
    }
}