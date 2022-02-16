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

public class CartActivity extends AppCompatActivity {

    TextView plus;
    TextView minus;
    TextView cartCount;
    Button cartBtn;
    TextView total_fee;
    TextView cartName;
    String res_name;
    int num;
    int fee;
    int origin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cart);

        Intent intent = getIntent();

        plus = (TextView) findViewById(R.id.plus);
        minus= (TextView) findViewById(R.id.minus);
        cartBtn = (Button) findViewById(R.id.cart_btn);
        cartCount = (TextView) findViewById(R.id.cart_cont);
        total_fee = (TextView) findViewById(R.id.total_fee);
        num = Integer.parseInt(cartCount.getText().toString());
        fee = Integer.parseInt(total_fee.getText().toString());
        cartName = (TextView) findViewById(R.id.cart_name);
        origin = Integer.parseInt(intent.getStringExtra("menuPrice"));
        cartName.setText(intent.getStringExtra("menuName"));
        total_fee.setText(intent.getStringExtra("menuPrice"));
//        res_name = intent.getStringExtra("resName");

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = num+1;
                fee +=origin;
                cartCount.setText(String.valueOf(num));
                total_fee.setText(String.valueOf(fee));
            }
        });
        
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num<1){

                    AlertDialog.Builder dlg = new AlertDialog.Builder(CartActivity.this);
                    dlg.setMessage("최소수량은 0입니다."); // 메시지
//                버튼 클릭시 동작
                    dlg.setPositiveButton("확인",new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    dlg.show();
                }else{
                    num = num-1;
                    fee -=origin;
                    cartCount.setText(String.valueOf(num));
                    total_fee.setText(String.valueOf(fee));
                }
            }
        });

        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),PaymentActivity.class);
                intent.putExtra("menuName",cartName.getText());
                intent.putExtra("totalFee", total_fee.getText());
                intent.putExtra("cartCount", cartCount.getText());
//                intent.putExtra("resName",intent.getStringExtra("resName"));
                startActivity(intent);
            }
        });



    }
}
