public class HomeDevices extends Product{
    
    private double discountPercentage;
    private double finalPrice;

    HomeDevices(){

    }


    HomeDevices(int code, String model, int year, String constructor, double price, int quantity) {
        super(code, model, year, constructor, price, quantity);
        
    }
    
    String discount(){
        discountPercentage=0.2;
        finalPrice=getPrice()-getPrice()*discountPercentage;
        return"The initial price is: "+getPrice()+" ,the discount percentage is: "+discountPercentage+" ,the discount price is: "+(getPrice()*discountPercentage)+" and the final price is: "+finalPrice;
    }
    
    public String toString() {
        return "code:" + getCode() +"\nmodel:" + getModel() + "\nyear:" + getYear()  +"\nconstructor:" + getConstructor() +"\nprice:" + getPrice() +"\nquantity:" + getQuantity() ;
    }

    
    
}

