package org.blog.pessoal.epicsteam.repository;

import java.util.*;
import org.blog.pessoal.epicsteam.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    public Optional<Usuario> findByUsuario(String usuario);
    
}
