package com.example.comofood.ui.facture;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.comofood.databinding.FactureFragmentBinding;

public class factureFragment extends Fragment {

    private @NonNull FactureFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding =  FactureFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }


}