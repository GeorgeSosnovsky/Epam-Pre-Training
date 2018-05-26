public class DinosaurWeight {
    public static final int CONVERT_TO_MILLIS = 1_000_000;
    public static final int CONVERT_TO_GRAMS = 1_000;
    public static final double CONVERT_TO_TONS = 0.001;

    public static double converseMills(double kg){
        return kg*CONVERT_TO_MILLIS;
    }

    public static double converseGrams(double kg){
        return kg*CONVERT_TO_GRAMS;
    }

    public static double converseTons(double kg){
        return kg*CONVERT_TO_TONS;
    }
}
