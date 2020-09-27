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
import model.Calculadora;

/**
 *
 * @author Guifgr
 */
@WebServlet(name = "operacoes", urlPatterns = {"/operacoes"})
public class operacoes extends HttpServlet {

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
        
        
        double resultado = 0;
        String mensagem = "Algo deu errado";
        
        try {
            String btnoperacao = request.getParameter("btnoperacao");    
            double n1 = Double.parseDouble(request.getParameter("valor1"));
            double n2 = Double.parseDouble(request.getParameter("valor2"));
            
            Calculadora calc = new Calculadora();
            calc.setV1(n1); //vai criar o valor 1 para o model que foi criado usando OO
            calc.setV2(n2);
            
            if(btnoperacao.equals("soma")){
              calc.somar();
              mensagem="O resultado da soma: ";
            }else if(btnoperacao.equals("diferenca")){
                calc.subtrair();
                mensagem="O resultado da subtração: ";
            }else if(btnoperacao.equals("multiplica")){
                calc.multiplicar();
                mensagem="O resultado da multiplicação: ";
            }else if(btnoperacao.equals("divide")){
                if(calc.verificarDivisao()==true){
                    calc.dividir();
                    mensagem="O resultado da divisao: ";    
                }else{
                    mensagem = "valor invalido ";
                }
                
            }
            
            
            
            resultado = calc.getResultado();
            
            
        } catch (Exception ex){
            mensagem = "Algo deu errado!!!";
        }
            request.setAttribute("mensagem", mensagem);
            request.setAttribute("resultado", resultado);

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
