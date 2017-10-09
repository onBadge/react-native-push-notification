package com.dieam.reactnativepushnotification.helpers;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.net.URL;

public class ImageDownloadTask extends AsyncTask<String, Void, Bitmap> {

    private static final String LOG_TAG = "RNImageDownloadTask";

    @Override
    protected Bitmap doInBackground(String... params) {
        Bitmap result = null;
        try {
            URL imageUrl = new URL(params[0]);
            result = BitmapFactory.decodeStream(imageUrl.openStream());
        } catch (IOException e) {
            Log.e(LOG_TAG, "Error while downloading notification image");
            e.printStackTrace();
        }

        return result;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
    }
}
