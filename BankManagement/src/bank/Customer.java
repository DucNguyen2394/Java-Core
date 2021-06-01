package bank;

public class Customer {
	private String name;
	private String address;
	private String dob;
	private String cardNumber;
	private String pin;
	
	private Account account = new Account();
	
	public Customer(){
		
	}
	
	public Customer(String name, String address, String dob, String cardNumber, String pin) {
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.cardNumber = cardNumber;
		this.pin = pin;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void verifyPassword(){
		
	}
}
