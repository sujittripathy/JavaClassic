package sample.pattern.builder;

public class UserbuilderMain {
    public static void main(String[] args) {
        User user= new User.UserBuilder("a","b").addAge(20).addSalary(30000).build();
        System.out.println(user);
    }
}
