package varun.db.connection.SprinbootJDBC;

import org.springframework.beans.factory.annotation.Autowired;
// Springboot Packages
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//JavaSE packages
import java.util.*;

// This class is the rest controller

@RestController 
@RequestMapping(path="/user")
public class FoodInfoController {
	
	@Autowired
	FoodInfoRepositoryDAO foodRepositoryDAO;
	
	/*@GetMapping(path="/getdata")
	public String check() {
		return "Get Service Up and running";
	}*/
	
	@GetMapping(path="/getFood")
	public List<FoodInfo> getFoodInfo(){
		return foodRepositoryDAO.getFoodInfo();
	}
	
	// Put- Update the data
	@PutMapping(path="/counterupdate")
	public int updateCounter(@RequestBody FoodInfo foodInfo) {
		foodRepositoryDAO.incrementCounter(foodInfo);
		return foodRepositoryDAO.getCounter(foodInfo);
	}
	
	@PutMapping(path="/ratingupdate")
	public int updateRating(@RequestBody FoodInfo foodInfo) {
		//Rating has to come from the User in JSON format - There has to be way for that to be sent back - Takes in rating from JSON adds to the db
		foodRepositoryDAO.updateRating(foodInfo, foodInfo.getRating());
		return 0; // Temporary Statement
	}
	
	//Post - Inserting New data
}
