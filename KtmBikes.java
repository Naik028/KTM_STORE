package ktm_shop;

import java.util.Scanner;

public class KtmBikes  {
		
		public static void main(String[] args) {
			
			Scanner scan= new Scanner(System.in);
			KtmBikes k = new KtmBikes();
			System.out.println("WELCOME TO KTM BIKES,BANGALORE");
			Duke200 d= new Duke200(7000,199.5,35.6,15,"petrolType","tubeless",6);
			Rc390 r= new Rc390(9000,391.33,30.2,16,"petrolType","tubeless",6);
			Duke125 d1= new Duke125(5000,124.36,30,14,"petrolType","tubeless",5);
			Adventure390 a= new Adventure390(10000, 400, 20,19,"petrolType","tubeless", 6);

			System.out.println("which among the Bike you would like to select ");
			System.out.println("[1]. Duke200\n[2]. Duke125\n[3]. Rc390\n[4]. Adventure390");
		    String key=scan.next();
			System.out.println("Sir!!! Here is yours choosen bike");
		switch (key) {
			case "1":
				System.out.println("\nSPECIFICATION AND FEATURES OF ==>"+d);
				break;
			case "2":System.out.println("\nSPECIFICATION AND FEATURES OF ==>"+d1); 	
				break;
			case "3":System.out.println("\nSPECIFICATION AND FEATURES OF ==>"+r);
				break;
			case "4":System.out.println("\nSPECIFICATION AND FEATURES OF ==>"+a);
				break;
			default:System.out.println("\nBIKE IS TEMPORARILY UNAVAILABLE");
			break;
		}
		System.out.println("\nwould you like to purchase this Bike");
		 System.out.println("press\n1.yes\n2.no");
		 int x=scan.nextInt();
		if (x==1) {
			switch(key) {
			case "1":
				d.ProcessTransaction(7000, 0);
				break;
			case "2":
				d1.ProcessTransaction(7000, 0);
				break;
			case "3":
				r.ProcessTransaction(7000, 0);
				break;
			case "4":
				a.ProcessTransaction(7000, 0);
				break;
			}
			} else {
			System.out.println("***Hey !!....seems not interested in purchasing the bike***");

		}
		
		}
	}
		


			

			

			
	
			

	
