package Task3;

public class Main {
    public static void main(String[] args) {
        TvSeries tvseries = new TvSeries("Ragnar",120,20);
        tvseries.getInfo();
        Movie movie = new Movie("Mr. Bean", 120, 5);
        movie.getInfo();
    }
}