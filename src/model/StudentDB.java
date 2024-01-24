/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author NUC
 */
public class StudentDB 
{
   private Connection con;
   private Statement st;
   private PreparedStatement pst;
    
   
   private void connect()
   {
       try 
       {
           // Activate the driver 
           Class.forName("oracle.jdbc.OracleDriver");
           con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
       } 
       catch (Exception e) 
       {
           System.out.println("exception in connect :"+e);
       }
   }
   
   public boolean insert(Student st)
   {
       
       try 
       {
           connect();
           pst = con.prepareStatement("insert into hr.student values(?,?,?,?)");
           pst.setInt(1, st.getId());
           pst.setString(2, st.getName());
           pst.setString(3, st.getCourse());
           pst.setInt(4, st.getFees());
           
           pst.executeUpdate();
           //pst.close();
           pst.close();
           con.close();
        return true;    
       } catch (Exception e) 
       {
           
           System.out.println("Exception in insert :"+e);
           return false;
       }
       
   }
   
   public ArrayList<Student> view()
   {
       ArrayList<Student> studentlist=new ArrayList<Student>();
       try 
       {
           connect();
           st=con.createStatement();
           ResultSet rs = st.executeQuery("select * from hr.student");
           
           while(rs.next())
           {
               Student s=new Student();
               s.setId(rs.getInt(1));
               s.setName(rs.getString(2));
               s.setCourse(rs.getString(3));
               s.setFees(rs.getInt(4));
               studentlist.add(s);
                       
           }
           rs.close();
           st.close();
           con.close();
           
       } 
       catch (Exception e) 
       {
           System.out.println("Exception in view "+e);
       }
       return studentlist;
   }
    public ArrayList<Student> view(int id)
   {
       ArrayList<Student> studentlist=new ArrayList<Student>();
       try 
       {
           connect();
           st=con.createStatement();
           String pass="select * from hr.student where  maths>35 and sci>35 and eng>35";
           String fail="select * from hr.student where  maths<35 or sci>35 or eng<35 and sid=";
           
           ResultSet rs = st.executeQuery((id==0)?pass:fail);
           
           //ResultSet rs = st.executeQuery("select * from hr.student where  maths>35 and sci>35 and eng>35  sid="+id);
           
           while(rs.next())
           {
               Student s=new Student();
               s.setId(rs.getInt(1));
               s.setName(rs.getString(2));
               s.setCourse(rs.getString(3));
               s.setFees(rs.getInt(4));
               studentlist.add(s);
                       
           }
           rs.close();
           st.close();
           con.close();
           
       } 
       catch (Exception e) 
       {
           System.out.println("Exception in view "+e);
       }
       return studentlist;
   }
   
    
}
