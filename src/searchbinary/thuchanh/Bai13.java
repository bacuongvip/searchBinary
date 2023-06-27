package searchbinary.thuchanh;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String str2 = "";
        for (int i = 0; i < str.length() - 1 ; i++) {
            if(str.charAt(i) < str.charAt(i + 1)) {
                str2 += str.charAt(i);
            } else {
                break;
            }
        }
        System.out.println(str2);
    }
}
