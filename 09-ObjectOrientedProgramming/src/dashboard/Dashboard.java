package dashboard;

import model.User;

public abstract class Dashboard {
    protected final User user;

    public Dashboard(User user) {
        this.user = user;
    }

    public abstract void goToDashboard();

    protected void showUserInformation() {
        System.out.println("username: " + user.getUsername() + " | full name: " + user.getFullName()
                + " | email: " + user.getEmail() + " | level: " + user.getLevel());
    }
}
