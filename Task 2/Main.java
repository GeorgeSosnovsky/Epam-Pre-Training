public class Main {
    public static void main(String[] args){
        int a = 342;
        int b = 1;
        int c = 44;
        System.out.printf("Is it %d, %d, %d are all equal? : %b\n", a, b, c,
                NumberEquality.checkEquality(a, b, c));

        double w = 4549;
        System.out.printf("Dinosaur's weight: %.2f kg = %.2f ml = %.2f gram = %.2f ton\n", w,
                DinosaurWeight.converseMills(w), DinosaurWeight.converseGrams(w), DinosaurWeight.converseTons(w));

        double r1 = 34;
        double r2 = 17;
        System.out.printf("Area of the ring = %.2f\n",
                Ring.calculateArea(r1, r2));

        int ch = 1234;
        System.out.printf("Is it true, that digits of %d create increasing sequence? --> %b\n", ch,
                IncreasingSequence.typeSequence(ch));

        int numb = 639756;
        System.out.printf("Geometric and arithmetic average of digits %d is %s \n", numb,
                Average.calculateAverage(numb));

        int n = 1234567;
        System.out.printf("Reversion of number %d is %d \n", n, Reverse.reverseNumber(n));

        int p = 1234;
        int m = 4321;
        System.out.printf( Change.changeValue(p, m), "\n");


    }
}
