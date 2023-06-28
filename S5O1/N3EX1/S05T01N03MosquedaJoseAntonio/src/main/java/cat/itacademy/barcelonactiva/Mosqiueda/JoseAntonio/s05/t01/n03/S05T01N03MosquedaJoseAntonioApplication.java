package cat.itacademy.barcelonactiva.Mosqiueda.JoseAntonio.s05.t01.n03;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title="API Rest Flor2 llama a API rest Flor", version = "1.0.0"),
		servers ={@Server(url="http://localhost:9002")},
		tags = {@Tag(name = "Flower API to API", description = "API CRUD para administrar flores para llamar a otra API")})


public class S05T01N03MosquedaJoseAntonioApplication {

	public static void main(String[] args) {
		SpringApplication.run(S05T01N03MosquedaJoseAntonioApplication.class, args);
	}

}
