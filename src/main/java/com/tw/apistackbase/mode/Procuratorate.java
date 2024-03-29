package com.tw.apistackbase.mode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Procuratorate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true ,length = 50)
    @NotNull
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Procurator> procurator;

    public List<Procurator> getProcurator() {
        return procurator;
    }

    public void setProcurator(List<Procurator> procurator) {
        this.procurator = procurator;
    }

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
}
