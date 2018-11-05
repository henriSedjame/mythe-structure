package org.mythe.structure.services.impl;

import org.mythe.structure.models.Utilisateur;
import org.mythe.structure.services.MytheInterfaceServices;
import org.mythe.structure.services.MytheServerServices;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class MytheInterfaceServicesImpl implements MytheInterfaceServices {

  private MytheServerServices serverServices;

  public MytheInterfaceServicesImpl(MytheServerServices serverServices) {
    this.serverServices = serverServices;
  }

  @Override
  public Utilisateur inscription(Utilisateur utilisateur, Function function) {

    return null;
  }

  @Override
  public boolean desincription(Object o) {

    return false;
  }

  @Override
  public Object connexion(String login, String password) {
    return null;
  }

  @Override
  public boolean deconnexion(Object o) {
    return false;
  }

  @Override
  public Object ajouterService(Object vendeur, Object prestation) {
    return null;
  }

  @Override
  public boolean supprimerService(Object vendeur, Object prestation) {
    return false;
  }

  @Override
  public Object modifierService(Object prestation) {
    return null;
  }

  @Override
  public boolean ajouterCreneau(Object creaneau) {
    return false;
  }

  @Override
  public boolean supprimerCreneau(Object o) {
    return false;
  }

  @Override
  public Object reserverService(Object service, Object client) {
    return null;
  }

  @Override
  public boolean annulerReservation(Object reservation, Object client) {
    return false;
  }

  @Override
  public Object accepterReservation(Object reservation, Object vendeur) {
    return null;
  }

  @Override
  public Object refuserReservation(Object reservation, Object vendeur) {
    return null;
  }
}
