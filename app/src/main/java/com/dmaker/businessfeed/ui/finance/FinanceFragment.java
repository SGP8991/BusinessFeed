package com.dmaker.businessfeed.ui.finance;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.dmaker.businessfeed.MainActivity;
import com.dmaker.businessfeed.R;

public class FinanceFragment extends Fragment {

    private FinanceViewModel financeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        financeViewModel =
                new ViewModelProvider(this).get(FinanceViewModel.class);
        View view = inflater.inflate(R.layout.fragment_finance, container, false);

        return view;
    }
}