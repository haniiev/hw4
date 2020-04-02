package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class empl {
    private String name;
    private int department;
    private int salary;

    empl(String name, int department, int salary) throws IOException {
      this.name = name;
      this.department = department;
      this.salary = salary;


        }

    public int getDepartment() {
        return department;
    }
}





