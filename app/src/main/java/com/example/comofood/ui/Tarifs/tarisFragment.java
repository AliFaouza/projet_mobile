package com.example.comofood.ui.Tarifs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.comofood.databinding.FragmentTarifBinding;

public class tarisFragment extends Fragment {

private FragmentTarifBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        tarifsViewModel tarifsViewModel =
                new ViewModelProvider(this).get(tarifsViewModel.class);

    binding = FragmentTarifBinding.inflate(inflater, container, false);
    View root = binding.getRoot();


        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}