package model;

import cryptography.PasswordEncryption;
import dashboard.*;

public class User {

    public User() {
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = PasswordEncryption.encodePassword(password);
        this.email = email;
        this.level = UserLevel.USER;
        this.fullName = "Unknown";
    }

    public User(String username, String password, String email, String level) {
        this.username = username;
        this.password = PasswordEncryption.encodePassword(password);
        this.email = email;
        this.level = level;
        this.fullName = "Unknown";
    }

    public User(String username, String password, String email, String level, String fullName) {
        this.username = username;
        this.password = PasswordEncryption.encodePassword(password);
        this.email = email;
        this.level = level;
        this.fullName = fullName;
    }

    private String username;
    private String password;
    private String fullName;
    private String email;
    private String level;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = PasswordEncryption.encodePassword(password);
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

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getLevel() {
        return level;
    }

    public void login(String username, String password) {
        if (username.equals(this.username) && PasswordEncryption.checkPassword(password, this.password)) {
            System.out.println(this.username + " logged successfully");
            System.out.println("Entering the " + this.level + " page ...");
            switch (this.level) {
                case UserLevel.USER -> {
                    UserDashboard user = new UserDashboard(new User(this.username, this.password, this.email, this.level, this.fullName));
                    user.goToDashboard();
                }
                case UserLevel.AUTHOR -> {
                    AuthorDashboard author = new AuthorDashboard(new User(this.username, this.password, this.email, this.level, this.fullName));
                    author.goToDashboard();
                }
                case UserLevel.ADMIN -> {
                    AdminDashboard admin = new AdminDashboard(new User(this.username, this.password, this.email, this.level, this.fullName));
                    admin.goToDashboard();
                }
                case UserLevel.OWNER -> {
                    OwnerDashboard owner = new OwnerDashboard(new User(this.username, this.password, this.email, this.level, this.fullName));
                    owner.goToDashboard();
                }
            }
        } else {
            System.out.println("username or password is wrong");
        }
    }
}
