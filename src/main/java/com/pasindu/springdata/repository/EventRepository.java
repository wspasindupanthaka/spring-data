package com.pasindu.springdata.repository;

import com.pasindu.springdata.entity.Event;
import com.pasindu.springdata.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository
{

	Event save(Event event);

	List<Event> findByName(String name);
}
