package test.enums;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Today1 today1 = new Today1(WeekDays1.MONDAY);
        today1.daysInfo();
        WeekDays1 weekDays1 = WeekDays1.valueOf("MONDAY");
        System.out.println(weekDays1);
        WeekDays1[] weekDays2 = WeekDays1.values();
        System.out.println(Arrays.toString(weekDays2));
    }
}

enum WeekDays1 {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");
    private String mood;
    private WeekDays1(String mood){
        this.mood = mood;
    }
    public String getMood(){
        return mood;
    }

}
class Today1 {
    WeekDays1 weekDays1;

    public Today1(WeekDays1 weekDays1) {
        this.weekDays1 = weekDays1;
    }

    void daysInfo(){

        switch (weekDays1){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go working");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Chill out");

        }
        System.out.println("Mood on this day: " + weekDays1.getMood());

    }
}
