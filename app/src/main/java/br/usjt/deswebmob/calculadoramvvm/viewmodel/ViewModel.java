package br.usjt.deswebmob.calculadoramvvm.viewmodel;

public interface ViewModel {
    void onCreate();
    void onStart();
    void onRestart();
    void onPause();
    void onStop();
    void onResume();
    void onDestroy();
}
