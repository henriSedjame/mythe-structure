package org.mythe.structure.services;

import org.mythe.structure.models.Utilisateur;
import org.mythe.structure.models.connexion.ParametreConnexion;

import java.util.function.Function;

public interface MytheInterfaceServices<User, Prest, Res, Cren> {


  /** Un utilisateur doit pouvoir s'inscrire sur la plateforme**/
  Utilisateur inscription(Utilisateur utilisateur, Function<ParametreConnexion, Utilisateur> function);

  /** Un utilisateur doit pouvoir se désincrire de la plateforme**/
  boolean desincription(User user);

  /** Un utilisateur doit pouvoir se connecter à son espace perso sur la plateforme **/
  User connexion(String login, String password);

  /** Un utilisateur doit pouvoir se déconnecter de son espace perso sur la palteforme**/
  boolean deconnexion(User user);


  /** Un prestataire doit pouvoir ajouter une nouvelle prestation**/
  Prest ajouterService(User vendeur, Prest prestation);

  /** Un prestataire doit pouvoir supprimer une prestation existante **/
  boolean supprimerService(User vendeur, Prest prestation);

  /** Un prestataire doit pouvoir modifier une prestation existante**/
  Prest modifierService(Prest prestation);


  /** Un prestataire doit pouvoir ajouter un créneau à son agenda**/
  boolean ajouterCreneau(Cren creaneau);

  /** Un prestataire doit pouvoir supprimer un créneau de son agenda**/
  boolean supprimerCreneau(Cren cren);


  /** Un client doit pouvoir réserver une prestation **/
  Res reserverService(Prest service, User client);

  /** Un client doit pouvoir annuler une prestation **/
  boolean annulerReservation(Res reservation, User client);

  /** Un prestataire doit pouvoir accepter une reservation **/
  Res accepterReservation(Res reservation, User vendeur);

  /** Un prestataire doit pouvoir refuser une reservation **/
  Res refuserReservation(Res reservation, User vendeur);

}
