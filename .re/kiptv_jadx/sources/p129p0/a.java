package p129p0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f26170a;

    public a(java.util.List list) {
        this.f26170a = list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final boolean a() {
        ?? r9 = this.f26170a;
        int size = r9.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((p129p0.b) r9.get(i3)).getClass();
        }
        return false;
    }
}
