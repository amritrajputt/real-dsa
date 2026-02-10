package binaryconverter;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("binaryconverter/TestCases.txt");
            Scanner sc = new Scanner(file);
            int testNumber = 1;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");
                int input = Integer.parseInt(parts[0]);
                String expectedOutput = parts[1];
                String actualOutput = BinaryConverterUsingBitManipulation.integerToBinary(input);
               

                if (actualOutput.equals(expectedOutput)) {
                    System.out.println("Test " + testNumber + " passed");
                } else {
                    System.out.println("Test " + testNumber + " failed");
                    System.out.println("Input: " + input);
                    System.out.println("Expected: " + expectedOutput);
                    System.out.println("Your output: " + actualOutput);
                }
                testNumber++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found!...");
        }
    }
}
