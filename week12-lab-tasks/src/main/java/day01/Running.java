package day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Running {

    public double sumDistanceForYearAndMonthByFile(int year, int month, String path) {
        double distanceSum = 0d;
        String line;
        String[] lineArray;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                lineArray = line.split("[ ;-]");
                if (isRelevantLineArray(lineArray, year, month)) {
                    distanceSum += Double.parseDouble(lineArray[0]);
                }
            }
            return distanceSum;
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.", exception);
        }
    }

    // --- private methods ----------------------------------------------------

    private boolean isRelevantLineArray(String[] lineArray, int year, int month) {
        return
            lineArray[2].equals(Integer.toString(year)) &&
            lineArray[3].equals(Integer.toString(month));
    }
}