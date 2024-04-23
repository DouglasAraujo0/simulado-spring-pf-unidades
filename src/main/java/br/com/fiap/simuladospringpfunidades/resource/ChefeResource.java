package br.com.fiap.simuladospringpfunidades.resource;

import br.com.fiap.simuladospringpfunidades.dto.request.ChefeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.ChefeResponse;
import br.com.fiap.simuladospringpfunidades.entity.Chefe;
import br.com.fiap.simuladospringpfunidades.repository.ChefeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Objects;

@RestController
@RequestMapping(value = "/chefe")
public class ChefeResource implements ResourceDTO<ChefeRequest, ChefeResponse>{

    @Autowired
    private ChefeRepository repo;

    @GetMapping
    public Collection<Chefe> findAll(){
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ChefeResponse> findById(@PathVariable Long id) {
        Chefe chefe = repo.findById(id);
        if (Objects.isNull(chefe)) return ResponseEntity.notFound().build();
        var response = repo.toResponse(chefe);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ChefeResponse> save(ChefeRequest r) {
        return null;
    }

    @Transactional
    @PostMapping
    public Chefe save(@RequestBody Chefe chefe) {
        return repo.save(chefe);
    }
}
