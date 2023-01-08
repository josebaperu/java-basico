package com.github.josebaperu.javabasico.tuto.newboston.basico;

public class tuna {
    private int hour;
    private int minute;
    private int second;

    public tuna(){
        this(0,0,0);
    }
    public tuna(int h){
        this(h,0,0);
    }
    public tuna(int h, int m){
        this(h,m,0);
    }
    public tuna(int h, int m, int s){
        this.hour = h;
        this.minute = m;
        this.second = s;
    }
    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h){
        this.hour = ((h>=0&&h<24)?h:0);
    }
    public void setMinute(int m){
        this.minute = ((m>=0&&m<60)?m:0);
    }
    public void setSecond(int s){
        this.second = ((s>=0&&s<60)?s:0);
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public String toMilitary(){
        return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
    }
}
