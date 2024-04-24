package br.com.fiap.simuladospringpfunidades.resource;

import br.com.fiap.simuladospringpfunidades.dto.request.ChefeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.ChefeResponse;
import br.com.fiap.simuladospringpfunidades.entity.Chefe;
import br.com.fiap.simuladospringpfunidades.repository.ChefeRepository;
import br.com.fiap.simuladospringpfunidades.service.ChefeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/chefe")
public class ChefeResource implements ResourceDTO<ChefeRequest, ChefeResponse>{

    @GetMapping
    public Collection<ChefeResponse> findAll(
            @RequestParam(name = "userChefe", required = false) Long userChefe,
            @RequestParam(name = "substituto",required = false) Boolean substituto,
            @RequestParam(name = "unidade",required = false) Long unidade
    ) {
        return List.of();
    }

    @Override
    public ResponseEntity<ChefeResponse> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<ChefeResponse> save(ChefeRequest r) {
        return null;
    }
}