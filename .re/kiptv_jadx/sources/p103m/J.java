package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class J implements android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p103m.L f24927h;

    public J(p103m.L l2) {
        this.f24927h = l2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i3, long j) {
        p103m.L l2 = this.f24927h;
        l2.f24941M.setSelection(i3);
        p103m.O o8 = l2.f24941M;
        if (o8.getOnItemClickListener() != null) {
            o8.performItemClick(view, i3, l2.f24938J.getItemId(i3));
        }
        l2.dismiss();
    }
}
