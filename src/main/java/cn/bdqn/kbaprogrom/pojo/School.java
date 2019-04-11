package cn.bdqn.kbaprogrom.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
@Entity
@Table(name = "SCHOOL")
public class School {
    @Id
    private Long schoolId;
    @Column(name = "SCHOOL_NAME")
    private String schoolName;
    @Column(name = "SCHOOL_PROVINCE")
    private String schoolProvince;

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolProvince() {
        return schoolProvince;
    }

    public void setSchoolProvince(String schoolProvince) {
        this.schoolProvince = schoolProvince;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schoolId, school.schoolId) &&
                Objects.equals(schoolName, school.schoolName) &&
                Objects.equals(schoolProvince, school.schoolProvince);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolId, schoolName, schoolProvince);
    }
}
