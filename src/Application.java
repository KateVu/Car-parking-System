/**
 * The main application 
 * @author Quyen Vu Thi Tu SID 102418320
 * verion 0.1 lasted update date
 */
public class Application {

	
	public void start() {
		System.out.println(checkCarReg("Dd234e"));
	}
	
	/**
	 * 
	 * @param registration inputed registration number of a car
	 * @return true if start with a upper case and followed by 4 digit numbers
	 */
	public boolean checkCarReg(String inputReg) {
		char firstChar = inputReg.charAt(0);
		char secondChar = inputReg.charAt(1);
		char thirdChar = inputReg.charAt(2);
		char fourthChar = inputReg.charAt(3);
		char fifChar = inputReg.charAt(4);
		return (inputReg.length() == 5) & (Character.isUpperCase(firstChar)) & (Character.isDigit(secondChar)) & (Character.isDigit(thirdChar)) & (Character.isDigit(fourthChar)) & (Character.isDigit(fifChar));	
	}
	public static void main (String[] args) {
		Application app = new Application();
		app.start();
	}
}
