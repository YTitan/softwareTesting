package st_lab1.part3;

public abstract class Engine {
    boolean isWorking = true;

    public boolean GetIsWorking(){
        return isWorking;
    }

    public Engine(){
        isWorking = true;
    }
}
