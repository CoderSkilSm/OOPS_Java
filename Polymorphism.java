// Compile time polymorphism
class Main{
    //data 
    private int a; 
    private int b; 
    private int c; 
    private double d; 
    //all the getters and setters 
    //constructor
    
    public int sum(int x,int y){
        return x + y; 
    }
    public int sum(int x,int y,int z){
        return x + y + z; 
    }
    public int sum(int x, double y){
        return x + (int) y; 
    }
    public int sum(double x, int y){
        return (int)x + y; 
    }
    
    public static void main(String args[]){
        Main obj; 
        obj = new Main(); 
        System.out.println("Sum: " + obj.sum(2,3)); //5
        System.out.println("Sum: " + obj.sum(2,3.3)); //5
        System.out.println("Sum: " + obj.sum(3.3,2)); //5
        // System.out.println("Sum: " + obj.sum(3.2,3.3));// Error 
    }
}
// Runtime Polymorphism
class A{
    public void display(){
        System.out.println("Inside A display"); 
    }
    public void show(){
        System.out.println("Inside A show"); 
    }
}

class B extends A {
    public void display(){
        System.out.println("Inside B display"); 
    }
    public void show(){
        System.out.println("Inside B show"); 
    }
}


class C extends B{
    public void display(){
        System.out.println("Inside C display"); 
    }
    public void show(){
        System.out.println("Inside C show"); 
    }
}
class Main{
    public static void main(String args[]){
        A obj; 
        obj = new C(); 
        obj.show(); // C version 
        obj = new B(); 
        obj.show(); // B version
        C obj1; 
        obj1 = new B(); 
        obj1.show(); // error
        B obj2; 
        obj2 = new C(); 
        obj2.display(); // C version
    }
}



























