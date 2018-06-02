public class Main {
    public static void main(String[] args) {
        System.out.println("Calculate Heads and Tails");
        int number = 1000;
        int heads = Coin.calculateHeadsOrTails(number);
        System.out.println("Heads: " + heads + "\nTails: " + (number - heads));

       ;
        int num = 5673;
        System.out.println("Max number of "+ num + ": " + Algorithms.findMaxNum(num));

        int nPalindrome = 1234567;
        boolean flag = Algorithms.checkPalindrome(nPalindrome);
        if (flag){
            System.out.println("\nNumber " + nPalindrome + " is Palindrome!");
        }
        else{
            System.out.println("\nNumber " + nPalindrome + " isn't Palindrome!");
        }

        int simple = 102;
        boolean flagSimple = Algorithms.checkSimpleNum((simple));
        if (flagSimple){
            System.out.println("\nNumber " + simple + " is simple!!");
        }
        else{
            System.out.println("\nNumber " + simple + " isn't simple!!");
        }

        int divider = 48;
        System.out.println("\nNumber " + divider + " have simple divider: " + Algorithms.findAllDivider(divider));

        int first = 2;
        int second = 22;

        int diff = 12345;
        System.out.println("\nNumber " + diff + " have " + Algorithms.calcDifferentNum(diff) + " different number!");


        int perfect = 8128;
        boolean flagPerfect = PerfectNumber.findPerfectNum(perfect);
        if  (flagPerfect) {
            System.out.println("Number " + perfect + " is Perfect Number!!");
        }
        else {
            System.out.println("Number " + perfect + " isn't Perfect Number!!");
        }

    }
}
