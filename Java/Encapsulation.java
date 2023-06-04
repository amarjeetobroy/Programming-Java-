 class Bank
{
    private String name;
    private double balance;
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public double getbalance(){
        return balance;
    }
    public void setbalance(double balance){
        this.balance = balance;
    }
}
    public class Main{
        public static void main(String args[]){
            Bank b = new Bank();
            b.setname("Amarjeet");
            b.setbalance(100000);
            System.out.println(b.getname());
            System.out.println(b.getbalance());
        }
    }

/* Output
Amarjeet
100000.0
*/
