package com.example.jams.proyecto4;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class llamadaymensaje extends AppCompatActivity implements View.OnClickListener {
    public EditText pan;
    public Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamadaymensaje);
        pan = (EditText) findViewById(R.id.editText2);
        bt1 = (Button) findViewById(R.id.btn1);
        bt2 = (Button) findViewById(R.id.btn2);
        bt3 = (Button) findViewById(R.id.btn3);
        bt4 = (Button) findViewById(R.id.btn4);
        bt5 = (Button) findViewById(R.id.btn5);
        bt6 = (Button) findViewById(R.id.btn6);
        bt7 = (Button) findViewById(R.id.btn7);
        bt8 = (Button) findViewById(R.id.btn8);
        bt9 = (Button) findViewById(R.id.btn9);
        bt10 = (Button) findViewById(R.id.btn10);
        bt11 = (Button) findViewById(R.id.btn11);
        bt12 = (Button) findViewById(R.id.btnll);
        bt13 = (Button) findViewById(R.id.btnll2);
        bt14 = (Button) findViewById(R.id.btnC);
        bt15 = (Button) findViewById(R.id.mss);
        bt16 = (Button) findViewById(R.id.cont);
        bt17 = (Button) findViewById(R.id.btn0);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt10.setOnClickListener(this);
        bt11.setOnClickListener(this);
        bt12.setOnClickListener(this);
        bt13.setOnClickListener(this);
        bt14.setOnClickListener(this);
        bt15.setOnClickListener(this);
        bt16.setOnClickListener(this);
        bt17.setOnClickListener(this);
        bt1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Uri uri = Uri.parse("tel:*855");
                Intent it =
                        new Intent(Intent.ACTION_CALL, uri);
                if (ActivityCompat.checkSelfPermission(llamadaymensaje.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return true;
                }
                startActivity(it);

                return true;
            }
        });
        bt17.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btn02();
                return true;
            }
        });
    }

    public void btn1() {
        String cap = pan.getText().toString();
        cap = cap + "1";
        pan.setText(cap);
    }

    public void btn2() {
        String cap = pan.getText().toString();
        cap = cap + "2";
        pan.setText(cap);
    }

    public void btn3() {
        String cap = pan.getText().toString();
        cap = cap + "3";
        pan.setText(cap);
    }

    public void btn4() {
        String cap = pan.getText().toString();
        cap = cap + "4";
        pan.setText(cap);
    }

    public void btn5() {
        String cap = pan.getText().toString();
        cap = cap + "5";
        pan.setText(cap);
    }

    public void btn6() {
        String cap = pan.getText().toString();
        cap = cap + "6";
        pan.setText(cap);
    }

    public void btn7() {
        String cap = pan.getText().toString();
        cap = cap + "7";
        pan.setText(cap);
    }

    public void btn8() {
        String cap = pan.getText().toString();
        cap = cap + "8";
        pan.setText(cap);
    }

    public void btn9() {
        String cap = pan.getText().toString();
        cap = cap + "9";
        pan.setText(cap);
    }

    public void btnas() {
        String cap = pan.getText().toString();
        cap = cap + "*";
        pan.setText(cap);
    }

    public void btnnume() {
        String cap = pan.getText().toString();
        cap = cap + "#";
        pan.setText(cap);
    }

    public void btn0() {
        String cap = pan.getText().toString();
        cap = cap + "0";
        pan.setText(cap);
    }

    public void btn02() {
        String cap = pan.getText().toString();
        cap = cap + "+";
        pan.setText(cap);
    }

    public void borrar() {
        if (!pan.getText().toString().equals("")) {
            pan.setText(pan.getText().subSequence(0, pan.getText().length() - 1) + "");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                btn1();
                break;
            case R.id.btn2:
                btn2();
                break;
            case R.id.btn3:
                btn3();
                break;
            case R.id.btn4:
                btn4();
                break;
            case R.id.btn5:
                btn5();
                break;
            case R.id.btn6:
                btn6();
                break;
            case R.id.btn7:
                btn7();
                break;
            case R.id.btn8:
                btn8();
                break;
            case R.id.btn9:
                btn9();
                break;
            case R.id.btn10:
                btnas();
                break;
            case R.id.btn0:
                btn0();
                break;
            case R.id.btn11:
                btnnume();
                break;
            case R.id.btnll:
                String phoneNo = pan.getText().toString();
                if (!TextUtils.isEmpty(phoneNo)) {
                    String dial = "tel:" + phoneNo;
                    if (ActivityCompat.checkSelfPermission(llamadaymensaje.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }else {
                    Toast.makeText(llamadaymensaje.this, "Ingrese numero", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnll2:
                String phoneNo2 = pan.getText().toString();
                if(!TextUtils.isEmpty(phoneNo2)) {
                    String dial = "tel:" + phoneNo2;
                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                }else {
                    Toast.makeText(llamadaymensaje.this, "ingrese numero", Toast.LENGTH_SHORT).show();
                }
            case R.id.btnC:
                borrar();
                break;
            case R.id.mss:
                String phoneNo3 = pan.getText().toString();
                if(!TextUtils.isEmpty(phoneNo3)) {
                    Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + phoneNo3));
                    startActivity(smsIntent);
                }
                break;
            case R.id.cont:
                Toast.makeText(llamadaymensaje.this, "nose como hacerlo", Toast.LENGTH_SHORT).show();
                break;
        }

    }


}
