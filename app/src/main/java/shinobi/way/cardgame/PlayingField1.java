package shinobi.way.cardgame;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class PlayingField1 extends Activity implements View.OnClickListener, View.OnTouchListener {

    Dialog cardinfo;
    Dialog battlefield;

    private long backPressedTime;
    long startTime;
    private Toast backToast;
    public int count = 0;
    public int sumstep1 = 0;
    public int battlepoint1 = 0;
    public int sumcards1 = 6;
    public int sumstep2 = 0;
    public int battlepoint2 = 0;
    public int sumcards2 = 6;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playing_field);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final ImageView imgcard1 = findViewById(R.id.imgcard1);
        imgcard1.setImageResource(R.drawable.shu);
        final ImageView imgcard2 = findViewById(R.id.imgcard2);
        imgcard2.setImageResource(R.drawable.pashke);
        final ImageView imgcard3 = findViewById(R.id.imgcard3);
        imgcard3.setImageResource(R.drawable.akemi);
        final ImageView imgcard4 = findViewById(R.id.imgcard4);
        imgcard4.setImageResource(R.drawable.rike);
        final ImageView imgcard5 = findViewById(R.id.imgcard5);
        imgcard5.setImageResource(R.drawable.kentaru);
        final ImageView imgcard6 = findViewById(R.id.imgcard6);
        imgcard6.setImageResource(R.drawable.hiruko);
        final ImageView imgcard7 = findViewById(R.id.imgcard7);
        imgcard7.setImageResource(R.drawable.keiko);
        final ImageView imgcard8 = findViewById(R.id.imgcard8);
        imgcard8.setImageResource(R.drawable.akito);
        final ImageView imgcard9 = findViewById(R.id.imgcard9);
        imgcard9.setImageResource(R.drawable.ryu);
        final ImageView imgcard10 = findViewById(R.id.imgcard10);
        imgcard10.setImageResource(R.drawable.kitsu);
        final ImageView imgcard11 = findViewById(R.id.imgcard11);
        imgcard11.setImageResource(R.drawable.benkei);
        final ImageView imgcard12 = findViewById(R.id.imgcard12);
        imgcard12.setImageResource(R.drawable.teeru);
        LinearLayout p1 = findViewById(R.id.p1);
        LinearLayout p2 = findViewById(R.id.p2);
        LinearLayout p3 = findViewById(R.id.p3);
        LinearLayout p4 = findViewById(R.id.p4);
        LinearLayout p5 = findViewById(R.id.p5);
        LinearLayout p6 = findViewById(R.id.p6);
        LinearLayout f1 = findViewById(R.id.f1);
        LinearLayout f2 = findViewById(R.id.f2);
        LinearLayout ph = findViewById(R.id.ph);

        imgcard1.setOnTouchListener(this);
        imgcard2.setOnTouchListener(this);
        imgcard3.setOnTouchListener(this);
        imgcard4.setOnTouchListener(this);
        imgcard5.setOnTouchListener(this);
        imgcard6.setOnTouchListener(this);
        imgcard7.setOnTouchListener(this);
        imgcard8.setOnTouchListener(this);
        imgcard9.setOnTouchListener(this);
        imgcard10.setOnTouchListener(this);
        imgcard11.setOnTouchListener(this);
        imgcard12.setOnTouchListener(this);
        imgcard1.setOnClickListener(this);
        imgcard2.setOnClickListener(this);;
        imgcard3.setOnClickListener(this);
        imgcard4.setOnClickListener(this);
        imgcard5.setOnClickListener(this);
        imgcard6.setOnClickListener(this);
        imgcard7.setOnClickListener(this);
        imgcard8.setOnClickListener(this);
        imgcard9.setOnClickListener(this);;
        imgcard10.setOnClickListener(this);
        imgcard11.setOnClickListener(this);
        imgcard12.setOnClickListener(this);
        p1.setOnClickListener(this);
        p2.setOnClickListener(this);
        p3.setOnClickListener(this);
        p4.setOnClickListener(this);
        p5.setOnClickListener(this);
        p6.setOnClickListener(this);
        f1.setOnClickListener(this);
        f2.setOnClickListener(this);
        ph.setOnClickListener(this);

        final Button endturn1 = findViewById(R.id.endturn1);
        final TextView sumturn1 = findViewById(R.id.sumturn1);
        final TextView sumcard1 = findViewById(R.id.sumcard1);
        final TextView battlepoints1 = findViewById(R.id.battlepoints1);
        final Button endturn2 = findViewById(R.id.endturn2);
        final TextView sumturn2 = findViewById(R.id.sumturn2);
        final TextView sumcard2 = findViewById(R.id.sumcard2);
        final TextView battlepoints2 = findViewById(R.id.battlepoints2);
        sumturn1.setText("Ход: " + sumstep1);
        sumcard1.setText("Карты: " + sumcards1);
        battlepoints1.setText("ОЗ: " + battlepoint1);
        endturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumstep1++;
                sumturn1.setText("Ход: " + sumstep1);
                endturn1.setEnabled(false);
                endturn2.setEnabled(true);
                imgcard1.setEnabled(false);
                imgcard2.setEnabled(false);
                imgcard3.setEnabled(false);
                imgcard4.setEnabled(false);
                imgcard5.setEnabled(false);
                imgcard6.setEnabled(false);
                imgcard7.setEnabled(true);
                imgcard8.setEnabled(true);
                imgcard9.setEnabled(true);
                imgcard10.setEnabled(true);
                imgcard11.setEnabled(true);
                imgcard12.setEnabled(true);
            }
        });
        sumturn2.setText("Ход: " + sumstep2);
        sumcard2.setText("Карты: " + sumcards2);
        battlepoints2.setText("ОЗ: " + battlepoint2);
        endturn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumstep2++;
                sumturn2.setText("Ход: " + sumstep2);
                endturn2.setEnabled(false);
                endturn1.setEnabled(true);
                imgcard1.setEnabled(true);
                imgcard2.setEnabled(true);
                imgcard3.setEnabled(true);
                imgcard4.setEnabled(true);
                imgcard5.setEnabled(true);
                imgcard6.setEnabled(true);
                imgcard7.setEnabled(false);
                imgcard8.setEnabled(false);
                imgcard9.setEnabled(false);
                imgcard10.setEnabled(false);
                imgcard11.setEnabled(false);
                imgcard12.setEnabled(false);
            }
        });

        if (sumstep1 == 0){
            imgcard1.setEnabled(true);
            imgcard2.setEnabled(true);
            imgcard3.setEnabled(true);
            imgcard4.setEnabled(true);
            imgcard5.setEnabled(true);
            imgcard6.setEnabled(true);
            imgcard7.setEnabled(false);
            imgcard8.setEnabled(false);
            imgcard9.setEnabled(false);
            imgcard10.setEnabled(false);
            imgcard11.setEnabled(false);
            imgcard12.setEnabled(false);
            endturn2.setEnabled(false);
        }
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.p1:
                case R.id.p2:
                case R.id.p3:
                case R.id.p4:
                case R.id.p5:
                case R.id.p6:
                case R.id.f1:
                case R.id.f2:
                case R.id.ph:
                    battlefield = new Dialog(this);
                    battlefield.requestWindowFeature(Window.FEATURE_NO_TITLE);
                    battlefield.setContentView(R.layout.battle_field);
                    battlefield.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    battlefield.setCancelable(false);
                    TextView exitdialog2 = battlefield.findViewById(R.id.exit_dialog2);
                    exitdialog2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            battlefield.dismiss();
                        }
                    });
                    battlefield.show();
                    break;
            }
        }


    @Override
    public void onBackPressed() {
        if(backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        }else {
            backToast = Toast.makeText(getBaseContext(), "Нажмите ещё раз, чтобы выйти", Toast.LENGTH_LONG);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()) {
            case R.id.imgcard1:
            case R.id.imgcard2:
            case R.id.imgcard3:
            case R.id.imgcard4:
            case R.id.imgcard5:
            case R.id.imgcard6:
            case R.id.imgcard7:
            case R.id.imgcard8:
            case R.id.imgcard9:
            case R.id.imgcard10:
            case R.id.imgcard11:
            case R.id.imgcard12:
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        startTime = System.currentTimeMillis();
                        break;
                    case MotionEvent.ACTION_UP:
                        long totalTime1 = System.currentTimeMillis() - startTime;
                        if (totalTime1 >= 1000) {
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

                            cardinfo.show();

                        }break;
                }
                break;
        }
        return false;
    }
}
