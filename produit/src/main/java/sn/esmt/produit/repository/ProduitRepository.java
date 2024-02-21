package sn.esmt.produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.esmt.produit.entity.ProduitEntity;

import java.util.Optional;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity,String>{

  @Query("select e from ProduitEntity e where e.reference=?1 and e.nom=?2")
  public Optional<ProduitEntity> findByReferenceAndNom(String reference, String nom);

  @Query("select e from ProduitEntity e where e.reference= :r and e.nom= :n")
  public Optional<ProduitEntity> findByReferenceAndNomv2(@Param("r") String reference, @Param("n") String nom);

  public Optional<ProduitEntity> findByReference(String reference);
}
