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

public class KonohaBonus extends AppCompatActivity implements View.OnClickListener {

    Dialog cardinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_box);

        Button buttonback = findViewById(R.id.buttonback);

        LinearLayout tittlecard1 = findViewById(R.id.tittlecard1);
        TextView card1 = findViewById(R.id.card1);
        tittlecard1.setBackgroundResource(R.drawable.press_back2);
        card1.setText(R.string.bar);
        LinearLayout tittlecard2 = findViewById(R.id.tittlecard2);
        TextView card2 = findViewById(R.id.card2);
        tittlecard2.setBackgroundResource(R.drawable.press_back2);
        card2.setText(R.string.himera);
        LinearLayout tittlecard3 = findViewById(R.id.tittlecard3);
        TextView card3 = findViewById(R.id.card3);
        tittlecard3.setBackgroundResource(R.drawable.press_back2);
        card3.setText(R.string.tsunami);
        LinearLayout tittlecard4 = findViewById(R.id.tittlecard4);
        TextView card4 = findViewById(R.id.card4);
        tittlecard4.setBackgroundResource(R.drawable.press_back2);
        card4.setText(R.string.kingjerry);
        LinearLayout tittlecard5 = findViewById(R.id.tittlecard5);
        TextView card5 = findViewById(R.id.card5);
        tittlecard5.setBackgroundResource(R.drawable.press_back2);
        card5.setText(R.string.ren);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        buttonback.setOnClickListener(this);
        tittlecard1.setOnClickListener(this);
        tittlecard2.setOnClickListener(this);
        tittlecard3.setOnClickListener(this);
        tittlecard4.setOnClickListener(this);
        tittlecard5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonback:
                Intent intent = new Intent(KonohaBonus.this,ChooseFraction.class);
                startActivity(intent); finish();
                break;
            case R.id.tittlecard1:
                cardinfo = new Dialog(this);
                cardinfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                cardinfo.setContentView(R.layout.bonus_info);
                cardinfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cardinfo.setCancelable(false);
                TextView exitdialog1 = cardinfo.findViewById(R.id.exit_dialog1);
                exitdialog1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cardinfo.dismiss();
                    }
                });
                TextView cardname1 = cardinfo.findViewById(R.id.cardname1);
                TextView special1 = cardinfo.findViewById(R.id.special);
                ImageView cardappear1 = cardinfo.findViewById(R.id.cardappear1);
                cardappear1.setImageResource(R.drawable.bar);
                cardname1.setText(R.string.bar);
                special1.setText("При выпадении добавляет 5 единиц здоровья каждой карте");
                cardinfo.show();
                break;
            case R.id.tittlecard2:
                cardinfo = new Dialog(this);
                cardinfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                cardinfo.setContentView(R.layout.bonus_info);
                cardinfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cardinfo.setCancelable(false);
                TextView exitdialog2 = cardinfo.findViewById(R.id.exit_dialog1);
                exitdialog2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cardinfo.dismiss();
                    }
                });
                TextView cardname2 = cardinfo.findViewById(R.id.cardname1);
                TextView special2 = cardinfo.findViewById(R.id.special);
                cardname2.setText(R.string.himera);
                special2.setText("При выпадении увеличивает урон Хируко на 3 единицы");
                ImageView cardappear2 = cardinfo.findViewById(R.id.cardappear1);
                cardappear2.setImageResource(R.drawable.himera);
                cardinfo.show();
                break;
            case R.id.tittlecard3:
                cardinfo = new Dialog(this);
                cardinfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                cardinfo.setContentView(R.layout.bonus_info);
                cardinfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cardinfo.setCancelable(false);
                TextView exitdialog3 = cardinfo.findViewById(R.id.exit_dialog1);
                exitdialog3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cardinfo.dismiss();
                    }
                });
                TextView cardname3 = cardinfo.findViewById(R.id.cardname1);
                TextView special3 = cardinfo.findViewById(R.id.special);
                cardname3.setText(R.string.tsunami);
                special3.setText("При выпадении увеличивает урон Кентару на 3 единицы");
                ImageView cardappear3 = cardinfo.findViewById(R.id.cardappear1);
                cardappear3.setImageResource(R.drawable.tsunami);
                cardinfo.show();
                break;
            case R.id.tittlecard4:
                cardinfo = new Dialog(this);
                cardinfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                cardinfo.setContentView(R.layout.bonus_info);
                cardinfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cardinfo.setCancelable(false);
                TextView exitdialog4 = cardinfo.findViewById(R.id.exit_dialog1);
                exitdialog4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cardinfo.dismiss();
                    }
                });
                TextView cardname4 = cardinfo.findViewById(R.id.cardname1);
                TextView special4 = cardinfo.findViewById(R.id.special);
                cardname4.setText(R.string.kingjerry);
                special4.setText("При выпадении увеличивает урон Шу на 3 единицы");
                ImageView cardappear4 = cardinfo.findViewById(R.id.cardappear1);
                cardappear4.setImageResource(R.drawable.king_jerry);
                cardinfo.show();
                break;
            case R.id.tittlecard5:
                cardinfo = new Dialog(this);
                cardinfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                cardinfo.setContentView(R.layout.bonus_info);
                cardinfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cardinfo.setCancelable(false);
                TextView exitdialog5 = cardinfo.findViewById(R.id.exit_dialog1);
                exitdialog5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cardinfo.dismiss();
                    }
                });
                TextView cardname5 = cardinfo.findViewById(R.id.cardname1);
                TextView special5 = cardinfo.findViewById(R.id.special);
                cardname5.setText(R.string.ren);
                special5.setText("При выпадении уменьшает урон на 2 единицы для каждой карты");
                ImageView cardappear5 = cardinfo.findViewById(R.id.cardappear1);
                cardappear5.setImageResource(R.drawable.ren);
                cardinfo.show();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(KonohaBonus.this, ChooseFraction.class);
        startActivity(intent);
        finish();
    }
}
