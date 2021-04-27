 
package model;
 

import bean.PaperCategoryBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PaperCategoryDao {
    Connection con =null;
    PreparedStatement pstmt=null;
    Statement stmt=null;
    ResultSet rs=null;
    public int insertPaperCategory(PaperCategoryBean pc)
    {
        int result=0;
         
        try{
            con=MyConnection.getMyConnection();
            String sql="INSERT INTO papercat(catname,catdetail) VALUES(?,?)";
             pstmt=con.prepareStatement(sql);
             pstmt.setString(1,pc.getCatName());
             pstmt.setString(2,pc.getCatDetail());                          
            
            result=pstmt.executeUpdate();
             
         }catch(SQLException sqle){sqle.printStackTrace();}
        
        
        return result;
    }
    
    
    public ArrayList<PaperCategoryBean> showAllPaperCategory()
    {
        ArrayList<PaperCategoryBean> al= new  ArrayList<PaperCategoryBean>();
        try
        {
            con=MyConnection.getMyConnection();
            String sql="SELECT * FROM papercat ";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {   
                PaperCategoryBean beanObj= new PaperCategoryBean();
                beanObj.setCatId(rs.getInt("catid"));
                beanObj.setCatName(rs.getString("catname"));
                beanObj.setCatDetail(rs.getString("catdetail"));
                al.add(beanObj);
            }
        }
        catch(Exception e)
            { e.printStackTrace();}
        
        
        return  al;
    }
    
    
    public String paperCategoryByid(int id)
    {
       String paperName=""; 
        try
        {
            con=MyConnection.getMyConnection();
            String sql="SELECT catname FROM papercat WHERE catid="+id;
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
             rs.next(); 
                 
                paperName= rs.getString("catname");
                
             
        }
        catch(Exception e)
            { e.printStackTrace();}
        
        
        return  paperName;
    }
}
