package model;

import javafx.beans.property.SimpleStringProperty;

public class Character {
	private SimpleStringProperty character;
	private SimpleStringProperty image;

	public Character(String character, String image) {
		this.character = new SimpleStringProperty(character);
		this.image = new SimpleStringProperty(image);
	}

	public String getCharacter() {
		return character.get();
	}

	public void setCharacter(String character) {
		this.character.set(character);
	}

	public String getImage() {
		return image.get();
	}

	public void setImage(String image) {
		this.image.set(image);
	}

}
