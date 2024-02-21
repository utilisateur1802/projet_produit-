package sn.esmt.produit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="produit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProduitEntity {
  @Id
  @Column(name= "reference",length = 10)
  private String reference;
  @Column(name= "nom",length = 150)
  private String nom;
  @Column(name = "quantite_stock")
  private double qt_stock;

}
