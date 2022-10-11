package github.com.Guuuuh;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class Configuracao {

    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("Rodando a Configuração de Desenvolvimento");
        };
    }
}
