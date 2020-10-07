package com.company;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;

public class TaskLocalDates {
    Date dateToConvert =  new Date();
    public LocalDate convertToLocalDate() {

        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
    public LocalTime convertToLocalTime(){
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalTime();
    }
    public LocalDateTime convertToLocalDateTime(){
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
}
