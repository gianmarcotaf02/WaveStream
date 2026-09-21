package p076i4;

/* JADX INFO: renamed from: i4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2185b extends p076i4.AbstractC2215q implements p076i4.InterfaceC2227w0 {
    @Override // p076i4.AbstractC2215q, p076i4.G0
    public final java.util.Collection get(java.lang.Object obj) {
        return (java.util.List) super.get(obj);
    }

    @Override // p076i4.AbstractC2215q
    public final java.util.Collection k(java.lang.Object obj, java.util.Collection collection) {
        java.util.List list = (java.util.List) collection;
        return list instanceof java.util.RandomAccess ? new p076i4.C2201j(this, obj, list, null) : new p076i4.C2211o(this, obj, list, null);
    }

    @Override // p076i4.AbstractC2215q, p076i4.G0
    public final java.util.List get(java.lang.Object obj) {
        return (java.util.List) super.get(obj);
    }
}
