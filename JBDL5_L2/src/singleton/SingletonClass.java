package singleton;

public class SingletonClass {


    private static SingletonClass INSTANCE = null;

    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        if (INSTANCE==null){
            INSTANCE = new SingletonClass();
        }
        return INSTANCE;
    }

}
