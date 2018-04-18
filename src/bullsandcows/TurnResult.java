package bullsandcows;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TurnResult {
    private StringProperty guess = new SimpleStringProperty();
    private IntegerProperty turnNr = new SimpleIntegerProperty();
    private IntegerProperty bulls = new SimpleIntegerProperty();
    private IntegerProperty cows = new SimpleIntegerProperty();

    public String getGuess() {
        return guess.get();
    }

    public StringProperty guessProperty() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess.set(guess);
    }

    public int getTurnNr() {
        return turnNr.get();
    }

    public IntegerProperty turnNrProperty() {
        return turnNr;
    }

    public void setTurnNr(int turnNr) {
        this.turnNr.set(turnNr);
    }

    public int getBulls() {
        return bulls.get();
    }

    public IntegerProperty bullsProperty() {
        return bulls;
    }

    public void setBulls(int bulls) {
        this.bulls.set(bulls);
    }

    public int getCows() {
        return cows.get();
    }

    public IntegerProperty cowsProperty() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows.set(cows);
    }
}
