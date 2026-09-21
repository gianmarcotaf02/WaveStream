package p193x5;

/* JADX INFO: renamed from: x5.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3149w0 implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f31680h;

    public /* synthetic */ C3149w0(int i3) {
        this.f31680h = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f31680h) {
            case 0:
                return com.google.crypto.tink.shaded.protobuf.q0.o((java.lang.Integer) ((p070h6.k) obj).f22539h, (java.lang.Integer) ((p070h6.k) obj2).f22539h);
            default:
                return com.google.crypto.tink.shaded.protobuf.q0.o((java.lang.Long) ((p070h6.k) obj2).f22539h, (java.lang.Long) ((p070h6.k) obj).f22539h);
        }
    }
}
