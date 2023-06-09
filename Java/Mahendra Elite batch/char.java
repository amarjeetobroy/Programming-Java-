// count uppercase lowercase specilcharacter and integer
import java.util.Scanner;
public class char{
public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	String str;
        	str=sc.nextLine();

        	int nc=0,uc=0,lc=0,s_c=0;
        	for(int i=0;i<str.length();i++){
        		char ch=str.charAt(i);
        		if(ch>='0'&&ch<='9')
        			nc++;
        		else if(ch>='A'&&ch<='Z')
        			uc++;
        		else if(ch>='a'&&ch<='z')
        			lc++;
        		else
        			s_c++;
        	}
        	System.out.println("UC="+uc+"\nLC="+lc+"\nNC="+nc+"\nS_C="+s_c);
        }
}

/* Output
Amarjeet3847#$%^4
UC=1
LC=7
NC=5
S_C=4
