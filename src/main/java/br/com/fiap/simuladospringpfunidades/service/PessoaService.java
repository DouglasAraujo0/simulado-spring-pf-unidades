package br.com.fiap.simuladospringpfunidades.service;

import br.com.fiap.simuladospringpfunidades.dto.request.PessoaRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.PessoaResponse;
import br.com.fiap.simuladospringpfunidades.entity.Pessoa;
import br.com.fiap.simuladospringpfunidades.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PessoaService implements ServiceDTO<Pessoa, PessoaRequest, PessoaResponse> {

    @Autowired
    private PessoaRepository repo;

    @Override
    public Pessoa toEntity(PessoaRequest r) {
        return Pessoa.builder()
                .nome(r.nome() )
                .sobrenome(r.sobrenome() )
                .email(r.email() )
                .nascimento(r.nascimento())
                .build();

    }
    @Override
    public PessoaResponse toResponse(Pessoa e) {
        return PessoaResponse.builder()
                .id(e.getId() )
                .nome(e.getNome() )
                .sobrenome(e.getSobrenome() )
                .email(e.getEmail() )
                .nascimento(e.getNascimento())
                .build();
    }
    @Override
    public List<Pessoa> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Pessoa> findAll(Example<Pessoa> example) {
        return repo.findAll( example );
    }

    @Override
    public Pessoa findById(Long id){
        return repo.findById( id ).orElseThrow(null);
    }

    @Override
    public Pessoa save(Pessoa e) {
        return repo.save( e );
    }
}
