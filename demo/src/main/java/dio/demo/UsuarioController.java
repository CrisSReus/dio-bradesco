package dio.demo;

import java.util.List;

import dio.model.Usuario;
import dio.repository.UserRepository;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UsuarioController {
    @Autowired
    private UserRepository repository;
    @GetMapping("/users")
    public List<Usuario>getUsers(){
        return repository.findAll();
    }
}
