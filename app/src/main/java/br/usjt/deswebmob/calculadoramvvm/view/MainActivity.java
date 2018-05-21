package br.usjt.deswebmob.calculadoramvvm.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import br.usjt.deswebmob.calculadoramvvm.databinding.ActivityMainBinding;
import br.usjt.deswebmob.calculadoramvvm.R;
import br.usjt.deswebmob.calculadoramvvm.viewmodel.MainViewModel;

public class MainActivity extends Activity {
    MainViewModel viewModel = new MainViewModel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(viewModel);
        viewModel.onCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();
        viewModel.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        viewModel.onRestart();
    }


    @Override
    protected void onPause() {
        super.onPause();
        viewModel.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        viewModel.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.onDestroy();
    }

}
