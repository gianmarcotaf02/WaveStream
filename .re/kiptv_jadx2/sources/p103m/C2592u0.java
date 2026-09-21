package p103m;

import android.view.View;
import android.widget.AdapterView;

public final class C2592u0 implements AdapterView.OnItemSelectedListener {

    public final B0 f25140h;

    public C2592u0(B0 b9) {
        this.f25140h = b9;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j) {
        C2581o0 c2581o0;
        if (i3 == -1 || (c2581o0 = this.f25140h.j) == null) {
            return;
        }
        c2581o0.setListSelectionHidden(false);
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
