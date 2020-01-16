package fun.sanjibsinha;
/*
we will compute number of molecules in a hydrocarbon
a mole of any substance contains 6.02 * 10^23 molecules
this is called Avogadro's number
relationship of a mass of a substance and the number of molecules is:

molecules = mass * 1mole/FormulaWeight * (6.02 * 10^23 molecules)/i mole
*/
/*
the algorithm will be:
Step 1: take input and store the mass of hydrocarbon, the number of carbon, and the number
of hydrogen atoms
Step 2: find and store the formula weight of one mole
Step 3: find the number of molecules in given mass of hydrocarbon  using the above formula
Step 4: output the stored input values and the result
 */

import java.util.Scanner;

public class HydroCarbonMolecule {

    static float massOfHydrocarbon = 0.00f;
    static int numberOfCarbonAtoms = 0;
    static int numberOfHydrogenAtoms = 0;

    public static void main(String[] args) {

        System.out.println("Enter mass of HydroCarbon in a floating point: ");
        Scanner mh = new Scanner(System.in);
        massOfHydrocarbon = mh.nextFloat();
        System.out.println("Enter the number of carbon atoms: ");
        Scanner nc = new Scanner(System.in);
        numberOfCarbonAtoms = nc.nextInt();
        System.out.println("Enter the number of hydrogen atoms: ");
        Scanner nh = new Scanner(System.in);
        numberOfHydrogenAtoms = nh.nextInt();
        final int CarbonAMU = 12;
        final int HydrogenAMU = 1;
        long formulaWeightOfOneMole = 111111111111L;
        formulaWeightOfOneMole = (numberOfCarbonAtoms * CarbonAMU)
                + (numberOfHydrogenAtoms * HydrogenAMU);
        double AvogadroNumber = 6.02e23;
        double molecules = (massOfHydrocarbon/formulaWeightOfOneMole) * AvogadroNumber;
        System.out.println(massOfHydrocarbon + " grams of hydrocarbon with " + numberOfCarbonAtoms
                + " carbon atoms and " + numberOfHydrogenAtoms + " hydrogen atoms contain "
                + molecules + " molecules.");

    }
}
/*
Enter mass of HydroCarbon in a floating point:
16
Enter the number of carbon atoms:
1
Enter the number of hydrogen atoms:
4
16.0 grams of hydrocarbon with
 1 carbon atoms and 4 hydrogen atoms contain 6.019999999999999E23 molecules.
 */
