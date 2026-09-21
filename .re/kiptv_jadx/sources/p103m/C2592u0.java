package p103m;

/* JADX INFO: renamed from: m.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2592u0 implements android.widget.AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p103m.B0 f25140h;

    public C2592u0(p103m.B0 b9) {
        this.f25140h = b9;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i3, long j) {
        p103m.C2581o0 c2581o0;
        if (i3 == -1 || (c2581o0 = this.f25140h.j) == null) {
            return;
        }
        c2581o0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView adapterView) {
    }
}
