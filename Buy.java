import java.math.BigInteger;
import java.time.LocalDate;


class Buy {
    private int saleCode;
    private String model;
    private String name;
    private BigInteger phoneNumber;
    private LocalDate date;
    private double price; 
    

    Buy(int saleCode,String model,String name,BigInteger phoneNumber,LocalDate date,double price){
        this.saleCode=saleCode;
        this.model=model;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.date=date;
        this.price=price;

    }

    Buy(){

    }


    public int getSaleCode() {
        return this.saleCode;
    }

    public String getModel() {
        return this.model;
    }

    public String getName() {
        return this.name;
    }

    public BigInteger getPhoneNumber() {
        return this.phoneNumber;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public double getPrice(){
        return this.price;
    }

    public void setSaleCode(int saleCode) {
        this.saleCode = saleCode;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    

    @Override
    public String toString() {
        return "saleCode: " + getSaleCode() +"\nmodel: " + getModel() +"\nname: " + getName() +"\nphoneNumber: " + getPhoneNumber() +"\ndate: " + getDate() +"\nprice: "+getPrice();
    }

}
