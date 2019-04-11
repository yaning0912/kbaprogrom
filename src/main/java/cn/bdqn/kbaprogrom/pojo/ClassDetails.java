package cn.bdqn.kbaprogrom.pojo;

import jdk.Exported;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Objects;
@Entity
@Table(name = "CLASS_DETAILS")
public class ClassDetails {
    @Id
    private Long classId;
    @Column(name = "CLASS_NAME")
    private String className;
    @Column(name = "SCHOOL_ID")
    private Long schoolId;
    @Column(name = "PROVINCE")
    private String province;
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "CLASS_STATE")
    private Long classState;
    @Column(name = "CLASS_DATE")
    private Time classDate;

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getClassState() {
        return classState;
    }

    public void setClassState(Long classState) {
        this.classState = classState;
    }

    public Time getClassDate() {
        return classDate;
    }

    public void setClassDate(Time classDate) {
        this.classDate = classDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassDetails that = (ClassDetails) o;
        return Objects.equals(classId, that.classId) &&
                Objects.equals(className, that.className) &&
                Objects.equals(schoolId, that.schoolId) &&
                Objects.equals(province, that.province) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(classState, that.classState) &&
                Objects.equals(classDate, that.classDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, className, schoolId, province, userId, classState, classDate);
    }
}
