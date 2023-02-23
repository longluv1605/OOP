import org.junit.Test;

public class Week4Test {
    //public static Week4 test = new Week4();

    @Test
    public static void testMax2Int1(){
        org.junit.Assert.assertEquals(Week4.max2Int(1, 2), 2);   
    }

    @Test
    public static void testMax2Int2(){
        org.junit.Assert.assertEquals(Week4.max2Int(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MAX_VALUE);
    }

    @Test
    public static void testMax2Int3(){
        org.junit.Assert.assertEquals(Week4.max2Int(10000, 9999), 10000);
    }

    @Test
    public static void testMax2Int4(){
        org.junit.Assert.assertEquals(Week4.max2Int(-1, 0), 0);
    }

    @Test
    public static void testMax2Int5(){
        org.junit.Assert.assertEquals(Week4.max2Int(67, 67676), 67676);
    }

    @Test
    public static void testMinArray1(){
        int[] arr = {1, 2, 3, 4 ,5 ,6, 7, 8, 9};
        org.junit.Assert.assertEquals(Week4.minArray(arr), 1);
    }

    @Test
    public static void testMinArray2(){
        int[] arr = {12321, 2312, 5343, -4354 , 5453423, -33242346, 7, 38, 94};
        org.junit.Assert.assertEquals(Week4.minArray(arr), -33242346);
    }

    @Test
    public static void testMinArray3(){
        int[] arr = {12321, 2312, 5343, -433243254 , 54533423, -33242346, 7, 38, 94};
        org.junit.Assert.assertEquals(Week4.minArray(arr), -433243254);
    }

    @Test
    public static void testMinArray4(){
        int[] arr = {12321, 2312, 5232343, -4354 , 5453423, -33242346, 7, 38, 94};
        org.junit.Assert.assertEquals(Week4.minArray(arr), -33242346);
    }

    @Test
    public static void testMinArray5(){
        int[] arr = {12321, 434342312, 5343, -4354 , -5453423, -33242346, 7, 38, 94};
        org.junit.Assert.assertEquals(Week4.minArray(arr), -33242346);
    }

    @Test
    public static void testCalculateBMI1(){
        org.junit.Assert.assertEquals(Week4.calculateBMI(45, 1.6), "Thiếu cân");
    }

    @Test
    public static void testCalculateBMI2(){
        org.junit.Assert.assertEquals(Week4.calculateBMI(62, 1.8), "Bình thường");
    }

    @Test
    public static void testCalculateBMI3(){
        org.junit.Assert.assertEquals(Week4.calculateBMI(73, 1.7), "Béo phì");
    }

    @Test
    public static void testCalculateBMI4(){
        org.junit.Assert.assertEquals(Week4.calculateBMI(50, 1.6), "Bình thường");
    }

    @Test
    public static void testCalculateBMI5(){
        org.junit.Assert.assertEquals(Week4.calculateBMI(100, 1.7), "Béo phì");
    }
} 

