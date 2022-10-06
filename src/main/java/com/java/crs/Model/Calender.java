package com.java.crs.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "calender")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Calender {

    @Id
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "UUID")
    @Column(name = "calender_id")
    private String id;

    @Column(name = "day_name")
    @Enumerated(EnumType.STRING)
    private Day dayName;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @ManyToMany
    @JoinTable(name = "course_time",joinColumns = @JoinColumn(name = "calender_id"),
            inverseJoinColumns = @JoinColumn(name ="course_id" ))
    private List<Course> courses;

}
