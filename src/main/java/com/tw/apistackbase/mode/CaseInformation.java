package com.tw.apistackbase.mode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class CaseInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Column(length = 255)
    private String subjectSituation;
    @NotNull
    @Column(length = 255)
    private String objectSituation;

    public CaseInformation(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectSituation() {
        return subjectSituation;
    }

    public void setSubjectSituation(String subjectSituation) {
        this.subjectSituation = subjectSituation;
    }

    public String getObjectSituation() {
        return objectSituation;
    }

    public void setObjectSituation(String objectSituation) {
        this.objectSituation = objectSituation;
    }
}
