package bank;

public class Bank {
	private String code;
	private String address;
	
	private Account account;
	private ATM atm;
	private Customer customer;
	private AtmTransaction atmT;
	
	public Bank(){
		
	}
	
	public Bank(String code, String address) {
		super();
		this.code = code;
		this.address = address;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setAccount(Account account){
		this.account = account;
	}

	public void setAtm(ATM atm) {
		this.atm = atm;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setAtmT(AtmTransaction atmT) {
		this.atmT = atmT;
	}
	
	
	
}
