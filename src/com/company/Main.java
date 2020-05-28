package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String inputString;

        System.out.println("Enter a word :");
        inputString = scanner.nextLine();

        String[] array = {"a", "e", "ı", "i", "o", "ö", "u", "ü","A", "E", "I", "İ", "O", "Ö", "U", "Ü"};


        List<String> ArrayList = new ArrayList<String>(Arrays.asList(inputString.split("")));

        for (int i = 0 ; i < ArrayList.size() ; i++ ){
            String temp = ArrayList.get(i);
            for (int j = 0 ; j < array.length ; j++ ){
                if (temp == array[j]);
                ArrayList.remove(array[j]);
            }
        }

        for (int i = 0 ; i < ArrayList.size() ; i++ ) {
            System.out.print(ArrayList.get(i));
        }
    }

}
