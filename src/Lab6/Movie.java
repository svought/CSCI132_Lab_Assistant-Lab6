package Lab6;

public class Movie {

    // Fields
    private String title;
    private Integer year;

    // Constructor Methods
    public Movie() {
        this.title = "unknown";
        this.year = -1;
    }
    public Movie(String given_title) {
        this.title = given_title;
        this.year = -1;
    }
    public Movie(Integer given_year) {
        this.title = "unknown";
        this.year = given_year;
    }
    public Movie(String given_title, Integer given_year) {
        this.title = given_title;
        this.year = given_year;
    }


    public String getTitle() {
        return this.title;
    }

    public Integer getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return this.title + " (" + this.year + ")";
    }
}
