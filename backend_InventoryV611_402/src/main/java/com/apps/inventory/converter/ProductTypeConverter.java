package com.apps.inventory.converter;

import com.apps.inventory.enums.ProductType;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class ProductTypeConverter implements AttributeConverter<ProductType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ProductType productType) {
        return productType != null ? productType.ordinal() : null;
    }

    @Override
    public ProductType convertToEntityAttribute(Integer dbData) {
		return ProductType.getProductType(dbData);
    }
}
