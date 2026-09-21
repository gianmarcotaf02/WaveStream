package p063g8;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p063g8.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f22377a;

    public g(java.util.ArrayList arrayList) {
        this.f22377a = arrayList;
    }

    @Override // p063g8.q
    public final boolean test(java.lang.Object obj) {
        java.util.ArrayList arrayList = this.f22377a;
        if (arrayList.isEmpty()) {
            return true;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((p063g8.q) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
