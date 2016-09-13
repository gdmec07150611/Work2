package cn.edu.gdmec.s07150611.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Work2","apk onCreate启动,噢，是吗？");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Work2","apk onStart启动,噢，是吗？");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Work2","apk onResume启动,噢，是吗？");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Work2","apk onPause启动,噢，是吗？");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Work2","apk onStop启动,噢，是吗？");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Work2","apk onRestart启动,噢，是吗？");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Work2","apk onDestroy启动，噢，是吗？");
    }
}
