package E2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.media3.common.util.Log;
import java.util.ArrayList;
import java.util.List;

public abstract class p {

    public static final j f2791a = new j(Boolean.TRUE);

    public static C a(String str) {
        String str2 = M8.A.f7207i;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new C(sb.toString(), str2, "file", null, str);
    }

    public static final Drawable b(l lVar, Resources resources) {
        if (lVar instanceof f) {
            return ((f) lVar).f2781a;
        }
        return lVar instanceof C0274a ? new BitmapDrawable(resources, ((C0274a) lVar).f2766a) : new m(0, lVar);
    }

    public static final l c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new C0274a(((BitmapDrawable) drawable).getBitmap()) : new f(drawable);
    }

    public static final Object d(S2.h hVar, j jVar) {
        Object obj = hVar.f9268r.f2787a.get(jVar);
        if (obj != null) {
            return obj;
        }
        Object obj2 = hVar.f9270t.f9244n.f2787a.get(jVar);
        return obj2 == null ? jVar.f2785a : obj2;
    }

    public static final Object e(S2.o oVar, j jVar) {
        Object obj = oVar.j.f2787a.get(jVar);
        return obj == null ? jVar.f2785a : obj;
    }

    public static final String f(C c9) {
        List listG = g(c9);
        if (listG.isEmpty()) {
            return null;
        }
        String str = c9.f2765e;
        kotlin.jvm.internal.m.b(str);
        String str2 = c9.f2762b;
        if (!O7.x.x0(str, str2, false)) {
            str2 = "";
        }
        return p078i6.o.o1(listG, c9.f2762b, str2, null, null, 60);
    }

    public static final List g(C c9) {
        String str = c9.f2765e;
        if (str == null) {
            return p078i6.w.f23205h;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = -1;
        while (i3 < str.length()) {
            int i9 = i3 + 1;
            int iK0 = O7.q.K0(str, '/', i9, 4);
            if (iK0 == -1) {
                iK0 = str.length();
            }
            String strSubstring = str.substring(i9, iK0);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i3 = iK0;
        }
        return arrayList;
    }

    public static final String h(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i3 = 0;
        int i9 = 0;
        while (true) {
            if (i3 >= iMax) {
                if (i3 == i9) {
                    return str;
                }
                if (i3 >= length) {
                    return O7.x.o0(0, i9, 5, bArr);
                }
            } else if (str.charAt(i3) == '%') {
                int i10 = i3 + 3;
                try {
                    String strSubstring = str.substring(i3 + 1, i10);
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                    R8.i.i(16);
                    bArr[i9] = (byte) Integer.parseInt(strSubstring, 16);
                    i9++;
                    i3 = i10;
                } catch (NumberFormatException unused) {
                    bArr[i9] = (byte) str.charAt(i3);
                    i9++;
                    i3++;
                }
            }
            bArr[i9] = (byte) str.charAt(i3);
            i9++;
            i3++;
        }
    }

    public static Bitmap i(l lVar) {
        int iB = lVar.b();
        int iA = lVar.a();
        boolean z6 = lVar instanceof C0274a;
        Bitmap.Config config = z6 ? ((C0274a) lVar).f2766a.getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (z6) {
            C0274a c0274a = (C0274a) lVar;
            if (c0274a.f2766a.getWidth() == iB) {
                Bitmap bitmap = c0274a.f2766a;
                if (bitmap.getHeight() == iA && bitmap.getConfig() == config) {
                    return bitmap;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iB, iA, config);
        lVar.e(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static C j(String str) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        String str2 = M8.A.f7207i;
        String strW0 = !kotlin.jvm.internal.m.a(str2, "/") ? O7.x.w0(str, str2, "/") : str;
        int i3 = 0;
        boolean z6 = true;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (i3 < strW0.length()) {
            char cCharAt = strW0.charAt(i3);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i11 == -1 && i9 == -1) {
                            i11 = i3 + 1;
                        }
                    } else if (z6 && i11 == -1 && i9 == -1) {
                        int i14 = i3 + 2;
                        if (i14 < str.length() && str.charAt(i3 + 1) == '/' && str.charAt(i14) == '/') {
                            i12 = i3 + 3;
                            z6 = false;
                            i13 = i3;
                            i3 = i14;
                        } else if (strW0.equals(str)) {
                            i10 = i3 + 1;
                            i13 = i3;
                            i3 = i10;
                            i12 = i3;
                        }
                    }
                } else if (i10 == -1 && i11 == -1 && i9 == -1) {
                    i10 = i12 == -1 ? 0 : i3;
                    z6 = false;
                }
            } else if (i9 == -1) {
                i9 = i3 + 1;
            }
            i3++;
        }
        int i15 = Log.LOG_LEVEL_OFF;
        int iMin = Math.min(i9 == -1 ? Integer.MAX_VALUE : i9 - 1, strW0.length());
        int iMin2 = Math.min(i11 == -1 ? Integer.MAX_VALUE : i11 - 1, iMin);
        if (i12 != -1) {
            strSubstring2 = strW0.substring(0, i13);
            kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
            if (i10 != -1) {
                i15 = i10;
            }
            strSubstring = strW0.substring(i12, Math.min(i15, iMin2));
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i10 != -1) {
            strSubstring3 = strW0.substring(i10, iMin2);
            kotlin.jvm.internal.m.d(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i11 != -1) {
            strSubstring4 = strW0.substring(i11, iMin);
            kotlin.jvm.internal.m.d(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i9 != -1) {
            strSubstring5 = strW0.substring(i9, strW0.length());
            kotlin.jvm.internal.m.d(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strH = strSubstring2 != null ? h(strSubstring2, bArr) : null;
        String strH2 = strSubstring != null ? h(strSubstring, bArr) : null;
        String strH3 = strSubstring3 != null ? h(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            h(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            h(strSubstring5, bArr);
        }
        return new C(strW0, str2, strH, strH2, strH3);
    }
}
