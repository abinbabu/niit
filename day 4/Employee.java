package dayfour;

public class Employee {

	private int id;
	private String name;
	private Depatment dept;
	private Employee manager;
	
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Depatment getDept() {
		return dept;
	}

	public void setDept(Depatment dept) {
		this.dept = dept;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		Employee manager = new Employee(102, "jp");
		Employee clerk = new Employee(105, "krish");
		clerk.setManager(manager);
		Depatment office = new Depatment(50, "office");
		clerk.setDept(office);

		display(clerk);

	}

	private static void display(Employee clerk) {

		System.out.println(clerk.getId());
		System.out.println(clerk.getName());

		System.out.println(clerk.getManager().getName());

	}
	
}

