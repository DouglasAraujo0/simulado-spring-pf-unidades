package br.com.fiap.simuladospringpfunidades.service;
import br.com.fiap.simuladospringpfunidades.dto.request.UsuarioRequest;
import br.com.fiap.simuladospringpfunidades.entity.Usuario;
import br.com.fiap.simuladospringpfunidades.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import java.util.List;

public class UsuarioService implements ServiceDTO<Usuario, UsuarioRequest, UsuarioResponse> {

    @Autowired
    private UsuarioRepository repo;

    @Override
    public Usuario toEntity(UsuarioRequest r) {
        return Usuario.builder()
                .username(r.username() )
                .password(r.password() )
                .pessoa(r.pessoa() )
                .build();
    }
    @Override
    public UsuarioResponse toResponse(Usuario e) {
        return UsuarioResponse.builder()
                .id(e.getId() )
                .username(e.getUsername() )
                .password(e.getPassword() )
                .pessoa(e.getPessoa() )
                .build();
    }
    @Override
    public List<Usuario> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Usuario> findAll(Example<Usuario> example) {
        return repo.findAll( example );
    }

    @Override
    public Usuario findById(Long id){
        return repo.findById( id ).orElseThrow(null);
    }

    @Override
    public Usuario save(Usuario e) {
        return repo.save( e );
    }
}
