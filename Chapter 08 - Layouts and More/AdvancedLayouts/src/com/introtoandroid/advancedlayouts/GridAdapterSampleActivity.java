package com.introtoandroid.advancedlayouts;
import com.androidbook.advancedlayouts.R;
import android.content.CursorLoader;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;
public class GridAdapterSampleActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setTitle("Grid Adapter");
        Cursor contacts = loader.loadInBackground();
        			ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, 
        setContentView(R.layout.scratch_grid);
        int view_id = R.id.scratch_adapter_view;
        GridView av = (GridView) findViewById(view_id);
        av.setAdapter(adapter);
        av.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
                		Toast.makeText(GridAdapterSampleActivity.this, 
            }
        });
    }
}