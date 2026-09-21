package p095l;

/* JADX INFO: loaded from: classes.dex */
public final class h implements p095l.x, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.content.Context f24625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.view.LayoutInflater f24626i;
    public p095l.l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.appcompat.view.menu.ExpandedMenuView f24627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p095l.w f24628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p095l.g f24629m;

    public h(android.content.Context context) {
        this.f24625h = context;
        this.f24626i = android.view.LayoutInflater.from(context);
    }

    @Override // p095l.x
    public final boolean b(p095l.n nVar) {
        return false;
    }

    @Override // p095l.x
    public final void c(p095l.l lVar, boolean z6) {
        p095l.w wVar = this.f24628l;
        if (wVar != null) {
            wVar.c(lVar, z6);
        }
    }

    @Override // p095l.x
    public final boolean d() {
        return false;
    }

    @Override // p095l.x
    public final void f() {
        p095l.g gVar = this.f24629m;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // p095l.x
    public final void g(p095l.w wVar) {
        throw null;
    }

    @Override // p095l.x
    public final void i(android.content.Context context, p095l.l lVar) {
        if (this.f24625h != null) {
            this.f24625h = context;
            if (this.f24626i == null) {
                this.f24626i = android.view.LayoutInflater.from(context);
            }
        }
        this.j = lVar;
        p095l.g gVar = this.f24629m;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // p095l.x
    public final boolean j(p095l.D d4) {
        if (!d4.hasVisibleItems()) {
            return false;
        }
        p095l.m mVar = new p095l.m();
        mVar.f24658h = d4;
        android.content.Context context = d4.f24636a;
        p072i.g gVar = new p072i.g(context);
        p095l.h hVar = new p095l.h(gVar.getContext());
        mVar.j = hVar;
        hVar.f24628l = mVar;
        d4.b(hVar, context);
        p095l.h hVar2 = mVar.j;
        if (hVar2.f24629m == null) {
            hVar2.f24629m = new p095l.g(hVar2);
        }
        p095l.g gVar2 = hVar2.f24629m;
        p072i.c cVar = gVar.f22644a;
        cVar.f22609k = gVar2;
        cVar.f22610l = mVar;
        android.view.View view = d4.f24648o;
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
        android.view.WindowManager.LayoutParams attributes = mVar.f24659i.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.f24659i.show();
        p095l.w wVar = this.f24628l;
        if (wVar == null) {
            return true;
        }
        wVar.j(d4);
        return true;
    }

    @Override // p095l.x
    public final boolean k(p095l.n nVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i3, long j) {
        this.j.q(this.f24629m.getItem(i3), this, 0);
    }
}
