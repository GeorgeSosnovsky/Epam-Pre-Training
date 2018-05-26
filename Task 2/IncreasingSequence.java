public class IncreasingSequence {
    public static boolean typeSequence(int ch){
        int first = (ch / 1000) % 10;
        int second = (ch / 100) % 10;
        int third = (ch / 10) % 10;
        int fourth = (ch % 10);

        return (first < second & second < third & third < fourth);
    }

}

