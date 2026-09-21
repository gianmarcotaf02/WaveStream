package K6;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ K6.i f6866i;

    public /* synthetic */ f(K6.i iVar, int i3) {
        this.f6865h = i3;
        this.f6866i = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        K6.i iVar = this.f6866i;
        switch (this.f6865h) {
            case 0:
                return java.util.Arrays.asList(iVar.l().a0(K6.p.f6955k), iVar.l().a0(K6.p.f6957m), iVar.l().a0(K6.p.f6958n), iVar.l().a0(K6.p.f6956l));
            default:
                java.util.EnumMap enumMap = new java.util.EnumMap(K6.k.class);
                java.util.HashMap map = new java.util.HashMap();
                java.util.HashMap map2 = new java.util.HashMap();
                for (K6.k kVar : K6.k.values()) {
                    java.lang.String strB = kVar.f6888h.b();
                    if (strB == null) {
                        iVar.getClass();
                        K6.i.a(47);
                        throw null;
                    }
                    C7.B bJ = iVar.k(strB).j();
                    if (bJ == null) {
                        K6.i.a(48);
                        throw null;
                    }
                    java.lang.String strB2 = kVar.f6889i.b();
                    if (strB2 == null) {
                        K6.i.a(47);
                        throw null;
                    }
                    C7.B bJ2 = iVar.k(strB2).j();
                    if (bJ2 == null) {
                        K6.i.a(48);
                        throw null;
                    }
                    enumMap.put(kVar, bJ2);
                    map.put(bJ, bJ2);
                    map2.put(bJ2, bJ);
                }
                return new K6.h(enumMap, map, map2);
        }
    }
}
