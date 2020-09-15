package com.mohammad.mymenutoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       int id=item.getItemId();
       if(id==R.id.menu_home)
           Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
       if (id==R.id.menu_help)
           Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show();
        if (id==R.id.menu_email)
            Toast.makeText(this, "Email", Toast.LENGTH_SHORT).show();
        if (id==R.id.menu_close){
            Toast.makeText(this, "Close", Toast.LENGTH_SHORT).show();
            finish();}
        return  super.onOptionsItemSelected(item);
    }

}
