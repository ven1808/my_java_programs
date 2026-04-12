import java.io.*;
import java.util.*;

public class StudentCSVCRUD {

    static String fileName = "Students.csv";

    public static void main(String[] args) {

        try {
            System.out.println("\n---- Initial File Content ----\n");
            displayFile();

            addStudents();
            System.out.println("\n---- After Adding 3 Students ----");
            displayFile();

            updateMarks();
            System.out.println("\n---- After Updating Marks ----");
            displayFile();

            calculatePercentage();
            System.out.println("\n---- After Calculating Percentage ----");
            displayFile();

            deleteStudent("102"); // change ID as needed
            System.out.println("\n---- After Deleting Student ----");
            displayFile();

        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }

    // ➤ Add 3 new students
    public static void addStudents() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
        System.out.println("\nAdding 3 new students");

        bw.write("\n101,John,CSE,78,82,85,0,0,0");
        bw.write("\n102,Alice,IT,88,79,91,0,0,0");
        bw.write("\n103,Bob,ECE,67,72,70,0,0,0");

        bw.close();
        
    }

    // ➤ Update marks4 and marks5
    public static void updateMarks() throws IOException {
        List<String[]> data = readCSV();

        for (int i = 1; i < data.size(); i++) {
            data.get(i)[6] = "75"; // marks4
            data.get(i)[7] = "80"; // marks5
        }

        writeCSV(data);
        System.out.println("Updated marks4 & marks5");
    }

    // ➤ Calculate percentage
    public static void calculatePercentage() throws IOException {
        List<String[]> data = readCSV();

        for (int i = 1; i < data.size(); i++) {
            String[] row = data.get(i);

            int total = 0;
            for (int j = 3; j <= 7; j++) {
                total += Integer.parseInt(row[j]);
            }

            double percentage = total / 5.0;
            row[8] = String.valueOf(percentage);
        }

        writeCSV(data);
        System.out.println("Calculated percentage");
    }

    // ➤ Delete student by ID
    public static void deleteStudent(String studentId) throws IOException {
        List<String[]> data = readCSV();
        List<String[]> newData = new ArrayList<>();

        for (String[] row : data) {
            if (!row[0].equals(studentId)) {
                newData.add(row);
            }
        }

        writeCSV(newData);
        System.out.println("Deleted student with ID: " + studentId);
    }

    // ➤ Read CSV
    public static List<String[]> readCSV() throws IOException {
        List<String[]> data = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = br.readLine()) != null) {
            data.add(line.split(","));
        }

        br.close();
        return data;
    }

    // ➤ Write CSV
    public static void writeCSV(List<String[]> data) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        for (String[] row : data) {
            bw.write(String.join(",", row));
            bw.newLine();
        }

        bw.close();
    }

    // ➤ Display file
    public static void displayFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}