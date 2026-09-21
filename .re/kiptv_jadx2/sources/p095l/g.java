package p095l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.kiptv.tv.R;
import java.util.ArrayList;

public final class g extends BaseAdapter {

    public int f24623a = -1;

    public final h f24624b;

    public g(h hVar) {
        this.f24624b = hVar;
        a();
    }

    public final void a() {
        l lVar = this.f24624b.j;
        n nVar = lVar.f24655v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((n) arrayList.get(i3)) == nVar) {
                    this.f24623a = i3;
                    return;
                }
            }
        }
        this.f24623a = -1;
    }

    @Override
    public final n getItem(int i3) {
        h hVar = this.f24624b;
        l lVar = hVar.j;
        lVar.i();
        ArrayList arrayList = lVar.j;
        hVar.getClass();
        int i9 = this.f24623a;
        if (i9 >= 0 && i3 >= i9) {
            i3++;
        }
        return (n) arrayList.get(i3);
    }

    @Override
    public final int getCount() {
        h hVar = this.f24624b;
        l lVar = hVar.j;
        lVar.i();
        int size = lVar.j.size();
        hVar.getClass();
        return this.f24623a < 0 ? size : size - 1;
    }

    @Override
    public final long getItemId(int i3) {
        return i3;
    }

    @Override
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f24624b.f24626i.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).b(getItem(i3));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
