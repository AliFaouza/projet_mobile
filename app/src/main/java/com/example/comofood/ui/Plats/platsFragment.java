package com.example.comofood.ui.Plats;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.comofood.R;
import com.example.comofood.databinding.FragmentPlatsBinding;

import java.util.ArrayList;

public class platsFragment extends Fragment {

private FragmentPlatsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
         platsViewModel homeViewModel =
                new ViewModelProvider(this).get(platsViewModel.class);

    binding = FragmentPlatsBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        return root;
    }
    RecyclerView recyclerView;
    ArrayList<MainModel> mainModels;
    MainAdapter mainAdapter;
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView();

        recyclerView= recyclerView.findViewById(R.id.recycleView);
        Integer[] menu={R.drawable.couscouma, R.drawable.foutra, R.drawable.pizza,R.drawable.dessert};

        String[] nomplats={"Couscouma","Foutra","Pizza","Dessert"};

        mainModels=new ArrayList<>();

        for (int i=0;i<menu.length;i++){
            MainModel model=new MainModel(menu[i], nomplats[i]);
            mainModels.add(model);
        }
        LinearLayoutManager layoutManager=new LinearLayoutManager(
              platsFragment.this,LinearLayoutManager.HORIZONTAL,false
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void setContentView() {
    }
}