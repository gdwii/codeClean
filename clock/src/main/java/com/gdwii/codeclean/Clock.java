package com.gdwii.codeclean;

public abstract class Clock {
    private final int UTC_OFFSET = 0;

    private int localTime;

    public abstract void setLocalTime(int localTime);
}
