package Z2;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

public final class A0 {

    public final V f12640a;

    public boolean f12641b;

    public boolean f12642c;

    public final Paint f12643d;

    public final Paint f12644e;

    public C1209t f12645f;
    public C1209t g;

    public boolean f12646h;

    public A0() {
        Paint paint = new Paint();
        this.f12643d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.f12644e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f12640a = V.a();
    }

    public A0(A0 a2) {
        this.f12641b = a2.f12641b;
        this.f12642c = a2.f12642c;
        this.f12643d = new Paint(a2.f12643d);
        this.f12644e = new Paint(a2.f12644e);
        C1209t c1209t = a2.f12645f;
        if (c1209t != null) {
            this.f12645f = new C1209t(c1209t);
        }
        C1209t c1209t2 = a2.g;
        if (c1209t2 != null) {
            this.g = new C1209t(c1209t2);
        }
        this.f12646h = a2.f12646h;
        try {
            this.f12640a = (V) a2.f12640a.clone();
        } catch (CloneNotSupportedException e6) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e6);
            this.f12640a = V.a();
        }
    }
}
