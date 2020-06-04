package varun.db.connection.SprinbootJDBC;

import org.springframework.stereotype.Service;

// The Rules for the Working of the application
@Service
public class InfoBusinessLogic {
	
	int calorieLimit = 2000;// Hard-Coded in the future must be user inputed value from the json file
	
	public int getCalorieLimit() {
		return calorieLimit;
	}

}
