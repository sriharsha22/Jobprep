package controller;

import com.google.gson.Gson;
import model.PersonData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by harsha on 9/27/17.
 */
public class AngularJsServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public AngularJsServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        PersonData personData = new PersonData();
        personData.setFirstName("Harsha");
        personData.setLastName("Ande");

        System.out.println("doGet");

        String json = new Gson().toJson(personData);
        response.setContentType("application/json");
        response.getWriter().write(json);
    }

}
