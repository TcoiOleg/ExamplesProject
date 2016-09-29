package ru.webexamples.app.api.entities;

import ru.webexamples.app.annotations.Entity;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "user")
public class User {
    @NotNull
    private String fistName;
    @NotNull
    private String lastName;
    private Date birthday;

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
