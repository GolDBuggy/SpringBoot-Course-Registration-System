package com.java.crs.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "faculty")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Faculty {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "faculty_id")
    private String id;

    @Column(name = "faculty_name")
    private String facultyName;

    @OneToMany(mappedBy = "faculty")
    private List<Department> departments;

}
