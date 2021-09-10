package Service;

import Dao.ActivityDao;
import Entity.Acitivity;

import java.util.Date;
import java.util.List;

public class AcitivityServiceImpl implements ActivityService{


   ActivityDao activityDao;

    public AcitivityServiceImpl() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setActivityDao(ActivityDao activityDao){
        this.activityDao = activityDao ;
    }
    public List<Acitivity> getActivityList(int begin, int end) {
        return null;
    }
    
    public Object isInDate(Date begin, Date end){
      return activityDao.getActivities();
    }

    @Override
    public List<Acitivity> getActivityList(Date begin, Date end) {
        return activityDao.getActivities();

    }
}
