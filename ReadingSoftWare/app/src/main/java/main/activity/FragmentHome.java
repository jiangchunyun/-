package main.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.readingsoftware.R;

/**
 * Created by 上官刀刀 on 2018/8/15.
 */

public class FragmentHome extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewGoodWord=inflater.inflate(R.layout.fragment_home,container,false);
        return viewGoodWord;
    }
}
