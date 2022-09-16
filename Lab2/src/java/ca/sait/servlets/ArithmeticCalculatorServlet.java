/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dylan
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/arithmetic"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstString = "";
        String secondString = "";
        request.setAttribute("arithmeticOutputField", "---");
        request.setAttribute("firstInputField", firstString);
        request.setAttribute("secondInputField", secondString);
        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstString = "";
        String secondString = "";
        try
        {
        firstString = request.getParameter("firstInput");
        secondString = request.getParameter("secondInput");
        double firstDouble = Double.parseDouble(firstString);
        double secondDouble = Double.parseDouble(secondString);
        String operationString = request.getParameter("operation");
        
        
            switch(operationString) {
                case "1":
                    request.setAttribute("arithmeticOutputField",String.format("%.6f", firstDouble + secondDouble));
                    break;
            
                case "2":
                    request.setAttribute("arithmeticOutputField",String.format("%.6f", firstDouble - secondDouble));
                    break;
                
                case "3":
                    request.setAttribute("arithmeticOutputField",String.format("%.6f", firstDouble * secondDouble));
                    break;
                
                case "4":
                    request.setAttribute("arithmeticOutputField",String.format("%.6f", firstDouble / secondDouble));
                    break;
            }
        } catch(Exception e) {
            request.setAttribute("arithmeticOutputField", "Invalid");
        }
        
        request.setAttribute("firstInputField", firstString);
        request.setAttribute("secondInputField", secondString);

        
        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
