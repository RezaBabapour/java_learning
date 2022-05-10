package dashboard;

import model.User;

public class UserDashboard extends Dashboard {
    public UserDashboard(User user) {
        super(user);
    }

    @Override
    public void goToDashboard() {
        System.out.println(user.getUsername() + " Welcome to your profile");
        showUserInformation();
    }
}
