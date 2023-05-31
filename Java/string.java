public class Main
{
	public static void main(String[] args) {
		char [] ch = {'h','e','l','o'};
		String s = "Hello";
		byte[] b = {99,100,101,102};
		String s1 = new String(b);
		String s2 = new String(ch);
		System.out.println(ch);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}
}
/* Output

helo
Hello
cdef
helo
*/
