public class CustomerDetails implements BonusPoints,DoorDelivery {
    private String customerName;
    private String phoneNumber;
    private String streetName;
    private double billAmount;
    private int distance;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public CustomerDetails() {

    }

    public CustomerDetails(String customerName, String phoneNumber, String streetName, double billAmount, int distance) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.streetName = streetName;
        this.billAmount = billAmount;
        this.distance = distance;
    }
    public double calculateBonusPoints() {
        double bonusPoints = 0;
        if (this.billAmount >= 250) {
            bonusPoints = billAmount / 10;
        } else if (this.billAmount < 250) {
            return bonusPoints;
        }
        return bonusPoints;
    }
    @Override
    public double calculateDeliveryPoints() {
        int deliveryCharges = 0;
        if(distance >= 25){
            deliveryCharges=8*distance;
        }
        if(distance >= 15&&distance<=25){
            deliveryCharges=5*distance;
        }
        if(distance<15){
            deliveryCharges=2*distance;
        }
        return deliveryCharges;
        }
    }

