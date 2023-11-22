package med.voll.api;


import med.voll.api.domain.paciente.Paciente;
import med.voll.api.domain.usuario.Usuario;
import med.voll.api.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class ApiStarterConfig implements CommandLineRunner {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {
//        Usuario admin = new Usuario();
//        admin.setLogin("admin");
//        admin.setSenha(passwordEncoder.encode("123456"));
//        usuarioRepository.save(admin);
    }
}
