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
