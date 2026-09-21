package X6;

import A7.m;
import K6.o;
import T6.AbstractC0926d;
import T6.C0927e;
import W6.x;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.AbstractC1903s;
import p007a7.C1480f;
import p070h6.k;
import p078i6.C;

public abstract class c {

    public static final p101l7.e f10884a = p101l7.e.e("message");

    public static final p101l7.e f10885b = p101l7.e.e("allowedTargets");

    public static final p101l7.e f10886c = p101l7.e.e("value");

    public static final Object f10887d = C.N0(new k(o.f6941t, x.f10691c), new k(o.f6944w, x.f10692d), new k(o.f6945x, x.f10694f));

    public static Y6.i a(p101l7.c kotlinName, p027c7.b annotationOwner, m c9) {
        C0927e c0927eA;
        kotlin.jvm.internal.m.e(kotlinName, "kotlinName");
        kotlin.jvm.internal.m.e(annotationOwner, "annotationOwner");
        kotlin.jvm.internal.m.e(c9, "c");
        if (kotlinName.equals(o.f6934m)) {
            p101l7.c DEPRECATED_ANNOTATION = x.f10693e;
            kotlin.jvm.internal.m.d(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            C0927e c0927eA2 = annotationOwner.a(DEPRECATED_ANNOTATION);
            if (c0927eA2 != null) {
                return new g(c0927eA2, c9);
            }
        }
        p101l7.c cVar = (p101l7.c) f10887d.get(kotlinName);
        if (cVar == null || (c0927eA = annotationOwner.a(cVar)) == null) {
            return null;
        }
        return b(c9, c0927eA, false);
    }

    public static Y6.i b(m c9, C0927e annotation, boolean z6) {
        kotlin.jvm.internal.m.e(annotation, "annotation");
        kotlin.jvm.internal.m.e(c9, "c");
        p101l7.b bVarA = AbstractC0926d.a(AbstractC1833d1.x(AbstractC1833d1.u(annotation.f9853a)));
        p101l7.c TARGET_ANNOTATION = x.f10691c;
        kotlin.jvm.internal.m.d(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (bVarA.equals(AbstractC1903s.L(TARGET_ANNOTATION))) {
            return new j(annotation, c9);
        }
        p101l7.c RETENTION_ANNOTATION = x.f10692d;
        kotlin.jvm.internal.m.d(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (bVarA.equals(AbstractC1903s.L(RETENTION_ANNOTATION))) {
            return new i(annotation, c9);
        }
        p101l7.c DOCUMENTED_ANNOTATION = x.f10694f;
        kotlin.jvm.internal.m.d(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (bVarA.equals(AbstractC1903s.L(DOCUMENTED_ANNOTATION))) {
            return new b(c9, annotation, o.f6945x);
        }
        p101l7.c DEPRECATED_ANNOTATION = x.f10693e;
        kotlin.jvm.internal.m.d(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (bVarA.equals(AbstractC1903s.L(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new C1480f(c9, annotation, z6);
    }
}
