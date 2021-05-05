package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double currentQualityScore = grade * courseCredits;


    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (numberOfCredits < 30) {
            return "Freshman";
        } else if (numberOfCredits > 29 && numberOfCredits < 60) {
            return "Sophomore";
        } else if (numberOfCredits > 59 && numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int StudentId) {
        this.studentId = StudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(int NumberOfCredits) {
        this.numberOfCredits = NumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double Gpa) {
        this.gpa = Gpa;
    }
}