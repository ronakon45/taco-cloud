package tacos;

import lombok.Data;

@Data
public class Ingredient {

	private final String id;
	private final String name;
	private final Type type;

	public enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}

	public Ingredient orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getIngredient() {
		// TODO Auto-generated method stub
		return null;
	}

}