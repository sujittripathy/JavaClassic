package sample.pattern.builder;

class User {
    private String fName;
    private String lName;
    private int age;
    private int salary;

    User(UserBuilder userBuilder){
        this.fName = userBuilder.fName;
        this.lName = userBuilder.lName;
        this.age=userBuilder.age;
        this.salary=userBuilder.salary;
    }

    @Override
    public String toString() {
        return "["+this.fName+","+this.lName+","+this.age+","+this.salary+"]";
    }

    public static class UserBuilder {
        private String fName;
        private String lName;
        private int age;
        private int salary;

        public UserBuilder(String fName,String lName){
            this.fName = fName;
            this.lName = lName;
        }
        public UserBuilder addAge( int age){
            this.age = age;
            return this;
        }
        public UserBuilder addSalary( int salary){
            this.salary = salary;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}

