package com.example.easynotes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class AppUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean active;
    private int cityId;
    private String cityName;
    private int countryId;
    private String countryName;
    private String createdBy;
    private Date createdAt;
    private String designation;
    private String email;
    private String mobile;
    private String modifiedBy;
    private Date modifiedAt;
    private String name;
    private String profilePic;
    private String region;
    private String firstName;
    private String lastName;
    private String opt;
    private Date otpTimestamp;
    private String password;
    private int level;
    private Long parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOpt() {
        return opt;
    }

    public void setOpt(String opt) {
        this.opt = opt;
    }

    public Date getOtpTimestamp() {
        return otpTimestamp;
    }

    public void setOtpTimestamp(Date otpTimestamp) {
        this.otpTimestamp = otpTimestamp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "AppUsers{" +
                "id=" + id +
                ", active=" + active +
                ", cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdAt=" + createdAt +
                ", designation='" + designation + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", modifiedAt=" + modifiedAt +
                ", name='" + name + '\'' +
                ", profilePic='" + profilePic + '\'' +
                ", region='" + region + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", opt='" + opt + '\'' +
                ", otpTimestamp=" + otpTimestamp +
                ", password='" + password + '\'' +
                ", level=" + level +
                ", parentId=" + parentId +
                '}';
    }
}
