package z8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f32956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z8.b f32958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f32959d;

    public a(java.lang.String name, boolean z6) {
        kotlin.jvm.internal.m.e(name, "name");
        this.f32956a = name;
        this.f32957b = z6;
        this.f32959d = -1L;
    }

    public abstract long a();

    public final java.lang.String toString() {
        return this.f32956a;
    }
}
