package main;


import java.util.ArrayList;
import java.util.Collection;

public class Recipe {
	final String name;
	final Collection<Ingredient> ingredients;

	public Recipe(String name) {
		this.name = name;
		ingredients = new ArrayList<>();
	}

	public Recipe(String name, Collection<Ingredient> ingredients) {
		this.name = name;
		this.ingredients = ingredients;
	}

	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}

	@Override
	public String toString() {
		// return "Recipe [" + (name != null ? "name=" + name + ", " : "")
		// + (fruityIngredients != null ? "fruityIngredients=" +
		// fruityIngredients : "") + "]";
		String s = "Recipe [" + name + "]\n" + "Ingredients:\n";
		for (Ingredient f : ingredients) {
			s += " * " + f.getName() + "\n";
		}
		return s;

	}

}
