package ru.com.kawaninja.carmanager;

public class CarManager {

	public static void main(String[] args) {

		PassengerCar prius = new PassengerCar("Toyota Prius", 2008, 1200, 15000, Color.GREEN);

		Bus renault = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);

		Bus renault2 = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);

		prius.addDistance(1000);
		prius.addDistance(2000);
		prius.addDistance(20.7);

		System.out.println(prius);
		System.out.println(renault);

		System.out.println(prius.equals(renault2));
		System.out.println(renault.equals(renault2));

	}

}
