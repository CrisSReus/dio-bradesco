package dio.repository;

import org.springframework.stereotype.Repository;

import dio.model.Usuario;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null)
        System.out.println("SAVE - Recebendo o usuario na camada de repositorio");
        else
        System.out.println("UPDATE - Recebendo o usuario na camada de repositorio");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id %d para deletar"));
        System.out.println(id);
    }
    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleysin","password"));
        usuarios.add(new Usuario("frank","masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para logar"));
        return new Usuario("gleyson","password");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username"));
        return new Usuario("gleyson","password");
    }
}
