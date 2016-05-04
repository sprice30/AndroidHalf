package com.example.samprice.applytojob;

import android.Manifest;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Resume extends AppCompatActivity {
    private static int RESULT_LOAD_IMAGE = 1;
    ArrayList<Uri> image = new ArrayList<Uri>();
    ArrayList<String> tit = new ArrayList<String>();
    int current = 0;
    public Uri uri;
    public EditText edit_text;
    public String titlehold = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);
    }
    public void onClickResumePost(View v) {setContentView(R.layout.resume_post);}



    public void onClickResumePic(View v) {setContentView(R.layout.view_stored_resume);}



    public void onClickMain(View v){setContentView(R.layout.activity_resume);}

    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    public static void verifyStoragePermissions(Activity activity) {
        // Check if we have write permission
        int permission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (permission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            // For API 23+ you need to request the read/write permissions even if they are already in your manifest.
            // See: http://developer.android.com/training/permissions/requesting.html
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE
            );
        }
    }

    public void onClickPickBack(View v) {
        setContentView(R.layout.resume_view);
        int a = tit.size();
        if (a == 0) {
        } else if (a == 1) {
            final TextView m = (TextView) findViewById(R.id.r1);
            m.setText(tit.get(0));
        } else if (a == 2) {
            final TextView m = (TextView) findViewById(R.id.r1);
            m.setText(tit.get(0));

            final TextView m2 = (TextView) findViewById(R.id.r2);
            m2.setText(tit.get(1));
        } else if (a == 3) {
            final TextView m = (TextView) findViewById(R.id.r1);
            m.setText(tit.get(0));

            final TextView m2 = (TextView) findViewById(R.id.r2);
            m2.setText(tit.get(1));

            final TextView m3 = (TextView) findViewById(R.id.r3);
            m3.setText(tit.get(2));

        } else if (a == 4) {
            final TextView m = (TextView) findViewById(R.id.r1);
            m.setText(tit.get(0));

            final TextView m2 = (TextView) findViewById(R.id.r2);
            m2.setText(tit.get(1));

            final TextView m3 = (TextView) findViewById(R.id.r3);
            m3.setText(tit.get(2));

            final TextView m4 = (TextView) findViewById(R.id.r4);
            m4.setText(tit.get(3));
        }

    }
   public void onClickTrash1(View v){
    int temp = tit.size();
       if(temp > 0) {
           tit.remove(0);
           image.get(0);
           current--;
           onClickPickBack(v);
       }
    }
    public void onClickTrash2(View v){
        int temp = tit.size();
        if(temp > 1) {
            tit.remove(1);
            image.get(1);
            current--;
            onClickPickBack(v);
        }
    }
    public void onClickTrash3(View v) {
        int temp = tit.size();
        if (temp > 2) {
            tit.remove(2);
            image.get(2);
            current--;
            onClickPickBack(v);
        }
    }
        public void onClickTrash4(View v){
            int temp = tit.size();
            if(temp > 3) {
                tit.remove(3);
                image.get(3);
                current--;
                onClickPickBack(v);
            }


        }


    public void onClickView1(View v){
        setContentView(R.layout.view_pic);
        int temp = tit.size();
        if(temp > 0) {
            final TextView m = (TextView) findViewById(R.id.pic_title);
            m.setText(tit.get(0));
            uri = image.get(0);

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri);
                ImageView imageView = (ImageView) findViewById(R.id.final_pic);

                // destroy the drawing cache to ensure that when a new image is loaded, its cached
                imageView.destroyDrawingCache();
                imageView.setImageBitmap(bitmap);
                imageView.setDrawingCacheEnabled(true);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public void onClickView2(View v){
        int temp = tit.size();
        if(temp > 1) {
            setContentView(R.layout.view_pic);
            final TextView m = (TextView) findViewById(R.id.pic_title);
            m.setText(tit.get(1));
            uri = image.get(1);

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri);
                ImageView imageView = (ImageView) findViewById(R.id.final_pic);

                // destroy the drawing cache to ensure that when a new image is loaded, its cached
                imageView.destroyDrawingCache();
                imageView.setImageBitmap(bitmap);
                imageView.setDrawingCacheEnabled(true);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void onClickView3(View v){
        int temp = tit.size();
        if(temp > 2) {
            setContentView(R.layout.view_pic);
            final TextView m = (TextView) findViewById(R.id.pic_title);
            m.setText(tit.get(2));
            uri = image.get(2);

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri);
                ImageView imageView = (ImageView) findViewById(R.id.final_pic);

                // destroy the drawing cache to ensure that when a new image is loaded, its cached
                imageView.destroyDrawingCache();
                imageView.setImageBitmap(bitmap);
                imageView.setDrawingCacheEnabled(true);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public void onClickView4(View v){
        int temp = tit.size();
        if(temp > 3) {
            setContentView(R.layout.view_pic);
            final TextView m = (TextView) findViewById(R.id.pic_title);
            m.setText(tit.get(3));
            uri = image.get(3);

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri);
                ImageView imageView = (ImageView) findViewById(R.id.final_pic);

                // destroy the drawing cache to ensure that when a new image is loaded, its cached
                imageView.destroyDrawingCache();
                imageView.setImageBitmap(bitmap);
                imageView.setDrawingCacheEnabled(true);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void onButtonClickAdd(View v){
        edit_text = (EditText)findViewById(R.id.res_title);
        titlehold = edit_text.getText().toString();
        setContentView(R.layout.resume_view);
        tit.add(titlehold);
        image.add(uri);
        if(current == 0) {
            final TextView m = (TextView) findViewById(R.id.r1);
            m.setText(tit.get(current));
        }
       else if(current == 1) {
            final TextView m = (TextView) findViewById(R.id.r1);
            m.setText(tit.get(current-1));
            final TextView m2 = (TextView) findViewById(R.id.r2);
            m2.setText(tit.get(current));
        }
        else if(current == 2) {
            final TextView m = (TextView) findViewById(R.id.r1);
            m.setText(tit.get(current-2));
            final TextView m2 = (TextView) findViewById(R.id.r2);
            m2.setText(tit.get(current-1));
            final TextView m3 = (TextView) findViewById(R.id.r3);
            m3.setText(tit.get(current));
        }
        else if(current == 3) {
            final TextView m = (TextView) findViewById(R.id.r1);
            m.setText(tit.get(current-3));
            final TextView m2 = (TextView) findViewById(R.id.r2);
            m2.setText(tit.get(current-2));
            final TextView m3 = (TextView) findViewById(R.id.r3);
            m3.setText(tit.get(current-1));
            final TextView m4 = (TextView) findViewById(R.id.r4);
            m4.setText(tit.get(current));
        }
        if(current < 3) {
            current++;
        }
        else {
            current = 3;
        }
    }

    public void onButtonClickLoadImage(View v){
        onClickResumePic(v);
        // Without this call, the app was crashing in the onActivityResult method when trying to read from file system
        verifyStoragePermissions(this);

        Intent i = new Intent(
                Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

        startActivityForResult(i, RESULT_LOAD_IMAGE);
    }
    public static final int CAMERA_REQUEST = 1888;
    public void onButtonClickTakeImage(View v){
        onClickResumePic(v);
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, CAMERA_REQUEST);
    }

    public Uri getImageUri(Context inContext, Bitmap inImage) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, "Title", null);
        return Uri.parse(path);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
             uri = data.getData();

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri);
                ImageView imageView = (ImageView) findViewById(R.id.resume);

                // destroy the drawing cache to ensure that when a new image is loaded, its cached
                imageView.destroyDrawingCache();
                imageView.setImageBitmap(bitmap);
                imageView.setDrawingCacheEnabled(true);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        else if(requestCode == CAMERA_REQUEST && resultCode == RESULT_OK &&  data != null){
            ImageView imageView = (ImageView) findViewById(R.id.resume);
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            uri = getImageUri(getApplicationContext(),photo);
            imageView.setImageBitmap(photo);



            // Setting image image icon on the imageview
        }
    }

    public void onClickJobSeeker1(View v){
        Intent myIntent = new Intent(Resume.this, MainActivity.class);
        startActivity(myIntent);

    }


}
