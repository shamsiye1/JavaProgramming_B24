package day16_switch;

public class DaysInWeek {
    public static void main(String[] args) {

        int day = 2;
        String dayInWords = "";

        switch (day) {
            case 1:
                dayInWords = "monday";
                break;
            case 2:
                dayInWords = "tuesday";
                break;
            case 3:
                dayInWords = "wednesday";
                break;
            case 4:
                dayInWords = "thursday";
                break;
            case 5:
                dayInWords = "friday";
                break;
            case 6:
                dayInWords = "saturday";
                break;
            case 7:
                dayInWords = "sunday";
                break;
            default:
                dayInWords = "invalid day number, needs to be between 1~7";


        }
        System.out.println(day);
        System.out.println(dayInWords);


    }
}


