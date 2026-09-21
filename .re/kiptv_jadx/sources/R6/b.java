package R6;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends N6.i0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final R6.b f9073k = new R6.b("protected_and_package", true);

    @Override // N6.i0
    public final java.lang.Integer a(N6.i0 visibility) {
        kotlin.jvm.internal.m.e(visibility, "visibility");
        if (equals(visibility)) {
            return 0;
        }
        if (visibility == N6.Z.f7381k) {
            return null;
        }
        p086j6.e eVar = N6.h0.f7397a;
        return visibility == N6.c0.f7384k || visibility == N6.d0.f7387k ? 1 : -1;
    }

    @Override // N6.i0
    public final java.lang.String d() {
        return "protected/*protected and package*/";
    }

    @Override // N6.i0
    public final N6.i0 k() {
        return N6.e0.f7388k;
    }
}
