package com.example.comofood.ui.contact;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.comofood.databinding.ContactFragmentBinding;


public class contactFragment extends Fragment {

    private @NonNull ContactFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding =  ContactFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

}