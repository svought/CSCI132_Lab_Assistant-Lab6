package Lab6;

import java.util.Arrays;

/*
 * Part 1:
 * Make a Movie class with...
 * fields: String title, and Integer year
 * methods: getTitle() returns a String, getYear() returns an int, toString returns a string.
 * constructor: to set both title and year
 *
 * Part 2:
 * Change the provided IntegerSwapper to a class called GenericSwapper that can swap elements from
 * any sort of array of objects, regardless of type. Test with Integers, Strings, and Movies.
 * Add exception handling so that the GenericSwapper catches ArrayIndexOutOfBoundsExceptions.
 *
 * Part 3:
 * Demonstrate GenericSwapper on Integer arrays (already in the code), String arrays, and Movie
 * arrays. Also demonstrate the exception handling.
 */


// TODO make this generic... Rename this file GenericSwapper, then complete the following...
public class GenericSwapper {

    // swaps integers a and b in the data array
    // TODO make it swap object a and b in the data array
    public static <T> void swap(T[] data, int a, int b) {
        // TODO use exception handling in case a or b is out of bounds
        // in that case, print a nice error message
        try {
            T temp = data[a];
            data[a] = data[b];
            data[b] = temp;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Bounds Error: " + e.getMessage());
        }



    }

    public static void main(String[] args) {

        System.out.println("Trying swap on an array of Integers:");

        Integer[] myIntegers = new Integer[10];
        for (int i = 0; i < myIntegers.length; i++) {
            myIntegers[i] = (i + 1) * 5;
        }
        System.out.println(Arrays.toString(myIntegers));

        // TODO uncomment when GenericSwapper is working
		GenericSwapper.swap(myIntegers, 0, 9);
		System.out.println(Arrays.toString(myIntegers));


        // TODO make the swap() method generic as described above, then:

        System.out.println("\nTrying swap on an array of Strings:");
        // TODO test with an array of Strings...
        String[] myStrings = {"Truck", "Car", "Bus", "Train", "Plane", "Bike"};

        System.out.println(Arrays.toString(myStrings));

        // Swap myStrings and print out
        GenericSwapper.swap(myStrings, 0, 3);
        System.out.println(Arrays.toString(myStrings));

        // TODO test with an array of Movies...
        System.out.println("\nTrying swap on an array of Movies:");
        Movie blank_movie = new Movie();
        Movie unknown_title = new Movie(1989);
        Movie unknown_year = new Movie("Piedood Eats");
        Movie first_movie = new Movie("The Fellowship of the Ring", 2001);
        Movie second_movie = new Movie("Harry Potter and the Sorcerer's Stone", 2001);

        Movie[] myMovies = {blank_movie, unknown_title, unknown_year, first_movie, second_movie};
        System.out.println(Arrays.toString(myMovies));

        // Swap myMovies elements 1 and 2
        GenericSwapper.swap(myMovies, 1, 2);
        System.out.println(Arrays.toString(myMovies));

        // TODO write a test on an array of any type that generates an array out of bounds exception
        System.out.println("\nTrying swap with an out of bounds array index");

        String mySentence[] = {"Pie!", "I ", "Like "};
        // Swap mySentence elements 0 and 8 (8 is out of bounds)
        GenericSwapper.swap(mySentence, 0, 8);
        System.out.println(Arrays.toString(mySentence));





    }

}
