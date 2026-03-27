package com.example.listyprojekt2;

public class RzeczDoZrobienia {
    private String CoZrobie;
    private boolean CzyZrobione;
    private int waga;

    public RzeczDoZrobienia(String coZrobie, int waga) {
        CoZrobie = coZrobie;
        this.waga = waga;
        CzyZrobione = false;
    }
}
