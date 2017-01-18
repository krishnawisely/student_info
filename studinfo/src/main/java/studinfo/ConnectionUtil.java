package studinfo;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
		public static BasicDataSource getSource(){
			BasicDataSource db= new BasicDataSource();
				db.setDriverClassName("com.mysql.jdbc.Driver");
				db.setUsername("root");
				db.setPassword("root");
				db.setUrl("jdbc:mysql://LocalHost:3306/stud");
				return db;
				
				
				
		}
		public static JdbcTemplate geTemplate()
		{
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(getSource());
		return temp;
		}
}
