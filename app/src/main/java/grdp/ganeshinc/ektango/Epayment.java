package grdp.ganeshinc.ektango;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Epayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epayment);


        CardView c = (CardView) findViewById(R.id.dth);
        CardView c1 = findViewById(R.id.electricity);
        CardView c2 = findViewById(R.id.prepaid);
        CardView c3 = findViewById(R.id.postpaid);
        CardView c4 = findViewById(R.id.phonepe);
        CardView c5 = findViewById(R.id.tez);



        c.setOnClickListener(new View.OnClickListener() {

                                 @Override
                                 public void onClick(View v) {

                                     Intent i = sakal(Epayment.this);
                                     startActivity(i);


                                 }


                             }


        );

        c1.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = lokmat(Epayment.this);
                                      startActivity(intent);


                                  }


                              }
        );

        c2.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = mata(Epayment.this);
                                      startActivity(intent);


                                  }


                              }
        );


        c3.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = loksatta(Epayment.this);
                                      startActivity(intent);


                                  }


                              }
        );


        c4.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = phonepe(Epayment.this);
                                      startActivity(intent);


                                  }


                              }
        );


        c5.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = tez(Epayment.this);
                                      startActivity(intent);


                                  }


                              }
        );




    }


    public static Intent sakal(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.phonepe.app", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://phon.pe/ru_gane5fai4"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://paytm.com/dth-recharge"));
        }


    }

    public static Intent lokmat(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.phonepe.app", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://phon.pe/ru_gane5fai4"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://paytm.com/electricity-bill-payment"));
        }


    }


    public static Intent mata(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.phonepe.app", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://phon.pe/ru_gane5fai4"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://paytm.com/recharge"));
        }


    }

    public static Intent loksatta(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.phonepe.app", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://phon.pe/ru_gane5fai4"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://paytm.com/recharge"));
        }


    }



    public static Intent phonepe(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.phonepe.app", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://phon.pe/ru_gane5fai4"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://phon.pe/ru_gane5fai4"));
        }


    }

    public static Intent tez(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.google.android.apps.nbu.paisa.user", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://g.co/tez/WT8UX"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://g.co/tez/WT8UX"));
        }


    }

}
