class student{
    String name;
    int age;
    
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class oop
{
	public static void main(String[] args) {
	    student s = new student("Amarjeet", 20);
	    s.printInfo();
	    
	}
}
/* Output
Amarjeet
20
*/
