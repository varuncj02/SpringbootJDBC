package varun.db.connection.SprinbootJDBC;


// The Rules for the Working of the application
public class InfoBusinessLogic {
	
	int calorieLimit = 2000;// Hard-Coded in the future must be user inputed value from the json file
	
	public int getCalorieLimit() {
		return calorieLimit;
	}

}
