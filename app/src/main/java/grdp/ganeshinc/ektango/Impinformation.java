package grdp.ganeshinc.ektango;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import static grdp.ganeshinc.ektango.Epaper.pudhari;
import static grdp.ganeshinc.ektango.Epaper.punyanagari;

public class Impinformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impinformation);


        CardView c = (CardView) findViewById(R.id.satbara);
        CardView c1 = findViewById(R.id.voterid);
        CardView c2 = findViewById(R.id.Aadhar);
        CardView c3 = findViewById(R.id.grampanchayat);
        CardView c4 = findViewById(R.id.rto);
        CardView c5 = findViewById(R.id.mahaonline);


        c.setOnClickListener(new View.OnClickListener() {

                                 @Override
                                 public void onClick(View v) {

                                     Intent i = sakal(Impinformation.this);
                                     startActivity(i);


                                 }


                             }


        );

        c1.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = lokmat(Impinformation.this);
                                      startActivity(intent);


                                  }


                              }
        );

        c2.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = mata(Impinformation.this);
                                      startActivity(intent);


                                  }


                              }
        );


        c3.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = loksatta(Impinformation.this);
                                      startActivity(intent);


                                  }


                              }
        );


        c4.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = pudhari(Impinformation.this);
                                      startActivity(intent);


                                  }


                              }
        );

        c5.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = punyanagari(Impinformation.this);
                                      startActivity(intent);


                                  }


                              }
        );


    }


    public static Intent sakal(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://mahabhulekh.maharashtra.gov.in/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://mahabhulekh.maharashtra.gov.in/"));
        }


    }

    public static Intent lokmat(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://103.23.150.139/marathi/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://103.23.150.139/marathi/"));
        }


    }


    public static Intent mata(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://eaadhaar.uidai.gov.in/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://eaadhaar.uidai.gov.in/"));
        }


    }

    public static Intent loksatta(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.planningonline.gov.in/ReportData.do?ReportMethod=getAnnualPlanReport"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.planningonline.gov.in/ReportData.do?ReportMethod=getAnnualPlanReport"));
        }


    }


    public static Intent pudhari(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://vahan.nic.in/nrservices/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://vahan.nic.in/nrservices/"));
        }


    }

    public static Intent punyanagari(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://mahapariksha.gov.in/OnlinePortal/loginPage"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://mahapariksha.gov.in/OnlinePortal/loginPage"));
        }


    }

}

