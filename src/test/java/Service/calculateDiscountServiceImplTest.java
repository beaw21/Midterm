package Service;

import Dao.CalculateDiscountDao;
import Entity.calculateDiscount;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.number.IsCloseTo.*;
import static org.mockito.Mockito.when;


import static org.junit.jupiter.api.Assertions.*;

class calculateDiscountServiceImplTest {

    CalculateDiscountDao calculateDiscountDao = null;

    @BeforeEach
    public void init(){
        calculateDiscountDao = mock(CalculateDiscountDao.class);
    }

    @Test
    void getDiscountPlatinum() {
        calculateDiscountServiceImpl calculateDiscountService = new calculateDiscountServiceImpl();
        calculateDiscountService.setCalculateDiscountDao(calculateDiscountDao);
        when(calculateDiscountDao.getDiscountPlatinum()).thenReturn(
                Arrays.asList(
                        new calculateDiscount(1,15200.00)));
        assertThat(calculateDiscountService.getDiscountPlatinum(),is(closeTo(13680.00,0.001)));

        when(calculateDiscountDao.getDiscountPlatinum()).thenReturn(
                Arrays.asList(
                        new calculateDiscount(1,25000.00)));
        assertThat(calculateDiscountService.getDiscountPlatinum(),is(closeTo(21250.00,0.001)));

        when(calculateDiscountDao.getDiscountPlatinum()).thenReturn(
                Arrays.asList(
                        new calculateDiscount(1,60000.00)));
        assertThat(calculateDiscountService.getDiscountPlatinum(),is(closeTo(48000.00,0.001)));
    }

    private void assertThat(List<calculateDiscount> discountPlatinum, Matcher<Double> doubleMatcher) {
    }


    @Test
    void getDiscountWhite() {
        calculateDiscountServiceImpl calculateDiscountService = new calculateDiscountServiceImpl();
        calculateDiscountService.setCalculateDiscountDao(calculateDiscountDao);
        when(calculateDiscountDao.getDiscountWhite()).thenReturn(
                Arrays.asList(
                        new calculateDiscount(2,15200.00)));
        assertThat(calculateDiscountService.getDiscountPlatinum(),is(closeTo(14744.00,0.001)));

        when(calculateDiscountDao.getDiscountWhite()).thenReturn(
                Arrays.asList(
                        new calculateDiscount(2,25000.00)));
        assertThat(calculateDiscountService.getDiscountPlatinum(),is(closeTo(23750.00,0.001)));

        when(calculateDiscountDao.getDiscountWhite()).thenReturn(
                Arrays.asList(
                        new calculateDiscount(2,60000.00)));
        assertThat(calculateDiscountService.getDiscountPlatinum(),is(closeTo(54000.00,0.001)));
    }
}