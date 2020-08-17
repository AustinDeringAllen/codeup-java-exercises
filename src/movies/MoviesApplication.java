package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    private static Movie[] movies = MoviesArray.findAll();
    private static String[] categories;

    public static void getCategories() {
        StringBuilder string = new StringBuilder();

        for(Movie movie : movies) {
            String category = movie.getCategory();
            if(!string.toString().contains(category)) {
                string.append(category);
                string.append(" ");
            }
        }

        categories = string.toString().split(" ");
        System.out.println(Arrays.toString(categories));
    }

    public static void main(String[] args) {
        getCategories();
        menu();
    }

    public static void menu() {
        Input input = new Input();

        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - add a new movie");
        System.out.println("2 - view all movies");
        for(int i=0; i<categories.length; i++) {
            System.out.printf("%s - view movies in the %s category\n",i+3,categories[i]);
        }

        System.out.print("\nEnter your choice: ");
        int userInput = input.getInt(0,categories.length+3);
        filterMovies(userInput);
    }

    public static void filterMovies(int option) {
        switch(option) {
            case 0:
                return;
            case 1:
                addMovie();
                break;
            case 2:
                displayMovies();
                break;
            default:
                displayMovies(categories[option-3]);
                break;
        }
        menu();
    }

    public static void displayMovies() {
        System.out.println();
        for(Movie movie : movies) {
            System.out.printf("%s -- %s \n",movie.getName(),movie.getCategory());
        }
        System.out.println();
    }

    public static void displayMovies(String type) {
        System.out.println();
        for(Movie movie : movies) {
            if(movie.getCategory().equals(type))
                System.out.printf("%s -- %s \n",movie.getName(),movie.getCategory());
        }
        System.out.println();
    }

    public static void addMovie() {
        Input input = new Input();
        Movie[] temp = new Movie[movies.length + 1];
        System.arraycopy(movies, 0, temp, 0, movies.length);

        System.out.print("Enter a movie name: ");
        String name = input.getString();
        System.out.print("Enter a movie category: ");
        String category = input.getString();


        temp[temp.length-1] = new Movie(name, category.toLowerCase());
        movies = temp;
        getCategories();
    }
}
