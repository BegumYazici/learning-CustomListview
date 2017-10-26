package customlistview.begi.com.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<Kisi> kisiler = new ArrayList<Kisi>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kisiler.add(new Kisi("Ali Yılmaz", false));
        kisiler.add(new Kisi("Ayşe Sever", true));
        kisiler.add(new Kisi("Begüm Yazıcı", true));
        kisiler.add(new Kisi("Ecem Altınmeşe", false));
        kisiler.add(new Kisi("Melek Ataer", true));
        kisiler.add(new Kisi("Selim Serdilli", false));
        kisiler.add(new Kisi("Halil İbrahim", false));

        final ListView listemiz = (ListView) findViewById(R.id.liste);
        OzelAdapter adaptorumuz=new OzelAdapter(this, kisiler);
        listemiz.setAdapter(adaptorumuz);
    }
}
