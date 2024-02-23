import java.math.BigInteger;
import java.time.LocalDate;

class Order {
    
    private int saleCode;
    private String model;
    private String name;
    private BigInteger phoneNumber;
    private LocalDate date;
    private double price; 
    private String status;

    Order(int saleCode,String model,String name,BigInteger phoneNumber,LocalDate date,double price,String status){
        this.saleCode=saleCode;
        this.model=model;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.date=date;
        this.price=price;
        this.status=status;

    }

    Order(){

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

    public String getStatus(){
        return this.status;
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
    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "saleCode: " + getSaleCode() +"\nmodel: " + getModel() +"\nname: " + getName() +"\nphoneNumber: " + getPhoneNumber() +"\ndate: " + getDate() +"\nprice: "+getPrice()+"\nstatus: "+getStatus();
    }


}
