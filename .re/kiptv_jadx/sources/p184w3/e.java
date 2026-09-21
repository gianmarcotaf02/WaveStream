package p184w3;

/* JADX INFO: loaded from: classes.dex */
public final class e implements E3.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.cast.CastDevice f29847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p191x3.D f29848i;
    public final android.os.Bundle j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f29849k = java.util.UUID.randomUUID().toString();

    public /* synthetic */ e(j1.l lVar) {
        this.f29847h = (com.google.android.gms.cast.CastDevice) lVar.f23899i;
        this.f29848i = (p191x3.D) lVar.j;
        this.j = (android.os.Bundle) lVar.f23900k;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[RETURN] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p184w3.e)) {
            return false;
        }
        p184w3.e eVar = (p184w3.e) obj;
        if (H3.q.j(this.f29847h, eVar.f29847h)) {
            android.os.Bundle bundle = this.j;
            android.os.Bundle bundle2 = eVar.j;
            if (bundle == null || bundle2 == null) {
                if (bundle == bundle2) {
                    if (H3.q.j(this.f29849k, eVar.f29849k)) {
                        return true;
                    }
                }
            } else if (bundle.size() == bundle2.size()) {
                java.util.Set<java.lang.String> setKeySet = bundle.keySet();
                if (setKeySet.containsAll(bundle2.keySet())) {
                    for (java.lang.String str : setKeySet) {
                        if (!H3.q.j(bundle.get(str), bundle2.get(str))) {
                        }
                    }
                    if (H3.q.j(this.f29849k, eVar.f29849k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f29847h, this.j, 0, this.f29849k});
    }
}
