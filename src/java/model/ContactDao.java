 
package model;
 
 
import bean.ContactBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactDao {
    Connection con =null;
    PreparedStatement pstmt=null;
    public int insertContat(ContactBean c)
    {
        int result=0;
         
        try{
            con=MyConnection.getMyConnection();
            String sql="INSERT INTO contact_page(name,email,phone,subject,message) VALUES(?,?,?,?,?)";
            pstmt=con.prepareStatement(sql);
             pstmt.setString(1,c.getName());
             pstmt.setString(2,c.getEmail());
             pstmt.setString(3,c.getPhone());
             pstmt.setString(4,c.getSubject());
             pstmt.setString(5,c.getMessage());             
            System.out.println(pstmt);
            result=pstmt.executeUpdate();
             
         }catch(SQLException sqle){sqle.printStackTrace();}
        
        
        return result;
    }
    
}
