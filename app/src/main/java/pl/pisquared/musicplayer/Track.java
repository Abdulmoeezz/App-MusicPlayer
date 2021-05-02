package pl.pisquared.musicplayer;

public class Track
{
    private final long id;
    private final String title;
    private final String author;
    private final long duration;
    private final String fileName;
    private int   songRawFile = 0;

    public int getSongRawFile() {
        return songRawFile;
    }

    public void setSongRawFile(int songRawFile) {
        this.songRawFile = songRawFile;
    }

    public Track(long id, String title, String author, long duration, String fileName, int songRawFile) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.fileName = fileName;
        this.songRawFile = songRawFile;
    }

    public Track(long id, String title, String author, long duration, String fileName )
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.fileName = fileName;
    }

    public long getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public long getDuration()
    {
        return duration;
    }

    public String getFileName()
    {
        return fileName;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Track)
        {
            return this.id == ((Track) obj).id;
        }
        else
            return false;
    }
}
