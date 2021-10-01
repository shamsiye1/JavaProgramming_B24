package day16_switch;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month ");
//        int month = scan.nextInt();
        String result = "";

        int days=0;
        switch (scan.next()){
            case "February":
                days=28;
                break;
            case "Aril":
            case "June":
            case "September":
            case "November":
                days=30;
                break;
            case "january":
            case "March":
            case"May":
            case"July":
            case "Augest":
            case "October":
            case"December":
                days=31;
                break;
            default:
                System.out.println("Invalid month name, please enter the month");
        }
        if (days!=0){
            System.out.println(days+ " days");
        }
//        System.out.println(scan.next());
//        System.out.println(days);
































//        switch (month) {
//            case 1:
//                result = "January";
//                break;
//            case 2:
//                result = "February";
//                break;
//            case 3:
//                result = "March";
//                break;
//            case 4:
//                result = "April";
//                break;
//            case 5:
//                result = "May";
//                break;
//            case 6:
//                result = "June";
//                break;
//            case 7:
//                result = "July";
//                break;
//            case 8:
//                result = "August";
//                break;
//            case 9:
//                result = "September";
//                break;
//            case 10:
//                result = "October";
//                break;
//            case 11:
//                result = "November";
//                break;
//            case 12:
//                result = "December";
//                break;
//            default:
//                result = "You entered wrong month number, please enter number from 1~12";
//
//
//        }
//        System.out.println(month);
//        System.out.println(result);

    }
















}
