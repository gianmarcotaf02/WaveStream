package p095l;

/* JADX INFO: loaded from: classes.dex */
public final class g extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24623a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p095l.h f24624b;

    public g(p095l.h hVar) {
        this.f24624b = hVar;
        a();
    }

    public final void a() {
        p095l.l lVar = this.f24624b.j;
        p095l.n nVar = lVar.f24655v;
        if (nVar != null) {
            lVar.i();
            java.util.ArrayList arrayList = lVar.j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((p095l.n) arrayList.get(i3)) == nVar) {
                    this.f24623a = i3;
                    return;
                }
            }
        }
        this.f24623a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p095l.n getItem(int i3) {
        p095l.h hVar = this.f24624b;
        p095l.l lVar = hVar.j;
        lVar.i();
        java.util.ArrayList arrayList = lVar.j;
        hVar.getClass();
        int i9 = this.f24623a;
        if (i9 >= 0 && i3 >= i9) {
            i3++;
        }
        return (p095l.n) arrayList.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        p095l.h hVar = this.f24624b;
        p095l.l lVar = hVar.j;
        lVar.i();
        int size = lVar.j.size();
        hVar.getClass();
        return this.f24623a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i3, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.f24624b.f24626i.inflate(com.kiptv.tv.R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((p095l.y) view).b(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
