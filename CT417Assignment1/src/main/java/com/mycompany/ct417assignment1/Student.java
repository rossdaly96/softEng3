package com.mycompany.ct417assignment1;

/**@author 14359691*/
public class Student {
    private String name;
    private int age;
    private String DOB;
    private String ID;
    private String username;
    
    public Student(String Name, int Age, String DOB, String id){
        this.name = Name;
        this.age = Age;
        this.DOB = DOB;
        this.ID = id;
        this.username = Name+Age;
    }
    
    //practice code
    public void printInfo(){
        System.out.println("My name is "+name+". I am "+age+" years old.");
    }
    
    //Creating all the getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getDOB(){
        return DOB;
    }
    public void setDOB(String DOB){
        this.DOB = DOB;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public String getUsername(){
        return username;
    }
    public void setuserName(String username){
        this.username = username;
    }
}
