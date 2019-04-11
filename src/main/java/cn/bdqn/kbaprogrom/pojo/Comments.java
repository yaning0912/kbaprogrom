package cn.bdqn.kbaprogrom.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Objects;
@Entity
@Table(name = "COMMENTS")
public class Comments {
    @Id
    private Long commentId;
    @Column(name = "NEWS_ID")
    private Long newsId;
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "COMMENT_DETAILS")
    private String commentDetails;
    @Column(name = "COMMENT_DATE")
    private Time commentDate;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCommentDetails() {
        return commentDetails;
    }

    public void setCommentDetails(String commentDetails) {
        this.commentDetails = commentDetails;
    }

    public Time getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Time commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comments comments = (Comments) o;
        return Objects.equals(commentId, comments.commentId) &&
                Objects.equals(newsId, comments.newsId) &&
                Objects.equals(userId, comments.userId) &&
                Objects.equals(commentDetails, comments.commentDetails) &&
                Objects.equals(commentDate, comments.commentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId, newsId, userId, commentDetails, commentDate);
    }
}
