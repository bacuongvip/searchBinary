package searchbinary.thuchanh;

import java.util.*;

public class Bai6 {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        getArr(arr);
        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println(arr);
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        System.out.println(arr.contains(key));
    }

    private static void getArr(List<Integer> arr){
        for (int i = 0; i < 20; i++) {
            arr.add((int)(Math.random() * 100));
        }
    }

}
