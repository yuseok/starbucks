package widget_list.oysu.tistory.com.widgetlist;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MyStep extends AppCompatActivity implements View.OnClickListener{

    DataHolder dataHolder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step);


        findViewById(R.id.btn_search).setOnClickListener(this);


        dataHolder = new DataHolder();



    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btn_search:
                break;
            case R.id.btn_ok:
                break;
            case R.id.btn_delete:
                break;
            case R.id.btn_refresh:
                break;
        }

    }


    Handler workerHandler;
    Handler mainThreadHandler;


    {
        workerHandler = new Handler(){
            
        };
        mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    private static class DataCall extends AsyncTask<Void, Void, Void> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
        }

        @Override
        protected void onCancelled(Void aVoid) {
            super.onCancelled(aVoid);
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
        }

    }

}
