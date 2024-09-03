package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;debut;fin;chaine");
            return;
        }
        int debut = Integer.parseInt(parameters[1]), fin = Integer.parseInt(parameters[2]);
        String remplacement ="";
        if (parameters.length>3) remplacement = parameters[3];
        document.remplacer(debut,fin,remplacement);
        super.executer();
    }

}
