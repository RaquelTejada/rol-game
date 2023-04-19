public class Wizard extends Character{
    private int mana;
    private int intelligence;

    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);

        if(hp < 50) { setHp(50);}
        else if(hp > 100) { setHp(100);}
        else {setHp(hp);}

        if(mana < 10) { setMana(10); }
        else if(mana > 50) { setMana(50); }
        else { setMana(mana); }

        if(intelligence < 1) { setIntelligence(1);}
        else if(intelligence > 50) { setIntelligence(50); }
        else { setIntelligence(intelligence); }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;

    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name=" + super.getName() +
                ", hp=" + super.getHp() +
                ", mana=" + mana +
                ", intelligence=" + intelligence +
                '}';
    }

    @Override
    public void attack(Character victim) {
        if (mana == 0) {
            mana += 2;
            System.out.println(super.getName() + ", you don't have enough mana to attack.");
        } else if (mana > 0 && mana < 5) {
            victim.setHp(victim.getHp() - 2);
            mana++;
            System.out.println(super.getName() + " executes STAFF HIT attack." +"\u26A1  "+ victim.getName() + " loses 2 hp." + "\uD83D\uDE2D");
        } else {
            int attackType = (int) (Math.random() * 2 + 1);
            if (attackType == 1) {
                int damageFireball = intelligence;
                victim.setHp(victim.getHp() - damageFireball);
                mana -= 5;
                System.out.println(super.getName() + " executes FIREBALL attack." + "\uD83D\uDD25  " + victim.getName() + " loses " + damageFireball + " hp." + "\uD83D\uDE2D");

            } else {
                victim.setHp(victim.getHp() - 2);
                mana++;
                System.out.println(super.getName() + " executes STAFF HIT attack." +"\u26A1  "+ victim.getName() + " loses 2 hp." + "\uD83D\uDE2D");
            }

        }
    }
}
