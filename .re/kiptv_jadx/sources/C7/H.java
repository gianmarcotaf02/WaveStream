package C7;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends C7.N {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1546d;

    public /* synthetic */ H(int i3, java.lang.Object obj) {
        this.f1545c = i3;
        this.f1546d = obj;
    }

    @Override // C7.T
    public boolean a() {
        switch (this.f1545c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // C7.T
    public boolean e() {
        switch (this.f1545c) {
            case 1:
                return ((java.util.Map) this.f1546d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // C7.N
    public final C7.P g(C7.M key) {
        switch (this.f1545c) {
            case 0:
                kotlin.jvm.internal.m.e(key, "key");
                if (!((java.util.ArrayList) this.f1546d).contains(key)) {
                    return null;
                }
                N6.InterfaceC0694h interfaceC0694hH = key.h();
                kotlin.jvm.internal.m.c(interfaceC0694hH, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return C7.Y.j((N6.U) interfaceC0694hH);
            default:
                kotlin.jvm.internal.m.e(key, "key");
                return (C7.P) ((java.util.Map) this.f1546d).get(key);
        }
    }
}
