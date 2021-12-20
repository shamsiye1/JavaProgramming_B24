package day47_constructors;

public class Phone2 {
    String name;
    String brand;
    double version;
    int memory;

    public Phone2(String name){

        this.name=name;

    }

    public Phone2(String name, String brand){
        this(name); // name ==> parameter
        this.brand=brand;

    }

    public Phone2(String name, String brand,double version){
//        this.name=name;
//        this.brand=brand;
        this(name,brand);
        this.version=version;

    }

    public Phone2(String name, String brand,double version, int memory){
//        this.name=name;
//        this.brand=brand;
//        this.version=version;

        this(name,brand,version);
        this.memory=memory;

    }

}
