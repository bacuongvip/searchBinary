package searchbinary.thuchanh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int[] a = getArr();
        List list = new ArrayList();
        System.out.println(Arrays.toString(a));
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();
        for (int i = 0; i < a.length; i++) {
            if(a[i] > x && a[i] < y && !list.contains(a[i])) {
                list.add(a[i]);
            }
        }
        System.out.println(list);
    }

    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

}
