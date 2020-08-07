package com.cars;

public class Car {
    //Attributes/Fields/Properties/instance variable
    private String registrationNumber;
    private String company;
    private int model;
    private String color;

    //No-Arg Constructor
    public Car(){
        setRegistrationNumber("000");
        setCompany(" ");
        setModel(2000);
        setColor("White");
    }
    //Overloaded 1-Arg Overloaded Constructor
    public Car(int model){
        setModel(model);
        setRegistrationNumber("");
        setColor("");
        setCompany("");
    }
    //2-arg overloaded
    public Car(String company, int model){
        setCompany(company);
        setModel(model);
        setRegistrationNumber("");
        setColor("");
    }

    public Car(int model, String color){
        setCompany("");
        setModel(model);
        setRegistrationNumber("");
        setColor(color);
    }

    public Car(String registrationNumber, String company, int model, String color){
        setRegistrationNumber(registrationNumber);
        setCompany(company);
        setModel(model);
        setColor(color);
    }

    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setModel(int model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public String getCompany(){
        return company;
    }
    public int getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public void print(){
        System.out.println("Registration # " + registrationNumber);
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }

    public String toString(){
        return "Car{ " +
                "Registration # " + registrationNumber + ", " +
                "Company: " + company + ", " +
                "Model:" + model + "," +
                "Color: " + color + "}";
    }
}
