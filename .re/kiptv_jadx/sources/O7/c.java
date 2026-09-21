package O7;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements N7.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f8033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p194x6.m f8035c;

    public c(java.lang.CharSequence input, int i3, p194x6.m mVar) {
        kotlin.jvm.internal.m.e(input, "input");
        this.f8033a = input;
        this.f8034b = i3;
        this.f8035c = mVar;
    }

    @Override // N7.m
    public final java.util.Iterator iterator() {
        return new O7.b(this);
    }
}
