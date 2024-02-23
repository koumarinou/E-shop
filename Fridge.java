public class Fridge extends HomeDevices {
    private String type;
    private String energClass;
    private int capacityFridge;//Xwrithkothta Psigeiou
    private int capacityReFRi;//Xwrithkothta Katapsixi

    Fridge(){
        
    }

    Fridge(int code, String model, int year, String constructor, double price, int quantity,String type,String energClass,int capacityFridge,int capacityReFRi) {
        super(code, model, year, constructor, price, quantity);
        this.type=type;
        this.energClass=energClass;
        this.capacityFridge=capacityFridge;
        this.capacityReFRi=capacityReFRi;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEnergClass() {
        return this.energClass;
    }

    public void setEnergClass(String energClass) {
        this.energClass = energClass;
    }

    public int getCapacityFridge() {
        return this.capacityFridge;
    }

    public void setCapacityFridge(int capacityFridge) {
        this.capacityFridge = capacityFridge;
    }

    public int getCapacityReFRi() {
        return this.capacityReFRi;
    }

    public void setCapacityReFRi(int capacityReFRi) {
        this.capacityReFRi = capacityReFRi;
    }

    @Override
    public String toString() {
        return super.toString()+"\ntype:" + getType() + "\nenergClass:" + getEnergClass() +"\ncapacityFridge:" + getCapacityFridge() +"\ncapacityReFRi:" + getCapacityReFRi()+"\n"+super.discount();
    }
    
}
