import java.sql.*;
import java.util.ArrayList;

class Emp {
	private int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	private String empName;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	private String empAddress;

	public Emp(int empId, String empName, String empAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
}

class Family {
    private int index;
	private String name;
	private int age;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Family(int index, String name, int age) {
		this.index = index;
		this.name = name;
		this.age = age;
	}
}

public class SampleJDBC {
	public static void main(String args[]) {
		ArrayList<Family> family = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gaemi", "root", "1234"); // 여기까지
																												// 접속하는
																												// string
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from family");
			family = new ArrayList<Family>();
			while (rs.next())
				// System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
				// rs.getString(3));

				family.add(new Family(rs.getInt(1), rs.getString(2), rs.getInt(3)));
				con.close();
		} catch (Exception e) {
			System.out.println(e);
		} 
		for(Family test : family) {
			System.out.println(test.getIndex() + "," + test.getName() + "," + test.getAge());
		}
		for (int i = 0; i < family.size(); i++) {
			System.out.println(family.get(i).getName());
		}
	}
}


