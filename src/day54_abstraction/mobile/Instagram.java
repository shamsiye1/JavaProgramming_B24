package day54_abstraction.mobile;

public class Instagram extends MobileApp{


    public Instagram(String name, double version) {
        super(name, version);
    }

    public Instagram() {

    }

    public void postPhoto(){ // there were for define method
        System.out.println("Posting phone");
    }

    @Override //this is signature
    public void useApp(int minutes){
      super.useApp(minutes);
      postPhoto(); // from call method to use.
    }



}
