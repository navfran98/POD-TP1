package ar.edu.itba.pod.api.entities;

public class Seat {
    // Variables
    private int row;
    private char column;
    private SeatCategory category;
    private String passengerName;
    // Contructor
    public Seat(int row, char column, SeatCategory category) {
        this.row = row;
        this.column = column;
        this.category = category;
        this.passengerName = "";
    }
    // Getters & Setters
    public int getRow() { return row; }
    public void setRow(int row) { this.row = row; }
    public char getColumn() { return column; }
    public void setColumn(char column) { this.column = column; }
    public SeatCategory getCategory() { return category; }
    public void setCategory(SeatCategory category) { this.category = category; }
    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }
}
