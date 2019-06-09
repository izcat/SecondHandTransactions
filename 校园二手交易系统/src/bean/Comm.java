package bean;

public class Comm {
	private int id;
	private String comnameString;
	private String comdesc;
	private String comtype;
	private int count;
	public Comm(int id, String comnameString, String comdesc, String comtype,
			int count, float price, String author, String phone, String sex) {
		super();
		this.id = id;
		this.comnameString = comnameString;
		this.comdesc = comdesc;
		this.comtype = comtype;
		this.count = count;
		this.price = price;
		this.author = author;
		this.phone = phone;
		this.sex = sex;
	}
	public Comm()
	{}
	public Comm(int id, String comnameString, String comdesc, String comtype,
			int count, int useyear, int usemonth, float price, String author,
			String phone, String sex) {
		super();
		this.id = id;
		this.comnameString = comnameString;
		this.comdesc = comdesc;
		this.comtype = comtype;
		this.count = count;
		this.useyear = useyear;
		this.usemonth = usemonth;
		this.price = price;
		this.author = author;
		this.phone = phone;
		this.sex = sex;
	}
	private int useyear;
	public int getUseyear() {
		return useyear;
	}
	public void setUseyear(int useyear) {
		this.useyear = useyear;
	}
	public int getUsemonth() {
		return usemonth;
	}
	public void setUsemonth(int usemonth) {
		this.usemonth = usemonth;
	}
	private int usemonth;
	private float price;
	private String author;
	private String phone;
	private String sex;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComnameString() {
		return comnameString;
	}
	public void setComnameString(String comnameString) {
		this.comnameString = comnameString;
	}
	public String getComdesc() {
		return comdesc;
	}
	public void setComdesc(String comdesc) {
		this.comdesc = comdesc;
	}
	public String getComtype() {
		return comtype;
	}
	public void setComtype(String comtype) {
		this.comtype = comtype;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
