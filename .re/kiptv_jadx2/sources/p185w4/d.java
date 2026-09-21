package p185w4;

public final class d {

    public static final d f29958c;

    public static final d f29959d;

    public static final d f29960e;

    public static final d f29961f;
    public static final d g;

    public static final d f29962h;

    public static final d f29963i;
    public static final d j;

    public static final d f29964k;

    public static final d f29965l;

    public static final d f29966m;

    public static final d f29967n;

    public static final d f29968o;

    public final int f29969a;

    public final String f29970b;

    static {
        int i3 = 0;
        f29958c = new d("TINK", i3);
        f29959d = new d("CRUNCHY", i3);
        f29960e = new d("LEGACY", i3);
        f29961f = new d("NO_PREFIX", i3);
        int i9 = 1;
        g = new d("SHA1", i9);
        f29962h = new d("SHA224", i9);
        f29963i = new d("SHA256", i9);
        j = new d("SHA384", i9);
        f29964k = new d("SHA512", i9);
        int i10 = 2;
        f29965l = new d("TINK", i10);
        f29966m = new d("CRUNCHY", i10);
        f29967n = new d("LEGACY", i10);
        f29968o = new d("NO_PREFIX", i10);
    }

    public d(String str, int i3) {
        this.f29969a = i3;
        this.f29970b = str;
    }

    public final String toString() {
        switch (this.f29969a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f29970b;
    }
}
