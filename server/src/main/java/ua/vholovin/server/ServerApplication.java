package ua.vholovin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.vholovin.server.domain.Actor;
import ua.vholovin.server.domain.DaoImpl;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);

		Actor actor = new Actor();
		actor.setFirstName("Valik");
		actor.setLastName("Holovin");

		DaoImpl dao = DaoImpl.getInstance();
		dao.save(actor);

		System.out.println(actor.getActorID() + " " + actor.getCreatedDate() + " " + actor.getModifiedDate());
	}
}
