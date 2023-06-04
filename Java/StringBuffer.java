public class Main
{
	public static void main(String[] args) {
	   StringBuffer s= new StringBuffer("welcome");
	   StringBuilder sb = new StringBuilder("welcome");
	   sb.append("hello");
	   s.append("java");
	   System.out.println(s.length());
	   System.out.println(sb.length());
	   
	   sb.insert(3,"java");
	   s.insert(2,"all");
	   System.out.println(s);
	   System.out.println(sb);
	   
	   s.replace(3,6,"java");
	   sb.replace(2,4,"all");
	   System.out.println(s);
	   System.out.println(sb);
		
	}
}
/* Output
11
12
wealllcomejava
weljavacomehello
weajavacomejava
weallavacomehello
*/
