package ru.avalon.java.dev.j10.labs.commons;

/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons. Done
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле. Done
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе. Done
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе. Done.
 */

public class Address{
    private String country, state, city, street, building;
    private int appartment;
    
    public Address (String country, String state, String city, String street, String building){
        this(country, state, city, street, building, 0);        
    }
    
    public Address (String country, String state, String city, String street, String building, int appartment){
        this.country=country;
        this.state=state;
        this.city=city;
        this.street=street;
        this.building=building;
        this.appartment=appartment;
    }
    
    public String getCountry(){
        return country;
    }
    
    public String getState(){
        return state;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getStreet(){
        return street;
    }
    
    public String getBuilding(){
        return building;
    }
    
    public int getAppartment(){
        return appartment;
    }
    
    public void setCountry(String country){
        this.country=country;
    }
    
    public void setState(String state){
        this.state=state;
    }
    
    public void setCity(String city){
        this.city=city;
    }
    
    public void setStreet(String street){
        this.street=street;
    }
    
    public void setBuilding(String building){
        this.building=building;
    }
    
    public void setAppartment(int appartment){
        this.appartment=appartment;
    }
}