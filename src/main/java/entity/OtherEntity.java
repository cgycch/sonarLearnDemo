package entity;

public class OtherEntity {
	private String hello;

	public OtherEntity(String hello) {
		super();
		this.hello = hello;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	@Override
	public String toString() {
		return "OtherEntity [hello=" + hello + "]";
	}

}
