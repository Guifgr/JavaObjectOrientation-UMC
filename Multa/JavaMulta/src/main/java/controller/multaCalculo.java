/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.calculo;

/**
 *
 * @author Guifgr
 */
@WebServlet(name = "multaCalculo", urlPatterns = {"/multaCalculo"})
public class multaCalculo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            
        double precoMulta;
        double pontosMulta;
        String mensagem="Algo deu errado";
        
        try {
            double velocidade = Double.parseDouble(request.getParameter("velocidade"));
            double limite = Double.parseDouble(request.getParameter("limite"));
            
            
            if(velocidade>100){
                velocidade = velocidade*0.93;
            }else{
                velocidade= velocidade-7;
            }
            calculo multa = new calculo();
            multa.setVelocidade(velocidade);
            multa.setLimite(limite);
            precoMulta = multa.calculoMulta();
            pontosMulta = multa.calculoPontos();
            mensagem = "Você tomou "+pontosMulta+" e sua multa ficou em: "+precoMulta;
        } catch (Exception ex){
        }
        request.setAttribute("mensagem", mensagem);
        request.getRequestDispatcher("/resultado.jsp").forward(request, response);
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
