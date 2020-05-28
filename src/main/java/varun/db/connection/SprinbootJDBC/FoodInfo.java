package varun.db.connection.SprinbootJDBC;

public class FoodInfo {
	private int id;
	private String cuisine;
	private String foodName;
	private int calories;
	private int counter;
	private int rating;
	
	public FoodInfo(String cuisine, String foodName, int calories, int counter, int rating) {
		this.cuisine = cuisine;
		this.foodName = foodName;
		this.calories = calories;
		this.counter = counter;
		this.rating = rating;
	}
	
	public FoodInfo() {}
	
	public int getID() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getCuisine() {
		return this.cuisine;
	}
	
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	
	public String getFoodName() {
		return this.foodName;
	}
	
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public int getCalories() {
		return this.calories;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public int getCounter() {
		return this.counter;
	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public int getRating() {
		return this.rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		String desc = "Food Info [ " + id + " ," + cuisine + " ," + foodName +" ," + calories;
		return desc;
	}
}
