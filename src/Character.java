public class Character implements IAttacker{
//    comment
    private String id;
    private String name;
    private int hp;
    private boolean isAlive = true;

    private String characterType;

    //Tipo de personaje = typePJ. -> String -> "warrior",
    // energy = 100;
    // attribute = 200;


    public Character(String id, String name, int hp, boolean isAlive, String characterType) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
        this.characterType=characterType;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public void attack(Character victim) {

    }
}
