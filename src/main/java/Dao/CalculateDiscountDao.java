package Dao;

import Entity.calculateDiscount;

import java.util.List;

public interface CalculateDiscountDao {
    List<calculateDiscount> getDiscountPlatinum();
    List<calculateDiscount> getDiscountWhite ();

}
