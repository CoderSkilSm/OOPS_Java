// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Static block  
class Main {
    //static variables ( class variables ) 
    static int a = 10; 
    static int b; 
    //static block
    static{
        System.out.println("Static block initialized"); 
        b = a * 4; 
    }
    
    public static void main(String[] args) {
        System.out.println("from main"); 
        System.out.println("value of a : " + a); 
        System.out.println("value of b : " + b); 
    }
}
//Static variable class
class Main{
    //static variable
    static int a = m1(); 
    //static block 
    static{
        System.out.println("Inside static block"); 
    }
    //static method
    static int m1(){
        System.out.println("from m1"); 
        return 20; 
    }
    //static method (main)
    public static void main(String args[]){
        System.out.println("Value of a : " + a); 
        System.out.println("from main"); 
    }
}


//static method
class Main{
    //static variable(class variable)
    static int a = 10; 
    //instance variable
    int b = 20;
    //static method
    static void m1(){
        a = 20; 
        System.out.println("from m1"); 
        b = 10; //compilation error
        m2(); //compilation error
        System.out.println(super.a);//compilation error 
    }
    //instance method
    void m2(){
        System.out.println("from m2"); 
    }
    //static method(main)
    static public void main(String[] args){
        System.out.println("Value of a: " + a); 
    }
}

//static class ---> A class can be made static if it is a nested class. We cannot declare a top level class with a static modifier but can declare nested class as the static class
class Main{
    //instance variable
    private String str = "String"; 
    //static class
    static class nested{
        public void disp(){
            System.out.println(str); //error :: non-static variable cannot be referenced from a static context 
        }
    }
    static public void main(String args[]){
        nested c1 = new nested(); 
        c1.disp(); 
    }
}





























































