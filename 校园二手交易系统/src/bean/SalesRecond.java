package bean;

public class SalesRecond {
	private int id;
	private int count;
	private float price;
	private String comname;
	private int data;
	public SalesRecond()
	{
		
	}
	public SalesRecond(int id, int count, float price, String comname, int data) {
		super();
		this.id = id;
		this.count = count;
		this.price = price;
		this.comname = comname;
		this.data = data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getComname() {
		return comname;
	}
	public void setComname(String comname) {
		this.comname = comname;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}
