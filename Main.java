import java.util.ArrayList;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a file");
		String filename = scnr.nextLine();
		ArrayList<Person> personList = new ArrayList<>();

		

		try {
			
			FileInputStream fileStream = new FileInputStream(filename);
			Scanner fileScanner = new Scanner(fileStream);

			if(fileScanner.hasNextLine())
			{
				fileScanner.nextLine();
			}

			while(fileScanner.hasNextLine())
			{
				String line = fileScanner.nextLine();
				String[] data = line.split(",");
				int age = Integer.parseInt(data[0]);
				double weight = Double.parseDouble(data[1]);
				int heightF = Integer.parseInt(data[2]);
				int heightI = Integer.parseInt(data[3]);

				Person person = new Person(age, weight, heightF, heightI);

				personList.add(person);




			}
			fileScanner.close();
			printBMICategory(personList);
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}

		

	}

	public static void printBMICategory(ArrayList<Person> personList)
	{
		for(Person person : personList)
		{
			System.out.println(person.getAge() + "," + person.getBMICategory());
		}
	}

}
