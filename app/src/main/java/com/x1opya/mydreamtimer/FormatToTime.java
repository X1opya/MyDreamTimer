package com.x1opya.mydreamtimer;

public class FormatToTime {
    private long milisec;
    public FormatToTime(long milisec) {
        this.milisec = milisec;
    }

    public String getSeconds(){
        return milisec/1000%60+"";
    }

    public String getMinut(){
        return milisec/1000/60%60+"";
    }

    public String getHour(){
        return milisec/1000/60/60%24+"";
    }

    public String getDays(){
        return (int)milisec/1000/60/60/24+"";
    }

    @Override
    public String toString() {
        return "Дней "+getDays()+"\n Часы "+getHour()+" Минуты "+getMinut()+" Секунд "+getSeconds();
    }
}
