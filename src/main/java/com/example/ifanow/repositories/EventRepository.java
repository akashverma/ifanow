package com.example.ifanow.repositories;

import com.example.ifanow.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

    Event findByUserId(int userId);

    boolean existsByUserId(int userId);
}
