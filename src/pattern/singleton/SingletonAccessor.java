package pattern.singleton;

public class SingletonAccessor {
    public static void main(String[] args) {
        System.out.println(SingletonClass.getInstance().getSomeName());
        System.out.println(SingletonClass.getInstance().getSomeName());
    }
}
