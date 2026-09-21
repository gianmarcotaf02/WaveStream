package Z2;

/* JADX INFO: renamed from: Z2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1190g implements Z2.InterfaceC1186e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12877a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z2.InterfaceC1186e
    public final boolean a(Z2.AbstractC1181b0 abstractC1181b0) {
        switch (this.f12877a) {
            case 0:
                return !(abstractC1181b0 instanceof Z2.Z) || ((Z2.Z) abstractC1181b0).b().size() == 0;
            case 1:
                return abstractC1181b0.f12870b == null;
            default:
                return false;
        }
    }

    public final java.lang.String toString() {
        switch (this.f12877a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
