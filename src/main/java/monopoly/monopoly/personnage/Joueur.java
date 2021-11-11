package monopoly.monopoly.personnage;

public class Joueur {

    private String NomJoueur;
    private int ChoixPion;
    private int Solde;
    private boolean Etat;
    private boolean Prison;
    private int nbTourPrison;

    public Joueur() {

    }

    public Joueur(String nomJoueur, int choixPion, boolean etat) {
        this.NomJoueur = nomJoueur;
        this.ChoixPion = choixPion;
        this.Solde = 2000;
        this.Etat = etat;
        this.Prison = false;
        this.nbTourPrison = 0;
    }

    public void afficher() {
        System.out.println("Nom : "+NomJoueur);
        System.out.println("Pion : "+ChoixPion);
        System.out.println("Solde : "+Solde);
        System.out.println("Etat : "+Etat);
        System.out.println("Prison : "+Prison);
        System.out.println("Nombre de tour de prison : "+nbTourPrison);
    }

    public String getNomJoueur() {
        return NomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        NomJoueur = nomJoueur;
    }

    public int getChoixPion() {
        return ChoixPion;
    }

    public void setChoixPion(int choixPion) {
        ChoixPion = choixPion;
    }

    public int getSolde() {
        return Solde;
    }

    public void setSolde(int solde) {
        Solde = solde;
    }

    public boolean isEtat() {
        return Etat;
    }

    public void setEtat(boolean etat) {
        Etat = etat;
    }

    public boolean isPrison() {
        return Prison;
    }

    public void setPrison(boolean prison) {
        Prison = prison;
    }

    public int getNbTourPrison() {
        return nbTourPrison;
    }

    public void setNbTourPrison(int nbTourPrison) {
        this.nbTourPrison = nbTourPrison;
    }


}
