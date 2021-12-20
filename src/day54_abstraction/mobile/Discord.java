package day54_abstraction.mobile;

public class Discord extends MobileApp{

  public void chat(){
      System.out.println("chatting on "+ getName());
  // chat method is like postPhone in Instagram

      // Instagram- just an extra instance method unique to the child class
  }

    @Override
    public void useApp(int minutes) {
      super.useApp(minutes);
      chat();
  }
  // creating a Discord class object and called instance methods

}
