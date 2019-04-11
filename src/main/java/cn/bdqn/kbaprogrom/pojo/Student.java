package cn.bdqn.kbaprogrom.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    private String studentId;
    @Column(name = "STUDENT_NAME")
    private String studentName;
    @Column(name = "STUDENT_SEX")
    private Long studentSex;
    @Column(name = "STUDENT_AGE")
    private Long studentAge;
    @Column(name = "STUDENT_SCHOOL")
    private String studentSchool;
    @Column(name = "STUDENT_MAJOR")
    private String studentMajor;
    @Column(name = "GRADE_ID")
    private Long gradeId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Long getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Long studentSex) {
        this.studentSex = studentSex;
    }

    public Long getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Long studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentSchool() {
        return studentSchool;
    }

    public void setStudentSchool(String studentSchool) {
        this.studentSchool = studentSchool;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId) &&
                Objects.equals(studentName, student.studentName) &&
                Objects.equals(studentSex, student.studentSex) &&
                Objects.equals(studentAge, student.studentAge) &&
                Objects.equals(studentSchool, student.studentSchool) &&
                Objects.equals(studentMajor, student.studentMajor) &&
                Objects.equals(gradeId, student.gradeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentSex, studentAge, studentSchool, studentMajor, gradeId);
    }
}
