package objects;

public class Animal {

	private String name;
	private int id;
	private String address;
	private int age;
	private double height;
	private double weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isValid() {
		if(name.length()>0) {
			return true;
		} 
		return false;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", id=" + id + ", address=" + address + ", age=" + age + ", height=" + height
				+ ", weight=" + weight + "]";
	}

	
}
