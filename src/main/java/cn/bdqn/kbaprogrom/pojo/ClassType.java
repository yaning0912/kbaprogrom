package cn.bdqn.kbaprogrom.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
@Entity
@Table(name = "CLASS_DETAILS")
public class ClassType {
    @Id
    private Long classId;
    @Column(name = "CLASS_NAME")
    private String className;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassType classType = (ClassType) o;
        return Objects.equals(classId, classType.classId) &&
                Objects.equals(className, classType.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, className);
    }
}
