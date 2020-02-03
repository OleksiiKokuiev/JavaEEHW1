package HW1;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    private static List<User> listOfUsers = new ArrayList<User>();

    public User(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
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
    
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addUser (String firstName, String lastName, String phone, String email){
        User newUser = new User(firstName, lastName, phone, email);
        listOfUsers.add(newUser);
    }

    @Override
    public String toString() {
        return  firstName + " " +
                lastName + " " +
                phone + " " +
                email;
    }

    public static String printAllUsersInHTMLDoc() {

        StringBuilder str = new StringBuilder();

        for (User user : listOfUsers){
            str.append(user.toString()).append("<br>");
        }
        return String.valueOf(str);
    }
}
