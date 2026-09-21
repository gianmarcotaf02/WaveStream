package Y2;

/* JADX INFO: renamed from: Y2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1036f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f11462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f11463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y2.C1038h f11465d;

    public final Y2.C1039i a() {
        com.google.android.gms.internal.play_billing.r rVarS;
        boolean z6 = true;
        java.util.ArrayList arrayList = this.f11463b;
        boolean z9 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (!z9) {
            throw new java.lang.IllegalArgumentException("Details of the products must be provided.");
        }
        java.util.ArrayList arrayList2 = this.f11463b;
        if (arrayList2 != null) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((Y2.C1037g) it.next()) == null) {
                    throw new java.lang.IllegalArgumentException("ProductDetailsParams cannot be null.");
                }
            }
        }
        Y2.C1039i c1039i = new Y2.C1039i();
        c1039i.f11471a = z9 && !((Y2.C1037g) this.f11463b.get(0)).f11466a.f11503b.optString("packageName").isEmpty();
        c1039i.f11472b = this.f11462a;
        Y2.C1038h c1038h = this.f11465d;
        if (android.text.TextUtils.isEmpty((java.lang.String) c1038h.f11470c) && android.text.TextUtils.isEmpty(null)) {
            z6 = false;
        }
        boolean zIsEmpty = android.text.TextUtils.isEmpty(null);
        if (z6 && !zIsEmpty) {
            throw new java.lang.IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!c1038h.f11469b && !z6 && zIsEmpty) {
            throw new java.lang.IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        Y2.L l2 = new Y2.L((char) 0, 7);
        l2.j = (java.lang.String) c1038h.f11470c;
        l2.f11389i = c1038h.f11468a;
        c1039i.f11473c = l2;
        c1039i.f11475e = new java.util.ArrayList();
        c1039i.f11476f = this.f11464c;
        java.util.ArrayList arrayList3 = this.f11463b;
        if (arrayList3 != null) {
            rVarS = com.google.android.gms.internal.play_billing.r.s(arrayList3);
        } else {
            com.google.android.gms.internal.play_billing.C1865p c1865p = com.google.android.gms.internal.play_billing.r.f19379i;
            rVarS = com.google.android.gms.internal.play_billing.C1876v.f19394l;
        }
        c1039i.f11474d = rVarS;
        return c1039i;
    }
}
