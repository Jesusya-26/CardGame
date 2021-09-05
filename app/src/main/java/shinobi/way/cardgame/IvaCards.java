package shinobi.way.cardgame;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IvaCards extends AppCompatActivity implements View.OnClickListener {

    Dialog cardinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_box);

        Button buttonback = findViewById(R.id.buttonback);

        LinearLayout tittlecard1 = findViewById(R.id.tittlecard1);
        TextView card1 = findViewById(R.id.card1);
        TextView card1class = findViewById(R.id.card1class);
        tittlecard1.setBackgroundResource(R.drawable.press_back2);
        card1.setText(R.string.keiko);
        card1class.setText(R.string.adk);
        LinearLayout tittlecard2 = findViewById(R.id.tittlecard2);
        TextView card2 = findViewById(R.id.card2);
        TextView card2class = findViewById(R.id.card2class);
        tittlecard2.setBackgroundResource(R.drawable.press_back2);
        card2.setText(R.string.akito);
        card2class.setText(R.string.support);
        LinearLayout tittlecard3 = findViewById(R.id.tittlecard3);
        TextView card3 = findViewById(R.id.card3);
        TextView card3class = findViewById(R.id.card3class);
        tittlecard3.setBackgroundResource(R.drawable.press_back2);
        card3.setText(R.string.ryu);
        card3class.setText(R.string.support);
        LinearLayout tittlecard4 = findViewById(R.id.tittlecard4);
        TextView card4 = findViewById(R.id.card4);
        TextView card4class = findViewById(R.id.card4class);
        tittlecard4.setBackgroundResource(R.drawable.press_back2);
        card4.setText(R.string.kitsu);
        card4class.setText(R.string.tank);
        LinearLayout tittlecard5 = findViewById(R.id.tittlecard5);
        TextView card5 = findViewById(R.id.card5);
        TextView card5class = findViewById(R.id.card5class);
        tittlecard5.setBackgroundResource(R.drawable.press_back2);
        card5.setText(R.string.benkei);
        card5class.setText(R.string.tank);
        LinearLayout tittlecard6 = findViewById(R.id.tittlecard6);
        TextView card6 = findViewById(R.id.card6);
        TextView card6class = findViewById(R.id.card6class);
        tittlecard6.setBackgroundResource(R.drawable.press_back2);
        card6.setText(R.string.teeru);
        card6class.setText(R.string.adk);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        buttonback.setOnClickListener(this);
        tittlecard1.setOnClickListener(this);
        tittlecard2.setOnClickListener(this);
        tittlecard3.setOnClickListener(this);
        tittlecard4.setOnClickListener(this);
        tittlecard5.setOnClickListener(this);
        tittlecard6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonback:
                Intent intent = new Intent(IvaCards.this,ChooseFraction.class);
                startActivity(intent); finish();
                break;
            case R.id.tittlecard1:
                cardinfo = new Dialog(this);
                cardinfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                cardinfo.setContentView(R.layout.card_info);
                cardinfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cardinfo.setCancelable(false);
                TextView exitdialog1 = cardinfo.findViewById(R.id.exit_dialog1);
                exitdialog1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cardinfo.dismiss();
                    }
                });
                TextView cardname1 = cardinfo.findViewById(R.id.cardname);
                TextView cardclass1 = cardinfo.findViewById(R.id.cardclass);
                TextView pace1 = cardinfo.findViewById(R.id.pace);
                TextView resist1 = cardinfo.findViewById(R.id.resist);
                TextView hp1 = cardinfo.findViewById(R.id.hp);
                TextView damage1 = cardinfo.findViewById(R.id.damage);
                ImageView cardappear1 = cardinfo.findViewById(R.id.cardappear);
                cardappear1.setImageResource(R.drawable.keiko1);
                cardname1.setText(R.string.keiko);
                cardclass1.setText(R.string.adk);
                pace1.setText("Cкорость: 1");
                resist1.setText("Стойкость: 5");
                hp1.setText("Здоровье: 20");
                damage1.setText("Урон: 5");
                cardinfo.show();
                break;
            case R.id.tittlecard2:
                cardinfo = new Dialog(this);
                cardinfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                cardinfo.setContentView(R.layout.card_info);
                cardinfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cardinfo.setCancelable(false);
                TextView exitdialog2 = cardinfo.findViewById(R.id.exit_dialog1);
                exitdialog2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cardinfo.dismiss();
                    }
                });
                TextView cardname2 = cardinfo.findViewById(R.id.cardname);
                TextView cardclass2 = cardinfo.findViewById(R.id.cardclass);
                TextView pace2 = cardinfo.findViewById(R.id.pace);
                TextView resist2 = cardinfo.findViewById(R.id.resist);
                TextView hp2 = cardinfo.findViewById(R.id.hp);
                TextView damage2 = cardinfo.findViewById(R.id.damage);
                ImageView cardappear2 = cardinfo.findViewById(R.id.cardappear);
                cardappear2.setImageResource(R.drawable.akito1);
                cardname2.setText(R.string.akito);
                cardclass2.setText(R.string.support);
                pace2.setText("Cкорость: 3");
                resist2.setText("Стойкость: 4");
                hp2.setText("Здоровье: 18");
                damage2.setText("Урон: 7");
                cardinfo.show();
                break;
            case R.id.tittlecard3:
                cardinfo = new Dialog(this);
                cardinfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                cardinfo.setContentView(R.layout.card_info);
                cardinfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cardinfo.setCancelable(false);
                TextView exitdialog3 = cardinfo.findViewById(R.id.exit_dialog1);
                exitdialog3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cardinfo.dismiss();
                    }
                });
                TextView cardname3 = cardinfo.findViewById(R.id.cardname);
                TextView cardclass3 = cardinfo.findViewById(R.id.cardclass);
                TextView pace3 = cardinfo.findViewById(R.id.pace);
                TextView resist3 = cardinfo.findViewById(R.id.resist);
                TextView hp3 = cardinfo.findViewById(R.id.hp);
                TextView damage3 = cardinfo.findViewById(R.id.damage);
                ImageView cardappear3 = cardinfo.findViewById(R.id.cardappear);
                cardappear3.setImageResource(R.drawable.ryu1);
                cardname3.setText(R.string.ryu);
                cardclass3.setText(R.string.support);
                pace3.setText("Cкорость: 2");
                resist3.setText("Стойкость: 3");
                hp3.setText("Здоровье: 14");
                damage3.setText("Урон: 7");
                cardinfo.show();
                break;
            case R.id.tittlecard4:
                cardinfo = new Dialog(this);
                cardinfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                cardinfo.setContentView(R.layout.card_info);
                cardinfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cardinfo.setCancelable(false);
                TextView exitdialog4 = cardinfo.findViewById(R.id.exit_dialog1);
                exitdialog4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cardinfo.dismiss();
                    }
                });
                TextView cardname4 = cardinfo.findViewById(R.id.cardname);
                TextView cardclass4 = cardinfo.findViewById(R.id.cardclass);
                TextView pace4 = cardinfo.findViewById(R.id.pace);
                TextView resist4 = cardinfo.findViewById(R.id.resist);
                TextView hp4 = cardinfo.findViewById(R.id.hp);
                TextView damage4 = cardinfo.findViewById(R.id.damage);
                ImageView cardappear4 = cardinfo.findViewById(R.id.cardappear);
                cardappear4.setImageResource(R.drawable.kitsu1);
                cardname4.setText(R.string.kitsu);
                cardclass4.setText(R.string.tank);
                pace4.setText("Cкорость: 4");
                resist4.setText("Стойкость: 1");
                hp4.setText("Здоровье: 12");
                damage4.setText("Урон: 10");
                cardinfo.show();
                break;
            case R.id.tittlecard5:
                cardinfo = new Dialog(this);
                cardinfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                cardinfo.setContentView(R.layout.card_info);
                cardinfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cardinfo.setCancelable(false);
                TextView exitdialog5 = cardinfo.findViewById(R.id.exit_dialog1);
                exitdialog5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cardinfo.dismiss();
                    }
                });
                TextView cardname5 = cardinfo.findViewById(R.id.cardname);
                TextView cardclass5 = cardinfo.findViewById(R.id.cardclass);
                TextView pace5 = cardinfo.findViewById(R.id.pace);
                TextView resist5 = cardinfo.findViewById(R.id.resist);
                TextView hp5 = cardinfo.findViewById(R.id.hp);
                TextView damage5 = cardinfo.findViewById(R.id.damage);
                ImageView cardappear5 = cardinfo.findViewById(R.id.cardappear);
                cardappear5.setImageResource(R.drawable.benkei1);
                cardname5.setText(R.string.benkei);
                cardclass5.setText(R.string.tank);
                pace5.setText("Cкорость: 3");
                resist5.setText("Стойкость: 2");
                hp5.setText("Здоровье: 14");
                damage5.setText("Урон: 8");
                cardinfo.show();
                break;
            case R.id.tittlecard6:
                cardinfo = new Dialog(this);
                cardinfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                cardinfo.setContentView(R.layout.card_info);
                cardinfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cardinfo.setCancelable(false);
                TextView exitdialog6 = cardinfo.findViewById(R.id.exit_dialog1);
                exitdialog6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cardinfo.dismiss();
                    }
                });
                TextView cardname6 = cardinfo.findViewById(R.id.cardname);
                TextView cardclass6 = cardinfo.findViewById(R.id.cardclass);
                TextView pace6 = cardinfo.findViewById(R.id.pace);
                TextView resist6 = cardinfo.findViewById(R.id.resist);
                TextView hp6 = cardinfo.findViewById(R.id.hp);
                TextView damage6 = cardinfo.findViewById(R.id.damage);
                ImageView cardappear6 = cardinfo.findViewById(R.id.cardappear);
                cardappear6.setImageResource(R.drawable.teeru1);
                cardname6.setText(R.string.teeru);
                cardclass6.setText(R.string.adk);
                pace6.setText("Cкорость: 2");
                resist6.setText("Стойкость: 3");
                hp6.setText("Здоровье: 14");
                damage6.setText("Урон: 7");
                cardinfo.show();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(IvaCards.this, ChooseFraction.class);
        startActivity(intent);
        finish();
    }
}
