package br.com.alura.forum_hub_alura.configuracao.seguranca;

import br.com.alura.forum_hub_alura.entity.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import static org.springframework.security.config.Elements.JWT;

@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String chaveSecreta;
    private String nomeAplicacao = "Forum Oracle Alura";

    public String gerarToken(Usuario usuario) throws RuntimeException {
        try {

            var algoritmo = Algorithm.HMAC256(chaveSecreta);
            return JWT.create()
                    .withIssuer(nomeAplicacao)
                    .withSubject(usuario.getEmail())
                    .withExpiresAt(dataExpiracao())
                    .sign(algoritmo);

        }catch (JWTCreationException exception){

            throw new RuntimeException("erro ao gerar token jwt ", exception);

        }
    }

    public String getSubject(String tokenJWT){
        try{
            var algoritmo = Algorithm.HMAC256(chaveSecreta);
            return JWT.require(algoritmo)
                    .withIssuer(nomeAplicacao)
                    .build()
                    .verify(tokenJWT)
                    .getSubject();
        }catch (JWTVerificationException exception){
            throw new RuntimeException("Token JWT inválido ou expirado!");
        }
    }

    private Instant dataExpiracao() {
        return LocalDateTime.now().plusHours(3).toInstant(ZoneOffset.of("-03:00"));
    }
}
