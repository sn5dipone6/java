package seven.first;

public abstract class Employee implements Payable{
    private String name;
    private String ID;

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }
}