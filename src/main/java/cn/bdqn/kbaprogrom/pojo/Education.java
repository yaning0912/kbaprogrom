package cn.bdqn.kbaprogrom.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
@Entity
@Table(name = "EDUCATION")
public class Education {
    @Id
    private Long educationId;
    @Column(name = "EDUCATION_NAME")
    private String educationName;

    public Long getEducationId() {
        return educationId;
    }

    public void setEducationId(Long educationId) {
        this.educationId = educationId;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Education education = (Education) o;
        return Objects.equals(educationId, education.educationId) &&
                Objects.equals(educationName, education.educationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(educationId, educationName);
    }
}
