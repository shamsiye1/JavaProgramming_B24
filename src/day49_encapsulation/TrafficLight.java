package day49_encapsulation;

public class TrafficLight {

   private String color;

    public TrafficLight(String color){
        this.color=color;
    }

    public String getColor(){ // getter ==> get information
        return color;
    }

    public void setColor(String color){ //

        switch (color){
            case "red":
            //    System.out.println("let car stop");
              //  break;
            case "green":
                //System.out.println("let car pass");
               // break;
            case "yellow":
                //System.out.println("please pass quick or directly stop");
                this.color=color;
                break;
            default:
                System.out.println(color+ " is not valid for traffic light");
        }



    }



}
