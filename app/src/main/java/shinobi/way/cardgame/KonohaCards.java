package shinobi.way.cardgame;


import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;



public class KonohaCards extends Activity implements OnClickListener {

    Dialog cardinfo;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_box);

        Button buttonback = findViewById(R.id.buttonback);

        LinearLayout tittlecard1 = findViewById(R.id.tittlecard1);
        TextView card1 = findViewById(R.id.card1);
        TextView card1class = findViewById(R.id.card1class);
        tittlecard1.setBackgroundResource(R.drawable.black_button_background1);
        card1.setText(R.string.shu);
        card1class.setText(R.string.tank);
        LinearLayout tittlecard2 = findViewById(R.id.tittlecard2);
        TextView card2 = findViewById(R.id.card2);
        TextView card2class = findViewById(R.id.card2class);
        tittlecard2.setBackgroundResource(R.drawable.black_button_background1);
        card2.setText(R.string.pashke);
        card2class.setText(R.string.adk);
        LinearLayout tittlecard3 = findViewById(R.id.tittlecard3);
        TextView card3 = findViewById(R.id.card3);
        TextView card3class = findViewById(R.id.card3class);
        tittlecard3.setBackgroundResource(R.drawable.black_button_background1);
        card3.setText(R.string.akemi);
        card3class.setText(R.string.adk);
        LinearLayout tittlecard4 = findViewById(R.id.tittlecard4);
        TextView card4 = findViewById(R.id.card4);
        TextView card4class = findViewById(R.id.card4class);
        tittlecard4.setBackgroundResource(R.drawable.black_button_background1);
        card4.setText(R.string.rike);
        card4class.setText(R.string.tank);
        LinearLayout tittlecard5 = findViewById(R.id.tittlecard5);
        TextView card5 = findViewById(R.id.card5);
        TextView card5class = findViewById(R.id.card5class);
        tittlecard5.setBackgroundResource(R.drawable.black_button_background1);
        card5.setText(R.string.hiruko);
        card5class.setText(R.string.adk);
        LinearLayout tittlecard6 = findViewById(R.id.tittlecard6);
        TextView card6 = findViewById(R.id.card6);
        TextView card6class = findViewById(R.id.card6class);
        tittlecard6.setBackgroundResource(R.drawable.black_button_background1);
        card6.setText(R.string.kentaru);
        card6class.setText(R.string.adk);
        LinearLayout tittlecard7 = findViewById(R.id.tittlecard7);
        TextView card7 = findViewById(R.id.card7);
        TextView card7class = findViewById(R.id.card7class);
        tittlecard7.setBackgroundResource(R.drawable.black_button_background1);
        card7.setText(R.string.iketani);
        card7class.setText(R.string.tank);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        buttonback.setOnClickListener(this);
        tittlecard1.setOnClickListener(this);
        tittlecard2.setOnClickListener(this);
        tittlecard3.setOnClickListener(this);
        tittlecard4.setOnClickListener(this);
        tittlecard5.setOnClickListener(this);
        tittlecard6.setOnClickListener(this);
        tittlecard7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonback:
                Intent intent = new Intent(KonohaCards.this,ChooseFraction.class);
                startActivity(intent); finish();
                break;
            case R.id.tittlecard1:
            case R.id.tittlecard2:
            case R.id.tittlecard3:
            case R.id.tittlecard4:
            case R.id.tittlecard5:
            case R.id.tittlecard6:
            case R.id.tittlecard7:
                cardinfo = new Dialog(this);
                cardinfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                cardinfo.setContentView(R.layout.card_info);
                cardinfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cardinfo.setCancelable(false);
                TextView exitdialog1 = cardinfo.findViewById(R.id.exit_dialog1);
                exitdialog1.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cardinfo.dismiss();
                    }
                });
                cardinfo.show();
                break;
        }

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(KonohaCards.this, ChooseFraction.class);
        startActivity(intent);
        finish();
    }

}

