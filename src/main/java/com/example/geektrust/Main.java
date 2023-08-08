package com.example.geektrust;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.geektrust.service.Service;

public class Main {
    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                inputs.add(sc.nextLine());
            }
            sc.close();

            Service service = new Service();
            int remainingPower = service.remainingPower(inputs);
            System.out.printf("POWER %s%n",remainingPower);
        } catch (IOException e) {
            System.out.println( e);
        }
    }
}
