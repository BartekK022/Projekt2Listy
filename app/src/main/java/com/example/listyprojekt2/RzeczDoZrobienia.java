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

    public void odwrocRobienie() {
        CzyZrobione = !CzyZrobione;
    }

    @Override
    public String toString() {
        return "RzeczDoZrobienia{" +
                "CoZrobie='" + CoZrobie + '\'' +
                ", CzyZrobione=" + CzyZrobione +
                ", waga=" + waga +
                '}';
    }
}
