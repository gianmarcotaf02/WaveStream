package F;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f3391a = 2500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f3392b = 1500;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f3393c = 50;

    /* JADX WARN: Code duplicated, block: B:35:0x00c1 A[Catch: j -> 0x018b, TryCatch #4 {j -> 0x018b, blocks: (B:33:0x00bd, B:35:0x00c1, B:37:0x00cd, B:51:0x00f3, B:55:0x0122, B:59:0x012b), top: B:97:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x0129  */
    /* JADX WARN: Code duplicated, block: B:66:0x016e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016e -> B:18:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(D.x r30, int r31, int r32, p113n1.c r33, p117n6.c r34) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F.V.a(D.x, int, int, n1.c, n6.c):java.lang.Object");
    }

    public static final boolean b(boolean z6, D.x xVar, int i3) {
        D.D d4 = (D.D) xVar.f1786c;
        if (z6) {
            if (xVar.c() > i3) {
                return true;
            }
            return xVar.c() == i3 && d4.f1646e.f1780c.g() > 0;
        }
        if (xVar.c() < i3) {
            return true;
        }
        return xVar.c() == i3 && d4.f1646e.f1780c.g() < 0;
    }

    public static final boolean c(D.x xVar, int i3) {
        return i3 <= xVar.d() && xVar.c() <= i3;
    }
}
