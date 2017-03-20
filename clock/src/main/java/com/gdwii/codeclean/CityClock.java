package com.gdwii.codeclean;

/**
 * Created by gdw on 2017/3/15.
 */
public class CityClock extends Clock{
    public CityClock(int utcOffSet) {
    	super(utcOffSet);
	}

	@Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
    }
}
