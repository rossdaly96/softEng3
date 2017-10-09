package com.mycompany.ct417assignment1;

import java.util.ArrayList;

/** @author 14359691*/
public class Module {
    
    private String moduleName;
    private String courseID;
    private ArrayList<Student> studentList;
    
    public Module(String moduleName, String id, ArrayList list){
        this.moduleName = moduleName;
        this.courseID = id;
        this.studentList = list;
    }
    
    //getters and setters
    public String getModuleName(){
        return moduleName;
    }
    public void setModuleName(String name){
        this.moduleName = name;
    }
    public String getCourseID(){
        return courseID;
    }
    public void setCourseID(String courseID){
        this.courseID = courseID;
    }
    public ArrayList getStudentList(){
        return studentList;
    }
    public void setStudentList(ArrayList studentList){
        this.studentList = studentList;
    }
}
