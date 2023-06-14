// reverse of String in recursion
public class Main{
    public static void main(String args[]){
        String s = "amarjeet";
        System.out.println(recursiveString(s));
    }
    private static String recursiveString(String s){
        if(s==null || s.length()<=1){
            return s;
        }
        return recursiveString(s.substring(1))+s.charAt(0);
    }
}
/* Output
   teejrama
  */
