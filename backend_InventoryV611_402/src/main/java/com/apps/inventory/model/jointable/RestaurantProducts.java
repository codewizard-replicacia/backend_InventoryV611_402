package com.apps.inventory.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.inventory.model.Document;
import com.apps.inventory.model.Product;
import com.apps.inventory.model.Vendor;
import com.apps.inventory.model.OrderAlert;
import com.apps.inventory.model.Inventory;
import com.apps.inventory.model.PurchaseOrder;
import com.apps.inventory.model.Restaurant;
import com.apps.inventory.enums.ProductType;
import com.apps.inventory.converter.ProductTypeConverter;

@Entity(name = "RestaurantProducts")
@Table(schema = "\"InventoryV611\"", name = "\"RestaurantProducts\"")
@Data
public class RestaurantProducts{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"RestuarantID\"")
	private Integer restuarantID;

    
    @Column(name = "\"ProductId\"")
    private Integer productId;
 
}