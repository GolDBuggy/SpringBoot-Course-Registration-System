package com.java.crs.Dto;

import com.java.crs.Model.Day;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalenderDto {

    private Day dayName;
    private LocalTime startTime;
    private LocalTime endTime;
}
