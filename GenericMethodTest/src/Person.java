


public class Person {
    String firstName;
    String lastName;
    public Person(){
        firstName = "John";
        lastName = "Doe";
    }
    public Person(String a,String b){
        firstName = a;
        lastName = b;
    }
    public String toString(){
        return firstName+lastName;
    }

}
