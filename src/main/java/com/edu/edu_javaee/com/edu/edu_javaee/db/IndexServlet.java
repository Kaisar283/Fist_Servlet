package com.edu.edu_javaee.com.edu.edu_javaee.db;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Items> items = DBManager.getItems();
        PrintWriter out = resp.getWriter();

        out.println("<h1>Items List:</h1>");
        for(Items it : items){
            out.println("<h3>"+it.getId()+" "+it.getName()+" "+it.getPrice()+ " " +it.getAmount());
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
