package HW1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {

    static final String TEMPLATE = "<html>" +
            "<head><title>HW1</title></head>" +
            "<body><h1>%s</h1></body></html>";

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String firstName = req.getParameter("name");
        String lastName = req.getParameter("surname");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");

        User user = new User(firstName, lastName, phone, email);

        resp.getWriter().println(String.format(TEMPLATE, "New user has been successfully added." + "<br>" +
                "Click back button to add one more user " + "or " +
                "add /list to URL in order to see all registered users"));
    }
}
