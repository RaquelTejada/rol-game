public class Warrior extends Character{

    private int stamina;
    private int strength;

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);

        if(hp < 100) { setHp(100);}
        else if(hp > 200) { setHp(200);}
        else {setHp(hp);}

        if(stamina < 10) { setStamina(10); }
        else if(stamina > 50) {setStamina(50);}
        else { setStamina(stamina);}

        if(strength < 1) { setStrength(1); }
        else if(strength > 10) { setStrength(10);}
        else { setStrength(strength);}
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name=" + super.getName() +
                ", hp=" + super.getHp() +
                ", stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }
    @Override
    public void attack(Character victim) {
        int damage = (int) Math.floor((this.getStrength() / 2) * 100) / 100;
        if (stamina == 0) {
            System.out.println(super.getName() + ", you don't have enough stamina to attack" );
            this.setStamina(this.getStamina() + 2);
        } else {
            if (stamina < 5) {
                this.weakAttack(victim);
                System.out.println(super.getName() + " executes WEAK attack." + "\u2728  " + victim.getName() + " loses " + damage + " hp." + "\uD83D\uDE2D");
            } else {
                int attackType = (int) (Math.random() * 2 + 1);
                if (attackType == 1) {
                    this.heavyAttack(victim);
                    System.out.println(super.getName() + " executes HEAVY attack." + "\uD83D\uDCA5  " + victim.getName() + " loses " + strength + " hp." + "\uD83D\uDE2D");
                } else {
                    this.weakAttack(victim);
                    System.out.println(super.getName() + " executes WEAK attack." + "\u2728  " + victim.getName() + " loses " + damage + " hp." + "\uD83D\uDE2D");
                }
            }
        }
    }

    private void heavyAttack(Character victim) {
        victim.setHp(victim.getHp() - this.getStrength());
        this.setStamina(this.getStamina() - 5);
    }

    private void weakAttack(Character victim) {
        int damage = (int) Math.floor((this.getStrength() / 2) * 100) / 100;
        victim.setHp(victim.getHp() - damage);
        this.setStamina(this.getStamina() + 1);
    }
}

