package movies;

import util.Input;

public class MoviesApplication {
    private static Movie[] movies;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Input input = new Input();

        System.out.println("What would you like to do? \n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the musical category");
        System.out.println("6 - view movies in the comedy category");

        System.out.print("\nEnter your choice: ");
        int userInput = input.getInt(0,6);
        filterMovies(userInput);
    }

    public static void filterMovies(int option) {
        switch(option) {
            case 0:
                return;
            case 1:
                displayMovies();
                break;
            case 2:
                displayMovies("animated");
                break;
            case 3:
                displayMovies("drama");
                break;
            case 4:
                displayMovies("horror");
                break;
            case 5:
                displayMovies("musical");
                break;
            case 6:
                displayMovies("comedy");
                break;
        }
    }

    public static void displayMovies() {
        Movie[] movies = MoviesArray.findAll();

        System.out.println();
        for(Movie movie : movies) {
            System.out.printf("%s -- %s \n",movie.getName(),movie.getCategory());
        }
        System.out.println();
        menu();
    }

    public static void displayMovies(String type) {
        Movie[] movies = MoviesArray.findAll();

        System.out.println();
        for(Movie movie : movies) {
            if(movie.getCategory().equals(type))
                System.out.printf("%s -- %s \n",movie.getName(),movie.getCategory());
        }
        System.out.println();
        menu();
    }
}
