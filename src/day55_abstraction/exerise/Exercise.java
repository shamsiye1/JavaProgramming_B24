package day55_abstraction.exerise;

public abstract class Exercise {
    public abstract void perform();

    public abstract void getCaloriesBurned(int minutes);


}

// new Exercise() ---> not possible, because the class is abstract
