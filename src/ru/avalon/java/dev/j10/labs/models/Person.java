package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;
/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    Passport passport;
    Address address;
    
    public Person (Address address){
    }
    
    public Person (String givename, String surname){
        passport = new Passport(givename, surname);
    }
    
    public Person (String givename, String surname, String text){
        passport = new Passport(givename, surname, text);
    }
    
    
    public Person (String givename, String surname, String country, String state, String city, String street, String building){
        passport = new Passport(givename, surname);
        address = new Address (country, state, city, street, building);
    }
    
    public Person (String givename, String surname, String text, String country, String state, String city, String street, String building){
        passport = new Passport(givename, surname, text);
        address = new Address (country, state, city, street, building);
    }
    
    public Person (String givename, String surname, String country, String state, String city, String street, String building, int appartment){
        passport = new Passport(givename, surname);
        address = new Address (country, state, city, street, building, appartment);
    }
    
    public Person (String givename, String surname, String text, String country, String state, String city, String street, String building, int appartment){
        passport = new Passport(givename, surname, text);
        address = new Address (country, state, city, street, building, appartment);
    }
    
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        String fullName;
        if (passport.getPatronymic()!=null){
            fullName=passport.getGivename()+" "+passport.getSurname()+" "+passport.getPatronymic();
        }
        else{
            if (passport.getSecondname()!=null){
                fullName=passport.getGivename()+" "+passport.getSecondname().charAt(0)+". "+passport.getSurname();
            }
            else{
                fullName=passport.getGivename()+" "+passport.getSurname();
            }  
        }
        return fullName;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */          
        String address_small = "COUNTRY : "+address.getCountry()+". STATE : "+address.getState()+". CITY : "+address.getCity()+". STREET : "+address.getStreet()+". BUILDING : "+address.getBuilding()+".";
        if(address.getAppartment()!=0) address_small=address_small+" APPARTMENT : "+address.getAppartment()+"."; 
        return address_small;
    }
}