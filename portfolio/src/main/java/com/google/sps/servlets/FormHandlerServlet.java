package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String email = request.getParameter("email");

    // Write the value to the response so the user can see it.
    response.setContentType("text/html;");
    response.getWriter().println("<p> First Name: " + firstName +"</p>");
    response.getWriter().println("<p> Last Name: " + lastName +"<p>");
    response.getWriter().println("<p> Email: " + email +"<p>");
  }
} 
