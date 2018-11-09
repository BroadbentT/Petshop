// *****************************************************************************
//  STAFFORDSHIRE UNIVERSITY
//  FACILITY OF COMPUTING, ENGINEERING & SCIENCE 
//  SCHOOL OF COMPUTING
//
//  CESMCOM10070/4 DATA STORAGE AND SOFTWARE DEVELOPMENT - SEMESTER 2
//  TUTORIAL SESSIONS EXERCISES & PORTFOLIO ASSIGNMENTS 45
//
//  JAVA PROGRAMMER TERENCE BROADBENT - B028035c@student.staffs.ac.uk
//  DATE: 11.03.2014 VERSION 1.0
//
//  TASK 2
// *****************************************************************************

// *****************************************************************************
// Call any imports to be used by the program
// *****************************************************************************

// *****************************************************************************
// Main Program - PetShop
// *****************************************************************************

public class PetShopApplication {
public static void main(String[] args) {
    
// *****************************************************************************
// Create and populate where necessary any variables used by the program
// *****************************************************************************
    
    Cat Cat1 = new Cat("Blacky","James McGregor", 10, 13);
    Cat Cat2 = new Cat("Tiger","Bill Stoke", 23, 12);
    Cat Cat3 = new Cat("Andy Powell", 28, 14);                                  //Call Overloaded Constructor
    Budgie Budgie1 = new Budgie("Tweety","Fred Carpenter","Yellow");
    Budgie Budgie2 = new Budgie("Tuts","Mary Hudson","Blue");
    
// *****************************************************************************
// Output the populated classes to the user via the screen
// *****************************************************************************

    System.out.println("All pets");
    System.out.println("\tPet Name\t\tOwner name\t\tTeeth\tTail length\tFeather colour");
    System.out.print("\t=====================\t=====================");
    System.out.println("\t=====\t===========\t==============");
    System.out.print("\t" + Cat1.getName() + "\t\t\t" + Cat1.getOwnerName() + "\t\t   ");
    System.out.print(Cat1.getNumberOfTeeth() + "\t\t " + Cat1.getLengthOfTail());
    System.out.println("\t\t   ---");
    System.out.print("\t" + Cat2.getName() + "\t\t\t" + Cat2.getOwnerName() + "\t\t   ");
    System.out.print(Cat2.getNumberOfTeeth() + "\t\t " + Cat2.getLengthOfTail());
    System.out.println("\t\t   ---");
    System.out.print("\t" + Cat3.getName() + "\t\t\t" + Cat3.getOwnerName() + "\t\t   ");
    System.out.print(Cat3.getNumberOfTeeth() + "\t\t " + Cat3.getLengthOfTail());
    System.out.println("\t\t   ---");
    System.out.print("\t" + Budgie1.getName() + "\t\t\t" + Budgie1.getOwnerName() + "\t\t");
    System.out.println("  ---\t\t---\t\t" + Budgie1.getColourOfFeathers());
    System.out.print("\t" + Budgie2.getName() + "\t\t\t" + Budgie2.getOwnerName() + "\t\t");
    System.out.println("  ---\t\t---\t\t  " + Budgie2.getColourOfFeathers() + "\n"); 
}
// *****************************************************************************
// End of Program - Job well done!!! 
// *****************************************************************************   
}
