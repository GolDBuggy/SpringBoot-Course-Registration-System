package com.java.crs.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "course")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "UUID")
    @Column(name = "course_id")
    private String id;

    @Column(name = "course_code")
    private String courseCode;

    @Column(name = "course_name")
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "academician_id")
    private Member member;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "users_course",joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name ="user_id" ))
    private List<Member> members;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "course_time",joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name ="calender_id" ))
    private List<Calender> calenders;


}
