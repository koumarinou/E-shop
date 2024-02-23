public class Tv extends SoundAndPicture {
    private String type;
    private double inches;//Diastash
    private String connect;//Thires
    private String pixel;//Analysh othonis


     Tv(){
        
     }

    Tv(int code, String model, int year, String constructor, double price, int quantity,String type,double inches,String connect,String pixel) {
        super(code, model, year, constructor, price, quantity);
        this.type=type;
        this.inches=inches;
        this.connect=connect;
        this.pixel=pixel;
        
    }


    

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getInches() {
        return this.inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public String getConnect() {
        return this.connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
    }

    public String getPixel() {
        return this.pixel;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }


    @Override
    public String toString() {
        return super.toString()+"\ntype:" + getType() +"\ninches:" + getInches()+"\nconnect:" + getConnect() +"\npixel:" + getPixel()+"\n"+super.discount();
    }
    



}
