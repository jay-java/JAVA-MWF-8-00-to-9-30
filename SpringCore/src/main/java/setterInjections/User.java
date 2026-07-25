package setterInjections;

public class User {

	private int id;
	private String name;
	private long contact;
	private String address;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, long contact, String address) {
		super();
		System.out.println("data set by constructor");
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("user id set by set method");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("user name set by set method");
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		System.out.println("user contact set by set method");
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.out.println("user address set by set method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}

}
