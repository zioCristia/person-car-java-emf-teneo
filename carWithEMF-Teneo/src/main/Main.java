package main;

import exoCar.Car;
import exoCar.ColorsType;
import exoCar.ExoCarFactory;
import exoCar.GazType;
import exoCar.Person;
import utils.HibernateUtils;

public class Main {

	public static void main(String[] args) {
		Car car1 = ExoCarFactory.eINSTANCE.createCar("car12", 45, "Toyota", 2, GazType.DIESEL, ColorsType.BLACK);
		// uncomment to see the exception thrown by a car with the same matriculation number
//		Car car2 = ExoCarFactory.eINSTANCE.createCar("car12", 45, "Toyota", 2, GazType.DIESEL, ColorsType.BLACK);
		car1.move(14);
		
		Person p1 = ExoCarFactory.eINSTANCE.createPerson("Carlo", 34);
		Person p2 = ExoCarFactory.eINSTANCE.createPerson("Carlo2", 34);
		Car panda = ExoCarFactory.eINSTANCE.createCar("panda", 20, "Renault", 18, GazType.GPL, ColorsType.RED);
		Car clio = ExoCarFactory.eINSTANCE.createCar("clio", 40, "Fiat", 25, GazType.GASOLINE, ColorsType.GREEN);

//		System.out.println(p1.getCars());
		p1.buyCar(panda);
		p1.buyCar(clio);
		p2.buyCar(panda);
		System.out.println(p1.getCars());
		System.out.println(p2.getCars());
		p1.drive(clio, 30);
		p1.drive(clio, 70);

		p2.drive(panda, 5);
		p2.sellCar(panda);
//		System.out.println(p1.getCars());
	}

}
