package Z2;

public final class r {

    public static final r f12920h;

    public static final r f12921i;
    public static final r j;

    public static final r f12922k;

    public static final r f12923l;

    public static final r f12924m;

    public static final r f12925n;

    public static final r f12926o;

    public static final r f12927p;

    public static final r f12928q;

    public static final r[] f12929r;

    static {
        r rVar = new r("none", 0);
        f12920h = rVar;
        r rVar2 = new r("xMinYMin", 1);
        f12921i = rVar2;
        r rVar3 = new r("xMidYMin", 2);
        j = rVar3;
        r rVar4 = new r("xMaxYMin", 3);
        f12922k = rVar4;
        r rVar5 = new r("xMinYMid", 4);
        f12923l = rVar5;
        r rVar6 = new r("xMidYMid", 5);
        f12924m = rVar6;
        r rVar7 = new r("xMaxYMid", 6);
        f12925n = rVar7;
        r rVar8 = new r("xMinYMax", 7);
        f12926o = rVar8;
        r rVar9 = new r("xMidYMax", 8);
        f12927p = rVar9;
        r rVar10 = new r("xMaxYMax", 9);
        f12928q = rVar10;
        f12929r = new r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f12929r.clone();
    }
}
