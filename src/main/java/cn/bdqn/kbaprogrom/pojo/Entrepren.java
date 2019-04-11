package cn.bdqn.kbaprogrom.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Objects;
@Entity
@Table(name = "ENTREPREN")
public class Entrepren {
    @Id
    private Long entreprenId;
    @Column(name = "ENTREPREN_TITLE")
    private String entreprenTitle;
    @Column(name = "ENTREPREN_DETAILS")
    private String entreprenDetails;
    @Column(name = "ENTREPREN_DATE")
    private Time entreprenDate;

    public Long getEntreprenId() {
        return entreprenId;
    }

    public void setEntreprenId(Long entreprenId) {
        this.entreprenId = entreprenId;
    }

    public String getEntreprenTitle() {
        return entreprenTitle;
    }

    public void setEntreprenTitle(String entreprenTitle) {
        this.entreprenTitle = entreprenTitle;
    }

    public String getEntreprenDetails() {
        return entreprenDetails;
    }

    public void setEntreprenDetails(String entreprenDetails) {
        this.entreprenDetails = entreprenDetails;
    }

    public Time getEntreprenDate() {
        return entreprenDate;
    }

    public void setEntreprenDate(Time entreprenDate) {
        this.entreprenDate = entreprenDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrepren entrepren = (Entrepren) o;
        return Objects.equals(entreprenId, entrepren.entreprenId) &&
                Objects.equals(entreprenTitle, entrepren.entreprenTitle) &&
                Objects.equals(entreprenDetails, entrepren.entreprenDetails) &&
                Objects.equals(entreprenDate, entrepren.entreprenDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entreprenId, entreprenTitle, entreprenDetails, entreprenDate);
    }
}
