package main.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloWorld extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out = res.getWriter();
        String abc = request.getParameter("abc");
        out.println("hello world");
        if (abc != null) {
            out.println("parametr = " + abc);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        if(request.getParameter("imie").equals("Johny")){
            res.setStatus(418);
            out.print(res);
        }else out.print("Hello " +request.getParameter("imie"));

    }

}
