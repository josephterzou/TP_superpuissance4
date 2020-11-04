/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_super_puissance4_terzibachian_schaeffer;

/**
 *
 * @author jterziba
 */
public class Joueur {
String Nom;
String Couleur;
Jeton[] ListeJetons;
int nombreDesintegrateurs;
int nombredeJetonsrestants;


public Joueur (String NomJ){
 Nom= NomJ;
}

public void affecterCouleur(String CouleurJ){ //association d'une couleur de jeton à un joueur
    Couleur = CouleurJ;
}

public boolean ajouterJeton(Jeton NvJeton){ //init
 if (nombredeJetonsrestants <21){ //nombredeJetonsrestants correspond à la taille de la liste (max 21 jetons)
    ListeJetons[nombredeJetonsrestants]=NvJeton; //tant qu'on a pas atteint 21 on peut ajouter des nouveaux jetons
 nombredeJetonsrestants=+1;
 return true;}
 else // on peut plus ajouter de jetons
     return false;
}

public void obtenirDesintegrateur(){
    nombreDesintegrateurs=+1; //incrémente le nb de désintégrateurs du joueur qd la f° est appelée
}

public boolean utiliserDesintegrateur(){  
    if (nombreDesintegrateurs >0){//on vérifie que le joueur a au moins un désintégrateur
        nombreDesintegrateurs=-1;//et si oui, on le laisse en utiliser  un et on lui retire
    return true;//on retourne true si ça s'est bien passé
    }
    else
       return false;//on retourne false sinon
   
}




}
