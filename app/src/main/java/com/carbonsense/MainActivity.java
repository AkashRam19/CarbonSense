package com.carbonsense;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;

import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    int pointCans = 0;
    int pointCardBoards = 0;
    int pointPlastic = 0;
    int pointGlass = 0;
    int pointPaper = 0;

    private OnClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView cans = (TextView) findViewById(R.id.editText5);
        cans.setText(pointCans);

        TextView cardboard = (TextView) findViewById(R.id.editText);
        cardboard.setText(pointCardBoards);

        TextView plastic = (TextView) findViewById(R.id.editText3);
        plastic.setText(pointPlastic);

        TextView glass = (TextView) findViewById(R.id.editText2);
        glass.setText(pointGlass);

        TextView paper = (TextView) findViewById(R.id.editText4);
        paper.setText(pointPaper);

        listener = new OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.camera_button:
                        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivityForResult(cameraIntent, ApplicationMap.CAMERA_PIC_REQUEST);
                        setContentView(R.layout.activity_trash_capture);
                        break;

                }
                ;
            }
        };

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    public void showPopup2(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu2);
        popup.show();
    }

    public void showMessageCan(View v) {
        Toast.makeText(this, "Can Points Added", Toast.LENGTH_SHORT).show();
        pointCans += 2;
    }

    public void showMessageCardboard(View v) {
        Toast.makeText(this, "Cardboard Points Added", Toast.LENGTH_SHORT).show();
        pointCardBoards += 2;
    }

    public void showMessageGlass(View v) {
        Toast.makeText(this, "Glass Points Added", Toast.LENGTH_SHORT).show();
        pointGlass += 2;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Paper Points Added", Toast.LENGTH_SHORT).show();
                pointPaper += 2;
                return true;
            case R.id.item2:
                Toast.makeText(this, "Paper Points Added", Toast.LENGTH_SHORT).show();
                pointPaper += 1;
                return true;
            case R.id.item3:
                Toast.makeText(this, "Paper Points Added", Toast.LENGTH_SHORT).show();
                pointPaper += 2;
                return true;
            case R.id.item4:
                Toast.makeText(this, "Paper Points Added", Toast.LENGTH_SHORT).show();
                pointPaper += 3;
                return true;
            case R.id.item5:
                Toast.makeText(this, "Paper Points Added", Toast.LENGTH_SHORT).show();
                pointPaper += 1;
                return true;
            case R.id.item6:
                Toast.makeText(this, "Plastic Points Added", Toast.LENGTH_SHORT).show();
                pointPaper += 2;
                return true;
            case R.id.item7:
                Toast.makeText(this, "Plastic Points Added", Toast.LENGTH_SHORT).show();
                pointPlastic += 3;
                return true;
            case R.id.item8:
                Toast.makeText(this, "Plastic Points Added", Toast.LENGTH_SHORT).show();
                pointPlastic += 3;
                return true;
            case R.id.item9:
                Toast.makeText(this, "Plastic Points Added", Toast.LENGTH_SHORT).show();
                pointPlastic += 2;
                return true;
            case R.id.item10:
                Toast.makeText(this, "Plastic Points Added", Toast.LENGTH_SHORT).show();
                pointPlastic += 2;
                return true;
            case R.id.item11:
                Toast.makeText(this, "PlasticPoints Added", Toast.LENGTH_SHORT).show();
                pointPlastic += 4;
                return true;
            case R.id.item12:
                Toast.makeText(this, "Plastic Points Added", Toast.LENGTH_SHORT).show();
                pointPlastic += 2;
                return true;
            default:
                return false;
        }
    }
}
