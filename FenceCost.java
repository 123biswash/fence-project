package FenceCost;

import java.util.Scanner;

public class FenceCost {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char yesOrNo;
		do{
		String FenceType;
		int noOfGates;
		do{
			System.out.println("Enter Fence Type (W/w/wooden/WOODEN for Wooden type, cl/CL/chain-link/CHAIN-LINK for Chain-link type): ");
			FenceType = s.next();
		}while (!(FenceType.equals("W"))&&!(FenceType.equals("w")) &&!(FenceType.equals("CL"))&&!(FenceType.equals("cl"))&& !(FenceType.equals("wooden"))&&!(FenceType.equals("chain-link"))&&!(FenceType.equals("WOODEN"))&&!(FenceType.equals("CHAIN-LINK")));
		FenceType = FenceType.toLowerCase();
		
		do{
			System.out.println("Enter the number of gates needed (should be at least one and at most three): ");
			noOfGates = s.nextInt();
		}while (noOfGates<1 && noOfGates>3 && !s.hasNextInt());
		
		System.out.println("Enter the perimeter of the yard in ft: ");
		while (!s.hasNextDouble())
		{
		    System.out.println("Enter the perimeter of the yard in ft:");
		    s.next();
		}
		double yardPerimeter = s.nextDouble();
		double FenceCost=15*yardPerimeter;
		if (FenceType == "w"||FenceType == "wooden"){
				FenceCost = (25*yardPerimeter);
			}
		
		double FenceCost1= FenceCost + (150 * noOfGates);
		System.out.println("The Fence Cost is: "+ FenceCost1);
		double TaxAmount=FenceCost1 * 0.06;
		double FenceCost2= FenceCost1 + TaxAmount;
		double FenceCost3 = FenceCost2 + 50;

		
		System.out.println("The Fence Cost is: "+ FenceCost3);
		
			do{
				System.out.println("Do you want another entry? (Y/N)");
				yesOrNo=s.next(".").charAt(0);
			}while(yesOrNo!='Y'&&yesOrNo!='y'&&yesOrNo!='N'&&yesOrNo!='n');
		
		}while(yesOrNo=='Y'||yesOrNo=='y');
		s.close();

	}

}