package Z2;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;

public final class V implements Cloneable {

    public Boolean f12811A;

    public Boolean f12812B;

    public AbstractC1187e0 f12813C;

    public Float f12814D;

    public String f12815E;

    public String f12816F;

    public AbstractC1187e0 f12817G;
    public Float H;

    public AbstractC1187e0 f12818I;

    public Float f12819J;

    public int f12820K;

    public int f12821L;

    public int f12822M;

    public int f12823N;

    public int f12824O;

    public int f12825P;

    public int f12826Q;

    public int f12827R;

    public int f12828S;

    public int f12829T;

    public long f12830h = 0;

    public AbstractC1187e0 f12831i;
    public Float j;

    public AbstractC1187e0 f12832k;

    public Float f12833l;

    public F f12834m;

    public Float f12835n;

    public F[] f12836o;

    public F f12837p;

    public Float f12838q;

    public C1212w f12839r;

    public ArrayList f12840s;

    public F f12841t;

    public Integer f12842u;

    public Boolean f12843v;

    public A7.m f12844w;

    public String f12845x;
    public String y;

    public String f12846z;

    public static V a() {
        V v6 = new V();
        v6.f12830h = -1L;
        C1212w c1212w = C1212w.f12961i;
        v6.f12831i = c1212w;
        v6.f12820K = 1;
        Float fValueOf = Float.valueOf(1.0f);
        v6.j = fValueOf;
        v6.f12832k = null;
        v6.f12833l = fValueOf;
        v6.f12834m = new F(1.0f);
        v6.f12821L = 1;
        v6.f12822M = 1;
        v6.f12835n = Float.valueOf(4.0f);
        v6.f12836o = null;
        v6.f12837p = new F(0.0f);
        v6.f12838q = fValueOf;
        v6.f12839r = c1212w;
        v6.f12840s = null;
        v6.f12841t = new F(12.0f, 7);
        v6.f12842u = Integer.valueOf(RCHTTPStatusCodes.BAD_REQUEST);
        v6.f12823N = 1;
        v6.f12824O = 1;
        v6.f12825P = 1;
        v6.f12826Q = 1;
        Boolean bool = Boolean.TRUE;
        v6.f12843v = bool;
        v6.f12844w = null;
        v6.f12845x = null;
        v6.y = null;
        v6.f12846z = null;
        v6.f12811A = bool;
        v6.f12812B = bool;
        v6.f12813C = c1212w;
        v6.f12814D = fValueOf;
        v6.f12815E = null;
        v6.f12827R = 1;
        v6.f12816F = null;
        v6.f12817G = null;
        v6.H = fValueOf;
        v6.f12818I = null;
        v6.f12819J = fValueOf;
        v6.f12828S = 1;
        v6.f12829T = 1;
        return v6;
    }

    public final Object clone() {
        V v6 = (V) super.clone();
        F[] fArr = this.f12836o;
        if (fArr != null) {
            v6.f12836o = (F[]) fArr.clone();
        }
        return v6;
    }
}
