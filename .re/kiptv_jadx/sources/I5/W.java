package I5;

/* JADX INFO: loaded from: classes4.dex */
public final class W implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4966h;

    public /* synthetic */ W(int i3) {
        this.f4966h = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f4966h) {
            case 0:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Integer.valueOf(((com.kiptv.core.model.E0) obj).a()), java.lang.Integer.valueOf(((com.kiptv.core.model.E0) obj2).a()));
            case 1:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Integer.valueOf(((com.kiptv.core.model.E0) obj).a()), java.lang.Integer.valueOf(((com.kiptv.core.model.E0) obj2).a()));
            default:
                return com.google.crypto.tink.shaded.protobuf.q0.o((java.lang.Long) ((p070h6.k) obj2).f22539h, (java.lang.Long) ((p070h6.k) obj).f22539h);
        }
    }
}
