// File: AccountTest2.java
import java.util.Scanner;
public class accountTest2 {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.balance = 500.0;
        account.name = "mevlana";

        System.out.println("nama:"  + account.name);
        System.out.println("saldo kamu: " + account.balance);
        System.out.println("____________________________");
        
        System.out.println("____PENARIKAN SALDO____");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah penarikan: (Rp): ");
        double amount = input.nextDouble();

        account.withdraw(amount);

        input.close();
    }
 }
