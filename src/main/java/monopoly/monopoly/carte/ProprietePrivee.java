package monopoly.monopoly.carte;

import monopoly.monopoly.personnage.Joueur;

public class ProprietePrivee extends Carte{

    private int nombreMaison;
    private int sommeAchat;
    private Joueur proprieteaire;


    //Getter and Setter
    public int getNombreMaison() {
        return nombreMaison;
    }

    public void setNombreMaison(int nombreMaison) {
        this.nombreMaison = nombreMaison;
    }

    public int getSommeAchat() {
        return sommeAchat;
    }

    public void setSommeAchat(int sommeAchat) {
        this.sommeAchat = sommeAchat;
    }

    public Joueur getProprieteaire() {
        return proprieteaire;
    }

    public void setProprieteaire(Joueur proprieteaire) {
        this.proprieteaire = proprieteaire;
    }
    //End of Getter and Setter


    public ProprietePrivee(int id, String nomCarte, Boolean possibiliteProprietaire, int nombreMaison, int sommeAchat, Joueur proprieteaire) {
        super(id, nomCarte, possibiliteProprietaire);
        this.nombreMaison = nombreMaison;
        this.sommeAchat = sommeAchat;
        this.proprieteaire = proprieteaire;
    }
}
