package net.micode.notes.ui;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import net.micode.notes.R;
import net.micode.notes.data.Notes;

import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class showResultActivity extends AppCompatActivity {

    private static final String TAG = "showResultActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "ok1");
        setContentView(R.layout.activity_show_result);
        Log.e(TAG, "ok2");
        // 获取传递过来的搜索结果
        ListView listView = findViewById(R.id.listView);
        Intent intent = getIntent();
        if(intent != null){
            List<String> searchResult = intent.getStringArrayListExtra("searchResult");
            if(searchResult != null) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, searchResult);
                // 设置Adapter
                listView.setAdapter(adapter);
            }
        }

        Log.e(TAG, "OK3");
    }
}

