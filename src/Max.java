public class Max {
    public static void main(String[] args) {


        int[][] arr = {{23, 123, 2300, 14, 56, 434},
                {1, 2, 3, 4, 5}};

        int[][] arr1 = new int[4][4];
        int b = 10;
        String string1 = "str";
        String str = test(myFuntion(1,5), string1);

        System.out.println(myFuntion(4, 5));
        int result = myFuntion(10, 11);
        test(1,"str","str2");



    }


    public static int myFuntion(int a, int b) {
        int sum = a + b;
        int x = 1;
        return sum;
    }

    public static String test(int i, String a) {

        return a + i;
    }
    public static String test(String i, String a) {

        return a + i;
    }
    public static void test(int i, String a,String b) {
        System.out.println(a);
    }

}
