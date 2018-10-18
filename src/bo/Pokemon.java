package bo;

public class Pokemon {
    private String name;
    private int niveauDeVie;
    private int niveauDePouvoir;
    private String criDeVictoire;
    private String criDeDefaite;
    private String criDeCombat;


    public Pokemon(String name, int niveauDeVie, int niveauDePouvoir, String criDeCombat, String criDeDefaite, String criDeVictoire) {
        this.name = name;
        this.niveauDeVie = niveauDeVie;
        this.niveauDePouvoir = niveauDePouvoir;
        this.criDeCombat = criDeCombat;
        this.criDeDefaite=criDeDefaite;
        this.criDeVictoire=criDeVictoire;
    }

    public String getName() {
        return name;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public int getNiveauDePouvoir() {
        return niveauDePouvoir;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public void setNiveauDePouvoir(int niveauDePouvoir) {
        this.niveauDePouvoir = niveauDePouvoir;
    }

    public String getCriDeVictoire() {
        return criDeVictoire;
    }

    public void setCriDeVictoire(String criDeVictoire) {
        this.criDeVictoire = criDeVictoire;
    }

    public String getCriDeDefaite() {
        return criDeDefaite;
    }

    public void setCriDeDefaite(String criDeDefaite) {
        this.criDeDefaite = criDeDefaite;
    }

    public String getCriDeCombat() {
        return criDeCombat;
    }

    public void setCriDeCombat(String criDeCombat) {
        this.criDeCombat = criDeCombat;
    }

    public boolean isequal (Pokemon pokemon){
        return this.name.equals(pokemon.getName());

    }

    public Pokemon attack(Pokemon pkm) {
        pkm.setNiveauDeVie(pkm.getNiveauDeVie() - this.getNiveauDePouvoir());
        return pkm;
    }

    public boolean dead (){
        return this.niveauDeVie <= 0;
    }


}