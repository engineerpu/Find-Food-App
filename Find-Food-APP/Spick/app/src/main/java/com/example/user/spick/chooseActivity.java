package com.example.user.spick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.Random;


public class chooseActivity extends AppCompatActivity {
    private CheckBox checkrice;
    private CheckBox checknoodles;
    private CheckBox checkfire;
    private CheckBox checksoup;
    private CheckBox checksweet;
    private CheckBox checkbun;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        checkrice = (CheckBox) findViewById(R.id.checkrice);
        checknoodles = (CheckBox) findViewById(R.id.checknoodles);
        checkfire = (CheckBox) findViewById(R.id.checkfire);
        checksoup = (CheckBox) findViewById(R.id.checksoup);
        checksweet = (CheckBox) findViewById(R.id.checksweet);
        checkbun = (CheckBox) findViewById(R.id.checkbun);
        Button Okbtn = (Button) findViewById(R.id.OKbtn);
        Okbtn.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                ArrayList<Class> activityList = new ArrayList<>();
                activityList.add(noodles1.class);
                activityList.add(rice4Activity.class);
                activityList.add(rice5.class);
                activityList.add(rice6.class);
                activityList.add(rice7.class);
                activityList.add(rice8.class);
                activityList.add(rice9.class);
                activityList.add(rice10.class);
                activityList.add(noodles1.class);
                activityList.add(noodles2.class);
                activityList.add(noodles3.class);
                activityList.add(noodles4.class);
                activityList.add(hotpot2.class);
                activityList.add(hotpot3.class);
                activityList.add(hotpot1.class);
                activityList.add(bun1.class);
                activityList.add(bun2.class);
                activityList.add(bun3.class);
                    activityList.add(nramdon1.class);
                    activityList.add(nramdon2.class);
                    activityList.add(nramdon3.class);
                    activityList.add(nramdon4.class);
                    activityList.add(nramdon5.class);
                    activityList.add(nramdon6.class);
                    activityList.add(nramdon7.class);
                    activityList.add(nramdon8.class);
                    activityList.add(nramdon9.class);
                    activityList.add(nramdon10.class);
                    activityList.add(nramdon11.class);
                    activityList.add(nramdon12.class);
                    activityList.add(nramdon13.class);
                    activityList.add(nramdon14.class);
                    activityList.add(nramdon15.class);



                Class activity = null;
                    for(int x=0;x<500;x++) {
                        Random generator = new Random();
                        int number = generator.nextInt(33) ;
                        if ((checkrice).isChecked() && (number) == 1) {
                            activity = nramdon1.class;
                            activityList.remove(nramdon1.class);
                            break;
                        } else if ((checkrice).isChecked() && (number) == 2) {
                            activity = nramdon2.class;
                            activityList.remove(nramdon2.class);
                            break;
                        } else if ((checkrice).isChecked() && (number) == 3) {
                            activity = nramdon3.class;
                            activityList.remove(nramdon3.class);
                            break;}
                            else if ((checkrice).isChecked() && (number) == 16) {
                            activity = rice4Activity.class;
                            activityList.remove(rice4Activity.class);
                            break;
                        }else if ((checkrice).isChecked() && (number) == 17) {
                                activity = rice5.class;
                                activityList.remove(rice5.class);
                                break;
                        }else if ((checkrice).isChecked() && (number) == 18) {
                            activity = rice6.class;
                            activityList.remove(rice6.class);
                            break;
                        }else if ((checkrice).isChecked() && (number) == 19) {
                            activity = rice7.class;
                            activityList.remove(rice7.class);
                            break;
                        }else if ((checkrice).isChecked() && (number) == 20) {
                            activity = rice8.class;
                            activityList.remove(rice8.class);
                            break;
                        }else if ((checkrice).isChecked() && (number) == 21) {
                            activity = rice9.class;
                            activityList.remove(rice9.class);
                            break;
                        }else if ((checkrice).isChecked() && (number) == 22) {
                            activity = rice10.class;
                            activityList.remove(rice10.class);
                            break;
                        } else if ((checknoodles).isChecked() && (number) == 4) {
                            activity = nramdon4.class;
                            activityList.remove(nramdon4.class);
                            break;
                        } else if ((checknoodles).isChecked() && (number) == 5) {
                            activity = nramdon5.class;
                            activityList.remove(nramdon5.class);
                            break;
                        } else if ((checknoodles).isChecked() && (number) == 6) {
                            activity = nramdon6.class;
                            activityList.remove(nramdon6.class);
                            break;
                        } else if ((checknoodles).isChecked() && (number) == 7) {
                            activity = nramdon7.class;
                            activityList.remove(nramdon7.class);
                            break;
                        }else if ((checknoodles).isChecked() && (number) ==23) {
                            activity = noodles1.class;
                            activityList.remove(noodles1.class);
                            break;
                        }else if ((checknoodles).isChecked() && (number) ==24) {
                            activity = noodles2.class;
                            activityList.remove(noodles2.class);
                            break;
                        }else if ((checknoodles).isChecked() && (number) ==25) {
                            activity = noodles3.class;
                            activityList.remove(noodles3.class);
                            break;
                        }else if ((checknoodles).isChecked() && (number) ==26) {
                            activity = noodles4.class;
                            activityList.remove(noodles4.class);
                            break;
                        } else if ((checkfire).isChecked() && (number) == 8) {
                            activity = nramdon8.class;
                            activityList.remove(nramdon8.class);
                            break;
                        } else if ((checkfire).isChecked() && (number) == 9) {
                            activity = nramdon9.class;
                            activityList.remove(nramdon9.class);
                            break;
                        } else if ((checkfire).isChecked() && (number) == 27) {
                            activity = hotpot1.class;
                            activityList.remove(hotpot1.class);
                            break;
                        } else if ((checkfire).isChecked() && (number) == 28) {
                            activity = hotpot2.class;
                            activityList.remove(hotpot2.class);
                            break;
                        } else if ((checkfire).isChecked() && (number) == 29) {
                            activity = hotpot3.class;
                            activityList.remove(hotpot3.class);
                            break;
                        } else if ((checksoup).isChecked() && (number) == 10) {
                            activity = nramdon10.class;
                            activityList.remove(nramdon10.class);
                            break;
                        } else if ((checksoup).isChecked() && (number) == 11) {
                            activity = nramdon11.class;
                            activityList.remove(nramdon11.class);
                            break;
                        } else if ((checksweet).isChecked() && (number) == 14) {
                            activity = nramdon14.class;
                            activityList.remove(nramdon14.class);
                            break;
                        } else if ((checksweet).isChecked() && (number) == 15) {
                            activity = nramdon15.class;
                            activityList.remove(nramdon15.class);
                            break;
                        } else if ((checkbun).isChecked() && (number) == 12) {
                            activity = nramdon12.class;
                            activityList.remove(nramdon12.class);
                            break;
                        } else if ((checkbun).isChecked() && (number) == 13) {
                            activity = nramdon13.class;
                            activityList.remove(nramdon13.class);
                            break;
                        }
                        else if ((checkbun).isChecked() && (number) == 30) {
                            activity = bun1.class;
                            activityList.remove(bun1.class);
                            break;
                        }
                        else if ((checkbun).isChecked() && (number) == 31) {
                            activity = bun2.class;
                            activityList.remove(bun2.class);
                            break;
                        }
                        else if ((checkbun).isChecked() && (number) == 32) {
                            activity = bun3.class;
                            activityList.remove(bun3.class);
                            break;
                        }
                        else
                        x=x+1;
                    }

                // We use intents to start activities
                Intent intent = new Intent(getBaseContext(), activity);
                // `intent.putExtra(...)` is used to pass on extra information to the next activity
                intent.putExtra("ACTIVITY_LIST", activityList);
                startActivity(intent);
            }


        });

    }
}