public class FurnitureItemimpl {
    public static void main(String[] args){
        FurnitureItem furniture =new FurnitureItem();
        furniture.furniturecode= 12345;
        furniture.furnitureType= "tables";
        furniture.gradeoffurniture= 1;
        furniture.colour= "red";
        furniture.furnitureUsage= "outdoor";
        furniture.price= 4500;
        furniture.displayDetails();
        System.out.println("discountedbill" +furniture.calculatediscount());
    }

}
