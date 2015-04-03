package testcs2110.android.icingproductions.com.newdemoapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    Hello h;
    float f;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) this.findViewById(R.id.img);

        h = new Hello(23);
    }


    public void buttonClicked(View v){
        image.setX(image.getX());
        f = image.getY() - 10;
        Log.d("tagHere", "new position:" + f );
        image.setY(f);

    }



}
