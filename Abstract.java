In this code, Car is an abstract class that contains only one abstract method run. Its implementation is provided by the Abstract class.
  abstract class Car{  
  abstract void run();  
}  
class Abstract extends Car{  
void run(){System.out.println("running samothly");}  
public static void main(String args[]){  
 Car obj = new Abstract();  
 obj.run();  
}  
}  
