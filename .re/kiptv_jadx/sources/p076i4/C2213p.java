package p076i4;

/* JADX INFO: renamed from: i4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2213p extends p076i4.AbstractC2207m implements java.util.Set {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p076i4.Q f22927m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2213p(p076i4.Q q9, java.lang.Object obj, java.util.Set set) {
        super(q9, obj, set, null);
        this.f22927m = q9;
    }

    @Override // p076i4.AbstractC2207m, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zT = p076i4.AbstractC2230y.t((java.util.Set) this.f22918i, collection);
        if (zT) {
            int size2 = this.f22918i.size();
            this.f22927m.f22930m += size2 - size;
            f();
        }
        return zT;
    }
}
