package com.example.eurequat_algerie.walidlocalisation;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class choix1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choix1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void remise_libre(View v1) {
/*
        Button annu = (Button) findViewById(R.id.annu);
        annu.setEnabled(false);
        annu.setVisibility(View.INVISIBLE);

        list = (ListView) findViewById(R.id.listview);
        bsupp = (Button) findViewById(R.id.bsupprimer);
        modif = (Button) findViewById(R.id.modifier);
        cbarre = (EditText) findViewById(R.id.barre);
        listmodif.clear();
        qn.setEnabled(false);

        champ_selectionner = cbarre;

        modif.setEnabled(false);
        bsupp.setEnabled(false);
*/

        /*LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = layoutInflater.inflate(R.layout.remise_libre, null);


        final EditText rec = (EditText) popupView.findViewById(R.id.margevaleur);



        final TextView remis = (TextView) popupView.findViewById(R.id.remiseval);
        Typeface tf = Typeface.createFromAsset(getAssets(), "font/ds-digi.ttf");
        //rec.setTypeface(tf);
        //remis.setTypeface(tf);

        final PopupWindow popupWindow = new PopupWindow(popupView, RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

        champ_selectionner = rec;

        // modification du champ
        TextWatcher recLt = new TextWatcher() {
            public void afterTextChanged(Editable s) {

            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // you can check for enter key here
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(rec.getText().toString().trim().length()>0) {
                    int qq = produit_qnt.get(posProduit);
                    double pr = produit_prixTTC.get(posProduit);

                    double primo = (double) qq * pr;
                    double rrm = Double.parseDouble(rec.getText().toString());
                    double rem = primo * rrm / 100;
                    remis.setText(String.format("%.2f",rem));
                }
            }
        };

        rec.addTextChangedListener(recLt);


        Button btnDismiss = (Button) popupView.findViewById(R.id.annuler);
        Button btnFinalise = (Button) popupView.findViewById(R.id.appliqueremise);

        popupWindow.setFocusable(true);
        popupWindow.update();

        btnDismiss.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                popupWindow.dismiss();
                cbarre.setEnabled(true);
                cbarre.requestFocus();
                champ_selectionner = cbarre;
            }
        });


        btnFinalise.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if (rec.getText().toString().trim().length() > 0) {
                    double re = Double.parseDouble(rec.getText().toString());
                    produit_remise.set(posProduit, re);
                    String rp = "Remise: " + re + "%";
                    produit_libelle_re.set(posProduit, rp);


                    int fin = produit_list.size();
                    myList.clear();
                    for (int comp = 0; comp < fin; comp++) {
                        double pri = produit_prixTTC.get(comp);
                        double total = pri * produit_qnt.get(comp);
                        getDataInList(myList, produit_list.get(comp), produit_prixTTC.get(comp), produit_qnt.get(comp), total, produit_remise.get(comp));

                        if (produit_remise.get(comp) != 0.0) {
                            double rv = total * produit_remise.get(comp) / 100;
                            sum2 = sum2 + total - rv;
                        } else {
                            sum2 = sum2 + total;
                        }
                    }
                    sum2 = Math.floor(sum2);
                    final_sum = Math.floor(sum2);

                    list.setAdapter(new MyBaseAdapterEcranVente(context, vide));
                    list.setAdapter(new MyBaseAdapterEcranVente(context, myList));

                    TextView tot = (TextView) findViewById(R.id.ttl);
                    tot.setText(String.format("%.2f", sum2));

                    sum2 = 0.0;
                    bnr.setEnabled(false);
                    bnr2.setEnabled(false);
                    bnrl.setEnabled(false);
                    bnof.setEnabled(false);

                    popupWindow.dismiss();
                    cbarre.setEnabled(true);
                    cbarre.requestFocus();
                    champ_selectionner = cbarre;

                } else {
                    Toast.makeText(context, R.string.err_marge, Toast.LENGTH_LONG).show();
                }
            }
        });


        popupWindow.showAtLocation(v1, 1, 0, 0);
*/
    }
}
