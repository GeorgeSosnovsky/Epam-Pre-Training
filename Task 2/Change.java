public class Change {
    public static String changeValue(int p, int m) {
        p += m;
        m = p - m;
        p = m - p;

        return ("First variable was " + m + "," + " now = " +p +
                ". Second variable was "+ p + "," + " now = " +m);
    }
}
