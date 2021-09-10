package Service;

import Entity.calculateDiscount;

import java.util.List;

public interface calculateDiscountService {

    List<calculateDiscount> getDiscountPlatinum( );
    List<calculateDiscount> getDiscountWhite();
}
