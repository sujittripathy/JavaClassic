package pattern.singleton;

public class SingletonClass {
    public static SingletonClass singletonClass = null;

    private SingletonClass(){
        System.out.println("Object initialized");
    }

    public static SingletonClass getInstance(){
        if(singletonClass ==null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public String getSomeName(){
        return "I am a singleton";
    }
}

class SingletonAccesor{
    public static void main(String str[]){
        System.out.println(SingletonClass.getInstance().getSomeName());
        System.out.println(SingletonClass.getInstance().getSomeName());
    }
}
