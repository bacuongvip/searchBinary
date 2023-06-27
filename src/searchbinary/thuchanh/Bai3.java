package searchbinary.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    static int arr[][] = new int[10][10];

    public static void main(String[] args) {
        getArr();
        print();
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        search(key);
    }

    private static void getArr() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    private static void print(){
        for(int[] num : arr){
            System.out.println(Arrays.toString(num));
        }
    }

    private static void search(int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(key == arr[i][j]){
                    System.out.println(i+"."+j);
                }
            }
        }
    }
}
