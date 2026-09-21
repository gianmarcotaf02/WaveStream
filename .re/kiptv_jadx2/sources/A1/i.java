package A1;

import Y2.L;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.recyclerview.widget.f0;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.D;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p136q.S;

public abstract class i {

    public static final f0 f145a = new f0(16);

    public static final ThreadPoolExecutor f146b;

    public static final Object f147c;

    public static final S f148d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new l());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f146b = threadPoolExecutor;
        f147c = new Object();
        f148d = new S(0);
    }

    public static String a(int i3, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < list.size(); i9++) {
            sb.append(((e) list.get(i9)).f135e);
            sb.append("-");
            sb.append(i3);
            if (i9 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static h b(String str, Context context, List list, int i3) {
        int i9;
        Typeface typefaceK;
        AbstractC1833d1.h("getFontSync");
        f0 f0Var = f145a;
        try {
            Typeface typeface = (Typeface) f0Var.f(str);
            if (typeface != null) {
                h hVar = new h(typeface);
                Trace.endSection();
                return hVar;
            }
            try {
                L lA = d.a(context, list);
                int i10 = lA.f11389i;
                List list2 = (List) lA.j;
                if (i10 == 0) {
                    j[] jVarArr = (j[]) list2.get(0);
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
                    h hVar2 = new h(i9);
                    Trace.endSection();
                    return hVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    j[] jVarArr2 = (j[]) list2.get(0);
                    D d4 = p182w1.d.f29765a;
                    AbstractC1833d1.h("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceK = p182w1.d.f29765a.k(context, jVarArr2, i3);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    D d6 = p182w1.d.f29765a;
                    AbstractC1833d1.h("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceK = p182w1.d.f29765a.l(context, list2, i3);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceK == null) {
                    h hVar3 = new h(-3);
                    Trace.endSection();
                    return hVar3;
                }
                f0Var.j(str, typefaceK);
                h hVar4 = new h(typefaceK);
                Trace.endSection();
                return hVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                h hVar5 = new h(-1);
                Trace.endSection();
                return hVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
