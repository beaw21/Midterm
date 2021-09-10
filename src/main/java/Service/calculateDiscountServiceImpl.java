package Service;

import Dao.CalculateDiscountDao;
import Entity.calculateDiscount;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class calculateDiscountServiceImpl implements calculateDiscountService{

    CalculateDiscountDao calculateDiscountDao;

    public CalculateDiscountDao getCalculateDiscountDao() {
        return calculateDiscountDao;
    }

    public void setCalculateDiscountDao(CalculateDiscountDao calculateDiscountDao) {
        this.calculateDiscountDao = calculateDiscountDao;
    }


    @Override
    public List<calculateDiscount> getDiscountPlatinum()  {
        return calculateDiscountDao.getDiscountPlatinum();
    }


    @Override
    public List<calculateDiscount> getDiscountWhite() {
        List<calculateDiscount> output = calculateDiscountDao.getDiscountWhite();
        return output;
    }
}
