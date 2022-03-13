package week_3_2;

public class Cat {
	 int age;
	 String name;
	 String color;
	 
	 public Cat() {
		 this.age = 0;
		 this.color = "Renk Girilmedi";
		 this.name = "Ýsim Girilmedi";
	 }
	 
	 public Cat(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 
	 public Cat(String name, String color, int age) {
		 this.name = name;
		 this.color = color;
		 this.age = age;
	 }
	 
	 public Cat(int age, String name, String color) {
		 this.name = name;
		 this.color = color;
		 this.age = age;
	 }
}
