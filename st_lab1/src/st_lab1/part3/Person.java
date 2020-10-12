package st_lab1.part3;

public class Person {
    PersonFeeling feeling;
    int id;

    Person(int id){
        this.id = id;
        feeling = PersonFeeling.UNCOMFORTABLE;
    }

    PersonFeeling GetFeeling(){
        return feeling;
    }
}
