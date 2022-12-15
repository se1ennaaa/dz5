public class Hero {
    private int Haltht;
    private int Damage;
    private String ability;

    public Hero(int haltht, int damage, String ability) {
        Haltht = haltht;
        Damage = damage;
        this.ability = ability;
    }

    public Hero(int haltht, int damage) {
        Haltht = haltht;
        Damage = damage;
    }

    public int getHaltht() {
        return Haltht;
    }

    public int getDamage() {
        return Damage;
    }

    public String getAbility() {
        return ability;
    }


    public String toString(){

return " helth "+Haltht + "  Damage  " +Damage+ " ability "+ability;
    }
}

