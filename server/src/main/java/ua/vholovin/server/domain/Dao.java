package ua.vholovin.server.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface Dao extends CrudRepository<Actor, Integer> {

}
