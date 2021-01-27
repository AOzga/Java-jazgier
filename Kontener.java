package kontenery;

public class Kontener{
    private int weight;
    private String cargo;
    public String type;
    public static int nextId;
    public int id;

    public Kontener(int weight, String cargo){
        this.weight = weight;
        this.cargo = cargo;
        this.type = "20ft";
        Kontener.nextId++;
        this.id = Kontener.nextId;
    }
    
    public String GetInfo() {
    	return String.format("Container nr. %d of type %s info [Weight = %d , Cargo = %s] \n", this.id, this.type,this.weight, this.cargo);
    }
}