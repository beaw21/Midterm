package Entity;

import java.util.Date;
import java.util.Objects;

public class Acitivity {
    Integer id;
    String name;
    Date begin;
    Date end;

    public Acitivity(Integer id, String name, Date begin, Date end) {
        this.id = id;
        this.name = name;
        this.begin = begin;
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Acitivity)) return false;
        Acitivity acitivity = (Acitivity) o;
        return Objects.equals(id, acitivity.id) && Objects.equals(name, acitivity.name) && Objects.equals(begin, acitivity.begin) && Objects.equals(end, acitivity.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, begin, end);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
