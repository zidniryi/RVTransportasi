package zidniryi.com.rvtransportasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {

private RecyclerView myRecycle;

String nama[] = {"Bus", "Kapal", "Kereta", "Mobil", "Motor", "Sepeda"};

int gambar[] = {R.drawable.bis, R.drawable.kapal, R.drawable.kereta, R.drawable.mobil, R.drawable.motor, R.drawable.sepeda};

String[] detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Todo mengambil data array dari String
        detail = getResources().getStringArray(R.array.detail_transport);
        myRecycle = findViewById(R.id.my_rv);


        zidniryi.com.rvtransportasi.Adapter adapter = new zidniryi.com.rvtransportasi.Adapter(MainActivity.this, gambar, nama, detail);
        myRecycle.setHasFixedSize(true);
        myRecycle.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        myRecycle.setAdapter(adapter);
    }
}
