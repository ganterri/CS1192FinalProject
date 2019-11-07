package app.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>
{
	public List<Event> findBydateMonth(String dateMonth);
	
}
