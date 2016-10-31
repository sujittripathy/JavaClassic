package sample;

public class VarArgs {
    public static void main(String[] args) {
        new VarArgs().varArgFunc("a","b","c");
        new VarArgs().varArgFunc("a","b");
        new VarArgs().varArgFunc("a");

        new VarArgs().varArgFuncArray(new String[]{"A","B"});
    }

    private void varArgFunc(String... strArgs){
        for(String s:strArgs){
            System.out.println(s);
        }
    }

    private void varArgFuncArray(String[] strArgs){
        for(String s:strArgs){
            System.out.println(s);
        }
    }
}
