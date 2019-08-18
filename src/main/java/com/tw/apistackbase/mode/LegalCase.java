package com.tw.apistackbase.mode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class LegalCase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Column(length = 255)
    private String name;
    @NotNull
    @Column
    private Long time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
