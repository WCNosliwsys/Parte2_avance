package com.a952000243.ingwilson.nosliwsys.parte2_avance;

import android.app.Activity;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Multimedia2 extends Activity {
    private VideoView mVideoView;
    @Override public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia2);
        mVideoView =(VideoView)findViewById(R.id.surface_view);
        MediaController mc=new MediaController(this);
        mVideoView.setVideoURI(Uri.parse("http://techslides.com/demos/sample-videos/small.mp4"));
// mVideoView.setVideoPath("/mnt/sdcard/video.mp4");
        mVideoView.setMediaController(mc);
        mVideoView.requestFocus();
        mVideoView.start();
    }
}
