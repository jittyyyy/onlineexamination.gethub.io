 
package model;
 
import bean.UserRegistrationBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserRegistrationDao {
    Connection con =null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    Statement stmt=null; 
    public UserRegistrationBean authenticate(String username, String password)
    {
        UserRegistrationBean obj=new UserRegistrationBean();        
        try
        {
            con=MyConnection.getMyConnection();
            String sql="SELECT userid,email,name FROM login_details  where email=? AND password=? AND usertype='Student'";
            pstmt=con.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                obj.setUserid(rs.getInt("userid"));
                obj.setEmail(rs.getString("email"));
                obj.setName(rs.getString("name"));
            }
        }
        catch(Exception e)
            { System.out.println(e);}
          
        return obj;
    
    }
    
    public UserRegistrationBean authenticateAdmin(String username, String password)
    {
        UserRegistrationBean obj=new UserRegistrationBean();        
        try
        {
            con=MyConnection.getMyConnection();
            String sql="SELECT userid,email,name FROM login_details  where email=? AND password=? AND usertype='admin'";
            pstmt=con.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                obj.setUserid(rs.getInt("userid"));
                obj.setEmail(rs.getString("email"));
                obj.setName(rs.getString("name"));
            }
        }
        catch(Exception e)
            { System.out.println(e);}
          
        return obj;
    
    }
    
    
    public int UserRegistration(UserRegistrationBean urb)
    {
        int result=0;
        System.out.println(urb);
        try{
            con=MyConnection.getMyConnection();
            String sql="INSERT INTO login_details(name,dob,gender,qualification,email,password,city,state,pincode,usertype,verifystring,address) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt=con.prepareStatement(sql);
             pstmt.setString(1,urb.getName());
             pstmt.setString(2,urb.getDob());
             pstmt.setString(3,urb.getGender());
             pstmt.setString(4,urb.getQualification());
             pstmt.setString(5,urb.getEmail());
             pstmt.setString(6,urb.getPassword());
             pstmt.setString(7,urb.getCity());
             pstmt.setString(8,urb.getState());
             pstmt.setString(9,urb.getPincode());
             pstmt.setString(10,urb.getUsertype());
             pstmt.setString(11,urb.getVerifyString());
             pstmt.setString(12,urb.getAddress());
            
            result=pstmt.executeUpdate();
             
         }catch(SQLException sqle){sqle.printStackTrace();}
        
        
        return result;
    }

     public UserRegistrationBean getUserByEmail(String email)
    {
        UserRegistrationBean obj=new UserRegistrationBean();        
        try
        {
            con=MyConnection.getMyConnection();
            String sql="SELECT userid, name, email, password, usertype, dob, gender, qualification, city, state, pincode, address, status, verifystring, querydate FROM login_details  where email=? AND usertype='Student'";
            pstmt=con.prepareStatement(sql);
            pstmt.setString(1,email);             
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                obj.setUserid(rs.getInt("userid"));                
                obj.setName(rs.getString("name"));
                obj.setDob(rs.getString("dob"));
                obj.setGender(rs.getString("gender"));
                obj.setQualification(rs.getString("qualification"));
                obj.setEmail(rs.getString("email"));
                obj.setAddress(rs.getString("address"));
                obj.setCity(rs.getString("city"));
                obj.setState(rs.getString("state"));
                obj.setPincode(rs.getString("pincode"));
                
            }
        }
        catch(Exception e)
            { System.out.println(e);}
          
        return obj;
    
    }

     
      public ArrayList<UserRegistrationBean> findAll()  
    {
        ArrayList<UserRegistrationBean> al=new ArrayList<UserRegistrationBean>();
         try
        {

            con=MyConnection.getMyConnection();
            String sql="select * from login_details";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            while(rs.next())
            { UserRegistrationBean obj= new UserRegistrationBean();
             obj.setUserid(rs.getInt("userid"));                    
                    obj.setName(rs.getString("name"));
                    obj.setDob(rs.getString("dob"));
                    obj.setGender(rs.getString("gender"));
                obj.setQualification(rs.getString("qualification"));
                obj.setEmail(rs.getString("email"));
                obj.setAddress(rs.getString("address"));
                obj.setCity(rs.getString("city"));
                obj.setState(rs.getString("state"));
                obj.setPincode(rs.getString("pincode"));          
            
             al.add(obj);
            }
        }
        catch(Exception e)
            { e.printStackTrace();}
         
        return al ;
    }
    
}
