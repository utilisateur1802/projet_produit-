package sn.esmt.produit.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.produit.entity.ProduitEntity;
import sn.esmt.produit.service.ProduitService;

import java.util.List;

@RestController
@RequestMapping("produits")
@AllArgsConstructor
public class ProduitController {
  private ProduitService produitService;

  @PostMapping
  public ProduitEntity save(ProduitEntity produitEntity){
    return produitService.save(produitEntity);
  }

  @GetMapping
  public List<ProduitEntity> all() {
    return produitService.getAll().get();
  }

  @DeleteMapping
  public void delete(String reference){
    produitService.delete(reference);
  }

  @PutMapping
  public ProduitEntity update(String reference,ProduitEntity produitEntity){
    return produitService.update(reference,produitEntity);
  }

}
