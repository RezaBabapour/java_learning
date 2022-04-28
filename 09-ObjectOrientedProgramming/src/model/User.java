package model;

import cryptography.PasswordEncryption;

public class User {
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String level;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = PasswordEncryption.encryptPassword(password);
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void login(String username, String password) {
        if (username.equals(this.username) && PasswordEncryption.encryptPassword(password).equals(this.password)) {
            System.out.println(this.username + " logged successfully");
            System.out.println(this.toString());
        } else {
            System.out.println("username or password is wrong");
        }
    }

    @Override
    public String toString() {
        return "username: " + this.username + "| fullname: " + this.fullName +
                "| password: " + this.password + "| email: " + this.email + "| level: " + this.level;
    }
}
