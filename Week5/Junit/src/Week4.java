import java.lang.Math;

public class Week4 {
    /**
     * Max value.
     * 
     * @param a - num a
     * @param b - num b
     * @return max
     */
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        if (a > b) {
            return a;
        }
        return b;
    }

    /**
     * Min value in arr.
     * 
     * @param array - arr
     * @return min
     */
    public static int minArray(int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    /**
     * BMI.
     * 
     * @param weight - kg
     * @param height - m
     * @return String
     */
    public static String calculateBMI(double weight, double height) {
        // Tinh BMI
        double tmp = weight / (height * height);
        double bmi = Math.round(tmp * 10.0) / 10.0;

        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi <= 22.9) {
            return "Bình thường";
        } else if (bmi <= 24.9) {
            return "Thừa cân";
        }

        return "Béo phì";
    }
}
