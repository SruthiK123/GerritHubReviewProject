
public class JavaExample
{
    int add(int num1, int num2)
    {
        return num1+num2;
    }
    int add(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }
    int add(int num1, int num2, int num3, int num4)
    {
        return num1+num2+num3+num4;
    }
    int mul(int num1, int num2)
    {
        return num1+num2;
    }
	 int mul(int num1, int num2)
    {
        return num1*num2;
    }
    int mul(int num1, int num2, int num3)
    {
        return num1*num2*num3;
    }
    public static void main(String[] args) 
    {    
    	JavaExample obj = new JavaExample();
    	//This will call the first add method
        System.out.println("Sum of two numbers: "+obj.add(10, 20));
        //This will call second add method
        System.out.println("Sum of three numbers: "+obj.add(10, 20, 30));
        //This will call third add method
        System.out.println("Sum of four numbers: "+obj.add(1,  2, 3, 4));
        //This will call mul method with two parameters
        System.out.println("Multiplication of two numbers "+obj.mul(10, 20));
		//This will call mul method with three parameters
		System.out.println("Multiplication of two numbers "+obj.mul(10, 2,5));
        
    }
}