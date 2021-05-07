package com.glacier.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @author glacier
 * @version v1.0.0
 * @since <pre>2017/4/13 0013</pre>
 */
public class User implements Serializable {
    private static final long serialVersionUID = -3311756751335792019L;
    
    private String id;
    
    private String username;
    
    private String password;
    
    private Integer sex;
    
    private String nickname;
    
    private LocalDate birthday;
    
    private String idCard;
    
    private String duty;
    
    private LocalDate joinDate;
    
    private Double doubleData;
    
    public User() {
    }
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Integer getSex() {
        return sex;
    }
    
    public void setSex(Integer sex) {
        this.sex = sex;
    }
    
    public String getNickname() {
        return nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public LocalDate getBirthday() {
        return birthday;
    }
    
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
    public String getIdCard() {
        return idCard;
    }
    
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    
    public String getDuty() {
        return duty;
    }
    
    public void setDuty(String duty) {
        this.duty = duty;
    }
    
    public LocalDate getJoinDate() {
        return joinDate;
    }
    
    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }
    
    public Double getDoubleData() {
        return doubleData;
    }
    
    public void setDoubleData(Double doubleData) {
        this.doubleData = doubleData;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }
    
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", nickname='" + nickname + '\'' +
                ", birthday=" + birthday +
                ", idCard='" + idCard + '\'' +
                ", duty='" + duty + '\'' +
                ", joinDate=" + joinDate +
                ", doubleData=" + doubleData +
                '}';
    }
}
