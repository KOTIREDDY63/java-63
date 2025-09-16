package demo;

public class constructor {

    //method
    public void DoSomething(){
        System.out.println("I am doing something");
    }
//constructor
//same name as class name
//create a default constructor

public static void main(String[] args) {
  constructor obj = new constructor(); 
  System.out.println(obj); 
}

//parameterized constructor
//same name as class name
//create a parameterized constructor
public constructor(String name){
    System.out.println("I am a parameterized constructor and my name is:"+name);
}
}