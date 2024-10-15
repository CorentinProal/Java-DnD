package parametre;

public class Main {
    public static void main(String[] args) throws horsPlateauException {
        Game game = new Game();
        game.start();
    }
}


/////////////////////////////////////////////////////// V1 ///////////////////////////////////////////////////////////
//        +---------------------+
//        |       parametre.Main          |
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
//        | + fin(): boolean     |
//        | + message(String)    |
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
//        | + message(String)   |
//        | + CreationPersonnage(Game) |
//        +---------------------+
//        |
//        |
//        v
//        +---------------------+
//        |     Personnage      |
//        +---------------------+
//        | - nom: String      |
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
//        | - nom: String      |
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
//        | - nom: String      |
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
//        | horsPlateauException |
//        +---------------------+
//        |                     |
//        +---------------------+
//        | + horsPlateauException(String) |
//        +---------------------+
//
/////////////////////////////////////////////////////// V1 ///////////////////////////////////////////////////////////


/////////////////////////////////////////////////////// V2 ///////////////////////////////////////////////////////////
//
//        ,---------------------.   ,----------------------------------------.
//             |parametre.Main            |   |    |horsPlateauException     |
//        |---------------------|   |----------------------------------------|
//        |+ main(String[] args)|   |+ horsPlateauException(String)|
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
//        |+ fin(): boolean             |
//        |+ message(String)            |
//        |+ Jouer()                    |
//        |+ InfosPersonnage()          |
//        `-----------------------------'
//
//                                      ,---------------------------------------------.
//                                      |Personnage                                   |
//                                      |---------------------------------------------|
//                                      |- nom: String                               |
//        ,--------------------------.  |- type: String                               |
//        |Menu                      |  |- HP: int                                    |
//        |--------------------------|  |- ATQ: int                                   |
//        |- sc: Scanner             |  |- equipOffensif: EquipmentOffensif           |
//        |+ message(String)         |  |- equipDefensif: EquipementDefensif          |
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
//                                                      |- nom: String      |   |- nom: String      |
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