package me.androidbox.travelmate;


import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class OfflineFragment extends Fragment implements MainActivity.AnimateButtonListener {
    private static final String TAG = OfflineFragment.class.getSimpleName();



    public OfflineFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_offline, container, false);
        return view;
    }

    @Override
    public void onAnimateListener() {
        Log.d(TAG, "onAnimateListener");
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
