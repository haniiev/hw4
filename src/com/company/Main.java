package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        empl[] emplsArr = new empl[5];
        emplsArr[0] = new empl("Ivan", 1, 1000);
        emplsArr[1] = new empl("Vasya", 1, 2000);
        emplsArr[2] = new empl("Vitya", 2, 3000);
        emplsArr[3] = new empl("Kolya", 2, 4000);
        emplsArr[4] = new empl("Akakiy", 3, 5000);

        int dep = new Scanner(System.in).nextInt();
        for (int i = 0; i < emplsArr.length; i++) {
            if (emplsArr[i].getDepartment() == dep)
                System.out.println(emplsArr[i]);
        }
    }
}

