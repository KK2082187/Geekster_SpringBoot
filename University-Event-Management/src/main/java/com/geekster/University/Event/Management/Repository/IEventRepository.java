package com.geekster.University.Event.Management.Repository;

import com.geekster.University.Event.Management.Model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEventRepository extends CrudRepository<Event,Integer> {
    public List<Event> findAll();
    public Event findById(int eventId);
    public void addEvent(Event event);
    public void deleteEvent(int eventId) ;
    public void updateEvent(int eventId,Event newEvent) ;
}
