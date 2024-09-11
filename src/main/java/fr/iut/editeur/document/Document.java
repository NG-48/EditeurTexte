package fr.iut.editeur.document;



public class Document {

    // le texte contenu sur notre page
    private String texte;

    public Document() {
        this.texte = "";
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    // rajoute du texte à la fin du précedent
    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }
    // remplace le texte compris entre debut et fin par le texte remplacement
    public void remplacer(int debut, int fin, String remplacement) {
     String partieGauche = texte.substring(0, debut);
     String partieDroite = texte.substring(fin + 1);
     texte = partieGauche + remplacement + partieDroite;
      }

    public void majuscules(int debut,int fin){
      String maj = texte.substring(debut,fin+1);
      maj = maj.toUpperCase();
      remplacer(debut,fin,maj);
    }

    public void clear(){
        texte = "";
    }

    public void ajouter(int debut,String ajout){
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(debut + 1);
        texte = partieGauche + ajout + partieDroite;
    }
}
