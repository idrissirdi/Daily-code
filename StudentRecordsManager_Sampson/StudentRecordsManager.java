import java.io.*;
import java.util.*;

/**
 * Main class that manages student records.
 */
public class StudentRecordsManager {

    public static void main(String[] args) {
        StudentRecordsManager manager = new StudentRecordsManager();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input filename: ");
        String inputFile = scanner.nextLine();

        System.out.print("Enter output filename: ");
        String outputFile = scanner.nextLine();

        try {
            manager.processStudentRecords(inputFile, outputFile);
        } catch (Exception e) {
            System.err.println("An error occurred while processing student records: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public void processStudentRecords(String inputFile, String outputFile) {
        try {
            List<Student> students = readStudentRecords(inputFile);
            writeResultsToFile(students, outputFile);
            System.out.println("Student records processed successfully. Output written to: " + outputFile);
        } catch (FileNotFoundException e) {
            System.err.println("Input file not found: " + inputFile + ". Please check the file path.");
        } catch (IOException e) {
            System.err.println("I/O error while processing files: " + e.getMessage());
        }
    }

    public List<Student> readStudentRecords(String filename) throws IOException {
        List<Student> students = new ArrayList<>();
        int lineNumber = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                try {
                    String[] parts = line.split(",");
                    if (parts.length < 6) {
                        throw new ArrayIndexOutOfBoundsException("Insufficient fields in line");
                    }

                    String studentId = parts[0].trim();
                    String name = parts[1].trim();

                    int[] grades = new int[4];
                    for (int i = 0; i < 4; i++) {
                        grades[i] = Integer.parseInt(parts[i + 2].trim());
                        if (grades[i] < 0 || grades[i] > 100) {
                            throw new InvalidGradeException("Grade out of range: " + grades[i]);
                        }
                    }

                    students.add(new Student(studentId, name, grades));

                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format on line " + lineNumber + ": " + e.getMessage());
                } catch (InvalidGradeException e) {
                    System.err.println("Invalid grade on line " + lineNumber + ": " + e.getMessage());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("Malformed line " + lineNumber + ": " + e.getMessage());
                }
            }
        }

        return students;
    }

    public void writeResultsToFile(List<Student> students, String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Student Grade Report");
            writer.println("====================");

            double totalGrades = 0;
            int studentCount = 0;
            int[] gradeCounts = new int[5]; // A, B, C, D, F

            for (Student s : students) {
                writer.println(s);  // relies on overridden toString
                double avg = s.getAverageGrade();
                totalGrades += avg;
                studentCount++;

                switch (s.getLetterGrade()) {
                    case 'A' -> gradeCounts[0]++;
                    case 'B' -> gradeCounts[1]++;
                    case 'C' -> gradeCounts[2]++;
                    case 'D' -> gradeCounts[3]++;
                    case 'F' -> gradeCounts[4]++;
                }
            }

            double classAverage = studentCount == 0 ? 0 : totalGrades / studentCount;
            writer.printf("%nClass Statistics:%n");
            writer.printf("Total students: %d%n", studentCount);
            writer.printf("Class average: %.2f%n", classAverage);
            writer.printf("Grade distribution: A: %d, B: %d, C: %d, D: %d, F: %d%n",
                    gradeCounts[0], gradeCounts[1], gradeCounts[2], gradeCounts[3], gradeCounts[4]);
        }
    }
}

/**
 * Custom exception for invalid grade values.
 */