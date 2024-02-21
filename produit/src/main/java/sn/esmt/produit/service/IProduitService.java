package sn.esmt.produit.service;

import sn.esmt.produit.entity.ProduitEntity;

import java.util.List;
import java.util.Optional;

public interface IProduitService {

  public ProduitEntity save(ProduitEntity produitEntity);
  public ProduitEntity update(String reference, ProduitEntity produitEntity);
  public Optional<ProduitEntity> get(String reference);
  public Optional<List<ProduitEntity>> getAll();
  public void delete (String reference);
}
