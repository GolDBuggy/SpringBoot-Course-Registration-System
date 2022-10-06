package com.java.crs.Service;

import com.java.crs.Model.Calender;
import com.java.crs.Repo.CalenderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CalenderService {

    private final CalenderRepo calenderRepo;

    public void saveCalender(Calender calender){
        calenderRepo.save(calender);
    }

    public List<Calender> getAll() {
        return calenderRepo.findAll();
    }
}
