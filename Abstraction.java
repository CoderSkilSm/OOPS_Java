abstract class A{
    abstract void fun(); 
}

class B extends A{
    void fun(){
        System.out.println("Have fun"); 
    }
}

class Main{
    public static void main(String args[]){
           A a = new B(); 
           a.fun(); 
    }
}
