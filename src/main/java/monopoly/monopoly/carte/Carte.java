package monopoly.monopoly.carte;

public class Carte {
    private int id;
    private String nomCarte;
    private Boolean possibiliteProprietaire;



    //Getter and Setter
    public Boolean getPossibiliteProprietaire() {return possibiliteProprietaire;}
    public void setPossibiliteProprietaire(Boolean possibiliteProprietaire) {this.possibiliteProprietaire = possibiliteProprietaire;}

    public String getNomCarte() {return nomCarte;}
    public void setNomCarte(String nomCarte) {this.nomCarte = nomCarte;}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    //End of getter and setter


    public Carte(int id, String nomCarte, Boolean possibiliteProprietaire) {
        this.id = id;
        this.nomCarte = nomCarte;
        this.possibiliteProprietaire = possibiliteProprietaire;
    }

}
