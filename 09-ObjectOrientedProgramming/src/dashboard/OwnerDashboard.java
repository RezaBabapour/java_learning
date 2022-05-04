package dashboard;

import model.User;

public class OwnerDashboard extends Dashboard {
    public OwnerDashboard(User user) {
        super(user);
    }

    @Override
    public void goToDashboard() {
        System.out.println(user.getUsername() + " Welcome to your profile");
        showUserInformation();
    }
}
