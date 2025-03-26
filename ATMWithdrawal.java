//ATM Withdrawal
public class ATMWithdrawal {
    public static void dispenseCash(int amount) {
        if (amount % 100 != 0) {
            System.out.println("Invalid amount. Enter a multiple of 100.");
            return;
        }

        int[] notes = {2000, 500, 100};
        for (int note : notes) {
            if (amount >= note) {
                System.out.println((amount / note) + " x " + note);
                amount %= note;
            }
        }
    }

    public static void main(String[] args) {
        dispenseCash(3700);
    }
}