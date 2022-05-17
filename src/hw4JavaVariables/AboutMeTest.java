package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // Constructor is Initialized
		aboutMe.name = "Rayhan Chowdhury"; // Variable Initialized
		aboutMe.age = 23;
		aboutMe.mySalary = 4000;
		aboutMe.myYearlySalary = 45000;
		aboutMe.myBankbalance = 5000000l;
		aboutMe.myHight = 5.800000f;
		aboutMe.myGrade = 3.85454656145;
		aboutMe.gender = 'M';
		aboutMe.iamNative = false;
		aboutMe.aboutMe(); // Method Initialized

		AboutMe yasir = new AboutMe(); // // Constructor is Initialized
		yasir.name = "Yasir Arafat";
		yasir.age = 22;
		yasir.mySalary = 3000;
		yasir.myYearlySalary = 35000;
		yasir.myBankbalance = 7000000l;
		yasir.myHight = 4.800000f;
		yasir.myGrade = 2.85454656145;
		yasir.gender = 'M';
		yasir.iamNative = false;
		yasir.aboutMe();
	}
}
