import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//you need create database with this name 'github-example-jdbc'
		String url = "jdbc:postgresql://localhost:55432/test1";
		//user default
		String user = "pub";
		//your password. root is default
		String password = "pub";
		PersonJDBC pjdbc = new PersonJDBC(url, user, password);
		
		//Person person = new Person();
		//person.setName("Chloe");
		//person.setIdentity("ZAA21");
		//person.setBirthday("10/10/1980");
		//pjdbc.addPerson(person);
		
		
		ArrayList<Person> array = pjdbc.getAllPersons();
		
		for (Person i : array) {
			System.out.println(i.getName()+ ", uid: "+ i.getId()+ 
					", "+ i.getBirthday() + ", mask: " +i.getIdentity());
		}
		
		//System.out.println(pjdbc.getPerson("Rafael").getName());
		//pjdbc.removePerson(person);
	}

}
