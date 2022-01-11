package co.persistence.mapper;

import co.domain.service.PurchaseItem;
import co.persistence.entity.ComprasProducto;
import co.persistence.entity.ComprasProductoPK;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-10T19:38:53-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class PurchaseItemMapperImpl implements PurchaseItemMapper {

    @Override
    public PurchaseItem toPurchaseItem(ComprasProducto comprasProducto) {
        if ( comprasProducto == null ) {
            return null;
        }

        PurchaseItem purchaseItem = new PurchaseItem();

        Integer idProducto = comprasProductoIdIdProducto( comprasProducto );
        if ( idProducto != null ) {
            purchaseItem.setProductId( idProducto );
        }
        if ( comprasProducto.getCantidad() != null ) {
            purchaseItem.setQuantity( comprasProducto.getCantidad() );
        }
        if ( comprasProducto.getEstado() != null ) {
            purchaseItem.setActive( comprasProducto.getEstado() );
        }
        if ( comprasProducto.getTotal() != null ) {
            purchaseItem.setTotal( comprasProducto.getTotal() );
        }

        return purchaseItem;
    }

    @Override
    public ComprasProducto toComprasProducto(PurchaseItem item) {
        if ( item == null ) {
            return null;
        }

        ComprasProducto comprasProducto = new ComprasProducto();

        comprasProducto.setId( purchaseItemToComprasProductoPK( item ) );
        comprasProducto.setCantidad( item.getQuantity() );
        comprasProducto.setEstado( item.isActive() );
        comprasProducto.setTotal( item.getTotal() );

        return comprasProducto;
    }

    private Integer comprasProductoIdIdProducto(ComprasProducto comprasProducto) {
        if ( comprasProducto == null ) {
            return null;
        }
        ComprasProductoPK id = comprasProducto.getId();
        if ( id == null ) {
            return null;
        }
        Integer idProducto = id.getIdProducto();
        if ( idProducto == null ) {
            return null;
        }
        return idProducto;
    }

    protected ComprasProductoPK purchaseItemToComprasProductoPK(PurchaseItem purchaseItem) {
        if ( purchaseItem == null ) {
            return null;
        }

        ComprasProductoPK comprasProductoPK = new ComprasProductoPK();

        comprasProductoPK.setIdProducto( purchaseItem.getProductId() );

        return comprasProductoPK;
    }
}
