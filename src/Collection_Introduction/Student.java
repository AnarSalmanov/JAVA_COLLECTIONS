package Collection_Introduction;

public class Student implements Comparable<Student> {

	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student st) {
		if (this.id > st.id) {
			return 1;
		} else if (this.id < st.id) {
			return -1;
		}
		return 0;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}