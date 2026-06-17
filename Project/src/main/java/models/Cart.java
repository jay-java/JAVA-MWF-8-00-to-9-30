package models;

public class Cart {

	private int cart_id, pid, cus_id;

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getCus_id() {
		return cus_id;
	}

	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}

	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", pid=" + pid + ", cus_id=" + cus_id + "]";
	}

}
