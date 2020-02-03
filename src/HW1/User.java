package HW1;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String firstName;
    private String lastName;
    private String phone;

    private static List<User> listOfUsers = new ArrayList<User>();

    public User(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        listOfUsers.add(User.this);
    }

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addUser (String firstName, String lastName, String phone){
        User newUser = new User(firstName, lastName, phone);
        listOfUsers.add(newUser);
    }

    @Override
    public String toString() {
        return  firstName + " " +
                lastName + " " +
                phone;
    }

    public static String printAllUsersInHTMLDoc() {

        StringBuilder str = new StringBuilder();

        for (User user : listOfUsers){
            str.append(user.toString()).append("<br>");
        }
        return String.valueOf(str);
    }
}
