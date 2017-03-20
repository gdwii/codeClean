package com.gdwii.codeclean;

public class UtcTime extends TimeSubject{
    private int utcZeroTime;

    public void setUtcZeroTime(int utcZeroTime){
        this.utcZeroTime = utcZeroTime;
        notifyAllClocks();
    }

    public int getUtcZeroTime(){
        return utcZeroTime;
    }

    @Override
    public void notifyAllClocks() {
        for(Clock clock : super.clocks.values()){
            clock.setLocalTime(Clock.toLocalTime(utcZeroTime));
        }
    }

	public void printTimeOfAllClocks() {
		for(String clockName : clocks.keySet()){
			System.out.println(clockName + ":" + clocks.get(clockName).getTime());
		}
	}
}
