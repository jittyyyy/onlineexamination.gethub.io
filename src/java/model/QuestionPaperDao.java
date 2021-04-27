/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import bean.QuestionPaperBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mohd Haris Khan
 */
public class QuestionPaperDao {
    Connection con =null;
    PreparedStatement pstmt=null;
    Statement stmt = null;
    ResultSet rs = null;
    public int insertData(QuestionPaperBean q)
    {
        int result=0;
         
        try{
            con=MyConnection.getMyConnection();
            String sql="INSERT INTO qpaper(qid,catid,question,option_a,option_b,option_c,option_d,answer) VALUES(?,?,?,?,?,?,?,?)";
            pstmt=con.prepareStatement(sql);
             pstmt.setInt(1, q.getQid());
             pstmt.setInt(2, q.getCatid());
             pstmt.setString(3,q.getQuestion());
             pstmt.setString(4,q.getOption_a());
             pstmt.setString(5,q.getOption_b());
             pstmt.setString(6,q.getOption_c());
             pstmt.setString(7,q.getOption_d());
              pstmt.setString(8,q.getAnswer());
            System.out.println(pstmt);
            result=pstmt.executeUpdate();
             
         }catch(SQLException sqle){sqle.printStackTrace();}
        return result;
    }
    
    public QuestionPaperBean displayByID(int qid) throws SQLException {
        QuestionPaperBean qp = new QuestionPaperBean();
         con=MyConnection.getMyConnection();
         stmt=con.createStatement();
        String sqlQ = "SELECT * FROM qpaper WHERE qid = " + qid;
            rs=stmt.executeQuery(sqlQ);
            if(rs.next()) {
                qp.setCatid(Integer.parseInt(rs.getString("catid")));
                qp.setQuestion(rs.getString("question"));
                qp.setOption_a(rs.getString("option_a"));
                qp.setOption_b(rs.getString("option_b"));
                qp.setOption_c(rs.getString("option_c"));
                qp.setOption_d(rs.getString("option_d"));
                qp.setAnswer(rs.getString("answer"));
                qp.setStatus(rs.getString("status"));
            }   
        return qp;
    }
    
    public QuestionPaperBean displayByCatID(int cid) throws SQLException {
        
         QuestionPaperBean qp = new QuestionPaperBean();
         con=MyConnection.getMyConnection();
            String sqlQ = "SELECT * FROM qpaper WHERE catid = " + cid+" order by RAND()";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sqlQ);
              while(rs.next()) {
                qp.setCatid(Integer.parseInt(rs.getString("catid")));
                qp.setQuestion(rs.getString("question"));
                qp.setOption_a(rs.getString("option_a"));
                qp.setOption_b(rs.getString("option_b"));
                qp.setOption_c(rs.getString("option_c"));
                qp.setOption_d(rs.getString("option_d"));
                qp.setAnswer(rs.getString("answer"));
                qp.setStatus(rs.getString("status"));
                qp.setQid(rs.getInt("qid"));
            }   
              con.close();
        return qp;
    }
    
    
    
    public ArrayList<QuestionPaperBean> diplayAll() {
    ArrayList<QuestionPaperBean> a1 = new ArrayList<QuestionPaperBean>();
    try{
    con=MyConnection.getMyConnection();
    stmt = con.createStatement();
    String sqlQ = "SELECT * FROM qpaper";
    rs= stmt.executeQuery(sqlQ);
    
    while(rs.next()) {
        QuestionPaperBean qp = new QuestionPaperBean();
        qp.setQid(Integer.parseInt(rs.getString("qid")));
        qp.setCatid(Integer.parseInt(rs.getString("catid")));
        qp.setQuestion(rs.getString("question"));
        qp.setOption_a(rs.getString("option_a"));
        qp.setOption_b(rs.getString("option_b"));
        qp.setOption_c(rs.getString("option_c"));
        qp.setOption_d(rs.getString("option_d"));
        qp.setAnswer(rs.getString("answer"));
        qp.setStatus(rs.getString("status"));
        a1.add(qp);
    }
    }catch(Exception se){
    se.printStackTrace();
    }
    return a1;
    }
    
    public int deleteDataByID(int uid){
        int result=0;
        try{
            con=MyConnection.getMyConnection();
            stmt=con.createStatement();
            String sql = "DELETE FROM qpaper WHERE qid=" + uid;
            result=stmt.executeUpdate(sql);
        }catch(Exception e){e.printStackTrace();}
        return result;
    }
    
    public int deleteAllData(){
        int result = 0;
        try{
            con=MyConnection.getMyConnection();
            stmt = con.createStatement();
            String sql = "DELETE FROM qpaper";
            result = stmt.executeUpdate(sql);
        }catch(Exception e){e.printStackTrace();}
        return result;
    }
    
    public int updateDataByID(QuestionPaperBean qp) {
    int result = 0;
    try{
       con=MyConnection.getMyConnection();
       stmt = con.createStatement();
       String sql="UPDATE TABLE qpaper SET catid=" + qp.getCatid() +", question='"+ qp.getQuestion()+"', option_a='" + qp.getOption_a()+ "', option_b='"+ qp.getOption_b() + "', option_c='"+qp.getOption_c()+"', option_d='"+ qp.getOption_d()+"', answer='" + qp.getAnswer() + "', status='"+qp.getStatus()+"'";
       result=stmt.executeUpdate(sql);
    }catch(Exception e){e.printStackTrace();}
    return result;
    }
    
}
