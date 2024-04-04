package n2ejercicio2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{
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


    @Override
    public int compareTo(Restaurant r) {
        int result;
        int nameCompare = this.getName().compareTo(r.getName());

        if (nameCompare != 0) {
            result = nameCompare;
        } else {
            result = Integer.compare(this.getScore(), r.getScore());
        }
        return result;
    }
}
