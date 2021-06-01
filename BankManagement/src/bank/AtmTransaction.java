package bank;

public class AtmTransaction {
	private String transactionId;
	private String Date;
	private String type;
	private double amount;
	private double postBalance;
	
	public AtmTransaction(){
		
	}
	
	public AtmTransaction(String transactionId, String date, String type, double amount, double postBalance) {
		super();
		this.transactionId = transactionId;
		Date = date;
		this.type = type;
		this.amount = amount;
		this.postBalance = postBalance;
	}
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getPostBalance() {
		return postBalance;
	}

	public void setPostBalance(double postBalance) {
		this.postBalance = postBalance;
	}

	public void modifies(){
		
	}
}
