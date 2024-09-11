package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

public class CommandeFactory {

    private static CommandeFactory instance;

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    /*
     * methode qui avec la ligne de commande entré creer la bonne fonctionalité
     * @param name , commmande saisit par l'utilisateur
     * @param document , document sur lequel on écrit actuellement
     * @param parameters , tableau contenant les parametres de la commande
     * @return Une commande qui est le produit de tout les paramètres
     */
    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter" : return new CommandeAjouter(document, parameters);
            case "remplacer" : return new CommandeRemplacer(document,parameters);
            case "effacer" : return new CommandeEffacer(document,parameters);
            case "clear" : return new CommandeClear(document,parameters);
            case "inserer" : return new CommandeInserer(document,parameters);
            default: return null;
        }
    }

}
