package lesson6;

import java.io.Serializable;

public class Student implements Serializable {

    private int studentId;
    private String name;
    private int grade;


    public Student(final int studentId, final String name, final int grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(final int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(final int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(final Object inputObject) {

        boolean isEqual = false;

        if (this == inputObject) {

            isEqual = true;
        } else if (inputObject != null && getClass() == inputObject.getClass()) {

            final Student inputStudent = (Student) inputObject;

            if (this.getStudentId() == inputStudent.getStudentId()) {
                isEqual = true;
            }
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        return this.getStudentId();
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", name=" + name + ", grade=" + grade + "]";
    }

}
