package com.google.sps.servlets;


import java.io.IOException;
import com.google.gson.Gson;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/head")
public class Server2 extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    ArrayList<String> temp = new ArrayList<String>();
    temp.add("This is cool");
    temp.add("I am confused");
    temp.add("I don't know if I can do this alone");
  
   String jsonresponse = convertToJsonUsingGson(temp);

    response.setContentType("application/json;");
    response.getWriter().println(jsonresponse);
  }
      
  private String convertToJsonUsingGson(ArrayList<String> temp) {
    Gson gson = new Gson();
    String json = gson.toJson(temp);
    return json;
  }
}