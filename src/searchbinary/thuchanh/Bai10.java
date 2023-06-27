package searchbinary.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Integer[] a = getArr();
        System.out.println(Arrays.toString(a));
        int x = Integer.parseInt(new Scanner(System.in).nextLine());
        int y = Integer.parseInt(new Scanner(System.in).nextLine());
        for (int i = searchBinary(a, x); i <= searchBinary1(a, y) - 1; i++) {
            System.out.print(a[i] + "\t");
        }

    }

    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }

    public static int searchBinary(Integer[] list, int key){
        int low = 0;
        int high = list.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if (key < list[mid]){
                high = mid - 1;
            } else if (key > list[mid]){
                low = mid + 1;
            } else {
                return mid+1;
            }
        }
        return low;
    }

    public static int searchBinary1(Integer[] list, int key){
        int low = 0;
        int high = list.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if (key < list[mid]){
                high = mid - 1;
            } else if (key > list[mid]){
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return low;
    }
}
