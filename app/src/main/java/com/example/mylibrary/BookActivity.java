package com.example.mylibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {
    private static final String TAG = "BookActivity";
    
    private TextView bookName;
    private TextView authorName;
    private TextView description;
    private TextView pageNumber;

    private ImageView bookImage;

    private Button btnCurReading;
    private Button btnWantToRead;
    private Button btnAlreadyRead;

    private Book incomingBook;

    private Util util;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        overridePendingTransition(R.anim.in, R.anim.out);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initWidgets();

        Intent intent = getIntent();

        int id = intent.getIntExtra("bookId", 0);
        util = new Util();
        ArrayList<Book> books = util.getAllBooks();

        for( Book b: books) {
            if(b.getId() == id){
                incomingBook = b;
                bookName.setText(b.getName());
                authorName.setText(b.getAuthor());
                description.setText(b.getDescription());
                pageNumber.setText("Pages " + b.getPages());
                Glide.with(this)
                        .asBitmap()
                        .load(b.getImageUrl())
                        .into(bookImage);
            }
        }

        btnCurReading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnCurReadingTapped();
            }
        });

        btnAlreadyRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnAlreadyReadTapped();
            }
        });

        btnWantToRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnWantToReadTapped();
            }
        });
    }
    
    private void btnWantToReadTapped () {
        Log.d(TAG, "btnWantToReadTapped: started");


//        boolean doesExist = false;

        ArrayList<Book> wantToReadBooks = util.getWantToReadBooks();

//        for (Book book : wantToReadBooks) {
//            if(book.getId() == incomingBook.getId()) {
//                doesExist = true;
//            }
//        }

//        if(doesExist) {
        if(wantToReadBooks.contains(incomingBook)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setMessage("You already added this book to your Want To Read list");

            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });

            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });

            builder.setCancelable(false);

            builder.create().show();
        } else {
            ArrayList<Book> alreadyReadBooks = util.getAlreadyReadBooks();

            if(alreadyReadBooks.contains(incomingBook)){
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("You already read this book");
                builder.setTitle("Error");

                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.setCancelable(false);

                builder.create().show();
            } else {
                ArrayList<Book> currentlyReadingBooks = util.getCurrentlyReadingBooks();

                if(currentlyReadingBooks.contains(incomingBook)){
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage("You are already reading this book");
                    builder.setTitle("Error");

                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });

                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });

                    builder.setCancelable(false);

                    builder.create().show();
                } else {
                    util.addWantToReadBook(incomingBook);
                    Toast.makeText(this, "This Book " + incomingBook.getName()
                            + "Added to your Want To Read Shelf", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private void btnAlreadyReadTapped () {
        Log.d(TAG, "btnAlreadyReadTapped: started");

        ArrayList<Book> alreadyReadBooks = util.getAlreadyReadBooks();


        if(alreadyReadBooks.contains(incomingBook)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setMessage("You already added this book to your Already Read list");

            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });

            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });

            builder.setCancelable(false);

            builder.create().show();
        } else {
            ArrayList<Book> currentlyReadingBooks = util.getCurrentlyReadingBooks();

            if(currentlyReadingBooks.contains(incomingBook)){
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Have you finished reading this book?");
                builder.setTitle("Error");

                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        util.removeCurrentlyReadingBook(incomingBook);
                        util.addAlreadyReadBooks(incomingBook);

                        Toast.makeText(BookActivity.this, "This Book " + incomingBook.getName()
                                + "Added to your Already Read Shelf", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.setCancelable(false);

                builder.create().show();
            } else {
                util.addAlreadyReadBooks(incomingBook);
                Toast.makeText(this, "This Book " + incomingBook.getName()
                        + "Added to your Already Read Shelf", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void btnCurReadingTapped() {
        Log.d(TAG, "btnCurReadingTapped: started");

        ArrayList<Book> currentlyReadingBooks = util.getCurrentlyReadingBooks();

        if(currentlyReadingBooks.contains(incomingBook)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setMessage("You already added this book to your currently Reading list");

            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });

            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });

            builder.setCancelable(false);

            builder.create().show();
        } else {
            ArrayList<Book> wantToReadBooks = util.getWantToReadBooks();

            if(wantToReadBooks.contains(incomingBook)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setMessage("Are you going to start reading this book?");

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        util.removeWantToReadBook(incomingBook);
                        util.addCurrentlyReadingBook(incomingBook);

                        Toast.makeText(BookActivity.this, "This Book " + incomingBook.getName()
                                + "Added to your Currently Reading Shelf", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.create().show();
            } else {
                ArrayList<Book> alreadyReadBooks = util.getAlreadyReadBooks();

                if(alreadyReadBooks.contains(incomingBook)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);

                    builder.setMessage("Do you want to read it again?");

                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            util.addCurrentlyReadingBook(incomingBook);

                            Toast.makeText(BookActivity.this, "This Book " + incomingBook.getName()
                                    + "Added to your Currently Reading Shelf", Toast.LENGTH_SHORT).show();
                        }
                    });

                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });

                    builder.create().show();
                } else {
                    util.addCurrentlyReadingBook(incomingBook);
                    Toast.makeText(this, "This Book " + incomingBook.getName()
                            + "Added to your Currently Reading Shelf", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private void initWidgets() {
        bookName = (TextView) findViewById(R.id.bookName);
        authorName = (TextView) findViewById(R.id.authorName);
        description = (TextView) findViewById(R.id.bookDesc);
        pageNumber = (TextView) findViewById(R.id.bookPages);

        bookImage = (ImageView) findViewById(R.id.bookImage);

        btnCurReading = (Button) findViewById(R.id.btnCurReading);
        btnWantToRead = (Button) findViewById(R.id.btnWantToRead);
        btnAlreadyRead = (Button) findViewById(R.id.btnAlreadyRead);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.close_in, R.anim.close_out);
    }
}