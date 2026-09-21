package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class X extends p076i4.r implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f22846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f22847i;

    public X(java.lang.Object obj, java.lang.Object obj2) {
        this.f22846h = obj;
        this.f22847i = obj2;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f22846h;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f22847i;
    }

    @Override // p076i4.r, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
