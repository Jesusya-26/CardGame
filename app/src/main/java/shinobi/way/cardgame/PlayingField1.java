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
import android.widget.TextView;
import android.widget.Toast;

public class PlayingField1 extends Activity implements View.OnClickListener, View.OnTouchListener {

    Dialog cardinfo;
    Dialog battlefield;
    Dialog yes_no;

    CardInfo cardInfo = new CardInfo();

    private long backPressedTime;
    long startTime;
    private Toast backToast;
    public int card1p1 = 0;
    public int card2p1 = 0;
    public int card3p1 = 0;
    public int card4p1 = 0;
    public int card5p1 = 0;
    public int card6p1 = 0;
    public int card1p2 = 0;
    public int card2p2 = 0;
    public int card3p2 = 0;
    public int card4p2 = 0;
    public int card5p2 = 0;
    public int card6p2 = 0;
    public int card1p3 = 0;
    public int card2p3 = 0;
    public int card3p3 = 0;
    public int card4p3 = 0;
    public int card5p3 = 0;
    public int card6p3 = 0;
    public int card1p4 = 0;
    public int card2p4 = 0;
    public int card3p4 = 0;
    public int card4p4 = 0;
    public int card5p4 = 0;
    public int card6p4 = 0;
    public int card1p5 = 0;
    public int card2p5 = 0;
    public int card3p5 = 0;
    public int card4p5 = 0;
    public int card5p5 = 0;
    public int card6p5 = 0;
    public int card1p6 = 0;
    public int card2p6 = 0;
    public int card3p6 = 0;
    public int card4p6 = 0;
    public int card5p6 = 0;
    public int card6p6 = 0;
    public int card1ph = 0;
    public int card2ph = 0;
    public int card3ph = 0;
    public int card4ph = 0;
    public int card5ph = 0;
    public int card6ph = 0;
    public int card1b1 = 0;
    public int card2b1 = 0;
    public int card3b1 = 0;
    public int card4b1 = 0;
    public int card5b1 = 0;
    public int card6b1 = 0;
    public int card1b2 = 0;
    public int card2b2 = 0;
    public int card3b2 = 0;
    public int card4b2 = 0;
    public int card5b2 = 0;
    public int card6b2 = 0;
    public int countp1 = 0;
    public int countp2 = 0;
    public int countp3 = 0;
    public int countp4 = 0;
    public int countp5 = 0;
    public int countp6 = 0;
    public int countb1 = 0;
    public int countb2 = 0;
    public int countph = 0;
    public int count1p1 = 0;
    public int count1p2 = 0;
    public int count1p3 = 0;
    public int count1p4 = 0;
    public int count1p5 = 0;
    public int count1p6 = 0;
    public int count1b1 = 0;
    public int count1b2 = 0;
    public int count1ph = 0;
    public int count = 0;
    public int count1 = 0;
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
        final TextView p1 = findViewById(R.id.p1);
        final TextView p2 = findViewById(R.id.p2);
        final TextView p3 = findViewById(R.id.p3);
        final TextView p4 = findViewById(R.id.p4);
        final TextView p5 = findViewById(R.id.p5);
        final TextView p6 = findViewById(R.id.p6);
        final TextView b1 = findViewById(R.id.b1);
        final TextView b2 = findViewById(R.id.b2);
        final TextView ph = findViewById(R.id.ph);
        final TextView namecard1 = findViewById(R.id.namecard1);
        final TextView namecard2 = findViewById(R.id.namecard2);
        final TextView namecard3 = findViewById(R.id.namecard3);
        final TextView namecard4 = findViewById(R.id.namecard4);
        final TextView namecard5 = findViewById(R.id.namecard5);
        final TextView namecard6 = findViewById(R.id.namecard6);
        final TextView namecard7 = findViewById(R.id.namecard7);
        final TextView namecard8 = findViewById(R.id.namecard8);
        final TextView namecard9 = findViewById(R.id.namecard9);
        final TextView namecard10 = findViewById(R.id.namecard10);
        final TextView namecard11 = findViewById(R.id.namecard11);
        final TextView namecard12 = findViewById(R.id.namecard12);
        final ImageView p1card1 = findViewById(R.id.p1card1);
        final ImageView p1card2 = findViewById(R.id.p1card2);
        final ImageView p1card3 = findViewById(R.id.p1card3);
        final ImageView p1card4 = findViewById(R.id.p1card4);
        final ImageView p1card5 = findViewById(R.id.p1card5);
        final ImageView p1card6 = findViewById(R.id.p1card6);
        final ImageView p2card1 = findViewById(R.id.p2card1);
        final ImageView p2card2 = findViewById(R.id.p2card2);
        final ImageView p2card3 = findViewById(R.id.p2card3);
        final ImageView p2card4 = findViewById(R.id.p2card4);
        final ImageView p2card5 = findViewById(R.id.p2card5);
        final ImageView p2card6 = findViewById(R.id.p2card6);
        final ImageView p3card1 = findViewById(R.id.p3card1);
        final ImageView p3card2 = findViewById(R.id.p3card2);
        final ImageView p3card3 = findViewById(R.id.p3card3);
        final ImageView p3card4 = findViewById(R.id.p3card4);
        final ImageView p3card5 = findViewById(R.id.p3card5);
        final ImageView p3card6 = findViewById(R.id.p3card6);
        final ImageView p4card1 = findViewById(R.id.p4card1);
        final ImageView p4card2 = findViewById(R.id.p4card2);
        final ImageView p4card3 = findViewById(R.id.p4card3);
        final ImageView p4card4 = findViewById(R.id.p4card4);
        final ImageView p4card5 = findViewById(R.id.p4card5);
        final ImageView p4card6 = findViewById(R.id.p4card6);
        final ImageView p5card1 = findViewById(R.id.p5card1);
        final ImageView p5card2 = findViewById(R.id.p5card2);
        final ImageView p5card3 = findViewById(R.id.p5card3);
        final ImageView p5card4 = findViewById(R.id.p5card4);
        final ImageView p5card5 = findViewById(R.id.p5card5);
        final ImageView p5card6 = findViewById(R.id.p5card6);
        final ImageView p6card1 = findViewById(R.id.p6card1);
        final ImageView p6card2 = findViewById(R.id.p6card2);
        final ImageView p6card3 = findViewById(R.id.p6card3);
        final ImageView p6card4 = findViewById(R.id.p6card4);
        final ImageView p6card5 = findViewById(R.id.p6card5);
        final ImageView p6card6 = findViewById(R.id.p6card6);
        final ImageView cardback1 = findViewById(R.id.cardback1);
        final ImageView cardback2 = findViewById(R.id.cardback2);

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
        namecard1.setOnTouchListener(this);
        namecard2.setOnTouchListener(this);
        namecard3.setOnTouchListener(this);
        namecard4.setOnTouchListener(this);
        namecard5.setOnTouchListener(this);
        namecard6.setOnTouchListener(this);
        namecard7.setOnTouchListener(this);
        namecard8.setOnTouchListener(this);
        namecard9.setOnTouchListener(this);
        namecard10.setOnTouchListener(this);
        namecard11.setOnTouchListener(this);
        namecard12.setOnTouchListener(this);
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
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
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
                p1.setBackgroundResource(R.drawable.white_button_background1);
                p2.setBackgroundResource(R.drawable.white_button_background1);
                p3.setBackgroundResource(R.drawable.white_button_background1);
                p4.setBackgroundResource(R.drawable.white_button_background1);
                p5.setBackgroundResource(R.drawable.white_button_background1);
                p6.setBackgroundResource(R.drawable.white_button_background1);
                b1.setBackgroundResource(R.drawable.white_button_background1);
                b2.setBackgroundResource(R.drawable.white_button_background1);
                ph.setBackgroundResource(R.drawable.white_button_background1);
                p1.setEnabled(true);
                p2.setEnabled(true);
                p3.setEnabled(true);
                p4.setEnabled(true);
                p5.setEnabled(true);
                p6.setEnabled(true);
                ph.setEnabled(true);
                b1.setEnabled(true);
                b2.setEnabled(true);
                count = 0;
                count1 = 0;
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
        final ImageView imgcard1 = findViewById(R.id.imgcard1);
        final ImageView imgcard2 = findViewById(R.id.imgcard2);
        final ImageView imgcard3 = findViewById(R.id.imgcard3);
        final ImageView imgcard4 = findViewById(R.id.imgcard4);
        final ImageView imgcard5 = findViewById(R.id.imgcard5);
        final ImageView imgcard6 = findViewById(R.id.imgcard6);
        final ImageView imgcard7 = findViewById(R.id.imgcard7);
        final ImageView imgcard8 = findViewById(R.id.imgcard8);
        final ImageView imgcard9 = findViewById(R.id.imgcard9);
        final ImageView imgcard10 = findViewById(R.id.imgcard10);
        final ImageView imgcard11 = findViewById(R.id.imgcard11);
        final ImageView imgcard12 = findViewById(R.id.imgcard12);
        final TextView p1 = findViewById(R.id.p1);
        final TextView p2 = findViewById(R.id.p2);
        final TextView p3 = findViewById(R.id.p3);
        final TextView p4 = findViewById(R.id.p4);
        final TextView p5 = findViewById(R.id.p5);
        final TextView p6 = findViewById(R.id.p6);
        final TextView b1 = findViewById(R.id.b1);
        final TextView b2 = findViewById(R.id.b2);
        final TextView ph = findViewById(R.id.ph);
        final TextView namecard1 = findViewById(R.id.namecard1);
        final TextView namecard2 = findViewById(R.id.namecard2);
        final TextView namecard3 = findViewById(R.id.namecard3);
        final TextView namecard4 = findViewById(R.id.namecard4);
        final TextView namecard5 = findViewById(R.id.namecard5);
        final TextView namecard6 = findViewById(R.id.namecard6);
        final TextView namecard7 = findViewById(R.id.namecard7);
        final TextView namecard8 = findViewById(R.id.namecard8);
        final TextView namecard9 = findViewById(R.id.namecard9);
        final TextView namecard10 = findViewById(R.id.namecard10);
        final TextView namecard11 = findViewById(R.id.namecard11);
        final TextView namecard12 = findViewById(R.id.namecard12);
        final ImageView p1card1 = findViewById(R.id.p1card1);
        final ImageView p1card2 = findViewById(R.id.p1card2);
        final ImageView p1card3 = findViewById(R.id.p1card3);
        final ImageView p1card4 = findViewById(R.id.p1card4);
        final ImageView p1card5 = findViewById(R.id.p1card5);
        final ImageView p1card6 = findViewById(R.id.p1card6);
        final ImageView p2card1 = findViewById(R.id.p2card1);
        final ImageView p2card2 = findViewById(R.id.p2card2);
        final ImageView p2card3 = findViewById(R.id.p2card3);
        final ImageView p2card4 = findViewById(R.id.p2card4);
        final ImageView p2card5 = findViewById(R.id.p2card5);
        final ImageView p2card6 = findViewById(R.id.p2card6);
        final ImageView p3card1 = findViewById(R.id.p3card1);
        final ImageView p3card2 = findViewById(R.id.p3card2);
        final ImageView p3card3 = findViewById(R.id.p3card3);
        final ImageView p3card4 = findViewById(R.id.p3card4);
        final ImageView p3card5 = findViewById(R.id.p3card5);
        final ImageView p3card6 = findViewById(R.id.p3card6);
        final ImageView p4card1 = findViewById(R.id.p4card1);
        final ImageView p4card2 = findViewById(R.id.p4card2);
        final ImageView p4card3 = findViewById(R.id.p4card3);
        final ImageView p4card4 = findViewById(R.id.p4card4);
        final ImageView p4card5 = findViewById(R.id.p4card5);
        final ImageView p4card6 = findViewById(R.id.p4card6);
        final ImageView p5card1 = findViewById(R.id.p5card1);
        final ImageView p5card2 = findViewById(R.id.p5card2);
        final ImageView p5card3 = findViewById(R.id.p5card3);
        final ImageView p5card4 = findViewById(R.id.p5card4);
        final ImageView p5card5 = findViewById(R.id.p5card5);
        final ImageView p5card6 = findViewById(R.id.p5card6);
        final ImageView p6card1 = findViewById(R.id.p6card1);
        final ImageView p6card2 = findViewById(R.id.p6card2);
        final ImageView p6card3 = findViewById(R.id.p6card3);
        final ImageView p6card4 = findViewById(R.id.p6card4);
        final ImageView p6card5 = findViewById(R.id.p6card5);
        final ImageView p6card6 = findViewById(R.id.p6card6);
        switch (v.getId()) {
            case R.id.imgcard1:
                if (count == 0) {
                    namecard1.setText(R.string.shu);
                    p1.setBackgroundResource(R.drawable.red_button_background1);
                    p2.setBackgroundResource(R.drawable.red_button_background1);
                    p3.setBackgroundResource(R.drawable.red_button_background1);
                    p4.setEnabled(false);
                    p5.setEnabled(false);
                    p6.setEnabled(false);
                    ph.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    count++;
                    count1++;
                    p1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp1 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard1.setImageAlpha(1);
                                        card1p1 = 1;
                                        p1card1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard1.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard1.setImageAlpha(1);
                                        card2p1 = 1;
                                        p1card2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard1.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard1.setImageAlpha(1);
                                        card3p1 = 1;
                                        p1card3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard1.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 1 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                battlefield.show();
                            }
                        }
                    });
                    p2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp2 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard1.setImageAlpha(1);
                                        card1p2 = 1;
                                        p2card1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard1.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard1.setImageAlpha(1);
                                        card2p2 = 1;
                                        p2card2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard1.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard1.setImageAlpha(1);
                                        card3p2 = 1;
                                        p2card3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard1.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 2 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                battlefield.show();
                            }
                        }
                    });
                    p3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp3 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard1.setImageAlpha(1);
                                        card1p3 = 1;
                                        p3card1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard1.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard1.setImageAlpha(1);
                                        card2p3 = 1;
                                        p3card2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard1.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard1.setImageAlpha(1);
                                        card3p3 = 1;
                                        p3card3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard1.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 3 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                battlefield.show();
                            }
                        }
                    });
                } else {
                    namecard1.setText("");
                    p1.setBackgroundResource(R.drawable.white_button_background1);
                    p2.setBackgroundResource(R.drawable.white_button_background1);
                    p3.setBackgroundResource(R.drawable.white_button_background1);
                    p4.setEnabled(true);
                    p5.setEnabled(true);
                    p6.setEnabled(true);
                    ph.setEnabled(true);
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    count = 0;
                    count1 = 0;
                }
                break;
            case R.id.imgcard2:
                if (count == 0) {
                    namecard2.setText(R.string.pashke);
                    p1.setBackgroundResource(R.drawable.red_button_background1);
                    p2.setBackgroundResource(R.drawable.red_button_background1);
                    p3.setBackgroundResource(R.drawable.red_button_background1);
                    p4.setEnabled(false);
                    p5.setEnabled(false);
                    p6.setEnabled(false);
                    ph.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    count++;
                    count1++;
                    p1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp1 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard2.setImageAlpha(1);
                                        card1p1 = 2;
                                        p1card1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard2.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard2.setImageAlpha(1);
                                        card2p1 = 2;
                                        p1card2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard2.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard2.setImageAlpha(1);
                                        card3p1 = 2;
                                        p1card3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard2.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 1 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                battlefield.show();
                            }
                        }
                    });
                    p2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp2 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard2.setImageAlpha(1);
                                        card1p2 = 2;
                                        p2card1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard2.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard2.setImageAlpha(1);
                                        card2p2 = 2;
                                        p2card2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard2.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard2.setImageAlpha(1);
                                        card3p2 = 2;
                                        p2card3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard2.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 2 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                battlefield.show();
                            }
                        }
                    });
                    p3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp3 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard2.setImageAlpha(1);
                                        card1p3 = 2;
                                        p3card1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard2.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard2.setImageAlpha(1);
                                        card2p3 = 2;
                                        p3card2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard2.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard2.setImageAlpha(1);
                                        card3p3 = 2;
                                        p3card3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard2.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 3 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                battlefield.show();
                            }
                        }
                    });
                } else {
                    namecard2.setText("");
                    p1.setBackgroundResource(R.drawable.white_button_background1);
                    p2.setBackgroundResource(R.drawable.white_button_background1);
                    p3.setBackgroundResource(R.drawable.white_button_background1);
                    p4.setEnabled(true);
                    p5.setEnabled(true);
                    p6.setEnabled(true);
                    ph.setEnabled(true);
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    count = 0;
                    count1 = 0;
                }
                break;

            case R.id.imgcard3:
                if (count == 0) {
                    namecard3.setText(R.string.akemi);
                    p1.setBackgroundResource(R.drawable.red_button_background1);
                    p2.setBackgroundResource(R.drawable.red_button_background1);
                    p3.setBackgroundResource(R.drawable.red_button_background1);
                    p4.setEnabled(false);
                    p5.setEnabled(false);
                    p6.setEnabled(false);
                    ph.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    count++;
                    count1++;
                    p1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp1 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard3.setImageAlpha(1);
                                        card1p1 = 3;
                                        p1card1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard3.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard3.setImageAlpha(1);
                                        card2p1 = 3;
                                        p1card2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard3.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard3.setImageAlpha(1);
                                        card3p1 = 3;
                                        p1card3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard3.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 1 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                battlefield.show();
                            }
                        }
                    });
                    p2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp2 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard3.setImageAlpha(1);
                                        card1p2 = 3;
                                        p2card1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard3.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard3.setImageAlpha(1);
                                        card2p2 = 3;
                                        p2card2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard3.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard3.setImageAlpha(1);
                                        card3p2 = 3;
                                        p2card3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard3.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 2 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                battlefield.show();
                            }
                        }
                    });
                    p3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp3 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard3.setImageAlpha(1);
                                        card1p3 = 3;
                                        p3card1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard3.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard3.setImageAlpha(1);
                                        card2p3 = 3;
                                        p3card2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard3.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard3.setImageAlpha(1);
                                        card3p3 = 3;
                                        p3card3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard3.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 3 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                battlefield.show();
                            }
                        }
                    });
                } else {
                    namecard3.setText("");
                    p1.setBackgroundResource(R.drawable.white_button_background1);
                    p2.setBackgroundResource(R.drawable.white_button_background1);
                    p3.setBackgroundResource(R.drawable.white_button_background1);
                    p4.setEnabled(true);
                    p5.setEnabled(true);
                    p6.setEnabled(true);
                    ph.setEnabled(true);
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    count = 0;
                    count1 = 0;
                }
                break;
            case R.id.imgcard4:
                if (count == 0) {
                    namecard4.setText(R.string.rike);
                    p1.setBackgroundResource(R.drawable.red_button_background1);
                    p2.setBackgroundResource(R.drawable.red_button_background1);
                    p3.setBackgroundResource(R.drawable.red_button_background1);
                    p4.setEnabled(false);
                    p5.setEnabled(false);
                    p6.setEnabled(false);
                    ph.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    count++;
                    count1++;
                    p1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp1 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard4.setImageAlpha(1);
                                        card1p1 = 4;
                                        p1card1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard4.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard4.setImageAlpha(1);
                                        card2p1 = 4;
                                        p1card2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard4.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard4.setImageAlpha(1);
                                        card3p1 = 4;
                                        p1card3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard4.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 1 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                battlefield.show();
                            }
                        }
                    });
                    p2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp2 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard4.setImageAlpha(1);
                                        card1p2 = 4;
                                        p2card1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard4.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard4.setImageAlpha(1);
                                        card2p2 = 4;
                                        p2card2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard4.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard4.setImageAlpha(1);
                                        card3p2 = 4;
                                        p2card3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard4.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 2 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                battlefield.show();
                            }
                        }
                    });
                    p3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp3 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard4.setImageAlpha(1);
                                        card1p3 = 4;
                                        p3card1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard4.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard4.setImageAlpha(1);
                                        card2p3 = 4;
                                        p3card2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard4.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard4.setImageAlpha(1);
                                        card3p3 = 4;
                                        p3card3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard4.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 3 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                battlefield.show();
                            }
                        }
                    });
                } else {
                    namecard4.setText("");
                    p1.setBackgroundResource(R.drawable.white_button_background1);
                    p2.setBackgroundResource(R.drawable.white_button_background1);
                    p3.setBackgroundResource(R.drawable.white_button_background1);
                    p4.setEnabled(true);
                    p5.setEnabled(true);
                    p6.setEnabled(true);
                    ph.setEnabled(true);
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    count = 0;
                    count1 = 0;
                }
                break;
            case R.id.imgcard5:
                if (count == 0) {
                    namecard5.setText(R.string.kentaru);
                    p1.setBackgroundResource(R.drawable.red_button_background1);
                    p2.setBackgroundResource(R.drawable.red_button_background1);
                    p3.setBackgroundResource(R.drawable.red_button_background1);
                    p4.setEnabled(false);
                    p5.setEnabled(false);
                    p6.setEnabled(false);
                    ph.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    count++;
                    count1++;
                    p1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp1 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard5.setImageAlpha(1);
                                        card1p1 = 5;
                                        p1card1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard5.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard5.setImageAlpha(1);
                                        card2p1 = 5;
                                        p1card2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard5.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard5.setImageAlpha(1);
                                        card3p1 = 5;
                                        p1card3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard5.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 1 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                battlefield.show();
                            }
                        }
                    });
                    p2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp2 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard5.setImageAlpha(1);
                                        card1p2 = 5;
                                        p2card1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard5.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard5.setImageAlpha(1);
                                        card2p2 = 5;
                                        p2card2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard5.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard5.setImageAlpha(1);
                                        card3p2 = 5;
                                        p2card3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard5.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 2 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                battlefield.show();
                            }
                        }
                    });
                    p3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp3 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard5.setImageAlpha(1);
                                        card1p3 = 5;
                                        p3card1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard5.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard5.setImageAlpha(1);
                                        card2p3 = 5;
                                        p3card2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard5.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard5.setImageAlpha(1);
                                        card3p3 = 5;
                                        p3card3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard5.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 3 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                battlefield.show();
                            }
                        }
                    });
                } else {
                    namecard5.setText("");
                    p1.setBackgroundResource(R.drawable.white_button_background1);
                    p2.setBackgroundResource(R.drawable.white_button_background1);
                    p3.setBackgroundResource(R.drawable.white_button_background1);
                    p4.setEnabled(true);
                    p5.setEnabled(true);
                    p6.setEnabled(true);
                    ph.setEnabled(true);
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    count = 0;
                    count1 = 0;
                }
                break;
            case R.id.imgcard6:
                if (count == 0) {
                    namecard6.setText(R.string.hiruko);
                    p1.setBackgroundResource(R.drawable.red_button_background1);
                    p2.setBackgroundResource(R.drawable.red_button_background1);
                    p3.setBackgroundResource(R.drawable.red_button_background1);
                    p4.setEnabled(false);
                    p5.setEnabled(false);
                    p6.setEnabled(false);
                    ph.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    count++;
                    count1++;
                    p1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp1 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard6.setImageAlpha(1);
                                        card1p1 = 6;
                                        p1card1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard6.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard6.setImageAlpha(1);
                                        card2p1 = 6;
                                        p1card2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard6.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard6.setImageAlpha(1);
                                        card3p1 = 6;
                                        p1card3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp1++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                        battlefield.show();
                                        imgcard6.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp1 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 1 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p1]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p1]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p1]);
                                battlefield.show();
                            }
                        }
                    });
                    p2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp2 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard6.setImageAlpha(1);
                                        card1p2 = 6;
                                        p2card1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard6.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard6.setImageAlpha(1);
                                        card2p2 = 6;
                                        p2card2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard6.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard6.setImageAlpha(1);
                                        card3p2 = 6;
                                        p2card3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp2++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                        battlefield.show();
                                        imgcard6.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp2 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 2 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p2]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p2]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p2]);
                                battlefield.show();
                            }
                        }
                    });
                    p3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (countp3 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard6.setImageAlpha(1);
                                        card1p3 = 6;
                                        p3card1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard6.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard6.setImageAlpha(1);
                                        card2p3 = 6;
                                        p3card2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard6.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard6.setImageAlpha(1);
                                        card3p3 = 6;
                                        p3card3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        p1.setBackgroundResource(R.drawable.white_button_background1);
                                        p2.setBackgroundResource(R.drawable.white_button_background1);
                                        p3.setBackgroundResource(R.drawable.white_button_background1);
                                        p4.setEnabled(true);
                                        p5.setEnabled(true);
                                        p6.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        countp3++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                        battlefield.show();
                                        imgcard6.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (countp3 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 3 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p3]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p3]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p3]);
                                battlefield.show();
                            }
                        }
                    });
                } else {
                    namecard6.setText("");
                    p1.setBackgroundResource(R.drawable.white_button_background1);
                    p2.setBackgroundResource(R.drawable.white_button_background1);
                    p3.setBackgroundResource(R.drawable.white_button_background1);
                    p4.setEnabled(true);
                    p5.setEnabled(true);
                    p6.setEnabled(true);
                    ph.setEnabled(true);
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    count = 0;
                    count1 = 0;
                }
                break;
            case R.id.imgcard7:
                if (count == 0) {
                    namecard7.setText(R.string.keiko);
                    p4.setBackgroundResource(R.drawable.red_button_background1);
                    p5.setBackgroundResource(R.drawable.red_button_background1);
                    p6.setBackgroundResource(R.drawable.red_button_background1);
                    p1.setEnabled(false);
                    p2.setEnabled(false);
                    p3.setEnabled(false);
                    ph.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    count++;
                    count1++;
                    p4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p4 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard7.setImageAlpha(1);
                                        card4p4 = 1;
                                        p4card4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard7.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard7.setImageAlpha(1);
                                        card5p4 = 1;
                                        p4card5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard7.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard7.setImageAlpha(1);
                                        card6p4 = 1;
                                        p4card6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard7.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 4 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                battlefield.show();
                            }
                        }
                    });
                    p5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p5 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard7.setImageAlpha(1);
                                        card4p5 = 1;
                                        p5card4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard7.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard7.setImageAlpha(1);
                                        card5p5 = 1;
                                        p5card5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard7.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard7.setImageAlpha(1);
                                        card6p5 = 1;
                                        p5card6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard7.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 5 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                battlefield.show();
                            }
                        }
                    });
                    p6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p6 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard7.setImageAlpha(1);
                                        card4p6 = 1;
                                        p6card4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard7.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard7.setImageAlpha(1);
                                        card5p6 = 1;
                                        p6card5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard7.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard7.setImageAlpha(1);
                                        card6p6 = 1;
                                        p6card6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard7.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 6 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                battlefield.show();
                            }
                        }
                    });
                } else {
                    namecard7.setText("");
                    p4.setBackgroundResource(R.drawable.white_button_background1);
                    p5.setBackgroundResource(R.drawable.white_button_background1);
                    p6.setBackgroundResource(R.drawable.white_button_background1);
                    p1.setEnabled(true);
                    p2.setEnabled(true);
                    p3.setEnabled(true);
                    ph.setEnabled(true);
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    count = 0;
                    count1 = 0;
                }
                break;
            case R.id.imgcard8:
                if (count == 0) {
                    namecard8.setText(R.string.akito);
                    p4.setBackgroundResource(R.drawable.red_button_background1);
                    p5.setBackgroundResource(R.drawable.red_button_background1);
                    p6.setBackgroundResource(R.drawable.red_button_background1);
                    p1.setEnabled(false);
                    p2.setEnabled(false);
                    p3.setEnabled(false);
                    ph.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    count++;
                    count1++;
                    p4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p4 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard8.setImageAlpha(1);
                                        card4p4 = 2;
                                        p4card4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard8.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard8.setImageAlpha(1);
                                        card5p4 = 2;
                                        p4card5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard8.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard8.setImageAlpha(1);
                                        card6p4 = 2;
                                        p4card6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard8.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 4 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                battlefield.show();
                            }
                        }
                    });
                    p5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p5 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard8.setImageAlpha(1);
                                        card4p5 = 2;
                                        p5card4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard8.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard8.setImageAlpha(1);
                                        card5p5 = 2;
                                        p5card5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard8.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard8.setImageAlpha(1);
                                        card6p5 = 2;
                                        p5card6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard8.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 5 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                battlefield.show();
                            }
                        }
                    });
                    p6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p6 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard8.setImageAlpha(1);
                                        card4p6 = 2;
                                        p6card4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard8.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard8.setImageAlpha(1);
                                        card5p6 = 2;
                                        p6card5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard8.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard8.setImageAlpha(1);
                                        card6p6 = 2;
                                        p6card6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard8.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 6 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                battlefield.show();
                            }
                        }
                    });
                } else {
                    namecard8.setText("");
                    p4.setBackgroundResource(R.drawable.white_button_background1);
                    p5.setBackgroundResource(R.drawable.white_button_background1);
                    p6.setBackgroundResource(R.drawable.white_button_background1);
                    p1.setEnabled(true);
                    p2.setEnabled(true);
                    p3.setEnabled(true);
                    ph.setEnabled(true);
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    count = 0;
                    count1 = 0;
                }
                break;
            case R.id.imgcard9:
                if (count == 0) {
                    namecard9.setText(R.string.ryu);
                    p4.setBackgroundResource(R.drawable.red_button_background1);
                    p5.setBackgroundResource(R.drawable.red_button_background1);
                    p6.setBackgroundResource(R.drawable.red_button_background1);
                    p1.setEnabled(false);
                    p2.setEnabled(false);
                    p3.setEnabled(false);
                    ph.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    count++;
                    count1++;
                    p4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p4 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard9.setImageAlpha(1);
                                        card4p4 = 3;
                                        p4card4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard9.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard9.setImageAlpha(1);
                                        card5p4 = 3;
                                        p4card5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard9.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard9.setImageAlpha(1);
                                        card6p4 = 3;
                                        p4card6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard9.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 4 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                battlefield.show();
                            }
                        }
                    });
                    p5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p5 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard9.setImageAlpha(1);
                                        card4p5 = 3;
                                        p5card4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard9.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard9.setImageAlpha(1);
                                        card5p5 = 3;
                                        p5card5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard9.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard9.setImageAlpha(1);
                                        card6p5 = 3;
                                        p5card6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard9.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 5 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                battlefield.show();
                            }
                        }
                    });
                    p6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p6 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard9.setImageAlpha(1);
                                        card4p6 = 3;
                                        p6card4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard9.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard9.setImageAlpha(1);
                                        card5p6 = 3;
                                        p6card5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard9.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard9.setImageAlpha(1);
                                        card6p6 = 3;
                                        p6card6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard9.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 6 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                battlefield.show();
                            }
                        }
                    });
                } else {
                    namecard9.setText("");
                    p4.setBackgroundResource(R.drawable.white_button_background1);
                    p5.setBackgroundResource(R.drawable.white_button_background1);
                    p6.setBackgroundResource(R.drawable.white_button_background1);
                    p1.setEnabled(true);
                    p2.setEnabled(true);
                    p3.setEnabled(true);
                    ph.setEnabled(true);
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    count = 0;
                    count1 = 0;
                }
                break;
            case R.id.imgcard10:
                if (count == 0) {
                    namecard10.setText(R.string.kitsu);
                    p4.setBackgroundResource(R.drawable.red_button_background1);
                    p5.setBackgroundResource(R.drawable.red_button_background1);
                    p6.setBackgroundResource(R.drawable.red_button_background1);
                    p1.setEnabled(false);
                    p2.setEnabled(false);
                    p3.setEnabled(false);
                    ph.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    count++;
                    count1++;
                    p4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p4 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard10.setImageAlpha(1);
                                        card4p4 = 4;
                                        p4card4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard10.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard10.setImageAlpha(1);
                                        card5p4 = 4;
                                        p4card5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard10.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard10.setImageAlpha(1);
                                        card6p4 = 4;
                                        p4card6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard10.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 4 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                battlefield.show();
                            }
                        }
                    });
                    p5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p5 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard10.setImageAlpha(1);
                                        card4p5 = 4;
                                        p5card4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard10.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard10.setImageAlpha(1);
                                        card5p5 = 4;
                                        p5card5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard10.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard10.setImageAlpha(1);
                                        card6p5 = 4;
                                        p5card6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard10.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 5 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                battlefield.show();
                            }
                        }
                    });
                    p6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p6 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard10.setImageAlpha(1);
                                        card4p6 = 4;
                                        p6card4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard10.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard10.setImageAlpha(1);
                                        card5p6 = 4;
                                        p6card5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard10.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard10.setImageAlpha(1);
                                        card6p6 = 4;
                                        p6card6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard10.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 6 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                battlefield.show();
                            }
                        }
                    });
                } else {
                    namecard10.setText("");
                    p4.setBackgroundResource(R.drawable.white_button_background1);
                    p5.setBackgroundResource(R.drawable.white_button_background1);
                    p6.setBackgroundResource(R.drawable.white_button_background1);
                    p1.setEnabled(true);
                    p2.setEnabled(true);
                    p3.setEnabled(true);
                    ph.setEnabled(true);
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    count = 0;
                    count1 = 0;
                }
                break;
            case R.id.imgcard11:
                if (count == 0) {
                    namecard11.setText(R.string.benkei);
                    p4.setBackgroundResource(R.drawable.red_button_background1);
                    p5.setBackgroundResource(R.drawable.red_button_background1);
                    p6.setBackgroundResource(R.drawable.red_button_background1);
                    p1.setEnabled(false);
                    p2.setEnabled(false);
                    p3.setEnabled(false);
                    ph.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    count++;
                    count1++;
                    p4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p4 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard11.setImageAlpha(1);
                                        card4p4 = 5;
                                        p4card4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard11.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard11.setImageAlpha(1);
                                        card5p4 = 5;
                                        p4card5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard11.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard11.setImageAlpha(1);
                                        card6p4 = 5;
                                        p4card6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard11.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 4 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                battlefield.show();
                            }
                        }
                    });
                    p5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p5 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard11.setImageAlpha(1);
                                        card4p5 = 5;
                                        p5card4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard11.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard11.setImageAlpha(1);
                                        card5p5 = 5;
                                        p5card5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard11.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard11.setImageAlpha(1);
                                        card6p5 = 5;
                                        p5card6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard11.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 5 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                battlefield.show();
                            }
                        }
                    });
                    p6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p6 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard11.setImageAlpha(1);
                                        card4p6 = 5;
                                        p6card4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard11.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard11.setImageAlpha(1);
                                        card5p6 = 5;
                                        p6card5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard11.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard11.setImageAlpha(1);
                                        card6p6 = 5;
                                        p6card6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard11.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 6 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                battlefield.show();
                            }
                        }
                    });
                } else {
                    namecard11.setText("");
                    p4.setBackgroundResource(R.drawable.white_button_background1);
                    p5.setBackgroundResource(R.drawable.white_button_background1);
                    p6.setBackgroundResource(R.drawable.white_button_background1);
                    p1.setEnabled(true);
                    p2.setEnabled(true);
                    p3.setEnabled(true);
                    ph.setEnabled(true);
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    count = 0;
                    count1 = 0;
                }
                break;
            case R.id.imgcard12:
                if (count == 0) {
                    namecard12.setText(R.string.teeru);
                    p4.setBackgroundResource(R.drawable.red_button_background1);
                    p5.setBackgroundResource(R.drawable.red_button_background1);
                    p6.setBackgroundResource(R.drawable.red_button_background1);
                    p1.setEnabled(false);
                    p2.setEnabled(false);
                    p3.setEnabled(false);
                    ph.setEnabled(false);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    count++;
                    count1++;
                    p4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p4 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard12.setImageAlpha(1);
                                        card4p4 = 6;
                                        p4card4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard12.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard12.setImageAlpha(1);
                                        card5p4 = 6;
                                        p4card5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard12.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard12.setImageAlpha(1);
                                        card6p4 = 6;
                                        p4card6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p4++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                        battlefield.show();
                                        imgcard12.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p4 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 4 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p4]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p4]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p4]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p4]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p4]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p4]);
                                battlefield.show();
                            }
                        }
                    });
                    p5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p5 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard12.setImageAlpha(1);
                                        card4p5 = 6;
                                        p5card4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard12.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard12.setImageAlpha(1);
                                        card5p5 = 6;
                                        p5card5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard12.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard12.setImageAlpha(1);
                                        card6p5 = 6;
                                        p5card6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p5++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                        battlefield.show();
                                        imgcard12.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p5 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 5 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p5]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p5]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p5]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p5]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p5]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p5]);
                                battlefield.show();
                            }
                        }
                    });
                    p6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (count1p6 == 0 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard12.setImageAlpha(1);
                                        card4p6 = 6;
                                        p6card4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard12.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 1 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard12.setImageAlpha(1);
                                        card5p6 = 6;
                                        p6card5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard12.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 2 & count1 == 1) {
                                yes_no = new Dialog(PlayingField1.this);
                                yes_no.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                yes_no.setContentView(R.layout.yes_no_dialog);
                                yes_no.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                yes_no.setCancelable(false);
                                Button no = yes_no.findViewById(R.id.no);
                                Button yes = yes_no.findViewById(R.id.yes);
                                no.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                    }
                                });
                                yes.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        yes_no.dismiss();
                                        imgcard12.setImageAlpha(1);
                                        card6p6 = 6;
                                        p6card6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        p4.setBackgroundResource(R.drawable.white_button_background1);
                                        p5.setBackgroundResource(R.drawable.white_button_background1);
                                        p6.setBackgroundResource(R.drawable.white_button_background1);
                                        p1.setEnabled(true);
                                        p2.setEnabled(true);
                                        p3.setEnabled(true);
                                        ph.setEnabled(true);
                                        b1.setEnabled(true);
                                        b2.setEnabled(true);
                                        count1p6++;
                                        count = 0;
                                        count1 = 0;
                                        battlefield = new Dialog(PlayingField1.this);
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
                                        ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                        ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                        ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                        ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                        ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                        ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                        battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                        battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                        battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                        battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                        battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                        battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                        battlefield.show();
                                        imgcard12.setClickable(false);
                                    }
                                });
                                yes_no.show();
                            } else if (count1p6 == 3 & count1 == 1) {
                                Toast.makeText(getBaseContext(), "Перевал 6 заполнен!", Toast.LENGTH_LONG).show();
                            } else {
                                battlefield = new Dialog(PlayingField1.this);
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
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                ImageView battlecard4 = battlefield.findViewById(R.id.battlecard4);
                                ImageView battlecard5 = battlefield.findViewById(R.id.battlecard5);
                                ImageView battlecard6 = battlefield.findViewById(R.id.battlecard6);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p6]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p6]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p6]);
                                battlecard4.setImageResource(cardInfo.ivacards1[card4p6]);
                                battlecard5.setImageResource(cardInfo.ivacards1[card5p6]);
                                battlecard6.setImageResource(cardInfo.ivacards1[card6p6]);
                                battlefield.show();
                            }
                        }
                    });
                } else {
                    namecard12.setText("");
                    p4.setBackgroundResource(R.drawable.white_button_background1);
                    p5.setBackgroundResource(R.drawable.white_button_background1);
                    p6.setBackgroundResource(R.drawable.white_button_background1);
                    p1.setEnabled(true);
                    p2.setEnabled(true);
                    p3.setEnabled(true);
                    ph.setEnabled(true);
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    count = 0;
                    count1 = 0;
                }
                break;
        }
    switch (v.getId()) {
            case R.id.p1:
            case R.id.p2:
            case R.id.p3:
            case R.id.p4:
            case R.id.p5:
            case R.id.p6:
            case R.id.b1:
            case R.id.b2:
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
            case R.id.namecard1:
            case R.id.namecard2:
            case R.id.namecard3:
            case R.id.namecard4:
            case R.id.namecard5:
            case R.id.namecard6:
            case R.id.imgcard7:
            case R.id.imgcard8:
            case R.id.imgcard9:
            case R.id.imgcard10:
            case R.id.imgcard11:
            case R.id.imgcard12:
            case R.id.namecard7:
            case R.id.namecard8:
            case R.id.namecard9:
            case R.id.namecard10:
            case R.id.namecard11:
            case R.id.namecard12:
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
