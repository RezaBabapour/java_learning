package dashboard;

import model.User;

public class AuthorDashboard extends Dashboard {
    public AuthorDashboard(User user) {
        super(user);
    }

    @Override
    public void goToDashboard() {
        System.out.println(user.getUsername() + " Welcome to your profile");
        showUserInformation();
    }
}
