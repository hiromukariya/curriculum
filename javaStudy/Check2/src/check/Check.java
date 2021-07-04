package check;
import constants.Constants;

public class Check {
	private static String firstName = "刈谷";
	private static String lastName = "洋睦";
	public static void main(String[] args) {
		printName(firstName, lastName);	
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		RobotPet robot = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robot.introduce();
		
	}
	private static void printName(String f, String l) {
		System.out.println("printNameメソッド → " +  f + l);
	}
}
