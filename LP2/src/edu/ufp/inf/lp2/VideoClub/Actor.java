package edu.ufp.inf.lp2.VideoClub;

import java.util.ArrayList;
import java.util.Vector;

public class Actor {
    public String id;

    public String name;

    /**
     * @element-type Movie
     */
    public Vector movies;

    public Movie addMovie(Movie m) {
        return null;
    }

    public Movie deleteMovie(String tittle) {
        return null;
    }

    public ArrayList<Movie> listMovies() {
        return null;
    }


    @Override
    public String toString() {
        return "Actor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }
}
