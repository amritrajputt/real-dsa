package findyear;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FindYear {
    public static void findYear (int numberOfPeople){
        try {
            String basePath = "D:/Problem - Find Year/Assignment/data";
            File data = new File(basePath);
            File[] getYears = data.listFiles();
            
            int start = 0;
            int end = getYears.length-1;
            while(start < end){
                int mid = start + (end-start)/2;
                int populationInJan;
                int populationInDec;
                String current = basePath+getYears[mid];
                BufferedReader br = new BufferedReader(new FileReader(current));
                String line;
                while((line = br.readLine()) != null){
                    line = br.readLine();
                    if(line == "[[Number of people: ${number}]]")
                }

            }
            
        }  catch (Exception e) {
            System.err.println("File not found: " + e.getMessage());
        }
        
    }
    public static void main(String [] args){
        findYear(5);
    }
}
