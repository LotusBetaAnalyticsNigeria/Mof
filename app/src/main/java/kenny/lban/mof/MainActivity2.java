package kenny.lban.mof;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton btnNewClient = (ImageButton) findViewById(R.id.newClientBtn);
        btnNewClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NewClientActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnPayment = (ImageButton) findViewById(R.id.paymentBtn);
        btnPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PaymentActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnBalance = (ImageButton) findViewById(R.id.balanceBtn);
        btnBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BalanceActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnTransaction = (ImageButton) findViewById(R.id.transactionBtn);
        btnTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TransactionActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnLoan = (ImageButton) findViewById(R.id.loanBtn);
        btnLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoanActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnTopUp = (ImageButton) findViewById(R.id.toUpBtn);
        btnTopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TopUpActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnEnquiry = (ImageButton) findViewById(R.id.enquiryBtn);
        btnEnquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EnquiryActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnPassword = (ImageButton) findViewById(R.id.passwordBtn);
        btnPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}
