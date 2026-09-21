package p153r8;

/* JADX INFO: renamed from: r8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2685a implements kotlinx.serialization.KSerializer {
    public abstract java.lang.Object a();

    public abstract int b(java.lang.Object obj);

    public abstract java.util.Iterator c(java.lang.Object obj);

    public abstract int d(java.lang.Object obj);

    @Override // kotlinx.serialization.KSerializer
    public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return e(decoder);
    }

    public final java.lang.Object e(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        java.lang.Object objA = a();
        int iB = b(objA);
        p143q8.a aVarC = decoder.c(getDescriptor());
        while (true) {
            int iS = aVarC.s(getDescriptor());
            if (iS == -1) {
                aVarC.a(getDescriptor());
                return h(objA);
            }
            f(aVarC, iS + iB, objA);
        }
    }

    public abstract void f(p143q8.a aVar, int i3, java.lang.Object obj);

    public abstract java.lang.Object g(java.lang.Object obj);

    public abstract java.lang.Object h(java.lang.Object obj);
}
