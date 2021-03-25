/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import proceso.Paso;
import proceso.User;
import proceso.encriptar;

/**
 *
 * @author carolina
 */
@WebServlet(name = "iniciarSesion", urlPatterns = {"/iniciarSesion"})
public class iniciarSesion extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
          String username = request.getParameter("username");
          String password = request.getParameter("password");
          
          String captcha = request.getParameter("g-recaptcha-response");
            System.out.println(username);
             System.out.println(password);
            
          boolean verificar = Paso.verificar(captcha);
          User pd = new User();
          if (verificar){
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_captacha_war_1.0-SNAPSHOTPU");
            EntityManager em = emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
            et.begin();
             Query cf =  em.createQuery("SELECT u FROM User u WHERE u.username=:username AND u.password=:password");
             cf.setParameter("username", username);
             cf.setParameter("password", encriptar.encrypt(password, "hoola"));
             List<User> dc = cf.getResultList();
            em.close();
            et.commit();
            if (dc.size()>0){
                
                 response.sendRedirect("bienvenidos.jsp");
            }else{
            response.sendRedirect("index.jsp");
            }
       
          }else{
              response.sendRedirect("index.jsp");
          
          }
          
        }
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
