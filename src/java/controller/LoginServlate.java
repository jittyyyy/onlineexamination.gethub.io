 
package controller;

import bean.UserRegistrationBean;
import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UserRegistrationDao;
 
public class LoginServlate extends HttpServlet {
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String usn=request.getParameter("email");
         String pwd=request.getParameter("pass");
         UserRegistrationBean sbean= new UserRegistrationDao().authenticate(usn, pwd);
         if(sbean.getUserid()>0){            
            HttpSession  sessionObj=null;
            sessionObj=request.getSession();
            sessionObj.setAttribute("email", sbean.getEmail());
              
            sessionObj.setAttribute("username", sbean.getName());
            response.sendRedirect("welcome.jsp");
         }
         else{
             response.sendRedirect("login.html?err=invaliduser");
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
