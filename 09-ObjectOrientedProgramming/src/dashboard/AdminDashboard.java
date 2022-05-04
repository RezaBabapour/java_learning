package dashboard;

import model.User;

public class AdminDashboard extends Dashboard {
    public AdminDashboard(User user) {
        super(user);
    }

    @Override
    public void goToDashboard() {
        System.out.println(user.getUsername() + " Welcome to your profile");
        showUserInformation();
    }
}
