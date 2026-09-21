package C7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class B extends C7.a0 implements F7.f, F7.g {
    @Override // C7.a0
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public abstract C7.B y0(boolean z6);

    @Override // C7.a0
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public abstract C7.B A0(C7.I i3);

    public java.lang.String toString() throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            java.lang.String[] strArr = {"[", p118n7.g.f25862e.w((O6.b) it.next(), null), "] "};
            for (int i3 = 0; i3 < 3; i3++) {
                sb.append(strArr[i3]);
            }
        }
        sb.append(u0());
        if (!s0().isEmpty()) {
            p078i6.o.n1(s0(), sb, ", ", "<", ">", null, 112);
        }
        if (v0()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
