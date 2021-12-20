package day57_polymorphism.driver;

public class Input implements WebElement    {
    @Override
    public void sendKeys(String text) {
        System.out.println("Sending "+text );
    }

    @Override
    public void click() {
        System.out.println("Waiting for text");
    }

    @Override
    public String getText() {
        return "Inputs name";
    }
}
