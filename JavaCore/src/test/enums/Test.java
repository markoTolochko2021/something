package test.enums;

public class Test {
    public static void main(String[] args) {
     Today1 today1 = new Today1(WeekDays1.MONDAY);
     today1.daysInfo();
    }
}

enum WeekDays{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}
class Today{
    WeekDays1 weekDays1;

    public Today(WeekDays1 weekDays1) {
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

    }
}

