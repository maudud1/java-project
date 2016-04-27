package day8_mod7_full;

import java.util.Date;

public class IntfTest {

    public static void main(String[] args) {
        Audit hh1 = new PromApp();
        Ranger hh4 = new Period();
        
        
        
        Audit hh2 = new LeaveApp();
        Ranger hh3 = new LeaveApp();

        String ins = hh1.getInsertBy();

    }
}

interface Audit {

    public String getInsertBy();

    public String getUpdateBy();
}

interface Ranger {

    public Date getStart();

    public Date getEnd();
}

class Period implements Ranger {

    Date start;
    Date end;

    @Override
    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;

    }
}

class LeaveApp implements Audit, Ranger {

    String insertBy;
    String updateBy;
    Emp emp;
    Date start;
    Date end;

    public String getInsertBy() {
        return insertBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    @Override
    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;

    }
}

class PromApp implements Audit {

    String insertBy;
    String updateBy;
    Emp emp;
    int incr;

    public String getInsertBy() {
        return insertBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }
}
