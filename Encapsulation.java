package OOPS;
// Encapsulation
public class oops {
    private int roll; 
    private float marks; 
    private char grade; 
    
    public void put_data(int data) { // Setter
    	this.marks = data;
    } 
    public float show_data() {   //Getter
    	return marks;  
    }
    
    public void put_roll(int roll) { //Setter
    	this.roll = roll; 
    }
    
    public int get_roll() {  //Getter
    	return roll;  
    }
    
    public void enter_grade(char grade) { //Setter
    	this.grade = grade; 
    }
    
    public char show_grade() { //Getter
    	return grade; 
    }
    
    
	public static void main(String[] args) {
        oops obj = new oops(); 
        // Enter the respective fields with the help of setter methods 
        obj.put_data(99);
        obj.put_roll(50);
        obj.enter_grade('A');
        // Getting the respective values with the help of getter methods 
        System.out.println("The marks is: " + obj.show_data());
        System.out.println("The roll is: " + obj.get_roll());
        System.out.println("The grade is: " + obj.show_grade()); 
	}
}
