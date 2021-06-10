package org.blog.pessoal.epicsteam.seguranca;

// FAZ UM MEIO DE CAMPO ENTRE A CLASSE USUARIO E A USERDETAILSIMPL


import java.util.Optional;

import org.blog.pessoal.epicsteam.model.Usuario;
import org.blog.pessoal.epicsteam.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service 
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UsuarioRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
        Optional<Usuario> user = userRepository.findByUsuario(userName);
        user.orElseThrow(() -> new UsernameNotFoundException(userName + "not found. "));

        return user.map(UserDetailsImpl::new).get();
    }  
    
}
