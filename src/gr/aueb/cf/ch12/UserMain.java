package gr.aueb.cf.ch12;

public class UserMain {

    public static void main(String[] args) {

        User user = new User(1L, "George", "Alexander", "george21", "g@dsf32", true);

        user.setPassword("newPassword##");

        System.out.printf("{id: %d, Username: %s, Password: %s}", user.getId(), user.getUsername(), user.getPassword());
    }
}
