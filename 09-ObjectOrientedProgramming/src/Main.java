import model.User;
import model.UserLevel;

public class Main {
    public static void main(String[] args) {

        // first instance of User class
        User u1 = new User();
        u1.setUsername("ali");
        u1.setFullName("ali ahmadi");
        u1.setPassword("ali._.ahmadi");
        u1.setEmail("ali@gmail.com");
        u1.setLevel(UserLevel.USER);

        // second instance of User class
        User u2 = new User();
        u2.setUsername("mahsa");
        u2.setFullName("mahsa aqaii");
        u2.setPassword("aqaii1234");
        u2.setEmail("mahsa@gmail.com");
        u2.setLevel(UserLevel.AUTHOR);

        // third instance of User class
        User u3 = new User();
        u3.setUsername("hesam");
        u3.setFullName("hesam sadr");
        u3.setPassword("hessadr.1111");
        u3.setEmail("sadr@gmail.com");
        u3.setLevel(UserLevel.ADMIN);

        // fourth instance of User class
        User u4 = new User();
        u4.setUsername("roxana");
        u4.setFullName("roxana");
        u4.setPassword("roxQWERTY");
        u4.setEmail("roxi@gmail.com");
        u4.setLevel(UserLevel.OWNER);

        // login users
        u1.login("ali", "ali.ahmadi");
        System.out.println("--------------------");
        u2.login("mahsa", "aqaii1234");
        System.out.println("--------------------");
        u3.login("hesam", "hessadr.1111");
        System.out.println("--------------------");
        u4.login("roxana", "roxQWERTY");
    }
}
