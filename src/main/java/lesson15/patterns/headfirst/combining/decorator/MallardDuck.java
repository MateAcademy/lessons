package lesson15.patterns.headfirst.combining.decorator;

public class MallardDuck implements Quackable {
 
	public void quack() {
		System.out.println("Quack");
	}
 
	public String toString() {
		return "Mallard Duck";
	}
}
