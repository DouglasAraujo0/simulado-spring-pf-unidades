package br.com.fiap.simuladospringpfunidades.service;
import br.com.fiap.simuladospringpfunidades.dto.request.UnidadeRequest;
import br.com.fiap.simuladospringpfunidades.dto.response.UnidadeResponse;
import br.com.fiap.simuladospringpfunidades.entity.Unidade;
import br.com.fiap.simuladospringpfunidades.repository.UnidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import java.util.List;

public class UnidadeService implements ServiceDTO<Unidade, UnidadeRequest, UnidadeResponse> {

    @Autowired
    private UnidadeRepository repo;

    @Override
    public Unidade toEntity(UnidadeRequest r) {
        return Unidade.builder()
                .nome(r.nome() )
                .sigla(r.sigla() )
                .descricao(r.descricao() )
                .macro(r.macro())
                .build();
    }
    @Override
    public UnidadeResponse toResponse(Unidade e) {
        return UnidadeResponse.builder()
                .id(e.getId() )
                .nome(e.getNome() )
                .sigla(e.getSigla() )
                .descricao(e.getDescricao() )
                .macro(e.getMacro())
                .build();
    }
    @Override
    public List<Unidade> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Unidade> findAll(Example<Unidade> example) {
        return repo.findAll( example );
    }

    @Override
    public Unidade findById(Long id){
        return repo.findById( id ).orElseThrow(null);
    }

    @Override
    public Unidade save(Unidade e) {
        return repo.save( e );
    }
}
