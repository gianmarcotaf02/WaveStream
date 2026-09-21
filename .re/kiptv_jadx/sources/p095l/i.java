package p095l;

/* JADX INFO: loaded from: classes.dex */
public final class i extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p095l.l f24630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24631b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f24634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24635f;

    public i(p095l.l lVar, android.view.LayoutInflater layoutInflater, boolean z6, int i3) {
        this.f24633d = z6;
        this.f24634e = layoutInflater;
        this.f24630a = lVar;
        this.f24635f = i3;
        a();
    }

    public final void a() {
        p095l.l lVar = this.f24630a;
        p095l.n nVar = lVar.f24655v;
        if (nVar != null) {
            lVar.i();
            java.util.ArrayList arrayList = lVar.j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((p095l.n) arrayList.get(i3)) == nVar) {
                    this.f24631b = i3;
                    return;
                }
            }
        }
        this.f24631b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p095l.n getItem(int i3) {
        java.util.ArrayList arrayListL;
        p095l.l lVar = this.f24630a;
        if (this.f24633d) {
            lVar.i();
            arrayListL = lVar.j;
        } else {
            arrayListL = lVar.l();
        }
        int i9 = this.f24631b;
        if (i9 >= 0 && i3 >= i9) {
            i3++;
        }
        return (p095l.n) arrayListL.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        java.util.ArrayList arrayListL;
        p095l.l lVar = this.f24630a;
        if (this.f24633d) {
            lVar.i();
            arrayListL = lVar.j;
        } else {
            arrayListL = lVar.l();
        }
        return this.f24631b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i3, android.view.View view, android.view.ViewGroup viewGroup) {
        boolean z6 = false;
        if (view == null) {
            view = this.f24634e.inflate(this.f24635f, viewGroup, false);
        }
        int i9 = getItem(i3).f24664b;
        int i10 = i3 - 1;
        int i11 = i10 >= 0 ? getItem(i10).f24664b : i9;
        androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) view;
        if (this.f24630a.m() && i9 != i11) {
            z6 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z6);
        p095l.y yVar = (p095l.y) view;
        if (this.f24632c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
