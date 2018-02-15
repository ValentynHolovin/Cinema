package ua.vholovin.server.repository;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
