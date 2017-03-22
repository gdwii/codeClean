package com.gdwii.codeclean;

public abstract class Clock {
    protected int UTC_OFFSET = 0;

    protected int localTime;

    public Clock(int utcOffSet) {
    	UTC_OFFSET = utcOffSet;
    }

	public abstract void setLocalTime(int localTime);

	public String getTime() {
		return String.valueOf(localTime);
	}

	public  void  setLocalTimeFromUtcZeroTime(int utcZeroTime){
        this.localTime = Clock.makeHourWithin0To23(utcZeroTime + UTC_OFFSET);
    }
}
