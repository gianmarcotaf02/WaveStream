package M8;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M8.A f7270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Long f7271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Long f7272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Long f7273f;
    public final java.lang.Long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Map f7274h;

    public p(boolean z6, boolean z9, M8.A a2, java.lang.Long l2, java.lang.Long l9, java.lang.Long l10, java.lang.Long l11, java.util.Map extras) {
        kotlin.jvm.internal.m.e(extras, "extras");
        this.f7268a = z6;
        this.f7269b = z9;
        this.f7270c = a2;
        this.f7271d = l2;
        this.f7272e = l9;
        this.f7273f = l10;
        this.g = l11;
        this.f7274h = p078i6.C.Y0(extras);
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f7268a) {
            arrayList.add("isRegularFile");
        }
        if (this.f7269b) {
            arrayList.add("isDirectory");
        }
        java.lang.Long l2 = this.f7271d;
        if (l2 != null) {
            arrayList.add("byteCount=" + l2);
        }
        java.lang.Long l9 = this.f7272e;
        if (l9 != null) {
            arrayList.add("createdAt=" + l9);
        }
        java.lang.Long l10 = this.f7273f;
        if (l10 != null) {
            arrayList.add("lastModifiedAt=" + l10);
        }
        java.lang.Long l11 = this.g;
        if (l11 != null) {
            arrayList.add("lastAccessedAt=" + l11);
        }
        java.util.Map map = this.f7274h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return p078i6.o.o1(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ p(boolean z6, boolean z9, M8.A a2, java.lang.Long l2, java.lang.Long l9, java.lang.Long l10, java.lang.Long l11) {
        this(z6, z9, a2, l2, l9, l10, l11, p078i6.x.f23206h);
    }
}
