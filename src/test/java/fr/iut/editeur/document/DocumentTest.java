package fr.iut.editeur.document;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.commande.factory.CommandeFactory;
import fr.iut.editeur.commande.invoker.CommandeInvoker;
import org.junit.jupiter.api.Test;

import javax.print.Doc;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testMethode() {
        Document doc  =new Document();
        CommandeFactory commandeFactory = CommandeFactory.getInstance();
        CommandeInvoker commandeInvoker = CommandeInvoker.getInstance();
        commandeInvoker.executer(commandeFactory.createCommand("ajouter",doc,new String[]{"ajouter","contenu du doc"}));
        assertTrue(doc.getTexte().equals("contenu du doc"));
    }

}