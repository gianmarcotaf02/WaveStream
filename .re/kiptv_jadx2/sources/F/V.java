package F;

public abstract class V {

    public static final float f3391a = 2500;

    public static final float f3392b = 1500;

    public static final float f3393c = 50;

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
