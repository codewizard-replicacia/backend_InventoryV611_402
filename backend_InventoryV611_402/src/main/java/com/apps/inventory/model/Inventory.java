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

@Entity(name = "Inventory")
@Table(name = "\"Inventory\"", schema =  "\"InventoryV611\"")
@Data
                        
public class Inventory {
	public Inventory () {   
  }
	  
  @Id
  @Column(name = "\"InventoryId\"", nullable = true )
  private String inventoryId;
	  
  @Column(name = "\"ExpirtyDate\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date expirtyDate;  
  
	  
  @Column(name = "\"PurchasedDate\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date purchasedDate;  
  
	  
  @Column(name = "\"VendorName\"", nullable = true )
  private String vendorName;
  
	  
  @Column(name = "\"CurrentStockUnits\"", nullable = true )
  private Integer currentStockUnits;
  
	  
  @Column(name = "\"InStockUnits\"", nullable = true )
  private String inStockUnits;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"InventoryStockalert\"",
            joinColumns = @JoinColumn( name="\"InventoryId\""),
            inverseJoinColumns = @JoinColumn( name="\"OrderAlertId\""), schema = "\"InventoryV611\"")
private List<OrderAlert> stockalert = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Inventory [" 
  + "InventoryId= " + inventoryId  + ", " 
  + "ExpirtyDate= " + expirtyDate  + ", " 
  + "PurchasedDate= " + purchasedDate  + ", " 
  + "VendorName= " + vendorName  + ", " 
  + "CurrentStockUnits= " + currentStockUnits  + ", " 
  + "InStockUnits= " + inStockUnits 
 + "]";
	}
	
}