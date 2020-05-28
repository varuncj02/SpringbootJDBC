package varun.db.connection.SprinbootJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

/**
 * Hello world!
 *
 */

@SpringBootApplication 
public class App {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);

    }
    /*
    public void run(String... args) throws Exception {
    	SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
    	insertActor.withTableName("foodinfo");
    	 
    	FoodInfo foodInfo = new FoodInfo("Indian", "Parantha", 200, 1, 9);
    	BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(foodInfo);
    	 
    	int result = insertActor.execute(paramSource);
    	 
    	if (result > 0) {
    	    System.out.println("Insert successfully.");
    	} 
            
    }*/
}

