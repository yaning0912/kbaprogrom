package cn.bdqn.kbaprogrom.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Objects;
@Entity
@Table(name = "NEWS")
public class News {
    @Id
    private Long newsId;
    @Column(name = "NEWS_TITLE")
    private String newsTitle;
    @Column(name = "NEWS_DETAILS")
    private String newsDetails;
    @Column(name = "NEWS_DATE")
    private Time newsDate;

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsDetails() {
        return newsDetails;
    }

    public void setNewsDetails(String newsDetails) {
        this.newsDetails = newsDetails;
    }

    public Time getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Time newsDate) {
        this.newsDate = newsDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(newsId, news.newsId) &&
                Objects.equals(newsTitle, news.newsTitle) &&
                Objects.equals(newsDetails, news.newsDetails) &&
                Objects.equals(newsDate, news.newsDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId, newsTitle, newsDetails, newsDate);
    }
}
