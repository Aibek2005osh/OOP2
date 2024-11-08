import java.util.Scanner;

public class
Student {
    private String name;
    private String surname;
    private int age;
    private String [] coures;

    public Student(){

    }
    public String getName(){
       return this.name;
    }
    public void setName(String name){
        this.name = new Scanner(System.in).nextLine();

    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){

        this.surname = surname + new Scanner(System.in).nextLine() ;

    }
    public int getAge (){
        return this.age;
    }
    public void setAge(int age){


    }

}
