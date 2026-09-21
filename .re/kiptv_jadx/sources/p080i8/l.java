package p080i8;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23272h;

    public /* synthetic */ l(int i3) {
        this.f23272h = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f23272h) {
            case 0:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Integer.valueOf(((p080i8.i) obj2).f23267a), java.lang.Integer.valueOf(((p080i8.i) obj).f23267a));
            default:
                return com.google.crypto.tink.shaded.protobuf.q0.o((java.lang.String) ((p070h6.k) obj).f22539h, (java.lang.String) ((p070h6.k) obj2).f22539h);
        }
    }
}
