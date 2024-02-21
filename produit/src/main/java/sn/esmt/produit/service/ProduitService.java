package sn.esmt.produit.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sn.esmt.produit.entity.ProduitEntity;
import sn.esmt.produit.repository.ProduitRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProduitService implements IProduitService {
  private ProduitRepository produitRepository;

  @Override
  public ProduitEntity save(ProduitEntity produitEntity) {
    return produitRepository.save(produitEntity);
  }

  @Override
  public ProduitEntity update(String reference, ProduitEntity produitEntity) {
    Optional<ProduitEntity> produitEntity1 = this.get(reference);
    if (produitEntity1.isPresent()) {
      produitEntity1.get().setNom(produitEntity.getNom());
      produitEntity1.get().setQt_stock(produitEntity.getQt_stock());


      return produitRepository.save(produitEntity1.get());
    }
    return produitEntity;
  }

  @Override
  public Optional<ProduitEntity> get(String reference) {
    return produitRepository.findById(reference);
  }

  @Override
  public Optional<List<ProduitEntity>> getAll() {
    return Optional.of(produitRepository.findAll());
  }

  @Override
  public void delete(String reference) {
    Optional<ProduitEntity> produitEntity1 = this.get(reference);
    if (produitEntity1.isPresent()) {
      produitRepository.delete(this.get(reference).get());
    }
  }
}