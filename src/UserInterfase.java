import java.util.Scanner;

public class UserInterfase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter customer name:");
        String CustomerName=sc.nextLine();
        System.out.println("enter the phone number:");
        String PhoneNumber=sc.nextLine();
        System.out.println("enter the street name:");
        String Address=sc.nextLine();
        System.out.println("enter the bill amount:");
        double BillAmount=sc.nextDouble();
        System.out.println("enter the distance:");
        int Distance=sc.nextInt();

        CustomerDetails customerDetails=new CustomerDetails(CustomerName,PhoneNumber,Address,BillAmount,Distance);




        System.out.println("customer name:"+customerDetails.getCustomerName());
        System.out.println("phone number:"+customerDetails.getPhoneNumber());
        System.out.println("street name:"+customerDetails.getStreetName());
        System.out.println("bonous points:"+customerDetails.calculateBonusPoints());
        System.out.println("delivery charges:"+customerDetails.calculateDeliveryPoints());
    }
}
