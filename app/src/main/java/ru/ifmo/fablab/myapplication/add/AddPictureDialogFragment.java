package ru.ifmo.fablab.myapplication.add;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.ifmo.fablab.myapplication.databinding.AddPictureDialogBinding;

/**
 * Created by mlebedev on 16/12/2017.
 */

public class AddPictureDialogFragment extends AppCompatDialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AddPictureDialogBinding binding = AddPictureDialogBinding.inflate(inflater,container,false);
        binding.setVm(new AddPictureDialogViewModel());
        return binding.getRoot();
    }
}
