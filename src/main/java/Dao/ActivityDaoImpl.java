package Dao;

import Entity.Acitivity;

import java.util.List;

public class ActivityDaoImpl implements ActivityDao{

    ActivityDao activityDao;
    @Override
    public List<Acitivity> getActivities() {
        return activityDao.getActivities();
    }
}
