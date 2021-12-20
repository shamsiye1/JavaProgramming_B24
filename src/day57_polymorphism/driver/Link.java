package day57_polymorphism.driver;

public class Link implements WebElement{

    public String getUrl(){
        return "google.com";
    }



    @Override
    public void sendKeys(String text) {
        System.out.println("Not valid");
    }

    @Override
    public void click() {
        System.out.println("Opening Link");
    }

    @Override
    public String getText() {
        return "Links Text";
    }
}
