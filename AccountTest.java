public class AccountTest {
public static void main(String[] args){
SavingsAccount sa0001 = new SavingsAccount();
sa0001.name = "reza";
sa0001.deposit(1000);
System.out.println("Account Name: " + sa0001.name);
sa0001.displayCustomer();

}//end class AccountTest
} //end main method