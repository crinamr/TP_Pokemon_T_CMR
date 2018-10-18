package bo;
import java.util.ArrayList;
import java.util.Random;

public class Tournoi {
    public int nbMax;
    public ArrayList<Pokemon> pokemonArrayList = new ArrayList<Pokemon>();

    public Tournoi (int nbMax) {
        this.nbMax = nbMax;
        for (int i=0; i<nbMax; i++) {
            this.pokemonArrayList.add(
                    new Pokemon("Coco " +i,
         new Random().nextInt(150)+50,
      new Random().nextInt(150)+10 ,"ruru"+i,"rere"+i,"roro"+i));
        }
    }

    public int getNbMax() {
        return nbMax;
    }

    public void start(){
        while (pokemonArrayList.size() > 1){
            Combat();
        }
        Pokemon pokemon = pokemonArrayList.get(0);
        System.out.println(pokemon.getName() + " a gagné");

    }
    public void Combat (){
        int index =new Random().nextInt(this.pokemonArrayList.size());
        Pokemon pkm1=this.pokemonArrayList.get(index);
        Pokemon pkm2;

        do {
             index =new Random().nextInt(this.pokemonArrayList.size());
             pkm2 = this.pokemonArrayList.get(index);
        } while (pkm1.isequal(pkm2));
        this.pokemonArrayList.remove(getPerdant(pkm1,pkm2));
    }

    public Pokemon getPerdant(Pokemon pkm1, Pokemon pkm2){
        pkm1.attack(pkm2);
        if (pkm2.dead()){
            System.out.println(pkm2.getCriDeDefaite());
            System.out.println(pkm1.getCriDeVictoire());
            return pkm2;
        }
        pkm2.attack(pkm1);
        if (pkm1.dead()){
            System.out.println(pkm1.getCriDeDefaite());
            System.out.println(pkm2.getCriDeVictoire());
            return pkm1;
        }
        return getPerdant(pkm1,pkm2);
    }






}



