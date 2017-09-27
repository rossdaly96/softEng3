package com.mycompany.ct417assignment1;

import java.util.ArrayList;
import java.util.Date;

/**@author 14359691 */
public class Programme {
    private String courseName;
    private ArrayList<Module> modules;
    private Date startDate;
    private Date endDate;
    
    public Programme(String courseName, ArrayList modules, Date startDate, Date endDate){
        this.courseName = courseName;
        this.modules = modules;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    //getters and setters
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public ArrayList getModules(){
        return modules;
    }
    public void setModules(ArrayList modules){
        this.modules = modules;
    }
    public Date getStartDate(){
        return startDate;
    }
    public void setStartDate(Date start){
        this.startDate = start;
    }
    public Date getEndDate(){
        return endDate;
    }
    public void setEndDate(Date end){
        this.endDate = end;
    }
}
