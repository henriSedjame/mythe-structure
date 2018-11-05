package org.mythe.structure.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Utilisateur {


  @NotNull
  @NotBlank
  private String login;  /** login de connexion **/
}
