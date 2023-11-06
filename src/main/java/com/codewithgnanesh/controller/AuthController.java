package com.codewithgnanesh.controller;

import com.codewithgnanesh.dao.UserDao;
import com.codewithgnanesh.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthController extends HttpServlet {
    private final UserDao userDao;
    public AuthController() {

            userDao = new UserDao();
        }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("here");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User loggedInUser=userDao.loginUser(username,password);
        if(loggedInUser!=null) {
            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("id", loggedInUser.getId());
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("todo.jsp");
            requestDispatcher.forward(req, resp);
        }else {
            req.setAttribute("error", true);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req, resp);
        }
    }
}
