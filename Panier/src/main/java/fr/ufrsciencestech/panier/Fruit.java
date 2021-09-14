/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author jb778790
 */
/**
 *
 * @author roudet
 */
public interface Fruit {
    public boolean isSeedless();  //predicat indiquant si le fruit a ou non des pepins
    public double getPrix();      //prix unitaire du fruit (en euros)
    public String getOrigine();   //pays d'origine du fruit
    @Override
    public boolean equals(Object o);  //predicat pour tester si 2 fruits sont equivalents
    @Override
    public String toString();    //affichage d'un fruit
}
