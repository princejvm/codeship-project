package objectdatapassing.modelattribute;

public class Student {
	private String studentName;
	private String studentAddress;
	public String getName() {
		return this.studentName;
	}
	public String getAddress() {
		return this.studentAddress;
	}
	public void setName(String name) {
		this.studentName = name;
	}
	public void setAddress(String address) {
		this.studentAddress = address;
	}
}
