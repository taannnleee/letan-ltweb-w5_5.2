package letan.servlet;

import letan.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("testServlet Get");
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String url = "/index.jsp";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.jsp";    // the "join" page
        } else if (action.equals("add")) {
            String receiveAnnouncements = "";
            String hearAboutUs = request.getParameter("HearAboutUs");

            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            String _receiveAnnouncements = request.getParameter("yesILikeThat");
            String contact = request.getParameter("contactMethod");

            if (_receiveAnnouncements != null) {
                receiveAnnouncements = "Yes";
            } else {
                receiveAnnouncements = "No";
            }

            if(firstName.isEmpty()||lastName.isEmpty()||email.isEmpty()){
                request.setAttribute("eror","All three values are required");
                url = "/index.jsp";
            }
            else {
                // store data in User object and save User object in db
                User user = new User(firstName, lastName, email, hearAboutUs, receiveAnnouncements, contact);

                // set User object in request object and set URL
                request.setAttribute("user", user);
                url = "/thanks.jsp";   // the "thanks" page
            }
        }

        // forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);

        // In chữ ra console (5.1  Mục 7)
        System.out.println("Value of 'action' parameter: " + action);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("testServlet Get");
        doPost(request, response);
    }
}
