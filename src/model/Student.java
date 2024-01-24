/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

    sql :- 



 */
package model;

/**
 *
 * @author NUC
 */
public class Student 
{
    private int id;
    private String name;
    private String course;
    private int fees;
    
    private static String courses[]={"C","C++","Java","Python"};
    private  static int course_fees[]={5000,12000,23000,22222};

    public static String[] getCourses() {
        return courses;
    }

    public static int[] getCourse_fees() {
        return course_fees;
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the fees
     */
    public int getFees() {
        return fees;
    }

    /**
     * @param fees the fees to set
     */
    public void setFees(int fees) {
        this.fees = fees;
    }
    
    
    
}
