package pl.pisquared.musicplayer.viewmodel;

import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import pl.pisquared.musicplayer.R;
import pl.pisquared.musicplayer.Track;


public class MusicPlayerViewModel extends ViewModel
{
    private List<Track> tracks;
    private Application appContext;

    public MusicPlayerViewModel(Application appContext)
    {
        this.appContext = appContext;
    }

    public List<Track> getTracks()
    {
        if (tracks == null)
        {
            loadTracks();
        }
        return tracks;
    }

    private void loadTracks()
    {
//        ContentResolver cr = appContext.getContentResolver();
//        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
//        String selection = MediaStore.Audio.Media.IS_MUSIC + "!=0";
//        String sortOrder = MediaStore.Audio.Media.TITLE + " COLLATE NOCASE ASC";
//        String [] projection = {
//                MediaStore.Audio.Media._ID,
//                MediaStore.Audio.Media.TITLE,
//                MediaStore.Audio.Media.ARTIST,
//                MediaStore.Audio.Media.DURATION,
//                MediaStore.Audio.Media.DATA};

        //Cursor cursor = cr.query(uri, projection, selection, null, sortOrder);
        List<Track> trackList = null;
        trackList = new ArrayList<>();
        trackList.add(new Track(0, "Kalki BGM", "Tamil Music",81000 , "song_one" , R.raw.sone_one));
        trackList.add(new Track(1, "Master BGM", "Tamil Music",124000 , "song_two" , R.raw.song_two));
        trackList.add(new Track(2, "Surya BGM", "Tamil Music",115000 , "song_three" , R.raw.song_three));


//        if(cursor != null)
//        {
//            long id = 0;
//            String title = "";
//            String author = "";
//            long duration = 0;
//            String fileName = "";
//            trackList = new ArrayList<>(cursor.getCount() + 1);
//            while(cursor.moveToNext())
//            {
//                id = cursor.getInt(cursor.getColumnIndex(MediaStore.Audio.Media._ID));
//                title = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.TITLE));
//                author = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ARTIST));
//                duration = cursor.getInt(cursor.getColumnIndex(MediaStore.Audio.Media.DURATION));
//                fileName = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.DATA));
//                Log.d("qq--","duration "+ duration + "ID: "+ id );
//
//
//
//                trackList.add(new Track(id, title, author, duration, fileName));
//            }
//            cursor.close();
//        }
        tracks = trackList;
    }
}
