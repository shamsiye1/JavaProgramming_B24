package day54_abstraction.mobile;

public class MobileApp {

    private String name;
    private double version;


    public void download(){
        System.out.println("Downloading version "+version+" of "+name);
    }


    public MobileApp(String name, double version) {

        this.name = name;
        this.version = version;

    }

    public MobileApp() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    public void useApp(int minutes) {

        System.out.println("Using "+name+" for "+minutes+ " minutes" );

    }




}
