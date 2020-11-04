/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_super_puissance4_terzibachian_schaeffer;
import java.util.Random;


/**
 *
 * @author jterziba
 */
public class Partie {
    Joueur[] Listejoueur;
    Joueur joueurCourant;
    Random rand = new Random();
    Grille GrilleInitiale = new Grille();//on créé une grille
    
    public void initialiserPartie(){
     
     for (int i = 0 ; i<7 ; i++){
              for (int j = 0 ; j<6 ; j++)
                  GrilleInitiale.Cellules[j][i].jetonCourant = null ;//on associe le vide à toutes les cases
     }
     for (int k = 0 ; k<5 ; k++){
         int lignetrou = rand.nextInt(6);
         int colonetrou = rand.nextInt(7);
        
     
}
            
}




}