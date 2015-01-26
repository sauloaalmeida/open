package org.openidmframework.core.model;

import java.util.Set;

/**
 * Created by saulo on 1/24/15.
 */
public class User  {

    private Long id;
    private String nome;

    public User(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
