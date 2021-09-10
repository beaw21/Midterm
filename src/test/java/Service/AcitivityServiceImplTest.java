package Service;

import Dao.ActivityDao;
import Entity.Acitivity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import java.util.*;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.number.IsCloseTo.*;
import static org.mockito.Mockito.when;

class AcitivityServiceImplTest {

    ActivityDao activityDao = null;

    @BeforeEach
    public void init(){
        activityDao = mock(ActivityDao.class);
    }

    @Test
    void getActivityList() {
        AcitivityServiceImpl acitivityService = new AcitivityServiceImpl();
        acitivityService.setActivityDao(activityDao);
        when(activityDao.getActivities()).thenReturn(
          Arrays.asList(
                  new Acitivity(1,"som", 2020-1-2,2020-5-11)
          )
        );
        assertThat(acitivityService.getActivityList(2020-1-2,2020-5-11),theInstance(2020-1-2));

        verify(activityDao,times(1));
    }

}