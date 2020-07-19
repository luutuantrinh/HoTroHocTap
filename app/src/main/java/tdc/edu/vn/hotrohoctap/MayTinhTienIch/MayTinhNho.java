package tdc.edu.vn.hotrohoctap.MayTinhTienIch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import tdc.edu.vn.hotrohoctap.R;

public class MayTinhNho extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnx1,btnqua,btntoi,btnxoa1,btnxoahet;
Button btnxwx,btnxxx,btnxcanx,btnfact,btnmc;
Button btnngoac1,btnngoac2,btnmcong,btnmtru,btnmro;
EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.may_tinh_nho_activity);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnx1 = findViewById(R.id.btn6);
        btnqua = findViewById(R.id.btn7);
        btntoi = findViewById(R.id.btn8);
        btnxoa1 = findViewById(R.id.btn9);
        btnxoahet = findViewById(R.id.btn0);
        btnxwx = findViewById(R.id.btnxwx);
        btnxxx = findViewById(R.id.btnxxx);
        btnxcanx = findViewById(R.id.btnxcanx);
        btnfact = findViewById(R.id.btnfact);
        btnmc = findViewById(R.id.btnmc);
        btnngoac1 = findViewById(R.id.btnngoac1);
        btnngoac2 = findViewById(R.id.btnngoac2);
        btnmcong = findViewById(R.id.btnmcong);
        btnmtru = findViewById(R.id.btnmtru);
        btnmro = findViewById(R.id.btnmro);
    }
}