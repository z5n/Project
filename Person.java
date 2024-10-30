
public class Person 
{
	private int age;
	private double weight;
	private int heightF;
	private int heightI;
	private double bmi;
	
	public Person(int age, double weight, int heightF, int heightI) {
		this.age = age;
		this.weight = weight;
		this.heightF = heightF;
		this.heightI = heightI;
		this.bmi = calcBMI();
	}
	
	public String getBMICategory()
	{
		if (bmi < 18.5)
			return "Under Weight";
		else if (bmi < 24.9)
			return "Normal Weight";
		else if (bmi < 29.9)
			return "Overweight";
		else
			return "Very Overwieght";
	}
	
	private double calcBMI()
	{
		int inches = (heightF*12)+heightI;
		bmi = (weight/(inches*inches))*703.0;
		return bmi;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHeightF() {
		return heightF;
	}

	public void setHeightF(int heightF) {
		this.heightF = heightF;
	}

	public int getHeightI() {
		return heightI;
	}

	public void setHeightI(int heightI) {
		this.heightI = heightI;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(int bmi) {
		this.bmi = bmi;
	}
	

}
