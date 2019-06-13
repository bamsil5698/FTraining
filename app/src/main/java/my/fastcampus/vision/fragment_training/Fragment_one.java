package my.fastcampus.vision.fragment_training;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static my.fastcampus.vision.fragment_training.MainActivity.Bundle_key;

public class Fragment_one extends Fragment {
    private View view;
    private TextView textView;
    int number;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment1, container,false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
         number = getArguments().getInt(Bundle_key);
//        Log.d("test_bundle","number:"+number);
        String str = String.valueOf(number);
        textView = view.findViewById(R.id.data_text);
        textView.setText(str);
    }
}
