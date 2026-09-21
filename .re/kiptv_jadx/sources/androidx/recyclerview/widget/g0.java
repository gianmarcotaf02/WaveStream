package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17429e;

    public final boolean a() {
        int i3;
        int i9;
        int i10;
        int i11 = this.f17425a;
        int i12 = 2;
        if ((i11 & 7) != 0) {
            int i13 = this.f17428d;
            int i14 = this.f17426b;
            if (i13 > i14) {
                i10 = 1;
            } else {
                i10 = i13 == i14 ? 2 : 4;
            }
            if ((i10 & i11) == 0) {
                return false;
            }
        }
        if ((i11 & 112) != 0) {
            int i15 = this.f17428d;
            int i16 = this.f17427c;
            if (i15 > i16) {
                i9 = 1;
            } else {
                i9 = i15 == i16 ? 2 : 4;
            }
            if (((i9 << 4) & i11) == 0) {
                return false;
            }
        }
        if ((i11 & 1792) != 0) {
            int i17 = this.f17429e;
            int i18 = this.f17426b;
            if (i17 > i18) {
                i3 = 1;
            } else {
                i3 = i17 == i18 ? 2 : 4;
            }
            if (((i3 << 8) & i11) == 0) {
                return false;
            }
        }
        if ((i11 & 28672) != 0) {
            int i19 = this.f17429e;
            int i20 = this.f17427c;
            if (i19 > i20) {
                i12 = 1;
            } else if (i19 != i20) {
                i12 = 4;
            }
            if ((i11 & (i12 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
