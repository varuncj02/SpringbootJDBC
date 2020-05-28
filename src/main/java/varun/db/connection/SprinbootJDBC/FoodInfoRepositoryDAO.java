package varun.db.connection.SprinbootJDBC;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

//Will Store all The DB info and perform processes on the FoodInfo class using the FoodInfoDAO interface

@Repository
public class FoodInfoRepositoryDAO implements FoodInfoDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;

	// Gets all the info from the mysql database
	public List<FoodInfo> getFoodInfo() {
		List<FoodInfo> foodList = new ArrayList<FoodInfo>();
		String sql ="SELECT cuisine, foodName FROM foodinfo";
		
		// Temporary SQL statement for checking purposes
		String tempSql ="SELECT * FROM foodinfo";
		
		Collection<Map<String, Object>> rows = jdbcTemplate.queryForList(tempSql);
        rows.stream().map((row) -> {
        	FoodInfo foodInfo = new FoodInfo();
        	foodInfo.setID((Integer) row.get("id"));
        	foodInfo.setCuisine((String) row.get("cuisine"));
        	foodInfo.setFoodName((String)(row.get("foodName")));
        	foodInfo.setCalories((Integer) row.get("calories"));
        	foodInfo.setCounter((Integer) row.get("counter"));
        	foodInfo.setRating((Integer) row.get("rating"));
        	return foodInfo;
        }).forEach((foodInfo) -> {
        	foodList.add(foodInfo);
        });
		return foodList;
	}
	
	// Increments the value of the number of times a dish is being used
	public void incrementCounter(FoodInfo foodInfo) {
		//String counterincrementSQL = "INSERT INTO foodinfo (counter) VALUES (?)"; -- Only to add new values not to change current values
		String updateCounter = "UPDATE foodinfo SET counter = ? WHERE id = ?";
		
		foodInfo.setCounter(foodInfo.getCounter()+1);
		jdbcTemplate.update(updateCounter, foodInfo.getCounter(), foodInfo.getID());
	}
	
	
	public void updateRating(FoodInfo foodInfo, int rating) {
		String updateQuery = "UPDATE foodinfo SET rating = ? WHERE id = ?";
		foodInfo.setRating(rating);
		jdbcTemplate.update(updateQuery, foodInfo.getRating(), foodInfo.getID());
	}
	
	// Test Method
	public int getCounter(FoodInfo foodinfo) {
		return foodinfo.getCounter();
	}
	
	
	
	
	
}
