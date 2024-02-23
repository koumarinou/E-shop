public class WashingMachine extends HomeDevices{
    private String energClass;
    private int capacity;
    private int turns;

    WashingMachine(){
        
    }

    WashingMachine(int code, String model, int year, String constructor, double price, int quantity,String energClass,int capacity,int turns) {
        super(code, model, year, constructor, price, quantity);
        this.energClass=energClass;
        this.capacity=capacity;
        this.turns=turns;
        
    }

    public String getEnergClass() {
        return this.energClass;
    }

    public void setEnergClass(String energClass) {
        this.energClass = energClass;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTurns() {
        return this.turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    @Override
    public String toString() {
        return super.toString()+"energClass:" + getEnergClass() +"\ncapacity:" + getCapacity()+ "\nturns:" + getTurns()+"\n"+super.discount() ;
    }

    
}
