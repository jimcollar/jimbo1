package net.eqware.jimbo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "extra_msg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity:","onCreate");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity:","onRestart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity:","onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity:","onPause");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity:","onStart");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity:","onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();;
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
