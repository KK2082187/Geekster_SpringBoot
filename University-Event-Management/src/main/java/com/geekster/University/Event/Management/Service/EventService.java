package com.geekster.University.Event.Management.Service;

import com.geekster.University.Event.Management.Model.Event;
import com.geekster.University.Event.Management.Repository.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventRepository iEventRepository;
    public List<Event> findAll(){
        return iEventRepository.findAll();
    }
    public Event findById(int eventId){
        return iEventRepository.findById(eventId);
    }
    public Event addEvent(Event event){
        return iEventRepository.save(event);
    }
    public void deleteEvent(int eventId){
    iEventRepository.deleteEvent(eventId);
    }

   public void updateEvent(int eventId,Event newEvent){
        Event event = iEventRepository.findById(eventId);
       event.setEventName(newEvent.getEventName());
       event.setLocationOfEvent(newEvent.getLocationOfEvent());
       event.setDate(newEvent.getDate());
       event.setStartTime(newEvent.getStartTime());
       event.setEndTime(newEvent.getEndTime());
       iEventRepository.save(event);
   }

    public List<Event> allEventByDate(String date) {
        List<Event>eventList = iEventRepository.findAll();
        List<Event>dateEvent=null;
        for(Event event:eventList){
            if(event.equals(date)){
                dateEvent.add(event);
            }
        }
        return dateEvent;
    }
}
