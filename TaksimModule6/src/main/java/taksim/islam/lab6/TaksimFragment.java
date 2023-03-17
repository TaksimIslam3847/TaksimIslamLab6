package taksim.islam.lab6;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import java.io.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

public class TaksimFragment extends Fragment {

    public TaksimFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_taksim, container, false);
        RadioGroup radioGroup =(RadioGroup) view.findViewById(R.id.radio);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.radioButton:
                        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

                        builder.setTitle(getString(R.string.my_name));
                        builder.setMessage(R.string.first_radio);
                        builder.setNegativeButton(R.string.Okay, (DialogInterface.OnClickListener) (dialog, which) -> {
                            dialog.cancel();
                        });
                        builder.setCancelable(false);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        break;
                    case R.id.radioButton2:
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(view.getContext());

                        builder1.setTitle(getString(R.string.my_name));
                        builder1.setMessage(R.string.second_radio);
                        builder1.setNegativeButton(R.string.Okay, (DialogInterface.OnClickListener) (dialog, which) -> {
                            dialog.cancel();
                        });
                        builder1.setCancelable(false);
                        AlertDialog alertDialog1 = builder1.create();
                        alertDialog1.show();
                        break;
                    case R.id.radioButton3:
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(view.getContext());

                        builder2.setTitle(getString(R.string.my_name));
                        builder2.setMessage(R.string.third_radio);
                        builder2.setNegativeButton(R.string.Okay, (DialogInterface.OnClickListener) (dialog, which) -> {
                            dialog.cancel();
                        });
                        builder2.setCancelable(false);
                        AlertDialog alertDialog2 = builder2.create();
                        alertDialog2.show();
                        break;
                }

            }});

        return  view;
    }
}