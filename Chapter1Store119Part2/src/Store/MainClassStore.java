package Store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MainClassStore {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		Order order = new Order();
		Customer customer;
		ATMCard atmCard = new ATMCard();
		CreditCard creditCard = new CreditCard();
		OrderDetail[] m_OrderDetail = new OrderDetail[0];
		OrderDetail orderDetail;
		Product product;

		System.out.println("*********ORDER************");

		boolean flag = true;
		while (flag) {

			System.out.println("Enter name product: ");
			String nameProduct = input.readLine();

			System.out.println("Enter price of product: ");
			double price = Double.parseDouble(input.readLine());

			System.out.println("Enter quantity of product: ");
			int quantity = Integer.parseInt(input.readLine());

			product = new Product(nameProduct, price);
			orderDetail = new OrderDetail(quantity, product);
			m_OrderDetail = Arrays.copyOf(m_OrderDetail,
					m_OrderDetail.length + 1);
			m_OrderDetail[m_OrderDetail.length - 1] = orderDetail;
			System.out.println("Do you want to continue?[Y/N]");
			if (selectYN()) {
				continue;
			} else {
				break;
			}
		}

		System.out.println("Date of order: ");
		String date = input.readLine();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);

		Date orderDate = dateFormat.parse(date);

		System.out.println("State of Order");

		System.out
				.println("Select Status: \n1)Just Order \n2)Paid \n3)Received ");
		int number = Integer.parseInt(input.readLine());
		String status = "";
		switch (number) {
		case 1:
			status = "Just Order";
			break;
		case 2:
			status = "Paid";
			break;
		case 3:
			status = "Received";
			break;
		default:
			System.out.println("wrong choose!");
			break;
		}
		System.out.println("You want to print bill? [Y/N]");
		boolean printOrder;
		printOrder = selectYN();

		// code thanh tien

		order = new Order(orderDate, printOrder, status, m_OrderDetail);

		System.out
				.println("Do you want Order or Order and Payment? \nSelect 1: Order 2: Order and Payment");
		int n = Integer.parseInt(input.readLine());
		System.out.println("===========INFORMATION CUSTOMER==============");

		System.out.println("Enter ID customer: ");
		String customerID = input.readLine();

		System.out.println("Enter customer name: ");
		String name = input.readLine();

		System.out.println("EnterIidentityCard Number: ");
		String identityCardNumber = input.readLine();

		System.out.println("Enter Address");
		String address = input.readLine();

		System.out.println("Enter Email: ");
		String email = input.readLine();

		System.out.println("Enter Phone Number: ");
		String phoneNumber = input.readLine();

		customer = new Customer(address, email, identityCardNumber, name,
				phoneNumber, customerID, order);
		switch (n) {
		case 1:
			System.out.println(" Order Success !");
			break;
		case 2:
			System.out.println("===========INFORMATION CARD==============");
			System.out.println("Enter ID Card: ");
			String cardID = input.readLine();
			System.out
					.println("Select type of paiment: \n1) CreditCard \n2)ATMCard");
			int num = Integer.parseInt(input.readLine());
			switch (num) {
			case 1:
				// code
				System.out.println("Auth Method" + creditCard.getAuthMethod());
				System.out.println("Enter type of card: ");
				String type = input.readLine();

				System.out.println("Date of order: ");
				String expirationDate1 = input.readLine();
				dateFormat.setLenient(false);

				Date expirationDate = dateFormat.parse(expirationDate1);

				System.out.println("Enter Max Debt: ");
				double maxDebt = Double.parseDouble(input.readLine());

				creditCard = new CreditCard(cardID, order, expirationDate,
						maxDebt, type);
				System.out.println("Infor paid: " + creditCard.toString());

				break;
			case 2:
				// code
				System.out.println("Auth Method" + atmCard.getAuthMethod());
				System.out.println("Balance of Card: ");
				double balance = Double.parseDouble(input.readLine());
				atmCard = new ATMCard(cardID, order, balance);
				System.out.println("Infor paid: " + atmCard.toString());
				break;
			default:
				System.out.println("Wrong choose!");
				break;

			}

		}

		order = new Order(orderDate, printOrder, status, m_OrderDetail,
				customer);
		System.out.println("\t================RECEIPT==============\n"
				+ order.toString());

	}

	public static void inputInformationCustomer() {

	}

	public static boolean selectYN() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		String st = input.readLine();
		boolean flag = false;
		while (!flag) {
			switch (st) {
			case "N":
			case "NO":
			case "no":
			case "n":
				return false;

			case "Y":
			case "YES":
			case "yes":
			case "y":
				return true;
			default:
				System.out.println("Choose again!");
				st = input.readLine();
				break;
			}

		}

		return false;
	}

}
