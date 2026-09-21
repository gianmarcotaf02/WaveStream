package Z2;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z2.V f12640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f12643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f12644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Z2.C1209t f12645f;
    public Z2.C1209t g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12646h;

    public A0() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f12643d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Typeface typeface = android.graphics.Typeface.DEFAULT;
        paint.setTypeface(typeface);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f12644e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f12640a = Z2.V.a();
    }

    public A0(Z2.A0 a2) {
        this.f12641b = a2.f12641b;
        this.f12642c = a2.f12642c;
        this.f12643d = new android.graphics.Paint(a2.f12643d);
        this.f12644e = new android.graphics.Paint(a2.f12644e);
        Z2.C1209t c1209t = a2.f12645f;
        if (c1209t != null) {
            this.f12645f = new Z2.C1209t(c1209t);
        }
        Z2.C1209t c1209t2 = a2.g;
        if (c1209t2 != null) {
            this.g = new Z2.C1209t(c1209t2);
        }
        this.f12646h = a2.f12646h;
        try {
            this.f12640a = (Z2.V) a2.f12640a.clone();
        } catch (java.lang.CloneNotSupportedException e6) {
            android.util.Log.e("SVGAndroidRenderer", "Unexpected clone error", e6);
            this.f12640a = Z2.V.a();
        }
    }
}
