public class DVD extends SoundAndPicture {
    private String type;
    private String pixel;
    private String format;

    DVD(){
        
    }

    DVD(int code, String model, int year, String constructor, double price, int quantity,String type,String pixel,String format) {
        super(code, model, year, constructor, price, quantity);
        this.type=type;
        this.pixel=pixel;
        this.format=format;
        
    }


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPixel() {
        return this.pixel;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }


    @Override
    public String toString() {
        return super.toString()+"\ntype:" + getType()+"\npixel:" + getPixel() +"\nformat:" + getFormat()+"\n"+super.discount();
    }


    
}
