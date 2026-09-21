package X6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p101l7.e f10884a = p101l7.e.e("message");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p101l7.e f10885b = p101l7.e.e("allowedTargets");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p101l7.e f10886c = p101l7.e.e("value");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f10887d = p078i6.C.N0(new p070h6.k(K6.o.f6941t, W6.x.f10691c), new p070h6.k(K6.o.f6944w, W6.x.f10692d), new p070h6.k(K6.o.f6945x, W6.x.f10694f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static Y6.i a(p101l7.c kotlinName, p027c7.b annotationOwner, A7.m c9) {
        T6.C0927e c0927eA;
        kotlin.jvm.internal.m.e(kotlinName, "kotlinName");
        kotlin.jvm.internal.m.e(annotationOwner, "annotationOwner");
        kotlin.jvm.internal.m.e(c9, "c");
        if (kotlinName.equals(K6.o.f6934m)) {
            p101l7.c DEPRECATED_ANNOTATION = W6.x.f10693e;
            kotlin.jvm.internal.m.d(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            T6.C0927e c0927eA2 = annotationOwner.a(DEPRECATED_ANNOTATION);
            if (c0927eA2 != null) {
                return new X6.g(c0927eA2, c9);
            }
        }
        p101l7.c cVar = (p101l7.c) f10887d.get(kotlinName);
        if (cVar == null || (c0927eA = annotationOwner.a(cVar)) == null) {
            return null;
        }
        return b(c9, c0927eA, false);
    }

    public static Y6.i b(A7.m c9, T6.C0927e annotation, boolean z6) {
        kotlin.jvm.internal.m.e(annotation, "annotation");
        kotlin.jvm.internal.m.e(c9, "c");
        p101l7.b bVarA = T6.AbstractC0926d.a(com.google.android.gms.internal.play_billing.AbstractC1833d1.x(com.google.android.gms.internal.play_billing.AbstractC1833d1.u(annotation.f9853a)));
        p101l7.c TARGET_ANNOTATION = W6.x.f10691c;
        kotlin.jvm.internal.m.d(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (bVarA.equals(com.google.common.util.concurrent.AbstractC1903s.L(TARGET_ANNOTATION))) {
            return new X6.j(annotation, c9);
        }
        p101l7.c RETENTION_ANNOTATION = W6.x.f10692d;
        kotlin.jvm.internal.m.d(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (bVarA.equals(com.google.common.util.concurrent.AbstractC1903s.L(RETENTION_ANNOTATION))) {
            return new X6.i(annotation, c9);
        }
        p101l7.c DOCUMENTED_ANNOTATION = W6.x.f10694f;
        kotlin.jvm.internal.m.d(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (bVarA.equals(com.google.common.util.concurrent.AbstractC1903s.L(DOCUMENTED_ANNOTATION))) {
            return new X6.b(c9, annotation, K6.o.f6945x);
        }
        p101l7.c DEPRECATED_ANNOTATION = W6.x.f10693e;
        kotlin.jvm.internal.m.d(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (bVarA.equals(com.google.common.util.concurrent.AbstractC1903s.L(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new p007a7.C1480f(c9, annotation, z6);
    }
}
