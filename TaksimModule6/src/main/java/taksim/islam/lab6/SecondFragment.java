package taksim.islam.lab6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import java.io.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

public class SecondFragment extends Fragment {
    ImageButton btnimg;
    ProgressBar progressBar;
    int counter=0;
    public SecondFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        btnimg = view.findViewById(R.id.imageButton);
        progressBar = view.findViewById(R.id.progressBar);
        btnimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int z = (counter+1);
                if (counter == 0){
                    Toast.makeText(getContext(),getString(R.string.my_name)+z,Toast.LENGTH_SHORT).show();
                    counter++;
                }
                else if (counter == 1){
                    Toast.makeText(getContext(),getString(R.string.my_name)+z,Toast.LENGTH_SHORT).show();
                    counter++;
                }else if (counter == 2){
                    Toast.makeText(getContext(),getString(R.string.my_name)+z,Toast.LENGTH_SHORT).show();
                    counter++;
                }
                else if (counter == 3){
                    Toast.makeText(getContext(),getString(R.string.my_name)+z,Toast.LENGTH_SHORT).show();
                    counter++;
                }
                else if (counter == 4){
                    counter++;
                    Toast.makeText(getContext(),getString(R.string.my_name)+z,Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.INVISIBLE);

                } else if (counter == 5) {
                    Toast.makeText(getContext(),getString(R.string.my_name)+z,Toast.LENGTH_SHORT).show();
                    counter++;
                } else if (counter == 6) {
                    Toast.makeText(getContext(),getString(R.string.my_name)+z,Toast.LENGTH_SHORT).show();
                    counter++;
                } else if (counter ==7) {
                    Toast.makeText(getContext(),getString(R.string.my_name)+z,Toast.LENGTH_SHORT).show();
                    System.exit(0);
                }
            }
        });
        return view;
    }
}