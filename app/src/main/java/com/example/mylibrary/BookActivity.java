package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {

    private TextView bookName;
    private TextView authorName;
    private TextView description;

    private ImageView bookImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initWidgets();

        Intent intent = getIntent();

        int id = intent.getIntExtra("bookId", 0);
        Util util = new Util();
        ArrayList<Book> books = Util.getAllBooks();

        for( Book b: books) {
            if(b.getId() == id){
                bookName.setText(b.getName());
                authorName.setText(b.getAuthor());
                description.setText(b.getDescription());
                Glide.with(this)
                        .asBitmap()
                        .load(b.getImageUrl())
                        .into(bookImage);
            }
        }
    }

    private void initWidgets() {
        bookName = (TextView) findViewById(R.id.bookName);
        authorName = (TextView) findViewById(R.id.authorName);
        description = (TextView) findViewById(R.id.bookDesc);

        bookImage = (ImageView) findViewById(R.id.bookImage);
    }
}