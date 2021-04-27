/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.ReportBean;
import bean.TestdataBean;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ReportDao;
import model.TestdataDao;

/**
 *
 * @author pc
 */
public class SubmitExameServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            HttpSession sessionObj=request.getSession(false);
            String email=(String)sessionObj.getAttribute("email");
            int testid=(Integer)sessionObj.getAttribute("testid");            
            int catid=Integer.parseInt(request.getParameter("catid"));
            int totalquestion=0;
            int correctAns=0;
            int wrongAns=0;
            TestdataDao tdDao=new TestdataDao();
            ArrayList<TestdataBean> alist= tdDao.displayByTestID(testid);
            if(alist!=null)
                {
                   for(int i=0;i<alist.size();i++)
                    {
                        int ans=0;
                        totalquestion++;
                        
                        ans=tdDao.ansCount(alist.get(i));
                        if(ans>0)
			{
				correctAns++;

			}
			else{
				wrongAns++;
			}
                    }                   
                }
            ReportBean rb =new ReportBean();
            rb.setCatid(catid);
            rb.setCorrectans(correctAns);
            rb.setEmail(email);
            rb.setTestid(testid);
            rb.setTotalq(totalquestion);
            rb.setWrongans(wrongAns);
            
             int x=new ReportDao().insertReport(rb);
          if(x>0)
         {
             response.sendRedirect("previousresult.jsp");
         }
         else{
             response.sendRedirect("welcome.jsp?err=102");
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
