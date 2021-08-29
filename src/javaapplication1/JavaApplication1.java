/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication1 {

    public static void main(String[] args) {

        List<Information> informationList = new ArrayList<Information>();

        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();

        for (int i = 0; i < counter; i++) {

            Information info = new Information();

            info.id = input.nextInt();
            info.firstName = input.next();
            info.cgpa = input.nextFloat();

            informationList.add(info);
        }

        Collections.sort(informationList, Comparator.comparing(Information::getCgpa).reversed()
                .thenComparing(Information::getFirst_Name).thenComparing(Information::getID));

        for (Information student : informationList) {
            System.out.println(student.getFirst_Name());
        }
    }
}
