package main;

import resources.*;

public class StrawberryBananaSmoothie extends Recipe {

	// Fruit[] fruit = new Fruit[] { new Banana(), new Strawberry() };
	Banana banana = new Banana();
	Strawberry strawberry = new Strawberry();

	public StrawberryBananaSmoothie() {
		super("Strawberry Banana Smoothie");
	}

	@Override
	public String toString() {
		return super.name + ": " + banana.getName() + ", " + strawberry.getName();
	}

}
