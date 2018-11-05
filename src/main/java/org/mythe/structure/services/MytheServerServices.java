package org.mythe.structure.services;

import org.mythe.structure.models.connexion.ParametreConnexion;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public interface MytheServerServices {

  /** demande au service connexion de sauvegarger un nouvel utilisateur **/
  Mono<ParametreConnexion> inscrire(ParametreConnexion user);
}
