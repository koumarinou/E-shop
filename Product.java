public class Product {
    private int code;
    private String model;
    private int year;
    private String constructor;
    private double price;
    private int quantity;

    Product(){
        
    }


    Product(int code,String model,int year,String constructor,double price,int quantity){//Create the constructor
        this.code=code;
        this.model=model;
        this.year=year;
        this.constructor=constructor;
        this.price=price;
        this.quantity=quantity;

    }


    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getConstructor() {
        return this.constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    String discount(){
        return null;
    }


    @Override
    public String toString() {
        return "code:" + getCode() +"\nmodel:" + getModel() + "\nyear:" + getYear()  +"\nconstructor:" + getConstructor() +"\nprice:" + getPrice() +"\nquantity:" + getQuantity() ;
    }

}
