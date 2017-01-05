package ctci;

public class UniqueStringCharacter{
  public static void main(String s[]){
    String str = "UniqueStringCharacter";
    char charArray[] = str.toCharArray();
    boolean match = false;
    for(int i=0;i<charArray.length;i++){
      char c=charArray[i];
      for(int j=i+1;j<charArray.length;j++){
        if(c == charArray[j]){
          System.out.println("match : "+c +", index" + j);
          match = true;
          break;
        }
      }
      if(match){
        System.out.println("String character is not unique : "+str);
        break;
      }
    }
  }
}
