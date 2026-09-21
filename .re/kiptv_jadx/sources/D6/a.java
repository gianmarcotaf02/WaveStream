package D6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements java.lang.Iterable, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final char f2451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final char f2452i;
    public final int j = 1;

    public a(char c9, char c10) {
        this.f2451h = c9;
        this.f2452i = (char) com.google.crypto.tink.shaded.protobuf.AbstractC1911f.x(c9, c10, 1);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new D6.b(this.f2451h, this.f2452i, this.j);
    }
}
