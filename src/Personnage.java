import java.util.Objects;

public class Personnage {
    private String name;
    private String type;
    private int HP;
    private int ATQ;

    public Personnage() {
        this.name = "Edouard";
    }
    public Personnage(String name){
        this(name, "Magicien");
    }

    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;

        if(Objects.equals(type, "Magicien")){
            this.HP = 6;
            this.ATQ = 15;
        }
        else if (Objects.equals(type, "Guerrier")) {
            this.HP = 10;
            this.ATQ = 10;
        };
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
        return "\n Nom : " + name + ", Type : " + type + "\n HP \uD83D\uDEE1\uFE0F : " + HP + "\n ATQ \uD83D\uDDE1\uFE0F: " + ATQ;
    }

}

