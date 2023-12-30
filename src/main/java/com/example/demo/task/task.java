package com.example.demo.task;

import jakarta.persistence.*;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.Date;

@Entity
@Table(name= "task")
public class task {
    String summery;
    String discraptions;
    Date start ;
    Date end;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int summeryid;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public task() {
    }

    public task(String summery, String discraptions, Date start, Date end, int summeryid) {
        this.summery = summery;
        this.discraptions = discraptions;
        this.start = start;
        this.end = end;
        this.summeryid = summeryid;
    }

    public void setSummery(String summery) {
        this.summery = summery;
    }

    public void setDiscraptions(String discraptions) {
        this.discraptions = discraptions;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setSummeryid(int summeryid) {
        this.summeryid = summeryid;
    }

    public String getSummery() {
        return summery;
    }

    public String getDiscraptions() {
        return discraptions;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public int getSummeryid() {
        return summeryid;
    }
}
