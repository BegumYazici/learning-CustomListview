package customlistview.begi.com.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by asus1 on 26.10.2017.
 */
public class OzelAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Kisi> mKisiListesi;

    public OzelAdapter(Activity activity, List<Kisi> kisiler) {

        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.mKisiListesi = kisiler;
    }

    @Override
    public int getCount() {
        return mKisiListesi.size();
    }

    @Override
    public Object getItem(int i) {
        return mKisiListesi.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View satirView = mInflater.inflate(R.layout.satir_layout, null);

        TextView textView = (TextView) satirView.findViewById(R.id.tvAdSoyad);
        ImageView imageView = (ImageView) satirView.findViewById(R.id.imgSimge);

        Kisi kisi = mKisiListesi.get(i);

        textView.setText(kisi.getIsim());

        if (kisi.isKadinMi()) {

            imageView.setImageResource(R.drawable.girl);
        } else {

            imageView.setImageResource(R.drawable.boy);
        }
        return satirView;
    }
}
