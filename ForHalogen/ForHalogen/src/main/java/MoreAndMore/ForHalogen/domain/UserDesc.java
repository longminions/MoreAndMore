package MoreAndMore.ForHalogen.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "USER_DESC")
public class UserDesc  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_DESC")
    @SequenceGenerator(sequenceName = "SEQ_USER_DESC", allocationSize = 1, name = "USER_DESC")
    @Column(name = "RECORD_NO")
    private Long recordNo;

    @Column(name = "ACCESS_LEVEL")
    private String accessLevel;

    @Column(name = "ACCESS_TIME_END")
    private String accessTimeEnd;

    @Column(name = "ACCESS_TIME_START")
    private String accessTimeStart;

    @Column(name = "ADDITIONAL_LANGUAGE")
    private String additionalLanguage;
   
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "DASHBOARD_ID")
    private String dashboardId;

    @Column(name = "DAY_OF_WEEK")
    private String dayOfWeek;
    
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @Column(name = "EFFECTIVE_DATE")
    private Date effectiveDate;

    private String email;

    @Column(name = "MOBILE_PHONE")
    private String mobilePhone;

    @Column(name = "NOTIFICATION")
    private String notification;
    
    @Column(name = "FORGOT_PASSWORD_FAILED_TIMES")
    private BigDecimal forgotPasswordFailedTimes;

    private String geidid;

    @Column(name = "GROUP_ID")
    private String groupId;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @Column(name = "INACTIVE_DATETIME")
    private Date inactiveDatetime;

    @Column(name = "LANGUAGE_CODE")
    private String languageCode;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @Column(name = "LAST_ACTIVITY_TIME")
    private Date lastActivityTime;

    @Column(name = "LAST_APPROVED_USER")
    private String lastApprovedUser;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @Column(name = "LAST_LOG_ON_TIME")
    private Date lastLogOnTime;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "LOG_ON")
    private String logOn;

    @Column(name = "LOGIN_FAILED_TIMES")
    private Long loginFailedTimes;

    @Column(name = "OWNER_ORG_ID")
    private String ownerOrgId;

    private String password;

    @Column(name = "PASSWORD_1")
    private String password1;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @Column(name = "PASSWORD_EXPIRATION_DATE")
    private Date passwordExpirationDate;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @Column(name = "PURGE_DATETIME")
    private Date purgeDatetime;

    @Column(name = "QUESTION_CODE")
    private BigDecimal questionCode;

    @Column(name = "RESET_IND")
    private String resetInd;

    @Column(name = "SESSION_ID")
    private String sessionId;

    @Column(name = "STATUS_CODE")
    private String statusCode;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_PIN")
    private BigDecimal userPin;

    @Column(name = "USER_STATUS")
    private String userStatus;

	public Long getRecordNo() {
		return recordNo;
	}

	public void setRecordNo(Long recordNo) {
		this.recordNo = recordNo;
	}

	public String getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getAccessTimeEnd() {
		return accessTimeEnd;
	}

	public void setAccessTimeEnd(String accessTimeEnd) {
		this.accessTimeEnd = accessTimeEnd;
	}

	public String getAccessTimeStart() {
		return accessTimeStart;
	}

	public void setAccessTimeStart(String accessTimeStart) {
		this.accessTimeStart = accessTimeStart;
	}

	public String getAdditionalLanguage() {
		return additionalLanguage;
	}

	public void setAdditionalLanguage(String additionalLanguage) {
		this.additionalLanguage = additionalLanguage;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDashboardId() {
		return dashboardId;
	}

	public void setDashboardId(String dashboardId) {
		this.dashboardId = dashboardId;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	public BigDecimal getForgotPasswordFailedTimes() {
		return forgotPasswordFailedTimes;
	}

	public void setForgotPasswordFailedTimes(BigDecimal forgotPasswordFailedTimes) {
		this.forgotPasswordFailedTimes = forgotPasswordFailedTimes;
	}

	public String getGeidid() {
		return geidid;
	}

	public void setGeidid(String geidid) {
		this.geidid = geidid;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Date getInactiveDatetime() {
		return inactiveDatetime;
	}

	public void setInactiveDatetime(Date inactiveDatetime) {
		this.inactiveDatetime = inactiveDatetime;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public Date getLastActivityTime() {
		return lastActivityTime;
	}

	public void setLastActivityTime(Date lastActivityTime) {
		this.lastActivityTime = lastActivityTime;
	}

	public String getLastApprovedUser() {
		return lastApprovedUser;
	}

	public void setLastApprovedUser(String lastApprovedUser) {
		this.lastApprovedUser = lastApprovedUser;
	}

	public Date getLastLogOnTime() {
		return lastLogOnTime;
	}

	public void setLastLogOnTime(Date lastLogOnTime) {
		this.lastLogOnTime = lastLogOnTime;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogOn() {
		return logOn;
	}

	public void setLogOn(String logOn) {
		this.logOn = logOn;
	}

	public Long getLoginFailedTimes() {
		return loginFailedTimes;
	}

	public void setLoginFailedTimes(Long loginFailedTimes) {
		this.loginFailedTimes = loginFailedTimes;
	}

	public String getOwnerOrgId() {
		return ownerOrgId;
	}

	public void setOwnerOrgId(String ownerOrgId) {
		this.ownerOrgId = ownerOrgId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public Date getPasswordExpirationDate() {
		return passwordExpirationDate;
	}

	public void setPasswordExpirationDate(Date passwordExpirationDate) {
		this.passwordExpirationDate = passwordExpirationDate;
	}

	public Date getPurgeDatetime() {
		return purgeDatetime;
	}

	public void setPurgeDatetime(Date purgeDatetime) {
		this.purgeDatetime = purgeDatetime;
	}

	public BigDecimal getQuestionCode() {
		return questionCode;
	}

	public void setQuestionCode(BigDecimal questionCode) {
		this.questionCode = questionCode;
	}

	public String getResetInd() {
		return resetInd;
	}

	public void setResetInd(String resetInd) {
		this.resetInd = resetInd;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BigDecimal getUserPin() {
		return userPin;
	}

	public void setUserPin(BigDecimal userPin) {
		this.userPin = userPin;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
}
