package com.geekster.University.Event.Management.Controller;

import com.geekster.University.Event.Management.Model.Event;
import com.geekster.University.Event.Management.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/event")
public class EventController {
    @Autowired
    EventService eventService;
    @PostMapping(value="/addEvent")
    public String addEvent(Event event){
        eventService.addEvent(event);
        return "Event add Successfully Event id: "+event.getEventId()+" "+event.getEventName();
    }
    @GetMapping(value = "/find-event/eventId/{eventId}")
    public Event findById(@PathVariable int eventId){
        return eventService.findById(eventId);
    }
    @GetMapping(value = "find-all-event")
    public List<Event> findAll(){
        return eventService.findAll();
    }
    @PutMapping(value="/update-event/eventId/{eventId}")
    public String updateById(@PathVariable int eventId,@RequestBody Event event){
        eventService.updateEvent(eventId,event);
        return "Update Event successfully "+event.getEventName();
    }
    @DeleteMapping(value="/delete-event/eventId/{eventId}")
    public String deleteById(@PathVariable int eventId){
        eventService.deleteEvent(eventId);
        return "Event Deleted Successfully";
    }
    @GetMapping("all-event-date/date")
    public List<Event>allEventByDate(@PathVariable String date){
        return eventService.allEventByDate(date);
    }
}
