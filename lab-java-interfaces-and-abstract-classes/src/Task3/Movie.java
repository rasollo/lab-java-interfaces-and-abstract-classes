package Task3;

public class Movie extends Video{
    public Movie(String title, int duration, double rating) {
        super(title, duration);
        System.out.println(super.getInfo() + " Rating: " + rating);
    }
}
