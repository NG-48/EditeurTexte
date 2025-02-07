package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument {

    public CommandeEffacer(Document doc,String[] parameters) {super(doc,parameters);}


    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : effacer;debut;fin");
            return;
        }
        int debut = Integer.parseInt(parameters[1]), fin = Integer.parseInt(parameters[2]);
        document.remplacer(debut,fin,"");
        super.executer();
    }
}
