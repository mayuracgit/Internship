package com.mac.project.web.calculator;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Addition extends HttpServlet {

@Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstNumber = request.getParameter("firstNumber");
        String secondNumber = request.getParameter("secondNumber");
        int addition = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);

        response.setContentType("text/html");
        response.getWriter().write("Addition is: "+ addition + "<br/> <a href='./Calculator2.html'>Click here<a/> to continue.");
    }

}
