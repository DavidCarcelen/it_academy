package n2ejercicio1;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //equals hashcode y comparable para seghundo
    @Override
    public int hashCode(){

        return Objects.hash(name, score);
    }
    @Override
    public boolean equals(Object obj){

        Restaurant restaurant = (Restaurant) obj;
        return Objects.equals(name,restaurant.name) && score == restaurant.score;
    }
}
