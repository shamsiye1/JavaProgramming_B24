package day36_Methods;

public class DaysInAWeek {
    public static void main(String[] args) {
        //getDayOfWeek(1);
        System.out.println(getDayOfWeek(1));

        String day= getDayOfWeek(1);
        System.out.println(day.charAt(0));

        String day2=getDayOfWeek(10);
        System.out.println(day2.equals("not invalid day"));

        if (getDayOfWeek(6).equals("saturday") || getDayOfWeek(6).equals("sunday")){

            System.out.println("Its the weekend");

        }







    }


    public static String getDayOfWeek( int number){
        String day="";
        switch (number){

              case 1:
              day= "monday";
              break;
              case 2:
                  day= "tuesday";
                  break;
              case 3:
                  day= "wednesday";
                  break;
            case 4:
                day="thursday";
                break;
            case 5:
                day="friday";
                break;
            case 6:
                day="saturday";
                break;
            case 7:
                day="sunday";
                break;
            default:
                day= "not invalid day";

        }
      return day;

    }


}
