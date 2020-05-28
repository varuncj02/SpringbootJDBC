package varun.db.connection.SprinbootJDBC;

import java.util.List;

// Data Access Object class to seperate the Datbase from the Application logic and functions
public interface FoodInfoDAO {
	
	public List<FoodInfo> getFoodInfo();

	public void incrementCounter(FoodInfo foodInfo);
	
	public void updateRating(FoodInfo foodInfo, int rating);
}
