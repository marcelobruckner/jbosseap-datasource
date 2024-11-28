package br.bruckner.jakarta.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("alunos")
public class HelloWorldResource {

	@GET()
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Aluno> list() {


		return Arrays.asList(new Aluno());
	}
}