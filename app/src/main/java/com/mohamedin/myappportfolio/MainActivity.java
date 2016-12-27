package com.mohamedin.myappportfolio;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.moviesAppBtn) Button moviesAppBtn;
    @BindView(R.id.stockAppBtn) Button stockAppBtn;
    @BindView(R.id.buildItAppBtn) Button buildItAppBtn;
    @BindView(R.id.materialAppBtn) Button materialAppBtn;
    @BindView(R.id.ubiqAppBtn) Button ubiqAppBtn;
    @BindView(R.id.capstoneAppBtn) Button capstoneAppBtn;

    @BindString(R.string.capstoneAppMsg) String capStoneMsg;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        capstoneAppBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast(capStoneMsg);
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void showToast(String msg) {
        Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
        toast.show();
    }

    @OnClick(R.id.moviesAppBtn)
    public void moviesAppBtnClick(View view) {
        showToast(getResources().getString(R.string.popMoviesAppMsg));
    }
    @OnClick(R.id.stockAppBtn)
    public void stockAppBtnClick(View view) {
        showToast(getResources().getString(R.string.stockAppMsg));
    }
    @OnClick(R.id.buildItAppBtn)
    public void buildItAppBtnClick(View view) {
        showToast(getResources().getString(R.string.buildItBiggerAppMsg));
    }
    @OnClick(R.id.materialAppBtn)
    public void materialAppBtnClick(View view) {
        showToast(getResources().getString(R.string.materialAppMsg));
    }
    @OnClick(R.id.ubiqAppBtn)
    public void ubiqAppBtnClick(View view) {
        showToast(getResources().getString(R.string.ubiqAppMsg));
    }
/*    @OnClick(R.id.capstoneAppBtn)
    public void capstoneAppBtnClick(View view) {

    }
  */
    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.mohamedin.myappportfolio/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.mohamedin.myappportfolio/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
