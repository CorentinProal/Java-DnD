public class Personnage {
    private String name;
    private String type;

    public Personnage() {
        this.name = "";
        this.type = "";
    }

    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Nom: " + name + ", Type: " + type;
    }

    public void afficher() {
        System.out.println(this.toString());
    }
}

