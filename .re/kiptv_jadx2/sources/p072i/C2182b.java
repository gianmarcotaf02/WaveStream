package p072i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

public final class C2182b implements AdapterView.OnItemClickListener {

    public final f f22599h;

    public final c f22600i;

    public C2182b(c cVar, f fVar) {
        this.f22600i = cVar;
        this.f22599h = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
        c cVar = this.f22600i;
        DialogInterface.OnClickListener onClickListener = cVar.f22610l;
        f fVar = this.f22599h;
        onClickListener.onClick(fVar.f22622b, i3);
        if (cVar.f22612n) {
            return;
        }
        fVar.f22622b.dismiss();
    }
}
