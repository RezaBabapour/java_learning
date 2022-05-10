import dashboard.Dashboard;
import model.User;
import model.UserLevel;

public class Main {
    public static void main(String[] args) {

        // First instance of User class
        User u1 = new User("ali", "ali._.ahmadi", "ali@gmail.com");
        // The next day he registered his full name
        u1.setFullName("ali ahmadi");

        // Second instance of User class
        User u2 = new User("mahsa", "aghaii1234", "mahsa@gmail.com");
        // She first registered as a user and then was promoted to author level
        u2.setLevel(UserLevel.AUTHOR);
        u2.setFullName("mahsa aghaii");

        // Third instance of User class
        User u3 = new User("hesam", "hessadr.1111", "sadr@gmail.com", UserLevel.ADMIN);
        u3.setFullName("hesam sadr");

        // Fourth instance of User class
        User u4 = new User("roxana", "roxQWERTY", "roxi@gmail.com", UserLevel.OWNER, "roxana");

        // Login users
        u1.login("ali", "ali_ahmadi");
        System.out.println("--------------------");
        u1.login("ali", "ali._.ahmadi");
        System.out.println("--------------------");
        u2.login("mahsa", "aghaii1234");
        System.out.println("--------------------");
        u3.login("hesam", "hessadr.1111");
        System.out.println("--------------------");
        u4.login("roxana", "roxQWERTY");
    }
}
