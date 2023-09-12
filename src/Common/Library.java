package Common;

import java.util.Scanner;

public class Library {
    public String setString(String promt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(promt + ":");
        String Str = sc.nextLine();
        return Str;
    }

}
