public class Main {
    public static void main(String[] args) {
        int a = 0;

        int [] arr = {1,2,3,4,5};
        int []arr1 = new int[10];
        String[] strArr = {"a","b","c"};
        System.out.println(strArr[2]);
        int x  = arr[2];
        arr[2] = 10;
        arr1[6] = arr[0];

//        System.out.println(arr[2]);
//        System.out.println(x);
        for (int i = 0; i < 10; i++) {
            arr1[a] = a;
            a++;
            System.out.println(arr1[i]);

        }
    }
}