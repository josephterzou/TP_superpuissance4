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
public class Grille {
 Cellule[][] Cellules ;
 Cellule[][] tableaudecel = new Cellule[6][7];
 
 
 public void Grille(){
 for(int i=0 ; i<5 ; i++){
    for(int j=0 ; j<6 ; j++){
    Cellules[i][j] = new Cellule();
}
}
}

 public boolean ajouterJetonDansColonne(Jeton unJeton, int colone){
     boolean a = false ;
     for (int i =0 ; i<6 ; i++){//On parcours tout la colone
         if (Cellules[i][colone].affecterJeton(unJeton) == true){ //la fonction affecterJeton retourne true si elle a affecté le jeton
             i=6 ;//On pose i=6 pour sortir de la boucle for si cette condition est vérifiée
             a = true ;
         }
         else{
             a = false ;
         }
 }
 return a;
}

 
 
 public boolean etreRemplie(){
     boolean a = false ;
     for (int i =0 ; i<6 ; i++){//on parcours toutes les colones
         for (int j =0 ; j<6 ; j++){//on parcours toutes les lignes
            if (Cellules[i][j]== null){//si la cellule est vide alors la grille n'est pas pleine
             i=6 ;//on sort donc de la boucle pour pas faire tourner la boucle inutilement
             a = false ;
         }
         else{
             a = true ;
         }
        }
    }
return a;
}   
    
public void viderGrille(){
    for (int i =0 ; i<6 ; i++){//on parcours toutes les colones
         for (int j =0 ; j<6 ; j++){//on parcours toutes les lignes
         Cellules[i][j]= null;//on associe le vide à toutes les cases
         }
}
}

public void afficherGrilleSurConsole(){
    
}

public boolean 	celluleOccupee(int ligne ,int colone){
  if (Cellules[ligne][colone] != null){//on vérifie que la cellule de coordoonées données est occupée ou non
      return true ;
  }
  else return false ;
         
}


public String 	lireCouleurDuJeton(int ligne ,int colone){
   String a =  Cellules[ligne][colone].lirecouleurduJeton();//On utilise lirecouleurduJeton() créée dans la classe cellule
   return a ;
}

 public boolean etreGagnantePourJoueur(Joueur Joueur){
     
 }

public void tasserGrille(int colonne){
    for (int i = 0 ; i<6 ; i++){//on part du bas de la grille et on chercheune case de la colone ou un jeton a été suprimé 
        if (Cellules[i][colonne] == null){
            if (i !=5){
            for (int j=i ; j>0 ; j++){//On part de la cellule supprimée puis on remonte la grille de bas en haut
                Cellules[j][colonne]=Cellules[j+1][colonne];//On remplace chaque valeur de la colone au dessus du jeton supprimé par celle de la cellule d'au dessus    
            }       
            Cellules[5][colonne]=null;//si on décale tout alors la dernière valeur est forcément nulle
       //on pose la derniere cellule de la colone en dehors de la boucle car il n'existe pas de cellule au dessus de cette dernière
        }
        }//si le jeton supprimé était le jeton le plus haut d'une colone cela ne change rien car les cellules au dessus seront vide
    }
}
 

public boolean colonneRemplie(int colone){
    boolean a = false ;
    for (int i = 0 ; i<6 ; i++){
        if (Cellules[i][colone] == null){
            i = 6;
            a = false;
        }
        else a = true ;   
}
    return a;
} 

public boolean placerTrouNoir(int ligne, int colonne){
    if (Cellules[ligne][colonne].trouNoir == false){// on vérifie si il y a déja un trounoir
        Cellules[ligne][colonne].trouNoir = true;// si il n'y en a pas on en place un
    return true;//on retourne true si on a pu en placer un
    }
    else return false;//si il y en avait déja un on retourne false
}

public boolean placerDesintegrateur(int ligne, int colonne){
    if (Cellules[ligne][colonne].desintegrateur == false){// on vérifie si il y a déja un désintegrateur
        Cellules[ligne][colonne].desintegrateur = true;// si il n'y en a pas on en place un
    return true;//on retourne true si on a pu en placer un
    }
    else return false;//si il y en avait déja un on retourne false
}

public boolean supprimerJeton(int ligne, int colonne){
    if (Cellules[ligne][colonne] != null){
         Cellules[ligne][colonne]=null;
         return true;
    }
    else return false;
}

public Jeton recupererJeton(int ligne, int colonne){
    Jeton jeton = Cellules[ligne][colonne].recupererJeton();
    Cellules[ligne][colonne]=null;
    return jeton;
}




}