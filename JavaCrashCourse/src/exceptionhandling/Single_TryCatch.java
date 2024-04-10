package exceptionhandling;

public class Single_TryCatch {

	public static void main(String[] args) {
		try {
			int num1 = 3;

			int num2=2;

			int res = num1/num2;
			System.out.println(res);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Dont divide any number by 0");
		}
		catch(NullPointerException e) {
			System.out.println("This is due to No value in the expected result");
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println("Dont divide a number by zero that will lead to infinity");
			
		}
	}

}
