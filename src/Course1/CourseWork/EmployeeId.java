package Course1.CourseWork;

import java.util.Objects;

public class EmployeeId {
    private int id;

    public int EmployeeId(int id) {
        for (id = 1; id < 10; id++) {
        return id;}
        System.out.println(id);
        return id;
    }
//        return new EmployeeId[id];
//    }
    @Override
    public String toString() {
        return ", id = " + EmployeeId(id);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeId)) return false;
        EmployeeId that = (EmployeeId) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
