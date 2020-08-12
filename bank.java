import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        SavingAmount s1 = new SavingAmount(n);
        s1.decrement();
        System.out.println(s1.getSaving());
        s1.increment();
        System.out.println(s1.getSaving());
        s1.checkSavings();
        System.out.println(s1);
    }
}
class SavingAmount {

    private int saving;

    public SavingAmount(int saving){
        this.saving=saving;
    }
    public String toString() {
        return "Your current savings are Rs " + saving;
    }

    public int getSaving() {
        return saving;
    }
    public void increment() {
        this.saving +=1000;
    }
    public void decrement() {
        this.saving -=100;
    }
    public void checkSavings() {
        if(saving>=1000){
            System.out.println("Congratulations! You have saved a good amount");
        }
        else if(saving<1000 && saving>=0){
            System.out.println("Insufficient saving!");
        }
        else {
            System.out.println("You are in debt");
        }
    }
}
