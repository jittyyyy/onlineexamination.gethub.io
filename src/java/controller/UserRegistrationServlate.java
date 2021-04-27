/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserRegistrationBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserRegistrationDao;

/**
 *
 * @author pc
 */
public class UserRegistrationServlate extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String  name=request.getParameter("name");
        String	dob=request.getParameter("dob");
	String	gender=request.getParameter("gender");
	String	qualification=request.getParameter("qualification");
	String	email=request.getParameter("email");
	String	password=request.getParameter("password");
	String	confirmpassword=request.getParameter("confirmpassword");
	String	address=request.getParameter("address");
	String	city=request.getParameter("city");
	String	state=request.getParameter("state");
	String	pincode=request.getParameter("pincode");
	String	verifystring="std00145#gg";
	String	usertype="Student";
        
        UserRegistrationBean obj=new UserRegistrationBean();
        obj.setName(name);
         obj.setDob(dob);
         obj.setGender(gender);
         obj.setQualification(qualification);
         obj.setEmail(email);
         obj.setPassword(password);
         obj.setAddress(address);
         obj.setCity(city);
         obj.setState(state);
         obj.setPincode(pincode);
         obj.setVerifyString(verifystring);
         obj.setUsertype(usertype);
         
         int x=new UserRegistrationDao().UserRegistration(obj);
         if(x>0)
         {
             response.sendRedirect("login.html");
         }
         else{
             response.sendRedirect("registration.html?err=101");
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
