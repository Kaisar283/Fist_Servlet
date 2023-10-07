package com.edu.edu_javaee.com.edu.edu_javaee.db;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/add")
public class AddItemServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("item_name");
        int price = Integer.parseInt(req.getParameter("item_price"));
        int amount = Integer.parseInt(req.getParameter("item_amount"));

        Items item = new Items();
        item.setName(name);
        item.setPrice(price);
        item.setAmount(amount);

        DBManager.addItem(item);

        resp.sendRedirect("/index");
    }
}
