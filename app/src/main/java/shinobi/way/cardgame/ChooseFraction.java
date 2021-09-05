package shinobi.way.cardgame;


import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ChooseFraction extends AppCompatActivity implements OnClickListener {

    Dialog fractioninfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_fraction);

        LinearLayout konoha = findViewById(R.id.konoha);
        LinearLayout iva = findViewById(R.id.iva);
        LinearLayout morekonoha = findViewById(R.id.morekonoha);
        LinearLayout moreiva = findViewById(R.id.moreiva);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        konoha.setOnClickListener(this);
        iva.setOnClickListener(this);
        morekonoha.setOnClickListener(this);
        moreiva.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.konoha:
            case R.id.iva:
                Intent intent = new Intent(ChooseFraction.this, PlayingField1.class);
                startActivity(intent);
                finish();
                break;
            case R.id.morekonoha:
                fractioninfo = new Dialog(this);
                fractioninfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                fractioninfo.setContentView(R.layout.choose_cards);
                fractioninfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                fractioninfo.setCancelable(false);
                TextView exitdialog = (TextView)fractioninfo.findViewById(R.id.exit_dialog);
                ImageView cards = fractioninfo.findViewById(R.id.cards);
                ImageView bonus = fractioninfo.findViewById(R.id.bonus);
                exitdialog.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fractioninfo.dismiss();
                    }
                });
                cards.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fractioninfo.dismiss();
                        Intent intent = new Intent(ChooseFraction.this,KonohaCards.class);
                        startActivity(intent); finish();
                    }
                });
                bonus.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fractioninfo.dismiss();
                        Intent intent = new Intent(ChooseFraction.this, KonohaBonus.class);
                        startActivity(intent); finish();
                    }
                });
                fractioninfo.show();
                break;
            case R.id.moreiva:
                fractioninfo = new Dialog(this);
                fractioninfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                fractioninfo.setContentView(R.layout.choose_cards);
                fractioninfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                fractioninfo.setCancelable(false);
                TextView exitdialog1 = (TextView)fractioninfo.findViewById(R.id.exit_dialog);
                ImageView cards1 = fractioninfo.findViewById(R.id.cards);
                ImageView bonus1 = fractioninfo.findViewById(R.id.bonus);
                exitdialog1.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fractioninfo.dismiss();
                    }
                });
                cards1.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fractioninfo.dismiss();
                        Intent intent = new Intent(ChooseFraction.this,IvaCards.class);
                        startActivity(intent); finish();
                    }
                });
                bonus1.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fractioninfo.dismiss();
                        Intent intent = new Intent(ChooseFraction.this, IvaBonus.class);
                        startActivity(intent); finish();
                    }
                });
                fractioninfo.show();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ChooseFraction.this, StartActivity.class);
        startActivity(intent);
        finish();
    }

}