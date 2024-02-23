public class Console extends Gaming {
    private String type;
    private String processor;//Epejergasths
    private String graphic;//Grafika
    private int hardDrive;//Xwrikothta Sklhrou diskou
    private String audio;//Hxos

    Console(){
        
    }

    Console(int code, String model, int year, String constructor, double price, int quantity,String type,String processor,String graphic,int hardDrive,String audio) {
        super(code, model, year, constructor, price, quantity);
        this.type=type;
        this.processor=processor;
        this.graphic=graphic;
        this.hardDrive=hardDrive;
        this.audio=audio;
        
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProcessor() {
        return this.processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphic() {
        return this.graphic;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    public int getHardDrive() {
        return this.hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getAudio() {
        return this.audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return super.toString()+"\ntype:" + getType() +"\nprocessor:" + getProcessor() +"\ngraphic:" + getGraphic() +"\nhardDrive:" + getHardDrive()  + "\naudio:" + getAudio()+"\n"+super.discount() ;
    }
    
}
