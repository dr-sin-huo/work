package com.shortrent.myproject.generator.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    private Integer usrId;

    private BigInteger userPhone;

    private String usrPassword;

    private String userMail;

    private String userSex;

    private String userState;

    private Date userBirthday;

    private String userCertificateType;

    private Integer userIdNumber;

    private String userEducation;

    private String userWork;

    private String userArea;

    private String userImage;

    private String userFavorites;

    private static final long serialVersionUID = 1L;

    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public BigInteger getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(BigInteger userPhone) {
        this.userPhone = userPhone;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserCertificateType() {
        return userCertificateType;
    }

    public void setUserCertificateType(String userCertificateType) {
        this.userCertificateType = userCertificateType;
    }

    public Integer getUserIdNumber() {
        return userIdNumber;
    }

    public void setUserIdNumber(Integer userIdNumber) {
        this.userIdNumber = userIdNumber;
    }

    public String getUserEducation() {
        return userEducation;
    }

    public void setUserEducation(String userEducation) {
        this.userEducation = userEducation;
    }

    public String getUserWork() {
        return userWork;
    }

    public void setUserWork(String userWork) {
        this.userWork = userWork;
    }

    public String getUserArea() {
        return userArea;
    }

    public void setUserArea(String userArea) {
        this.userArea = userArea;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserFavorites() {
        return userFavorites;
    }

    public void setUserFavorites(String userFavorites) {
        this.userFavorites = userFavorites;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUsrId() == null ? other.getUsrId() == null : this.getUsrId().equals(other.getUsrId()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUsrPassword() == null ? other.getUsrPassword() == null : this.getUsrPassword().equals(other.getUsrPassword()))
            && (this.getUserMail() == null ? other.getUserMail() == null : this.getUserMail().equals(other.getUserMail()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserState() == null ? other.getUserState() == null : this.getUserState().equals(other.getUserState()))
            && (this.getUserBirthday() == null ? other.getUserBirthday() == null : this.getUserBirthday().equals(other.getUserBirthday()))
            && (this.getUserCertificateType() == null ? other.getUserCertificateType() == null : this.getUserCertificateType().equals(other.getUserCertificateType()))
            && (this.getUserIdNumber() == null ? other.getUserIdNumber() == null : this.getUserIdNumber().equals(other.getUserIdNumber()))
            && (this.getUserEducation() == null ? other.getUserEducation() == null : this.getUserEducation().equals(other.getUserEducation()))
            && (this.getUserWork() == null ? other.getUserWork() == null : this.getUserWork().equals(other.getUserWork()))
            && (this.getUserArea() == null ? other.getUserArea() == null : this.getUserArea().equals(other.getUserArea()))
            && (this.getUserImage() == null ? other.getUserImage() == null : this.getUserImage().equals(other.getUserImage()))
            && (this.getUserFavorites() == null ? other.getUserFavorites() == null : this.getUserFavorites().equals(other.getUserFavorites()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUsrId() == null) ? 0 : getUsrId().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUsrPassword() == null) ? 0 : getUsrPassword().hashCode());
        result = prime * result + ((getUserMail() == null) ? 0 : getUserMail().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserState() == null) ? 0 : getUserState().hashCode());
        result = prime * result + ((getUserBirthday() == null) ? 0 : getUserBirthday().hashCode());
        result = prime * result + ((getUserCertificateType() == null) ? 0 : getUserCertificateType().hashCode());
        result = prime * result + ((getUserIdNumber() == null) ? 0 : getUserIdNumber().hashCode());
        result = prime * result + ((getUserEducation() == null) ? 0 : getUserEducation().hashCode());
        result = prime * result + ((getUserWork() == null) ? 0 : getUserWork().hashCode());
        result = prime * result + ((getUserArea() == null) ? 0 : getUserArea().hashCode());
        result = prime * result + ((getUserImage() == null) ? 0 : getUserImage().hashCode());
        result = prime * result + ((getUserFavorites() == null) ? 0 : getUserFavorites().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usrId=").append(usrId);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", usrPassword=").append(usrPassword);
        sb.append(", userMail=").append(userMail);
        sb.append(", userSex=").append(userSex);
        sb.append(", userState=").append(userState);
        sb.append(", userBirthday=").append(userBirthday);
        sb.append(", userCertificateType=").append(userCertificateType);
        sb.append(", userIdNumber=").append(userIdNumber);
        sb.append(", userEducation=").append(userEducation);
        sb.append(", userWork=").append(userWork);
        sb.append(", userArea=").append(userArea);
        sb.append(", userImage=").append(userImage);
        sb.append(", userFavorites=").append(userFavorites);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}