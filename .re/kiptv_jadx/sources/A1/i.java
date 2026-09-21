package A1;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.recyclerview.widget.f0 f145a = new androidx.recyclerview.widget.f0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ThreadPoolExecutor f146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p136q.S f148d;

    static {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 10000, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingDeque(), new A1.l());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f146b = threadPoolExecutor;
        f147c = new java.lang.Object();
        f148d = new p136q.S(0);
    }

    public static java.lang.String a(int i3, java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i9 = 0; i9 < list.size(); i9++) {
            sb.append(((A1.e) list.get(i9)).f135e);
            sb.append("-");
            sb.append(i3);
            if (i9 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static A1.h b(java.lang.String str, android.content.Context context, java.util.List list, int i3) {
        int i9;
        android.graphics.Typeface typefaceK;
        com.google.android.gms.internal.play_billing.AbstractC1833d1.h("getFontSync");
        androidx.recyclerview.widget.f0 f0Var = f145a;
        try {
            android.graphics.Typeface typeface = (android.graphics.Typeface) f0Var.f(str);
            if (typeface != null) {
                A1.h hVar = new A1.h(typeface);
                android.os.Trace.endSection();
                return hVar;
            }
            try {
                Y2.L lA = A1.d.a(context, list);
                int i10 = lA.f11389i;
                java.util.List list2 = (java.util.List) lA.j;
                if (i10 == 0) {
                    A1.j[] jVarArr = (A1.j[]) list2.get(0);
                    if (jVarArr == null || jVarArr.length == 0) {
                        i9 = 1;
                    } else {
                        int length = jVarArr.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                i9 = 0;
                                break;
                            }
                            int i12 = jVarArr[i11].f153e;
                            if (i12 != 0) {
                                if (i12 >= 0) {
                                    i9 = i12;
                                    break;
                                }
                                i9 = -3;
                                break;
                            }
                            i11++;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        i9 = -3;
                        break;
                    }
                    i9 = -2;
                }
                if (i9 != 0) {
                    A1.h hVar2 = new A1.h(i9);
                    android.os.Trace.endSection();
                    return hVar2;
                }
                if (list2.size() <= 1 || android.os.Build.VERSION.SDK_INT < 29) {
                    A1.j[] jVarArr2 = (A1.j[]) list2.get(0);
                    com.google.common.util.concurrent.D d4 = p182w1.d.f29765a;
                    com.google.android.gms.internal.play_billing.AbstractC1833d1.h("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceK = p182w1.d.f29765a.k(context, jVarArr2, i3);
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th) {
                        android.os.Trace.endSection();
                        throw th;
                    }
                } else {
                    com.google.common.util.concurrent.D d6 = p182w1.d.f29765a;
                    com.google.android.gms.internal.play_billing.AbstractC1833d1.h("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceK = p182w1.d.f29765a.l(context, list2, i3);
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th2) {
                        android.os.Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceK == null) {
                    A1.h hVar3 = new A1.h(-3);
                    android.os.Trace.endSection();
                    return hVar3;
                }
                f0Var.j(str, typefaceK);
                A1.h hVar4 = new A1.h(typefaceK);
                android.os.Trace.endSection();
                return hVar4;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                A1.h hVar5 = new A1.h(-1);
                android.os.Trace.endSection();
                return hVar5;
            }
        } catch (java.lang.Throwable th3) {
            android.os.Trace.endSection();
            throw th3;
        }
    }
}
