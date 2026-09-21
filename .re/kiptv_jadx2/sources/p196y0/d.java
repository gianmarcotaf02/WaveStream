package p196y0;

import io.sentry.protocol.a;

public final class d {

    public static final float[] f31732a;

    public static final float[] f31733b;

    public static final r f31734c;

    public static final r f31735d;

    public static final q f31736e;

    public static final q f31737f;
    public static final q g;

    public static final q f31738h;

    public static final q f31739i;
    public static final q j;

    public static final q f31740k;

    public static final q f31741l;

    public static final q f31742m;

    public static final q f31743n;

    public static final q f31744o;

    public static final q f31745p;

    public static final q f31746q;

    public static final q f31747r;

    public static final k f31748s;

    public static final k f31749t;

    public static final q f31750u;

    public static final q f31751v;

    public static final q f31752w;

    public static final l f31753x;
    public static final c[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f31732a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f31733b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f31734c = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f31735d = rVar4;
        s sVar = j.f31764d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f31736e = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f31737f = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new a(18), new a(19), -0.799f, 2.399f, rVar, 2);
        g = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f31738h = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f31739i = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f31740k = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f31741l = qVar8;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f31761a, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f31742m = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f31743n = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f31744o = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f31762b, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f31745p = qVar12;
        s sVar2 = j.f31763c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f31746q = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f31747r = qVar14;
        k kVar = new k(14, 1, b.f31725b, "Generic XYZ");
        f31748s = kVar;
        long j9 = b.f31726c;
        k kVar2 = new k(15, 0, j9, "Generic L*a*b*");
        f31749t = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f31750u = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new a(20), new a(21), 0.0f, 1.0f, rVar3, 17);
        f31751v = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new a(22), new a(23), 0.0f, 1.0f, rVar4, 18);
        f31752w = qVar17;
        l lVar = new l("Oklab", j9, 19);
        f31753x = lVar;
        y = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, qVar16, qVar17, lVar};
    }

    public static double a(r rVar, double d4) {
        double d6 = d4 < 0.0d ? -1.0d : 1.0d;
        double d9 = d4 * d6;
        double d10 = rVar.f31792b;
        double d11 = d10 * d9;
        return (rVar.g + 1.0d) * d6 * (d11 <= 1.0d ? Math.pow(d11, rVar.f31793c) : Math.exp((d9 - rVar.f31796f) * rVar.f31794d) + rVar.f31795e);
    }

    public static double b(r rVar, double d4) {
        double d6 = d4 < 0.0d ? -1.0d : 1.0d;
        double d9 = 1.0d / rVar.f31792b;
        double d10 = 1.0d / rVar.f31793c;
        double d11 = 1.0d / rVar.f31794d;
        double d12 = (d4 * d6) / (rVar.g + 1.0d);
        return d6 * (d12 <= 1.0d ? Math.pow(d12, d10) * d9 : (Math.log(d12 - rVar.f31795e) * d11) + rVar.f31796f);
    }

    public static double c(r rVar, double d4) {
        double d6 = d4 < 0.0d ? -1.0d : 1.0d;
        double d9 = d4 * d6;
        double d10 = rVar.f31792b;
        double d11 = rVar.f31794d;
        double dPow = (Math.pow(d9, d11) * rVar.f31793c) + d10;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d9, d11) * rVar.f31796f) + rVar.f31795e), rVar.g) * d6;
    }

    public static double d(r rVar, double d4) {
        double d6 = d4 < 0.0d ? -1.0d : 1.0d;
        double d9 = d4 * d6;
        double d10 = -rVar.f31792b;
        double d11 = 1.0d / rVar.g;
        return Math.pow(Math.max((Math.pow(d9, d11) * rVar.f31795e) + d10, 0.0d) / ((Math.pow(d9, d11) * (-rVar.f31796f)) + rVar.f31793c), 1.0d / rVar.f31794d) * d6;
    }
}
