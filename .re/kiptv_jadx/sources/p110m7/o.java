package p110m7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends p110m7.AbstractC2629b implements java.io.Serializable {
    public static p110m7.C2641n f(p110m7.AbstractC2639l abstractC2639l, p110m7.o oVar, int i3, p110m7.K k9, java.lang.Class cls) {
        return new p110m7.C2641n(abstractC2639l, java.util.Collections.EMPTY_LIST, oVar, new p110m7.C2640m(i3, k9, true), cls);
    }

    public static p110m7.C2641n g(p110m7.AbstractC2639l abstractC2639l, java.io.Serializable serializable, p110m7.o oVar, int i3, p110m7.M m8, java.lang.Class cls) {
        return new p110m7.C2641n(abstractC2639l, serializable, oVar, new p110m7.C2640m(i3, m8, false), cls);
    }
}
