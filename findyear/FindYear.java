package findyear;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class FindYear {
    public static int findYear(int numberOfPeople) {
        try {
            String basePath = "D:/Problem - Find Year/Assignment/data";
            File data = new File(basePath);
            File[] getYears = data.listFiles(File::isDirectory);
if(getYears.length==0 || getYears == null) return -1;
            Arrays.sort(getYears,
                    (a, b) -> Integer.compare(
                            Integer.parseInt(a.getName()),
                            Integer.parseInt(b.getName())));

            int start = 0;
            int end = getYears.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;

                File current = getYears[mid];
                File janFile = new File(current, "January.txt");
                File decFile = new File(current, "December.txt");

                int populationInJan = extractPopulation(janFile);
                int populationInDec = extractPopulation(decFile);

                if (numberOfPeople < populationInJan) {
                    end = mid - 1;
                } else if (numberOfPeople > populationInDec) {
                    start = mid + 1;
                } else {
                    File[] months = current.listFiles(File::isFile);
                    for (File month : months) {
                        int population = extractPopulation(month);
                        if (population == numberOfPeople) {
                            return Integer.parseInt(current.getName());
                        }
                    }

                    return -1;
                }
            }

        } catch (Exception e) {
            System.err.println("File not found: " + e.getMessage());
        }
        return -1;
    }

   private static int extractPopulation(File file) throws Exception {
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains("Number of people")) {
                return Integer.parseInt(line.replaceAll("[^0-9]", ""));
            }
        }
        return -1;
    }
}

    public static void main(String[] args) {
        int result = findYear(329);
        if (result != -1)
            System.out.println("Found in year: " + result);
        else
            System.out.println("Not Found");
    }
}
