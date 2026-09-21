package p011b1;

/* JADX INFO: renamed from: b1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1649f implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17807h;

    public /* synthetic */ C1649f(int i3) {
        this.f17807h = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f17807h) {
            case 0:
                break;
        }
        return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Integer.valueOf(((p011b1.C1648e) obj).f17804b), java.lang.Integer.valueOf(((p011b1.C1648e) obj2).f17804b));
    }
}
