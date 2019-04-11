package cn.bdqn.kbaprogrom.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Objects;
@Entity
@Table(name = "USER_INFO")
public class UserInfo {
    @Id
    private Long userId;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "USER_PASS")
    private String userPass;
    @Column(name = "USER_TNAME")
    private String userTname;
    @Column(name = "TYPE_ID")
    private Long typeId;
    @Column(name = "SCHOOL_ID")
    private Long schoolId;
    @Column(name = "USER_POST")
    private String userPost;
    @Column(name = "USER_DEPARTMENT")
    private String userDepartment;
    @Column(name = "USER_TEACHDATE")
    private Time userTeachdate;
    @Column(name = "USER_TEACHSUBJECT")
    private String userTeachsubject;
    @Column(name = "USER_BIRTHDAY")
    private Time userBirthday;
    @Column(name = "USER_AGE")
    private Long userAge;
    @Column(name = "EDUCATION_ID")
    private Long educationId;
    @Column(name = "MAJOR_ID")
    private Long majorId;
    @Column(name = "USER_NAMEID")
    private String userNameid;
    @Column(name = "CLASS_ID")
    private Long classId;
    @Column(name = "USER_MOBILEPHONE")
    private String userMobilephone;
    @Column(name = "USER_LANDLINEPHON")
    private String userLandlinephon;
    @Column(name = "USER_EMAIL")
    private String userEmail;
    @Column(name = "USER_PHONADDRESS")
    private String userPhonaddress;
    @Column(name = "USER_ADMINDETAILS")
    private String userAdmindetails;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserTname() {
        return userTname;
    }

    public void setUserTname(String userTname) {
        this.userTname = userTname;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getUserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }

    public Time getUserTeachdate() {
        return userTeachdate;
    }

    public void setUserTeachdate(Time userTeachdate) {
        this.userTeachdate = userTeachdate;
    }

    public String getUserTeachsubject() {
        return userTeachsubject;
    }

    public void setUserTeachsubject(String userTeachsubject) {
        this.userTeachsubject = userTeachsubject;
    }

    public Time getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Time userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Long getUserAge() {
        return userAge;
    }

    public void setUserAge(Long userAge) {
        this.userAge = userAge;
    }

    public Long getEducationId() {
        return educationId;
    }

    public void setEducationId(Long educationId) {
        this.educationId = educationId;
    }

    public Long getMajorId() {
        return majorId;
    }

    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    public String getUserNameid() {
        return userNameid;
    }

    public void setUserNameid(String userNameid) {
        this.userNameid = userNameid;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getUserMobilephone() {
        return userMobilephone;
    }

    public void setUserMobilephone(String userMobilephone) {
        this.userMobilephone = userMobilephone;
    }

    public String getUserLandlinephon() {
        return userLandlinephon;
    }

    public void setUserLandlinephon(String userLandlinephon) {
        this.userLandlinephon = userLandlinephon;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhonaddress() {
        return userPhonaddress;
    }

    public void setUserPhonaddress(String userPhonaddress) {
        this.userPhonaddress = userPhonaddress;
    }

    public String getUserAdmindetails() {
        return userAdmindetails;
    }

    public void setUserAdmindetails(String userAdmindetails) {
        this.userAdmindetails = userAdmindetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(userId, userInfo.userId) &&
                Objects.equals(userName, userInfo.userName) &&
                Objects.equals(userPass, userInfo.userPass) &&
                Objects.equals(userTname, userInfo.userTname) &&
                Objects.equals(typeId, userInfo.typeId) &&
                Objects.equals(schoolId, userInfo.schoolId) &&
                Objects.equals(userPost, userInfo.userPost) &&
                Objects.equals(userDepartment, userInfo.userDepartment) &&
                Objects.equals(userTeachdate, userInfo.userTeachdate) &&
                Objects.equals(userTeachsubject, userInfo.userTeachsubject) &&
                Objects.equals(userBirthday, userInfo.userBirthday) &&
                Objects.equals(userAge, userInfo.userAge) &&
                Objects.equals(educationId, userInfo.educationId) &&
                Objects.equals(majorId, userInfo.majorId) &&
                Objects.equals(userNameid, userInfo.userNameid) &&
                Objects.equals(classId, userInfo.classId) &&
                Objects.equals(userMobilephone, userInfo.userMobilephone) &&
                Objects.equals(userLandlinephon, userInfo.userLandlinephon) &&
                Objects.equals(userEmail, userInfo.userEmail) &&
                Objects.equals(userPhonaddress, userInfo.userPhonaddress) &&
                Objects.equals(userAdmindetails, userInfo.userAdmindetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userPass, userTname, typeId, schoolId, userPost, userDepartment, userTeachdate, userTeachsubject, userBirthday, userAge, educationId, majorId, userNameid, classId, userMobilephone, userLandlinephon, userEmail, userPhonaddress, userAdmindetails);
    }
}
