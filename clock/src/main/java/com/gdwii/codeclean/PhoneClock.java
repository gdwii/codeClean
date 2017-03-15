package com.gdwii.codeclean;

/**
 * Created by gdw on 2017/3/15.
 */
public class PhoneClock extends Clock{
    private UtcTime utcTime;

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
        this.utcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }
}
