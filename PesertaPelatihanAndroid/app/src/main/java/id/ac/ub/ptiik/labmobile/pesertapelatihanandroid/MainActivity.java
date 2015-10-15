package id.ac.ub.ptiik.labmobile.pesertapelatihanandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    ArrayList<Peserta> newListPeserta = new ArrayList<Peserta>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newListPeserta.add(
                new Peserta("Peserta 1", "2011", "peserta@gmail.com", getDrawable(R.drawable.user1))
        );

        newListPeserta.add(
                new Peserta("Peserta 2", "2011", "peserta@gmail.com", getDrawable(R.drawable.user2))
        );

        newListPeserta.add(
                new Peserta("Peserta 3", "2011", "peserta@gmail.com", getDrawable(R.drawable.user3))
        );

        newListPeserta.add(
                new Peserta("Peserta 4", "2011", "peserta@gmail.com", getDrawable(R.drawable.user4))
        );

        newListPeserta.add(
                new Peserta("Peserta 5", "2011", "peserta@gmail.com", getDrawable(R.drawable.user1))
        );

        newListPeserta.add(
                new Peserta("Peserta 6", "2011", "peserta@gmail.com", getDrawable(R.drawable.user2))
        );

        newListPeserta.add(
                new Peserta("Peserta 7", "2011", "peserta@gmail.com", getDrawable(R.drawable.user3))
        );

        newListPeserta.add(
                new Peserta("Peserta 8", "2011", "peserta@gmail.com", getDrawable(R.drawable.user4))
        );

        ListView listPeserta = (ListView) findViewById(R.id.listView);

        PesertaAdapter adapter = new PesertaAdapter(this, newListPeserta);
        listPeserta.setAdapter(adapter);

        listPeserta.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(this, newListPeserta.get(position).nama, Toast.LENGTH_SHORT).show();

    }
}
