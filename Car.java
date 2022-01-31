package ru.com.kawaninja.carmanager;

import java.util.Objects;

public class Car {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	private double distance = 0;

	public Car(String name, int yearOfProduction, int price, int weight, Color color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
	}

	public void addDistance(int additionalDistance) {
		distance += additionalDistance;
		if (additionalDistance < 0) {

			throw new NullPointerException("Wrong distance!");
		}
		System.out.println("Inside method print: " + additionalDistance);

	}

	public void addDistance(double additionalDistance) {
		distance += additionalDistance;
		if (additionalDistance < 0) {

			throw new NullPointerException("Wrong distance!");
		}
		System.out.println("Inside method print: " + additionalDistance);

	}

	public double getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", distance=" + Math.round(distance) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, name, price, weight, yearOfProduction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return color == other.color && Objects.equals(name, other.name) && price == other.price
				&& weight == other.weight && yearOfProduction == other.yearOfProduction;
	}

}
