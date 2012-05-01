package com.mmm.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author galimru
 */
@Entity
@Table(name = "operations")
public class Operation {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    @Temporal(value = TemporalType.DATE)
    private Date date;

    @Column(name = "comment")
    private String comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
