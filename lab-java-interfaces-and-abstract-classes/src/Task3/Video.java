package Task3;

public abstract class Video {
    private String title;
    private int duration;
    public String getInfo(){
//        System.out.println("Title: " + title + " duration: " + duration);
        return("Title: " + title + " duration: " + duration);
    }

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
