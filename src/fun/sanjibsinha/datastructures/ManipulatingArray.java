package fun.sanjibsinha.datastructures;

public class ManipulatingArray {

    private int arrayOfRandomNumbers[] = new int[20];

    private int sizeOfArray = 5;

    public void getRandomElements(){
        for (int i = 0; i <= sizeOfArray; i++){
            arrayOfRandomNumbers[i] = (int)(Math.random()*121)+121;
            System.out.println(arrayOfRandomNumbers[i]);
        }
    }

    public boolean getValueInArray(int findTheValue){
        boolean theValue = false;
        for(int i = 0; i < sizeOfArray; i++){
            if(arrayOfRandomNumbers[i] == findTheValue){
                theValue = true;
            }
        }
        return theValue;
    }

    public static void main(String[] args) {
        ManipulatingArray manArray = new ManipulatingArray();
        manArray.getRandomElements();
        System.out.println("**********");
        System.out.println(manArray.getValueInArray(121));
    }
}
