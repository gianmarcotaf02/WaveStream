package p103m;

import android.view.View;
import android.widget.AdapterView;

public final class J implements AdapterView.OnItemClickListener {

    public final L f24927h;

    public J(L l2) {
        this.f24927h = l2;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
        L l2 = this.f24927h;
        l2.f24941M.setSelection(i3);
        O o8 = l2.f24941M;
        if (o8.getOnItemClickListener() != null) {
            o8.performItemClick(view, i3, l2.f24938J.getItemId(i3));
        }
        l2.dismiss();
    }
}
