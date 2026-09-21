package p095l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p072i.c;
import p072i.g;

public final class h implements x, AdapterView.OnItemClickListener {

    public Context f24625h;

    public LayoutInflater f24626i;
    public l j;

    public ExpandedMenuView f24627k;

    public w f24628l;

    public g f24629m;

    public h(Context context) {
        this.f24625h = context;
        this.f24626i = LayoutInflater.from(context);
    }

    @Override
    public final boolean b(n nVar) {
        return false;
    }

    @Override
    public final void c(l lVar, boolean z6) {
        w wVar = this.f24628l;
        if (wVar != null) {
            wVar.c(lVar, z6);
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void f() {
        g gVar = this.f24629m;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void g(w wVar) {
        throw null;
    }

    @Override
    public final void i(Context context, l lVar) {
        if (this.f24625h != null) {
            this.f24625h = context;
            if (this.f24626i == null) {
                this.f24626i = LayoutInflater.from(context);
            }
        }
        this.j = lVar;
        g gVar = this.f24629m;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(D d4) {
        if (!d4.hasVisibleItems()) {
            return false;
        }
        m mVar = new m();
        mVar.f24658h = d4;
        Context context = d4.f24636a;
        g gVar = new g(context);
        h hVar = new h(gVar.getContext());
        mVar.j = hVar;
        hVar.f24628l = mVar;
        d4.b(hVar, context);
        h hVar2 = mVar.j;
        if (hVar2.f24629m == null) {
            hVar2.f24629m = new g(hVar2);
        }
        g gVar2 = hVar2.f24629m;
        c cVar = gVar.f22644a;
        cVar.f22609k = gVar2;
        cVar.f22610l = mVar;
        View view = d4.f24648o;
        if (view != null) {
            cVar.f22605e = view;
        } else {
            cVar.f22603c = d4.f24647n;
            gVar.setTitle(d4.f24646m);
        }
        cVar.j = mVar;
        p072i.h hVarCreate = gVar.create();
        mVar.f24659i = hVarCreate;
        hVarCreate.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.f24659i.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.f24659i.show();
        w wVar = this.f24628l;
        if (wVar == null) {
            return true;
        }
        wVar.j(d4);
        return true;
    }

    @Override
    public final boolean k(n nVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
        this.j.q(this.f24629m.getItem(i3), this, 0);
    }
}
