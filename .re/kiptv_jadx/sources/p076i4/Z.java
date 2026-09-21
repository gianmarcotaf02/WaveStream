package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends p076i4.AbstractC2183a {
    public final p076i4.AbstractC2186b0 j;

    public Z(int i3, p076i4.AbstractC2186b0 abstractC2186b0) {
        super(abstractC2186b0.size(), i3);
        this.j = abstractC2186b0;
    }

    @Override // p076i4.AbstractC2183a
    public final java.lang.Object a(int i3) {
        return this.j.get(i3);
    }
}
