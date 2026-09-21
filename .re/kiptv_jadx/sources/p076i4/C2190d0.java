package p076i4;

/* JADX INFO: renamed from: i4.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2190d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f22882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f22883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f22884c;

    public C2190d0(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f22882a = obj;
        this.f22883b = obj2;
        this.f22884c = obj3;
    }

    public final java.lang.IllegalArgumentException a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Multiple entries with same key: ");
        java.lang.Object obj = this.f22882a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f22883b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f22884c);
        return new java.lang.IllegalArgumentException(sb.toString());
    }
}
