package p103m;

/* JADX INFO: renamed from: m.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2600y0 extends android.database.DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p103m.B0 f25150a;

    public C2600y0(p103m.B0 b9) {
        this.f25150a = b9;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        p103m.B0 b9 = this.f25150a;
        if (b9.f24884F.isShowing()) {
            b9.e();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f25150a.dismiss();
    }
}
