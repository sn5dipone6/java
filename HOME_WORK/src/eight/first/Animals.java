package eight.first;

interface Amphibious extends Aquatic, Land {
    String live();
}

class Aquatic_animals extends Animals implements Aquatic {
    public Aquatic_animals(String name) {
        super(name);
    }
    public String live() {
        return getName() + "是生活在水中。";
    }
}

class Land_animals extends Animals implements Land {
    public Land_animals(String name) {
        super(name);
    }
    public String live() {
        return getName() + "是生活在陆地上。";
    }
}

class Amphibious_animals extends Animals implements Amphibious {
    public Amphibious_animals(String name) {
        super(name);
    }
    public String live() {
        return getName() + "既可以生活在陆地上，也可以生活在水中。";
    }
}
public class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Aquatic_animals fish = new Aquatic_animals("fish");
        Land_animals lion = new Land_animals("lion");
        Amphibious_animals frog = new Amphibious_animals("frog");
        System.out.println(fish.live());
        System.out.println(lion.live());
        System.out.println(frog.live());
    }
}