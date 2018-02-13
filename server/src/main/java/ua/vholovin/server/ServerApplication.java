package ua.vholovin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ua.vholovin.server.domain.Actor;

@SpringBootApplication
@EnableJpaRepositories
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);

		Actor actor = new Actor();
		actor.setFirstName("Valik");
		actor.setLastName("Holovin");

		System.out.println(actor.getActorID() + " " + actor.getCreatedDate() + " " + actor.getModifiedDate());
	}
}
