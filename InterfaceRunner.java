package day1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

interface demo {
}

interface basic {
	int x = 5;
	
	public void in_call(); // Method Declaration

	public void out_call(); // Method Declaration

	public void in_sms(); // Method Declaration

	public void out_sms(); // Method Declaration

}

class Eseries implements basic {

	public void in_call() {
		System.out.println("Incall of Eseries");
	//	x=10;

	}

	public void out_call() {
		System.out.println("Outcall of Eseries");
	}

	public void in_sms() {
		System.out.println("Insms of Eseries");
	}

	public void out_sms() {
		System.out.println("OutSms of Eseries");
	}

}

class Jseries implements basic {

	public void in_call() {
		System.out.println("Incall of Jseries");
	}

	public void out_call() {
		System.out.println("Outcall of Jseries");
	}

	public void in_sms() {
		System.out.println("Insms of Jseries");
	}

	public void out_sms() {
		System.out.println("OutSms of Jseries");
	}

	public void myMethod() {
		System.out.println("My Method");
	}
}

public class InterfaceRunner {

	public static void main(String[] args) {
		basic m = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Eseries\n2.Jseries");
		int x = sc.nextInt();

		switch (x) {
		case 1: {
			m = new Eseries();
			break;
		}
		case 2: {
			m = new Jseries();
			break;
		}
		default:
			System.out.println("Invalid Choice");
		}
		m.in_call();
		m.in_sms();
		m.out_call();
		m.out_sms();
		/*
		 * basic j = new Jseries(); j.myMethod(); j.in_call(); j.out_call();
		 */
	}
}
