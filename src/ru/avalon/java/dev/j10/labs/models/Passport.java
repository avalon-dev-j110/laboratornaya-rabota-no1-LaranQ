package ru.avalon.java.dev.j10.labs.models;

import java.time.LocalDate;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
class Passport {

    private String givename, surname, patronymic, secondname, authority;
    private int serialNomber;
    private LocalDate birthDate, issueDate;
    
    Passport (String givename, String surname){
        this(givename, surname, null, null, 0, null, null, null);
    }
    
    Passport (String givename, String surname, String text){
        this(givename, surname, null, null, 0, null, null, null);
        patronymic=checkForPatronymic(text);
        if (patronymic==null) secondname=text;
    }
    
    Passport (String givename, String surname, int serialNomber, String authority, LocalDate birthDate, LocalDate issueDate){
        this(givename, surname, null, null, serialNomber, authority, birthDate, issueDate);
    }
    
    Passport (String givename, String surname, String text, int serialNomber, String authority, LocalDate birthDate, LocalDate issueDate){
        this(givename, surname, null, null, serialNomber, authority, birthDate, issueDate);
        patronymic=checkForPatronymic(text);
        if (patronymic==null) secondname=text;
    }
 
    Passport (String givename, String surname, String patronymic, String secondname, int serialNomber, String authority, LocalDate birthDate, LocalDate issueDate){
        this.givename=givename;
        this.surname=surname;
        this.patronymic=patronymic;
        this.secondname=secondname;
        this.serialNomber=serialNomber;
        this.authority=authority;
        this.birthDate=birthDate;
        this.birthDate=issueDate;
    }
    
    String checkForPatronymic(String text){
        if(text.endsWith("овна") || text.endsWith("ович"))
        {return text;}
        else {return null;}
    }
    
    String getGivename(){
        return givename;
    }
    
    String getSurname(){
        return surname;
    }
    
    String getPatronymic(){
        return patronymic;
    }
    
    String getSecondname(){
        return secondname;
    }
    
    String getAuthority(){
        return authority;
    }
    
    int getSerialNomber(){
        return serialNomber;
    }
    
    LocalDate getBirthDate(){
        return birthDate;
    }
    
    LocalDate getIssueDate(){
        return issueDate;
    }
    
    void setGivename(String givename){
        this.givename=givename;
    }
    
    void setSurname(String surname){
        this.surname=surname;
    }
    
    void setPatronymic(String patronymic){
        this.patronymic=patronymic;
    }
    
    void setSecondname(String secondname){
        this.secondname=secondname;
    }
    
    void setAuthority(String authority){
        this.authority=authority;
    }
    
    void setSerialNomber(int SerialNomber){
        this.serialNomber=serialNomber;
    }
    
    void setBirthDate(LocalDate birthDate){
        this.birthDate=birthDate;
    }
    
    void setIssueDate(LocalDate issueDate){
        this.issueDate=issueDate;
    }
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса. Done
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра? Done
     *
     * 3. Создайте все необходимые конструкторы класса. Done
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов. Done
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета. Done
     */
}
