package onclass.nine;

public class Cat {
    private final String name;
    private final int age;
    private final int weight;
    private final String color;

    public Cat(final String name, final int age, final int weight, final String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int hashCode() {
        final int s = 7 * name.hashCode() + 11 * new Integer(age).hashCode() + 13 * new Double(weight).hashCode()
                + 17 * color.hashCode();
        return s;
    }

    public Boolean equals(Cat cat) {
	    if ((new Integer(cat.age).equals(age)) && (new Integer(cat.weight).equals(weight)) && (cat.name.equals(name))
	            && (cat.color.equals(color)))
	        return true;
	    else
	        return false;
	
	}

	public static void toString(final Cat[] obj) {
        int i;
        for (i = 0; i < obj.length; i++) {
            if (obj[i + 1].equals(obj[i]))
                continue;
            else
                System.out.println(obj[i].name + obj[i].age + obj[i].weight + obj[i].color);
        }
    }

    public static void main(final String[] args) {
    
    }
}