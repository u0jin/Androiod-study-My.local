package com.example.yujin.phototest;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.VoiceInteractor;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity  extends AppCompatActivity  implements View.OnClickListener {


         int REQUEST_PICTURE = 1;


         int REQUEST_PHOTO_ALBUM = 2;

         String SAMPLEIMG = "ic_launche.png";


        ImageView iv;

        Dialog dialog;


        @Override

        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);


            iv = (ImageView) findViewById(R.id.imgView);


            findViewById(R.id.getCustom).setOnClickListener(this);

        }

        @Override

        public void onClick(View v) {


            if (v.getId() == R.id.getCustom) {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                View customLayout = View.inflate(this, R.layout.dialog, null);

                builder.setView(customLayout);

                customLayout.findViewById(R.id.camera).setOnClickListener(this);

                customLayout.findViewById(R.id.photoAlbum).setOnClickListener(this);


                dialog = builder.create();

                dialog.show();

            } else if (v.getId() == R.id.camera) {

                dialog.dismiss();

                takePicture();

            } else if (v.getId() == R.id.photoAlbum) {


                dialog.dismiss();

                photoAlbum();

            }

        }

        void takePicture() {


            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

            File file = new File(Environment.getExternalStorageDirectory(), SAMPLEIMG);

            intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));


            startActivityForResult(intent, REQUEST_PICTURE);

        }

        void photoAlbum() {


            Intent intent = new Intent(Intent.ACTION_PICK);


            intent.setType(MediaStore.Images.Media.CONTENT_TYPE);


            intent.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

            startActivityForResult(intent, REQUEST_PHOTO_ALBUM);

        }

        Bitmap loadPicture() {


            File file = new File(Environment.getExternalStorageDirectory(), SAMPLEIMG);


            BitmapFactory.Options options = new BitmapFactory.Options();


            options.inSampleSize = 4;


            return BitmapFactory.decodeFile(file.getAbsolutePath(), options);

        }

        protected void onActivityResult(int requestCode, int resultCode, Intent data) {

            super.onActivityResult(requestCode, resultCode, data);


            if (resultCode == RESULT_OK) {

                if (requestCode == REQUEST_PICTURE) {


                    iv.setImageBitmap(loadPicture());

                }

                if (requestCode == REQUEST_PHOTO_ALBUM) {


                    iv.setImageURI(data.getData());

                }

            }

        }

    }