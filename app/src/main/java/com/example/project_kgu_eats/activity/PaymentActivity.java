package com.example.project_kgu_eats.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project_kgu_eats.R;


public class PaymentActivity extends AppCompatActivity {

    Button btn;
    TextView price;
    TextView menuName;
    TextView count;
    TextView resName;
    BottomNavFragment1 frag;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        btn = (Button) findViewById(R.id.paymentBtn);
        Intent intent = getIntent();
        price = (TextView) findViewById(R.id.pay_price);
        price.setText(intent.getStringExtra("totalFee"));
        menuName = (TextView) findViewById(R.id.pay_name);
        menuName.setText(intent.getStringExtra("menuName"));
        count = (TextView) findViewById(R.id.pay_count);
        count.setText(intent.getStringExtra("cartCount")+"개");        ;
        resName = findViewById(R.id.pay_res_name);
//        resName.setText(intent.getStringExtra("resName"));

//        frag = new BottomNavFragment1();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(PaymentActivity.this);
                dlg.setMessage("결제가 완료되었습니다!"); // 메시지
//                버튼 클릭시 동작
                dlg.setPositiveButton("확인",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
//                        getSupportFragmentManager().beginTransaction().replace(R.id.cart_frame,frag).commit();

                        Intent intent1 = new Intent(getApplication(),MainTabActivity.class);
//                        intent1.putExtra("resName",resName.getText().toString());
                        startActivity(intent1);
                    }
                });
                dlg.show();
            }
        });
    }
}
