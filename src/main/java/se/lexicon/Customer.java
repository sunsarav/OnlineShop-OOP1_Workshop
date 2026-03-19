package se.lexicon;

public class Customer {
    private final int customerId;
    private final String customerName;
    private final String customerEmail;

    public Customer(int customerId, String customerName, String customerEmail) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

}
