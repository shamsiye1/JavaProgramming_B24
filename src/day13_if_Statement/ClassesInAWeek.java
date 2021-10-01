package day13_if_Statement;

public class ClassesInAWeek {
    public static void main(String[] args) {


      String day = "monday";
        boolean isTechnicalDay=day.equals("monday") || day.equals("wednesday") || day.equals("thursday") || day.equals("saturday") || day.equals("sunday");

        boolean isSoftSkills= day.equals("tuesday");

        boolean isFriday = !isSoftSkills && !isSoftSkills;

        if (isTechnicalDay){
            System.out.println("java");
        }else if (isSoftSkills){
            System.out.println("soft skills");
        }else if (isFriday){
            System.out.println("day off");
        }else{
            System.out.println("invalid day given");
        }
































    }
}
