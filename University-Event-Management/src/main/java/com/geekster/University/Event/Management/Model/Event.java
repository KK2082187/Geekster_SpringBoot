package com.geekster.University.Event.Management.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Event {

    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer eventId ;
    private String eventName;
    private String locationOfEvent;

    private String date;
    private String startTime;
    private String endTime;
}
