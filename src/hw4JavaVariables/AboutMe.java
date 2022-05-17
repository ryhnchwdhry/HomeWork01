package hw4JavaVariables;

public class AboutMe {
	// Variables declared
	public String name;
	public byte age;
	public short mySalary;
	public int myYearlySalary;
	public long myBankbalance;
	public float myHight;
	public double myGrade;
	public char gender;
	public boolean iamNative;

	// Constructor declared
	public AboutMe() {
		System.out.println("\nThis is all about us\n");
	}
	// Method implemented
	public void aboutMe() {
		System.out.println("My name:" + name + "\nMy age:" + age + "\nMy salary:" + mySalary + "\nMy yearly salary:"
				+ myYearlySalary + "\nMy bank balance:" + myBankbalance + "\nMy hight:" + myHight + "\nMy grade:"
				+ myGrade + "\nMy gender:" + gender + "\nI am native american:" + iamNative);
	}
}
