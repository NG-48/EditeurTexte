package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{

    public CommandeInserer(Document doc, String[] str) {super(doc,str);}

    public void executer(){
        if(parameters.length < 2) {
            System.err.println("Format attendu : inserer;debut(optionel);chaine");
            return;
        }
        int debut;
        String chaine;
        if(parameters.length == 3) {
            debut = Integer.parseInt(parameters[1]);
            chaine = parameters[2];
        }else{
            debut = document.getTexte().length();
            chaine = parameters[1];
        }
        document.ajouter(debut,chaine);
        super.executer();
    }
}
