package varun.db.connection.SprinbootJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

// Debugging the Program
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */

@SpringBootApplication 
public class App {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
    private static final Logger LOG = LogManager.getLogger(App.class);

	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    	
    	LOG.debug("This Will Be Printed On Debug");
        LOG.info("This Will Be Printed On Info");
        LOG.warn("This Will Be Printed On Warn");
        LOG.error("This Will Be Printed On Error");
        LOG.fatal("This Will Be Printed On Fatal");
        LOG.info("Appending string: {}.", "Hello, World");

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

