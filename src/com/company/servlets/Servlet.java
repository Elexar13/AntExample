package com.company.servlets;

import com.company.beans.UserBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class Servlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        UserBean userBean = new UserBean();
//        HttpSession session = request.getSession();
//        session.setAttribute("userBean", userBean);
        UserBean userBean = null;
        try{
            userBean = (UserBean) request.getSession().getAttribute("userBean");
            userBean.setUsername(request.getParameter("name"));
        }catch (NullPointerException ex){
            userBean = new UserBean();
        }
        request.getSession().setAttribute("userBean", userBean);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request, response);
    }

}
