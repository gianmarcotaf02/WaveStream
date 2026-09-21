package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32395h;

    public /* synthetic */ B(int i3) {
        this.f32395h = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f32395h) {
            case 0:
                java.lang.String str = ((com.kiptv.core.model.TMDBSearchResult) obj).f20299i;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = ((com.kiptv.core.model.TMDBSearchResult) obj2).f20299i;
                return com.google.crypto.tink.shaded.protobuf.q0.o(str, str2 != null ? str2 : "");
            default:
                return com.google.crypto.tink.shaded.protobuf.q0.o((java.lang.Long) ((p070h6.k) obj2).f22539h, (java.lang.Long) ((p070h6.k) obj).f22539h);
        }
    }
}
