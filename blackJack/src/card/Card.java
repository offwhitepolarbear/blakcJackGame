package card;

public class Card {
	Pattern pattern;
	Name name;
	int value;
	
	public Pattern getPattern() {
		return pattern;
	}
	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Card [pattern=" + pattern + ", name=" + name + ", value=" + value + "]";
	}
	
}