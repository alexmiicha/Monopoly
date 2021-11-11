package monopoly.monopoly.carte;

public class Impot extends Carte{

    private int sommeBonus;

    //Getter and Setter
    public int getSommeBonus() {return sommeBonus;}
    public void setSommeBonus(int sommeBonus) {this.sommeBonus = sommeBonus;}


    public Impot(int id, String nomCarte, Boolean possibiliteProprietaire, int sommeBonus) {
        super(id, nomCarte, possibiliteProprietaire);
        this.sommeBonus = sommeBonus;
    }

}
