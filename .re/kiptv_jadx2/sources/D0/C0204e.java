package D0;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.gms.internal.play_billing.M0;
import java.util.ArrayList;
import p188x0.C3098s;
import p188x0.S;

public final class C0204e {

    public final String f1865a;

    public final float f1866b;

    public final float f1867c;

    public final float f1868d;

    public final float f1869e;

    public final long f1870f;
    public final int g;

    public final boolean f1871h;

    public final ArrayList f1872i;
    public final C0203d j;

    public boolean f1873k;

    public C0204e(String str, float f9, float f10, float f11, float f12, long j, int i3, boolean z6, int i9) {
        str = (i9 & 1) != 0 ? "" : str;
        long j9 = (i9 & 32) != 0 ? C3098s.g : j;
        int i10 = (i9 & 64) != 0 ? 5 : i3;
        this.f1865a = str;
        this.f1866b = f9;
        this.f1867c = f10;
        this.f1868d = f11;
        this.f1869e = f12;
        this.f1870f = j9;
        this.g = i10;
        this.f1871h = z6;
        ArrayList arrayList = new ArrayList();
        this.f1872i = arrayList;
        C0203d c0203d = new C0203d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
        this.j = c0203d;
        arrayList.add(c0203d);
    }

    public static void a(C0204e c0204e, ArrayList arrayList, S s9) {
        if (c0204e.f1873k) {
            N0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C0203d) M0.j(1, c0204e.f1872i)).j.add(new K("", arrayList, 0, s9, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final C0205f b() {
        if (this.f1873k) {
            N0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f1872i;
            if (arrayList.size() <= 1) {
                C0203d c0203d = this.j;
                C0205f c0205f = new C0205f(this.f1865a, this.f1866b, this.f1867c, this.f1868d, this.f1869e, new H(c0203d.f1857a, c0203d.f1858b, c0203d.f1859c, c0203d.f1860d, c0203d.f1861e, c0203d.f1862f, c0203d.g, c0203d.f1863h, c0203d.f1864i, c0203d.j), this.f1870f, this.g, this.f1871h);
                this.f1873k = true;
                return c0205f;
            }
            if (this.f1873k) {
                N0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C0203d c0203d2 = (C0203d) arrayList.remove(arrayList.size() - 1);
            ((C0203d) M0.j(1, arrayList)).j.add(new H(c0203d2.f1857a, c0203d2.f1858b, c0203d2.f1859c, c0203d2.f1860d, c0203d2.f1861e, c0203d2.f1862f, c0203d2.g, c0203d2.f1863h, c0203d2.f1864i, c0203d2.j));
        }
    }
}
