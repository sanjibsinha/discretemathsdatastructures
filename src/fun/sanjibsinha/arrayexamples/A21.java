package fun.sanjibsinha.arrayexamples;

class Mobile{
    int modelNumber;
    String modelName;
    public void displayModels(int model, String name){
        this.modelName = name;
        this.modelNumber  = model;
        System.out.println("The model number : " + model + ". The model name :  " + name);
    }

}

public class A21 {

    public static void main(String[] args) {
        //we are creating three mobile objects in heap
        //three reference variables from stack point to the heap
        Mobile sam = new Mobile();
        Mobile red = new Mobile();
        Mobile zen = new Mobile();
        //an array of objects can be created just like any primitive data type
        Mobile[] mobiles = {sam, red, zen};
        for (int i = 0; i < mobiles.length; i ++){
            //we want model number starts from 10
            int j = 10;
            j += i;
            if(i == 0){
                mobiles[i].displayModels(j, "Sam");
            }
            else if(i == 1){
                mobiles[i].displayModels(j, "Red");
            }
            else {
                mobiles[i].displayModels(j, "Zen");
            }
        }
    }
}