/**
 * Class representing a student record with grades.
 * Demonstrates basic OOP principles and data encapsulation.
 */
public class Student {
    private String studentId;
    private String name;
    private int[] grades;
    private double averageGrade;
    private char letterGrade;

    /**
     * Constructor to initialize a Student object
     * @param studentId The student's ID
     * @param name The student's name
     * @param grades Array of the student's grades
     */
    public Student(String studentId, String name, int[] grades) {
        this.studentId = studentId;
        this.name = name;
        this.grades = grades;
        this.averageGrade = calculateAverage();
        this.letterGrade = determineLetterGrade();
    }

    /**
     * Calculates the average of all grades
     * @return The average grade as a double
     */
    private double calculateAverage() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return grades.length == 0 ? 0 : (double) sum / grades.length;
    }

    /**
     * Determines the letter grade based on the average
     * @return A character representing the letter grade (A, B, C, D, or F)
     */
    private char determineLetterGrade() {
        if (averageGrade >= 90) return 'A';
        if (averageGrade >= 80) return 'B';
        if (averageGrade >= 70) return 'C';
        if (averageGrade >= 60) return 'D';
        return 'F';
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    /**
     * Returns a string representation of the student
     * @return String containing all student information
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(studentId).append(", Name: ").append(name).append(", Grades: ");
        for (int g : grades) {
            sb.append(g).append(" ");
        }
        sb.append(String.format(", Average: %.2f", averageGrade));
        sb.append(", Letter Grade: ").append(letterGrade);
        return sb.toString();
    }
}
