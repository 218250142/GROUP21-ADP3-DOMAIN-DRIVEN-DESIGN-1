package za.ac.cput.entity;

/*
Mpho Sefoloko
218336322
group 21
March
 */

public class Menu {

    public int itemId;
    public String itemName;
    public double itemPrice;
    public double total;

    private Menu (Builder builder){
        this.itemId = builder.itemId;
        this.itemName = builder.itemName;
        this.itemPrice = builder.itemPrice;
        this.total = builder.total;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double getSubtotal() {
        return total;
    }



    @Override
    public String toString() {
        return "Menu{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", subtotal=" + total +
                '}';
    }

    public static class Builder{

        public int itemId;
        public String itemName;
        public double itemPrice;
        public double total;

        public  Builder setItemId(int itemId){
            this.itemId = itemId;
            return this;
        }

        public  Builder setItemName(String itemName){
            this.itemName = itemName;
            return this;
        }
        public  Builder setItemPrice(double itemPrice){
            this.itemPrice = itemPrice;
            return this;
        }

        public  Builder setTotal(double total){
            this.total = total;
            return this;
        }
        public Builder copy(Menu menu){

            this.itemId = menu.itemId;
            this.itemName = menu.itemName;
            this.itemPrice = menu.itemPrice;
            this.total = menu.total;

            return this;
        }

        public Menu build(){

            return new Menu(this);
        }

    }
}
