package org.appops.studentapp.core;



public class Student {
    private int id;
    private String name;
    private int age;
    private String email;

    public Student(int id, String name, int age,String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email= email;
    }

 
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age +  ",Email: "+ email;
    }
    
    public String getEmail() {
    	return email;
    	
    }

   
    public int getId() { 
    	
    	return id;
    	
    }
    public void  setEmail(String email) {
		this.email = email;    	
    }
    
    public void setName(String name) { 
    	this.name = name; 
    	
    }
    public void setAge(int age) {
        this.age = age; 
}
}