package tpl.monitoring.template.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import tpl.monitoring.template.databinding.FragmentScreenSlidePageBinding;

public class ScreenSlidePageFragment extends Fragment {
    private final int _position;

    public ScreenSlidePageFragment(int position) {
        this._position = position;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentScreenSlidePageBinding binding = FragmentScreenSlidePageBinding.inflate(inflater);
        binding.slidePosition.setText(String.valueOf(_position));
        return binding.getRoot();
    }
}
