class A{
    public void fun(){
        System.out.println("Inside the class A fun() method"); 
    }
    public void fun1(){
        System.out.println("Inside the class A fun1() method"); 
    }
}

class B extends A{
    public void fun2(){
        System.out.println("Inside the class B fun2() method"); 
    }
    public void fun3(){
        System.out.println("Inside the class B fun3() method"); 
    }
}

class Main{
    public static void main(String args[]){
        B obj; 
        obj = new B(); 
        obj.fun1(); //calling the Base class method
        obj.fun3(); //calling the Derived class method
    }
}
