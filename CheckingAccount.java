public class CheckingAccount {
    double balance;
    String name;

    public void deposit(double x) {
        balance += x;
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
           
            System.out.println("GAGAL!! Masukan jumlah penarikan lebih dari Rp 0");
        }
        else if (amount > balance) {
            System.out.println("GAGAL!! Masukan jumlah penarikan lebih dari Rp 0" + amount);
        }
        else {
            balance += amount;
            System.out.println("Berhasil deposit: Rp " + amount);
            System.out.println("Saldo saat ini: Rp " + balance);
        } 
    }
}