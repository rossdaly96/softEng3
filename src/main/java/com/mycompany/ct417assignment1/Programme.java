package com.mycompany.ct417assignment1;

import java.util.ArrayList;
import java.util.Date;
import org.joda.time.DateTime;

/**@author 14359691 */
public class Programme {
    private String courseName;
    private ArrayList<Module> modules;
    private DateTime startDate;
    private DateTime endDate;
    
    public Programme(String courseName, ArrayList modules, DateTime startDate, DateTime endDate){
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
    public DateTime getStartDate(){
        return startDate;
    }
    public void setStartDate(DateTime start){
        this.startDate = start;
    }
    public DateTime getEndDate(){
        return endDate;
    }
    public void setEndDate(DateTime end){
        this.endDate = end;
    }
}
