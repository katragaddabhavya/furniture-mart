public class FurnitureItem {
    int furniturecode;
    String furnitureType;
    char gradeoffurniture;
    String  colour;
    String furnitureUsage;
    double price;
    double disprice;

    FurnitureItem(int furniturecode, String furnitureType, char gradeoffurniture, String colour, String furnitureUsage, double price) {
        this.furniturecode = 1234;
        this. furnitureType = "tables";
        this.gradeoffurniture = 1;
        this. colour ="red";
        this.furnitureUsage ="outdoor";
        this.price = 4500;


    }

    public FurnitureItem() {

    }

    public double calculatediscount() {
        if(furnitureUsage=="outdoor"){
            disprice=price-(price*0.05);

        }
        else{
            disprice= price;
        }
        return disprice;
    }
    public void displayDetails(){
        System.out.println("furniturcode is"+furniturecode);
        System.out.println("furnituretype" +furnitureType);
        System.out.println("colour" +colour);
        System.out.println("furnitureUsage" +furnitureUsage);
        System.out.println("price" +price);
    }
}
