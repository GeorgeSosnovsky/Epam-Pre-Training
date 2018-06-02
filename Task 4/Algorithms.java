public class Algorithms {
    private static final int DIVIDER = 10;

    public static int findMaxNum(int number){
        int с, max = 0;
        while (number != 0){
            с = number % DIVIDER;
            if (с > max){
                max = с;
            }
            number /= DIVIDER;
        }
        return max;
    }

    public static boolean checkPalindrome(int number){
        int oldNumber = number;
        int reverseNumber = 0;
        while(number != 0){
            reverseNumber = reverseNumber * DIVIDER + (number % DIVIDER);
            number /= DIVIDER;
        }
        if (reverseNumber == oldNumber){
            return true;
        }
        return false;
    }

    public static boolean checkSimpleNum(int number) {
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String findAllDivider(int number){
        String str = "";
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                if(checkSimpleNum(i)) {
                    str += i + " ";
                }
            }
        }
        return str;
    }

    public static String calcNODandNOK(int nFirst, int nSecond){
//        if (nFirst > nSecond){
//            int tmp = nSecond;
//            nSecond = nFirst;
//            nFirst = tmp;
//        }
        String str = "";
        for (int i = nFirst; i > 0; i--){
            if (nFirst % i == 0 && nSecond % i == 0){
                str += "NOD = " + i;
                break;
            }
        }
        for(int i = nSecond; i < (nFirst*nSecond)+1; i++){
            if (i % nFirst == 0 && i % nSecond == 0){
                str += "\tNOK = " + i;
                break;
            }
        }
        return str;
    }

    public static int calcDifferentNum(int number){
        int tmp, tmp2, count = 0;
        int newNum;
        while (number != 0){
            count++;
            tmp = number % DIVIDER;
            number /= DIVIDER;
            newNum = number;
            while(newNum != 0){
                tmp2 = newNum % DIVIDER;
                if (tmp == tmp2){
                    count--;
                    break;
                }
                newNum /= DIVIDER;
            }
        }
        return count;
    }
}
