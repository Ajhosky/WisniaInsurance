package com.company.events;

import com.company.Offer.Policy;

public class Damage {
    private DamageType damgaeType;
    private int id;
    private Policy policy;
    private String documents;
    private String victim; // String najprawdopodobniej zamienic na customers

    public DamageType getDamgaeType() {
        return damgaeType;
    }

    public void setDamgaeType(DamageType damgaeType) {
        this.damgaeType = damgaeType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public String getVictim() {
        return victim;
    }

    public void setVictim(String victim) {
        this.victim = victim;
    }
}
