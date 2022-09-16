/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dylan
 */
public class AgeCalculatorServlet extends HttpServlet {

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
        this.getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);   
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
        int ageInteger;
                
        String ageString = request.getParameter("ageInput");
        if(!ageString.equals("") && ageString.matches("^[0-9]+")) {
            ageInteger = Integer.parseInt(ageString) + 1;
            request.setAttribute("ageOutputField", String.format("Your age next birthday will be %d ", ageInteger));
        } else if(ageString.equals("") && ageString.equals("^[0-9]")) {
            request.setAttribute("ageOutputField", "You must give your current age.");
        } else {
            request.setAttribute("ageOutputField", "You must enter a number.");
        }
        this.getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);   
    }
}
