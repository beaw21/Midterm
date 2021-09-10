package Service;

import Entity.Acitivity;

import java.util.Date;
import java.util.List;

public interface ActivityService {
    List<Acitivity> getActivityList(Date begin, Date end);
}
