package androidx.datastore.preferences.protobuf;

public final class W {

    public final AbstractC1514v f16167a;

    public final String f16168b;

    public final Object[] f16169c;

    public final int f16170d;

    public W(AbstractC1514v abstractC1514v, String str, Object[] objArr) {
        this.f16167a = abstractC1514v;
        this.f16168b = str;
        this.f16169c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f16170d = cCharAt;
            return;
        }
        int i3 = cCharAt & 8191;
        int i9 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i9 + 1;
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 55296) {
                this.f16170d = i3 | (cCharAt2 << i10);
                return;
            } else {
                i3 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i9 = i11;
            }
        }
    }

    public final int a() {
        int i3 = this.f16170d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }
}
