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
public class Cellule {
        Jeton jetonCourant;
        boolean trouNoir;
        boolean desintegrateur;
        
        
 public Cellule(){
     jetonCourant = null;
     trouNoir = false;
     desintegrateur = false;  
 }
        
public boolean affecterJeton(Jeton jetoon){
    if (jetonCourant == null){
         jetonCourant = jetoon;
         return true;
    }
    else
     return false;
}

public Jeton recupererJeton(){
 return jetonCourant ;
}

public boolean supprimerJeton(){
    if (jetonCourant == null){
        return false;
    }
    else{
    jetonCourant = null;
    return true;
    }
}

public boolean placerTrouNoir(){
    if (trouNoir == true){
        return false;
    }
    else {
        trouNoir = true;
        return true;
    }
}

public boolean placerDesintegrateur(){
    if (desintegrateur == true){
        return false;
    }
    else {
        desintegrateur = true;
        return true; 
}
}

public boolean presenceTrouNoir(){
    if (trouNoir == true){
        return false;
    }
    else {
        return true;
    }
}

public boolean presenceDesintegrateur(){
   if (desintegrateur == true){
        return true;
    }
    else {
        return false; 
    }
    }   

public String lirecouleurduJeton(){
    String CouleurCourante = jetonCourant.Couleur ;
    return CouleurCourante ; 
}

public boolean récupérerDesintegrateur(){
    if (desintegrateur == true){
        desintegrateur = false;
        return true;
    }
    else {
        return false; 
    }
}

public boolean activerTrouNoir(){
    if (trouNoir == true){
        jetonCourant = null;
        return true;
    }
    else {
        return false;
    }
}






}

    



