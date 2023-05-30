interface Member{
    public int MaX=100;
    void welcomeMsg();
}
interface Teacher{
    public void welcomeMsg();
}
class students implements Member,Teacher{
    public void welcomeMsg(){
        System.out.println("Hello student welcome you");
    }
}
public class Main
{
	public static void main(String[] args) {
		students M = new students();
		M.welcomeMsg();
	}
}

/* Output
Hello student welcome you
*/
