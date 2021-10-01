package day13_if_Statement;

public class Weather {
    public static void main(String[] args) {

        String weather = "rainy";

        if (weather.equals("sunny")){
            System.out.println("its nice, go outside, ride a bike, code java");
        }else if (weather.equals("rainy")){
            System.out.println("stay home, drink some tea, code java");
        }else if (weather.equals("windy")){
            System.out.println("fly a kite and code java");
        }else if (weather.equals("snowy")){
            System.out.println("go skiing, drink hot choco, code java");
        }else {
            System.out.println("not a valid weather type, but code java anyway");
        }
























    }
}
