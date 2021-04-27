/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.TestrBean;
import java.io.IOException; 
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.TestrDao;

public class TestStartServlate extends HttpServlet {

     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int catid=Integer.parseInt(request.getParameter("catid"));
            HttpSession sessionObj=request.getSession(false);
            String email=(String)sessionObj.getAttribute("email");
           Random rand = new Random();
           int testid=rand.nextInt(9999); 
            sessionObj.setAttribute("catid", catid);
             sessionObj.setAttribute("testid", testid);
            TestrBean beanobj= new TestrBean();
            beanobj.setTestid(testid);
            beanobj.setEmail(email);
            beanobj.setCatid(catid);
            int x=new  TestrDao().insertData(beanobj);
          if(x>0)
         {
             response.sendRedirect("ExameStart.jsp?catid="+catid);
         }
         else{
             response.sendRedirect("selectsubject.jsp?err=102");
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
