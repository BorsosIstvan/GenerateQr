package com.example.generateqrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        /* Arpi kodja. */
        String content = "HC1:NCFOXN%TSMAHN-HBUKN8N2A709SZ%K89245JD 4NPVJ59DX4C8C-RIGWB4TQ NI4EFSYSS%OM6PYE9*FJ UVQC8$.AIGCY0K5$0V+A+6WF5U:IG5-48 2J.C71LP72I+CYII71L:9WK.8NY0S4P 98EQPYE9/MVTZU7LAXPMHQ1*P14W19UESU96IA5B8X64SV8UDP4C5K11N4D.PD*NIGDBN+SYIJGDBGIASJLA8KOHSLOJJPAYGI4OIMEDTJCJKDLEDL9CWZJ$7K+ CREDOC0SF1U:7L/5R3FMIAE-B/EMUANLOS9+5LF9OIFR3HDPG*Z1.NN6ALD-IRTGG1WRT7YZQ H9+W30C0E$BUVPQRHIY1+ H1O1TQ3PTAZ6JL3EV4NNZRB3V67I3MUL-49VVY*K:5C/DRFWP+CV.8LP1P$QM06A9%SZRA PAGJPLFFDC4TA7 :HRPJ5FL-7TL13+4P00F/60/XHC0";
        int screenWidth = getResources().getDisplayMetrics().widthPixels;

        Bitmap qrImage = GenerateQR.generateQR(content, screenWidth);
        if (null != qrImage) {
            imageView.setImageBitmap(qrImage);
        }
    }

    public void onClick(View view) {
        finish();
    }

    public void onClickQr(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("Qr is valid");
    }

    public void onClickAdolf(View view) {
        imageView = findViewById(R.id.imageView);

        /* Adolf kodja */
        String adolf = "HC1:6BFOXN%TSMAHN-H3YS1IK47ES6IXJR4E47X5*T917VF+UOGIS1RYZV:X9:IMJZTCV4*XUA2PSGH.+H$NI4L6HUC%UG/YL WO*Z7ON13:LHNG7H8H%BFP8FG4T 9OKGUXI$NIUZUK*RIMI4UUIMI.J9WVHWVH+ZEOV1AT1HRI2UHD4TR/S09T./08H0AT1EYHEQMIE9WT0K3M9UVZSVV*001HW%8UE9.955B9-NT0 2$$0X4PCY0+-CVYCRMTB*05*9O%0HJP7NVDEBO584DKH78$ZJ*DJWP42W5P0QMO6C8PL353X7H1RU0P48PCA7T5MCH5:ZJ::AKU2UM97H98$QP3R8BH9LV3*O-+DV8QJHHY4I4GWU-LU7T9.V+ T%UNUWUG+M.1KG%VWE94%ALU47$71MFZJU*HFW.6$X50*MSYOJT1MR96/1Z%FV3O-0RW/Q.GMCQS%NE";
        int screenWidth = getResources().getDisplayMetrics().widthPixels;

        Bitmap qrImage = GenerateQR.generateQR(adolf, screenWidth);
        if (null != qrImage) {
            imageView.setImageBitmap(qrImage);
        }
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("Qr for Adolf");
    }

    public void onClickArpi(View view) {
        imageView = findViewById(R.id.imageView);

        /* Arpi kodja. */
        String arpi = "HC1:NCFOXN%TSMAHN-HBUKN8N2A709SZ%K89245JD 4NPVJ59DX4C8C-RIGWB4TQ NI4EFSYSS%OM6PYE9*FJ UVQC8$.AIGCY0K5$0V+A+6WF5U:IG5-48 2J.C71LP72I+CYII71L:9WK.8NY0S4P 98EQPYE9/MVTZU7LAXPMHQ1*P14W19UESU96IA5B8X64SV8UDP4C5K11N4D.PD*NIGDBN+SYIJGDBGIASJLA8KOHSLOJJPAYGI4OIMEDTJCJKDLEDL9CWZJ$7K+ CREDOC0SF1U:7L/5R3FMIAE-B/EMUANLOS9+5LF9OIFR3HDPG*Z1.NN6ALD-IRTGG1WRT7YZQ H9+W30C0E$BUVPQRHIY1+ H1O1TQ3PTAZ6JL3EV4NNZRB3V67I3MUL-49VVY*K:5C/DRFWP+CV.8LP1P$QM06A9%SZRA PAGJPLFFDC4TA7 :HRPJ5FL-7TL13+4P00F/60/XHC0";
        int screenWidth = getResources().getDisplayMetrics().widthPixels;

        Bitmap qrImage = GenerateQR.generateQR(arpi, screenWidth);
        if (null != qrImage) {
            imageView.setImageBitmap(qrImage);
        }
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("Qr for Arpi");
    }
}