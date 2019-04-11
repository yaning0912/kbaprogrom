package cn.bdqn.kbaprogrom.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
@Entity
@Table(name = "NOTICE")
public class Notice {
    @Id
    private Long noticeId;
    @Column(name = "NOTICE_TITLE")
    private String noticeTitle;
    @Column(name = "NOTICE_DETAILS")
    private String noticeDetails;

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeDetails() {
        return noticeDetails;
    }

    public void setNoticeDetails(String noticeDetails) {
        this.noticeDetails = noticeDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notice notice = (Notice) o;
        return Objects.equals(noticeId, notice.noticeId) &&
                Objects.equals(noticeTitle, notice.noticeTitle) &&
                Objects.equals(noticeDetails, notice.noticeDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noticeId, noticeTitle, noticeDetails);
    }
}
