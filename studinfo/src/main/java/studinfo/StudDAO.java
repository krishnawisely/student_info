package studinfo;

public class StudDAO {
	
	   public void add(Student stud)
	   {
		   String query="insert into student(name,regno,rollno) values (?,?,?)";
		   Object[] params={stud.getStudname(),stud.getRegno(),stud.getRollno()};
		   ConnectionUtil.geTemplate().update(query, params);
	   }
	   public void update(int rollno ){
		   String query="delete from student where rollno="+rollno;
		   ConnectionUtil.geTemplate().update(query);
		   
	   }
	

}
