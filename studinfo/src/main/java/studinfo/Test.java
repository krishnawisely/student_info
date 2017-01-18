package studinfo;

public class Test {

	public static void main(String[] args) {
	Student obj = new Student();
	//obj.setStudname("krishna");
	//obj.setRegno(1234546);
	//obj.setRollno(11);
	StudDAO myDAO = new StudDAO();
	//myDAO.add(obj);
	myDAO.update(11);

	}

}
