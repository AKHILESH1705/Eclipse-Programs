package Interfaces_programming;

public class car extends vehicle {
    private String name;
	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	@Override
	public String BMW(String name) {
		// TODO Auto-generated method stub
		return set_carname(name);
	}
	private String set_carname(String name) {
		return this.name = name;
	}

	@Override
	public String get_truckname() {
		// TODO Auto-generated method stub
		return "TATA";
	}

}
