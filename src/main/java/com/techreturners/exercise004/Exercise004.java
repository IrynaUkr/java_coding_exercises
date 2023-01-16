package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private final LocalDateTime localDateTime;

    public Exercise004(LocalDate date) {
        this.localDateTime =date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        this.localDateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        int gigaSecond = 1_000_000_000;
        return localDateTime.plusSeconds(gigaSecond);
    }
}
