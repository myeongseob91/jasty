package com.jasty.web;

/**
 * Created by cppc on 2018-02-02.
 */

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Optional;

@Component
public class TagLibrary {

    public String toKoreaTimeWith12Hour(LocalDateTime date) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd a hh:mm:ss").toFormatter();
        return formatter.format(date);
    }

    public String getValueOrEmpty(String s){
        return Optional.ofNullable(s).orElse("");
    }
}
