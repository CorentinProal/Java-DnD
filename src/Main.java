import Personnage.Personnage;
import Prametre.Game;
import Prametre.Menu;
import Prametre.PersonnageHorsPlateauException;

public class Main {
    public static void main(String[] args) throws PersonnageHorsPlateauException {
        Game game = new Game();
        game.start();
    }
}


/////////////////////////////////////////////////////// V1 ///////////////////////////////////////////////////////////
//        +---------------------+
//        |       Main          |
//        +---------------------+
//        |                     |
//        +---------------------+
//        | + main(String[] args) |
//        +---------------------+
//        |
//        |
//        v
//        +---------------------+
//        |       Game          |
//        +---------------------+
//        | - personnage: Personnage |
//        | - position: int     |
//        | - LimitePlateau: int|
//        | - sc: Scanner       |
//        | - menu: Menu        |
//        +---------------------+
//        | + setPersonnage(Personnage) |
//        | + getPersonnage(): Personnage |
//        | + getPosition(): int |
//        | + setPosition(int)   |
//        | + start()            |
//        | + ChoixOption(int): int |
//        | + Deplacement()      |
//        | + Fin(): boolean     |
//        | + Message(String)    |
//        | + Jouer()           |
//        | + InfosPersonnage()  |
//        +---------------------+
//        |
//        |
//        v
//        +---------------------+
//        |       Menu          |
//        +---------------------+
//        | - sc: Scanner       |
//        +---------------------+
//        | + Message(String)   |
//        | + CreationPersonnage(Game) |
//        +---------------------+
//        |
//        |
//        v
//        +---------------------+
//        |     Personnage      |
//        +---------------------+
//        | - name: String      |
//        | - type: String      |
//        | - HP: int           |
//        | - ATQ: int          |
//        | - equipOffensif: EquipmentOffensif |
//        | - equipDefensif: EquipementDefensif |
//        +---------------------+
//        | + getEquipementOffensif(): EquipmentOffensif |
//        | + getEquipementDefensif(): EquipementDefensif |
//        | + toString(): String  |
//        | + parametreheros()    |
//        +---------------------+
//        ^
//        |
//        |
//        +---------------------+          +---------------------+
//        |      Guerrier      |          |      Magicien       |
//        +---------------------+          +---------------------+
//        |                     |          |                     |
//        +---------------------+          +---------------------+
//        | + parametreheros()  |          | + parametreheros()  |
//        +---------------------+          +---------------------+
//        |
//        |
//        v
//        +---------------------+
//        |  EquipmentOffensif  |
//        +---------------------+
//        | - name: String      |
//        | - type: String      |
//        | - ATQLevel: int     |
//        +---------------------+
//        | + getName(): String  |
//        | + getType(): String  |
//        | + setName(String)    |
//        | + setType(String)    |
//        | + getATQLevel(): int |
//        | + setATQLevel(int)   |
//        | + toString(): String  |
//        +---------------------+
//        ^
//        |
//        |
//        +---------------------+          +---------------------+
//        |        Arme         |          |        Sort         |
//        +---------------------+          +---------------------+
//        |                     |          |                     |
//        +---------------------+          +---------------------+
//        |                     |          |                     |
//        +---------------------+          +---------------------+
//
//        +---------------------+
//        |  EquipementDefensif |
//        +---------------------+
//        | - name: String      |
//        | - type: String      |
//        | - DEFLevel: int     |
//        +---------------------+
//        | + getName(): String  |
//        | + getType(): String  |
//        | + setName(String)    |
//        | + setType(String)    |
//        | + getDEFLevel(): int |
//        | + setDEFLevel(int)   |
//        | + toString(): String  |
//        +---------------------+
//        ^
//        |
//        |
//        +---------------------+          +---------------------+
//        |      Bouclier      |          |       Philtre       |
//        +---------------------+          +---------------------+
//        |                     |          |                     |
//        +---------------------+          +---------------------+
//        |                     |          |                     |
//        +---------------------+          +---------------------+
//
//        +---------------------+
//        | PersonnageHorsPlateauException |
//        +---------------------+
//        |                     |
//        +---------------------+
//        | + PersonnageHorsPlateauException(String) |
//        +---------------------+
//
/////////////////////////////////////////////////////// V1 ///////////////////////////////////////////////////////////


/////////////////////////////////////////////////////// V2 ///////////////////////////////////////////////////////////
//
//        ,---------------------.   ,----------------------------------------.
//             |Main            |   |    |PersonnageHorsPlateauException     |
//        |---------------------|   |----------------------------------------|
//        |+ main(String[] args)|   |+ PersonnageHorsPlateauException(String)|
//        `---------------------'   `----------------------------------------'
//
//
//        ,-----------------------------.
//        |Game                         |
//        |-----------------------------|
//        |- personnage: Personnage     |
//        |- position: int              |
//        |- LimitePlateau: int         |
//        |- sc: Scanner                |
//        |- menu: Menu                 |
//        |+ setPersonnage(Personnage)  |
//        |+ getPersonnage(): Personnage|
//        |+ getPosition(): int         |
//        |+ setPosition(int)           |
//        |+ start()                    |
//        |+ ChoixOption(int): int      |
//        |+ Deplacement()              |
//        |+ Fin(): boolean             |
//        |+ Message(String)            |
//        |+ Jouer()                    |
//        |+ InfosPersonnage()          |
//        `-----------------------------'
//
//                                      ,---------------------------------------------.
//                                      |Personnage                                   |
//                                      |---------------------------------------------|
//                                      |- name: String                               |
//        ,--------------------------.  |- type: String                               |
//        |Menu                      |  |- HP: int                                    |
//        |--------------------------|  |- ATQ: int                                   |
//        |- sc: Scanner             |  |- equipOffensif: EquipmentOffensif           |
//        |+ Message(String)         |  |- equipDefensif: EquipementDefensif          |
//        |+ CreationPersonnage(Game)|  |+ getEquipementOffensif(): EquipmentOffensif |
//        `--------------------------'  |+ getEquipementDefensif(): EquipementDefensif|
//                                      |+ toString(): String                         |
//                                      |+ parametreheros()                           |
//                                      `---------------------------------------------'
//
//
//                                                      ,--------------------.   ,--------------------.
//                                                      |EquipmentOffensif   |   |EquipementDefensif  |
//                                                      |--------------------|   |--------------------|
//                                                      |- name: String      |   |- name: String      |
//        ,------------------.   ,------------------.   |- type: String      |   |- type: String      |
//        |Guerrier          |   |Magicien          |   |- ATQLevel: int     |   |- DEFLevel: int     |
//        |------------------|   |------------------|   |+ getName(): String |   |+ getName(): String |
//        |+ parametreheros()|   |+ parametreheros()|   |+ getType(): String |   |+ getType(): String |
//        `------------------'   `------------------'   |+ setName(String)   |   |+ setName(String)   |
//                                                      |+ setType(String)   |   |+ setType(String)   |
//                                                      |+ getATQLevel(): int|   |+ getDEFLevel(): int|
//                                                      |+ setATQLevel(int)  |   |+ setDEFLevel(int)  |
//                                                      |+ toString(): String|   |+ toString(): String|
//                                                      `--------------------'   `--------------------'
//
//                                                          ,----.   ,----.      ,--------.  ,-------.
//                                                          |Arme|   |Sort|      |Bouclier|  |Philtre|
//                                                          |----|   |----|      |--------|  |-------|
//                                                          `----'   `----'      `--------'  `-------'
//
/////////////////////////////////////////////////////// V2 ///////////////////////////////////////////////////////////