package fun.sanjibsinha.arrayexamples;

class Person{
    int age;
}


public class A20 {

    public static void main(String[] args){

        Person onePerson = new Person();
        onePerson.age = 10;
        Person twoPerson = new Person();
        twoPerson.age = 20;
        Person threePerson = new Person();
        threePerson.age = 30;
        Person[] persons = new Person[3];
        persons[0] = onePerson;
        persons[1] = twoPerson;
        persons[2] = threePerson;
        System.out.println("The age of three Persons : " + persons[0].age +
                ", " + persons[1].age + ", " + persons[2].age);

    }

}