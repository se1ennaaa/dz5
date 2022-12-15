public class Main {
    public static void main(String[] args) {
        Boss ursa = new Boss();
        ursa.setHalth(200);
        ursa.setDamage(50);
        ursa.setDefense("magic ");
        System.out.println("Здоровье "+ursa.getHalth() +" Урон "+ ursa.getDamage()+"  Защита "+ ursa.getDefense());

        for (int i = 0; i <creteHeroes().length ; i++) {
            System.out.println(" Номер героя № "+ (1+i)+creteHeroes()[i]);

        }


    }

    public static Hero[] creteHeroes(){
        Hero Voron = new Hero(200,40,"  udar");
        Hero adam = new Hero (300,50,"  magic");
        Hero Eva = new Hero (100, 40,"  Kinetic");
         Hero[] allHerose = {Voron,adam,Eva};

         return allHerose;

    }



}