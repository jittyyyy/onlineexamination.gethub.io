 
package model;

 
import bean.ReportBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ReportDao {
     Connection con =null;
    PreparedStatement pstmt=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    public int insertReport(ReportBean rb)
    {
        int result=0;
         
        try{
            con=MyConnection.getMyConnection();
            String sql="INSERT INTO report(testid,catid,totalq,correctans,wrongans,email) VALUES (?,?,?,?,?,?)";
             pstmt=con.prepareStatement(sql);
             pstmt.setInt(1,rb.getTestid());
             pstmt.setInt(2,rb.getCatid());
             pstmt.setInt(3,rb.getTotalq());
             pstmt.setInt(4,rb.getCorrectans());
             pstmt.setInt(5,rb.getWrongans());
             pstmt.setString(6,rb.getEmail());
             result=pstmt.executeUpdate();
             
         }catch(SQLException sqle){sqle.printStackTrace();}       
        
        return result;
    }
    
    
    
    public ArrayList<ReportBean> showAllReportsByEmail(String email)
    {
        ArrayList<ReportBean> al= new  ArrayList<ReportBean>();
        try
        {
            con=MyConnection.getMyConnection();
            String sql="SELECT reportid, testid, catid, totalq, correctans, wrongans, email FROM report WHERE email='"+email+"' order by reportid desc ";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {   
                ReportBean beanObj= new ReportBean();
                beanObj.setReportid(rs.getInt("reportid"));
                beanObj.setTestid(rs.getInt("testid"));
                beanObj.setCatid(rs.getInt("catid"));
                beanObj.setTotalq(rs.getInt("totalq"));
                beanObj.setCorrectans(rs.getInt("correctans"));
                beanObj.setWrongans(rs.getInt("wrongans"));
                beanObj.setEmail(rs.getString("email"));
                                
                al.add(beanObj);
            }
        }
        catch(Exception e)
            { e.printStackTrace();}
        
        
        return  al;
    }

    
     public ReportBean showAllReportsByReportId(int reportid)
    {
         ReportBean beanObj= new ReportBean();
        try
        {
            con=MyConnection.getMyConnection();
            String sql="SELECT reportid, testid, catid, totalq, correctans, wrongans, email FROM report WHERE reportid='"+reportid+"' ";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {   
                 
                beanObj.setReportid(rs.getInt("reportid"));
                beanObj.setTestid(rs.getInt("testid"));
                beanObj.setCatid(rs.getInt("catid"));
                beanObj.setTotalq(rs.getInt("totalq"));
                beanObj.setCorrectans(rs.getInt("correctans"));
                beanObj.setWrongans(rs.getInt("wrongans"));
                beanObj.setEmail(rs.getString("email"));
                                
                
            }
        }
        catch(Exception e)
            { e.printStackTrace();}
        
        
        return  beanObj;
    }

    
    
}
