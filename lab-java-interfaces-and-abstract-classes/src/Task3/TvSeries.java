package Task3;

public class TvSeries extends Video{
    public TvSeries(String title, int duration, int episode) {
        super(title, duration);
        System.out.println(super.getInfo() + " Episode: " + episode);
    }
}
