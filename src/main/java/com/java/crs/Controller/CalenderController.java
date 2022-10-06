package com.java.crs.Controller;

import com.java.crs.Model.Calender;
import com.java.crs.Model.Course;
import com.java.crs.Service.CalenderService;
import com.java.crs.Service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calender")
@RequiredArgsConstructor
public class CalenderController {

    private final CalenderService calenderService;


    @PostMapping("/create")
    public ResponseEntity<Calender> home(@RequestBody Calender calender){
        calenderService.saveCalender(calender);
        return ResponseEntity.ok(calender);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Calender>> getAll(){
        return ResponseEntity.ok(calenderService.getAll());
    }


}
