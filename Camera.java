public class Camera extends SoundAndPicture{
    private String type;
    private String megapixel;
    private String opticalZoom;
    private String digitalZoom;
    private double inches;

    Camera(){
        
    }

    Camera(int code, String model, int year, String constructor, double price, int quantity,String type,String megapixel,String opticalZoom,String digitalZoom,double inches) {
        super(code, model, year, constructor, price, quantity);
        this.type=type;
        this.megapixel=megapixel;
        this.opticalZoom=opticalZoom;
        this.digitalZoom=digitalZoom;
        this.inches=inches;
        
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMegapixel() {
        return this.megapixel;
    }

    public void setMegapixel(String megapixel) {
        this.megapixel = megapixel;
    }

    public String getOpticalZoom() {
        return this.opticalZoom;
    }

    public void setOpticalZoom(String opticalZoom) {
        this.opticalZoom = opticalZoom;
    }

    public String getDigitalZoom() {
        return this.digitalZoom;
    }

    public void setDigitalZoom(String digitalZoom) {
        this.digitalZoom = digitalZoom;
    }

    public double getInches() {
        return this.inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }


    @Override
    public String toString() {
        return super.toString()+"\ntype:" + getType()  + "\nmegapixel:" + getMegapixel() + "\nopticalZoom:" + getOpticalZoom() + "\ndigitalZoom:" + getDigitalZoom() +  "\ninches:" + getInches()+"\n"+super.discount();
    }


    
}
