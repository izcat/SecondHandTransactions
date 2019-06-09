package bean;

public class ComType {
	private int id;
	private String comtypename;
	private String comtypedesc;
	public ComType()
	{}
	public ComType(String s1,String s2)
	{
		comtypename=s1;
		comtypedesc=s2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComtypename() {
		return comtypename;
	}
	public void setComtypename(String comtypename) {
		this.comtypename = comtypename;
	}
	public String getComtypedesc() {
		return comtypedesc;
	}
	public void setComtypedesc(String comtypedesc) {
		this.comtypedesc = comtypedesc;
	}
}
