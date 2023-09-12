package com.apps.inventory.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.apps.inventory.model.Document;
import com.apps.inventory.model.Product;
import com.apps.inventory.model.Vendor;
import com.apps.inventory.model.OrderAlert;
import com.apps.inventory.model.Inventory;
import com.apps.inventory.model.PurchaseOrder;
import com.apps.inventory.model.Restaurant;
import com.apps.inventory.enums.ProductType;
import com.apps.inventory.converter.ProductTypeConverter;
import com.apps.inventory.converter.DurationConverter;
import com.apps.inventory.converter.UUIDToByteConverter;
import com.apps.inventory.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "PurchaseOrder")
@Table(name = "\"PurchaseOrder\"", schema =  "\"InventoryV611\"")
@Data
                        
public class PurchaseOrder {
	public PurchaseOrder () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"PurchaseOrderId\"", nullable = true )
  private Integer purchaseOrderId;
	  
  @Column(name = "\"ProductName\"", nullable = true )
  private String productName;
  
	  
  @Column(name = "\"Discount\"", nullable = true )
  private Integer discount;
  
	  
  @Column(name = "\"PurchaseOrderDate\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date purchaseOrderDate;  
  
	  
  @Column(name = "\"Invoice\"", nullable = true )
  private String invoice;
  
	  
  @Column(name = "\"TaxGSTAmount\"", nullable = true )
  private Integer taxGSTAmount;
  
	  
  @Column(name = "\"ExchangeDate\"", nullable = true )
  private Integer exchangeDate;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "PurchaseOrder [" 
  + "PurchaseOrderId= " + purchaseOrderId  + ", " 
  + "ProductName= " + productName  + ", " 
  + "Discount= " + discount  + ", " 
  + "PurchaseOrderDate= " + purchaseOrderDate  + ", " 
  + "Invoice= " + invoice  + ", " 
  + "TaxGSTAmount= " + taxGSTAmount  + ", " 
  + "ExchangeDate= " + exchangeDate 
 + "]";
	}
	
}