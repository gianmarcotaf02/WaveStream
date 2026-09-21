package p188x0;

import F3.C0371k;
import Q0.H;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.common.util.concurrent.U;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p078i6.p;
import p113n1.l;
import p181w0.b;
import p194x6.j;
import p196y0.c;
import p196y0.d;
import p196y0.q;
import p203z0.f;

public abstract class z {

    public static L f31140a;

    public static final K f31141b = new K();

    public static Method f31142c;

    public static Method f31143d;

    public static boolean f31144e;

    public static final float[] A(ArrayList arrayList, List list, int i3) {
        if (i3 == 0) {
            if (arrayList == null) {
                return null;
            }
            m.e(arrayList, "<this>");
            float[] fArr = new float[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                fArr[i9] = ((Number) it.next()).floatValue();
                i9++;
            }
            return fArr;
        }
        float[] fArr2 = new float[list.size() + i3];
        fArr2[0] = arrayList != null ? ((Number) arrayList.get(0)).floatValue() : 0.0f;
        int iA0 = p.A0(list);
        int i10 = 1;
        for (int i11 = 1; i11 < iA0; i11++) {
            long j = ((C3098s) list.get(i11)).f31129a;
            float fFloatValue = arrayList != null ? ((Number) arrayList.get(i11)).floatValue() : i11 / p.A0(list);
            int i12 = i10 + 1;
            fArr2[i10] = fFloatValue;
            if (C3098s.e(j) == 0.0f) {
                i10 += 2;
                fArr2[i12] = fFloatValue;
            } else {
                i10 = i12;
            }
        }
        fArr2[i10] = arrayList != null ? ((Number) arrayList.get(p.A0(list))).floatValue() : 1.0f;
        return fArr2;
    }

    public static final void B(Matrix matrix, float[] fArr) {
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[15];
        fArr[0] = f9;
        fArr[1] = f13;
        fArr[2] = f18;
        fArr[3] = f10;
        fArr[4] = f14;
        fArr[5] = f19;
        fArr[6] = f12;
        fArr[7] = f16;
        fArr[8] = f20;
        matrix.setValues(fArr);
        fArr[0] = f9;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
        fArr[4] = f13;
        fArr[5] = f14;
        fArr[6] = f15;
        fArr[7] = f16;
        fArr[8] = f17;
    }

    public static final void C(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        fArr[0] = f9;
        fArr[1] = f12;
        fArr[2] = 0.0f;
        fArr[3] = f15;
        fArr[4] = f10;
        fArr[5] = f13;
        fArr[6] = 0.0f;
        fArr[7] = f16;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f11;
        fArr[13] = f14;
        fArr[14] = 0.0f;
        fArr[15] = f17;
    }

    public static final long D(b bVar) {
        float f9 = bVar.f29748c - bVar.f29746a;
        float f10 = bVar.f29749d - bVar.f29747b;
        return (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
    }

    public static final BlendMode E(int i3) {
        if (i3 == 0) {
            return BlendMode.CLEAR;
        }
        if (i3 == 1) {
            return BlendMode.SRC;
        }
        if (i3 == 2) {
            return BlendMode.DST;
        }
        if (i3 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i3 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i3 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i3 == 6) {
            return BlendMode.DST_IN;
        }
        if (i3 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i3 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i3 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i3 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i3 == 11) {
            return BlendMode.XOR;
        }
        if (i3 == 12) {
            return BlendMode.PLUS;
        }
        if (i3 == 13) {
            return BlendMode.MODULATE;
        }
        if (i3 == 14) {
            return BlendMode.SCREEN;
        }
        if (i3 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i3 == 16) {
            return BlendMode.DARKEN;
        }
        if (i3 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i3 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i3 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i3 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i3 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i3 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i3 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i3 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i3 == 25) {
            return BlendMode.HUE;
        }
        if (i3 == 26) {
            return BlendMode.SATURATION;
        }
        if (i3 == 27) {
            return BlendMode.COLOR;
        }
        return i3 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final Rect F(l lVar) {
        return new Rect(lVar.f25561a, lVar.f25562b, lVar.f25563c, lVar.f25564d);
    }

    public static final RectF G(b bVar) {
        return new RectF(bVar.f29746a, bVar.f29747b, bVar.f29748c, bVar.f29749d);
    }

    public static final int H(long j) {
        float[] fArr = d.f31732a;
        return (int) (C3098s.b(j, d.f31736e) >>> 32);
    }

    public static final Bitmap.Config I(int i3) {
        if (i3 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i3 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i3 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 26 || i3 != 3) {
            return (i9 < 26 || i3 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    public static final b J(Rect rect) {
        return new b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final b K(RectF rectF) {
        return new b(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode L(int i3) {
        if (i3 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i3 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i3 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i3 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i3 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i3 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i3 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i3 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i3 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i3 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i3 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i3 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i3 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String M(int i3) {
        if (i3 == 0) {
            return "Clear";
        }
        if (i3 == 1) {
            return "Src";
        }
        if (i3 == 2) {
            return "Dst";
        }
        if (i3 == 3) {
            return "SrcOver";
        }
        if (i3 == 4) {
            return "DstOver";
        }
        if (i3 == 5) {
            return "SrcIn";
        }
        if (i3 == 6) {
            return "DstIn";
        }
        if (i3 == 7) {
            return "SrcOut";
        }
        if (i3 == 8) {
            return "DstOut";
        }
        if (i3 == 9) {
            return "SrcAtop";
        }
        if (i3 == 10) {
            return "DstAtop";
        }
        if (i3 == 11) {
            return "Xor";
        }
        if (i3 == 12) {
            return "Plus";
        }
        if (i3 == 13) {
            return "Modulate";
        }
        if (i3 == 14) {
            return "Screen";
        }
        if (i3 == 15) {
            return "Overlay";
        }
        if (i3 == 16) {
            return "Darken";
        }
        if (i3 == 17) {
            return "Lighten";
        }
        if (i3 == 18) {
            return "ColorDodge";
        }
        if (i3 == 19) {
            return "ColorBurn";
        }
        if (i3 == 20) {
            return "HardLight";
        }
        if (i3 == 21) {
            return "Softlight";
        }
        if (i3 == 22) {
            return "Difference";
        }
        if (i3 == 23) {
            return "Exclusion";
        }
        if (i3 == 24) {
            return "Multiply";
        }
        if (i3 == 25) {
            return "Hue";
        }
        if (i3 == 26) {
            return "Saturation";
        }
        if (i3 == 27) {
            return "Color";
        }
        return i3 == 28 ? "Luminosity" : "Unknown";
    }

    public static final void N(ArrayList arrayList, List list) {
        if (arrayList == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != arrayList.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final int O(float f9, float[] fArr, int i3) {
        float f10 = f9 >= 0.0f ? f9 : 0.0f;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (Math.abs(f10 - f9) > 1.05E-6f) {
            f10 = Float.NaN;
        }
        fArr[i3] = f10;
        return !Float.isNaN(f10) ? 1 : 0;
    }

    public static final C3082b a(C3086f c3086f) {
        Canvas canvas = AbstractC3083c.f31100a;
        C3082b c3082b = new C3082b();
        c3082b.f31097a = new Canvas(j(c3086f));
        return c3082b;
    }

    public static final long b(float f9, float f10, float f11, float f12, c cVar) {
        int i3;
        int i9;
        int i10;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        float f13;
        int i26 = 31;
        if (cVar.c()) {
            float f14 = f12 < 0.0f ? 0.0f : f12;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            int i27 = ((int) ((f14 * 255.0f) + 0.5f)) << 24;
            float f15 = f9 < 0.0f ? 0.0f : f9;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i28 = i27 | (((int) ((f15 * 255.0f) + 0.5f)) << 16);
            float f16 = f10 < 0.0f ? 0.0f : f10;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i29 = i28 | (((int) ((f16 * 255.0f) + 0.5f)) << 8);
            f13 = f11 >= 0.0f ? f11 : 0.0f;
            long j = ((long) (i29 | ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i30 = C3098s.f31128h;
            return j;
        }
        int i31 = p196y0.b.f31728e;
        if (((int) (cVar.f31730b >> 32)) != 3) {
            C.a("Color only works with ColorSpaces with 3 components");
        }
        int i32 = cVar.f31731c;
        if (i32 == -1) {
            C.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float fB3 = cVar.b(0);
        float fA3 = cVar.a(0);
        if (f9 >= fB3) {
            fB3 = f9;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i33 = iFloatToRawIntBits3 >>> 31;
        int i34 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i35 = iFloatToRawIntBits3 & 8388607;
        if (i34 == 255) {
            i9 = i35 != 0 ? 512 : 0;
            i3 = 31;
        } else {
            i3 = i34 - 112;
            if (i3 >= 31) {
                i3 = 49;
                i9 = 0;
            } else {
                if (i3 > 0) {
                    int i36 = i35 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i10 = (((i3 << 10) | i36) + 1) | (i33 << 15);
                    } else {
                        i9 = i36;
                    }
                    short s9 = (short) i10;
                    fB = cVar.b(1);
                    fA = cVar.a(1);
                    if (f10 >= fB) {
                        fB = f10;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i11 = iFloatToRawIntBits >>> 31;
                    i12 = (iFloatToRawIntBits >>> 23) & 255;
                    i13 = iFloatToRawIntBits & 8388607;
                    if (i12 == 255) {
                        if (i13 != 0) {
                            i16 = 512;
                        } else {
                            i16 = 0;
                        }
                        i14 = 31;
                    } else {
                        i14 = i12 - 112;
                        if (i14 >= 31) {
                            i14 = 49;
                            i16 = 0;
                        } else {
                            if (i14 <= 0) {
                                i15 = i13 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i17 = (((i14 << 10) | i15) + 1) | (i11 << 15);
                                } else {
                                    i16 = i15;
                                }
                                short s10 = (short) i17;
                                fB2 = cVar.b(2);
                                fA2 = cVar.a(2);
                                if (f11 >= fB2) {
                                    fB2 = f11;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i19 = iFloatToRawIntBits2 >>> 31;
                                i20 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i21 = 8388607 & iFloatToRawIntBits2;
                                if (i20 == 255) {
                                    if (i21 != 0) {
                                        i23 = 512;
                                    } else {
                                        i23 = 0;
                                    }
                                    i24 = (i19 << 15) | (i26 << 10) | i23;
                                } else {
                                    i22 = i20 - 112;
                                    if (i22 >= 31) {
                                        i26 = 49;
                                    } else {
                                        if (i22 <= 0) {
                                            i23 = i21 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i24 = (((i22 << 10) | i23) + 1) | (i19 << 15);
                                            } else {
                                                i26 = i22;
                                            }
                                        } else if (i22 >= -10) {
                                            i25 = (i21 | 8388608) >> (1 - i22);
                                            if ((i25 & 4096) != 0) {
                                                i25 += 8192;
                                            }
                                            i23 = i25 >> 13;
                                            i26 = 0;
                                        } else {
                                            i26 = 0;
                                        }
                                        i24 = (i19 << 15) | (i26 << 10) | i23;
                                    }
                                    i23 = 0;
                                    i24 = (i19 << 15) | (i26 << 10) | i23;
                                }
                                short s11 = (short) i24;
                                f13 = f12 >= 0.0f ? f12 : 0.0f;
                                long j9 = ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s9) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((((long) s11) & 65535) << 16) | (((long) i32) & 63);
                                int i37 = C3098s.f31128h;
                                return j9;
                            }
                            if (i14 >= -10) {
                                i18 = (i13 | 8388608) >> (1 - i14);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i16 = i18 >> 13;
                            } else {
                                i16 = 0;
                            }
                            i14 = 0;
                        }
                    }
                    i17 = i16 | (i11 << 15) | (i14 << 10);
                    short s12 = (short) i17;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f11 >= fB2) {
                        fB2 = f11;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i19 = iFloatToRawIntBits2 >>> 31;
                    i20 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i21 = 8388607 & iFloatToRawIntBits2;
                    if (i20 == 255) {
                        if (i21 != 0) {
                            i23 = 512;
                        } else {
                            i23 = 0;
                        }
                        i24 = (i19 << 15) | (i26 << 10) | i23;
                    } else {
                        i22 = i20 - 112;
                        if (i22 >= 31) {
                            i26 = 49;
                        } else {
                            if (i22 <= 0) {
                                i23 = i21 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i24 = (((i22 << 10) | i23) + 1) | (i19 << 15);
                                } else {
                                    i26 = i22;
                                }
                            } else if (i22 >= -10) {
                                i25 = (i21 | 8388608) >> (1 - i22);
                                if ((i25 & 4096) != 0) {
                                    i25 += 8192;
                                }
                                i23 = i25 >> 13;
                                i26 = 0;
                            } else {
                                i26 = 0;
                            }
                            i24 = (i19 << 15) | (i26 << 10) | i23;
                        }
                        i23 = 0;
                        i24 = (i19 << 15) | (i26 << 10) | i23;
                    }
                    short s13 = (short) i24;
                    if (f12 >= 0.0f) {
                    }
                    long j10 = ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s9) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) s13) & 65535) << 16) | (((long) i32) & 63);
                    int i38 = C3098s.f31128h;
                    return j10;
                }
                if (i3 >= -10) {
                    int i39 = (i35 | 8388608) >> (1 - i3);
                    if ((i39 & 4096) != 0) {
                        i39 += 8192;
                    }
                    i9 = i39 >> 13;
                } else {
                    i9 = 0;
                }
                i3 = 0;
            }
        }
        i10 = i9 | (i33 << 15) | (i3 << 10);
        short s14 = (short) i10;
        fB = cVar.b(1);
        fA = cVar.a(1);
        if (f10 >= fB) {
            fB = f10;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i11 = iFloatToRawIntBits >>> 31;
        i12 = (iFloatToRawIntBits >>> 23) & 255;
        i13 = iFloatToRawIntBits & 8388607;
        if (i12 == 255) {
            if (i13 != 0) {
                i16 = 512;
            } else {
                i16 = 0;
            }
            i14 = 31;
        } else {
            i14 = i12 - 112;
            if (i14 >= 31) {
                i14 = 49;
                i16 = 0;
            } else {
                if (i14 <= 0) {
                    i15 = i13 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i17 = (((i14 << 10) | i15) + 1) | (i11 << 15);
                    } else {
                        i16 = i15;
                    }
                    short s15 = (short) i17;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f11 >= fB2) {
                        fB2 = f11;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i19 = iFloatToRawIntBits2 >>> 31;
                    i20 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i21 = 8388607 & iFloatToRawIntBits2;
                    if (i20 == 255) {
                        if (i21 != 0) {
                            i23 = 512;
                        } else {
                            i23 = 0;
                        }
                        i24 = (i19 << 15) | (i26 << 10) | i23;
                    } else {
                        i22 = i20 - 112;
                        if (i22 >= 31) {
                            i26 = 49;
                        } else {
                            if (i22 <= 0) {
                                i23 = i21 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i24 = (((i22 << 10) | i23) + 1) | (i19 << 15);
                                } else {
                                    i26 = i22;
                                }
                            } else if (i22 >= -10) {
                                i25 = (i21 | 8388608) >> (1 - i22);
                                if ((i25 & 4096) != 0) {
                                    i25 += 8192;
                                }
                                i23 = i25 >> 13;
                                i26 = 0;
                            } else {
                                i26 = 0;
                            }
                            i24 = (i19 << 15) | (i26 << 10) | i23;
                        }
                        i23 = 0;
                        i24 = (i19 << 15) | (i26 << 10) | i23;
                    }
                    short s16 = (short) i24;
                    if (f12 >= 0.0f) {
                    }
                    long j11 = ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s14) & 65535) << 48) | ((((long) s15) & 65535) << 32) | ((((long) s16) & 65535) << 16) | (((long) i32) & 63);
                    int i310 = C3098s.f31128h;
                    return j11;
                }
                if (i14 >= -10) {
                    i18 = (i13 | 8388608) >> (1 - i14);
                    if ((i18 & 4096) != 0) {
                        i18 += 8192;
                    }
                    i16 = i18 >> 13;
                } else {
                    i16 = 0;
                }
                i14 = 0;
            }
        }
        i17 = i16 | (i11 << 15) | (i14 << 10);
        short s17 = (short) i17;
        fB2 = cVar.b(2);
        fA2 = cVar.a(2);
        if (f11 >= fB2) {
            fB2 = f11;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i19 = iFloatToRawIntBits2 >>> 31;
        i20 = (iFloatToRawIntBits2 >>> 23) & 255;
        i21 = 8388607 & iFloatToRawIntBits2;
        if (i20 == 255) {
            if (i21 != 0) {
                i23 = 512;
            } else {
                i23 = 0;
            }
            i24 = (i19 << 15) | (i26 << 10) | i23;
        } else {
            i22 = i20 - 112;
            if (i22 >= 31) {
                i26 = 49;
            } else {
                if (i22 <= 0) {
                    i23 = i21 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i24 = (((i22 << 10) | i23) + 1) | (i19 << 15);
                    } else {
                        i26 = i22;
                    }
                } else if (i22 >= -10) {
                    i25 = (i21 | 8388608) >> (1 - i22);
                    if ((i25 & 4096) != 0) {
                        i25 += 8192;
                    }
                    i23 = i25 >> 13;
                    i26 = 0;
                } else {
                    i26 = 0;
                }
                i24 = (i19 << 15) | (i26 << 10) | i23;
            }
            i23 = 0;
            i24 = (i19 << 15) | (i26 << 10) | i23;
        }
        short s18 = (short) i24;
        if (f12 >= 0.0f) {
        }
        long j12 = ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s14) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((((long) s18) & 65535) << 16) | (((long) i32) & 63);
        int i311 = C3098s.f31128h;
        return j12;
    }

    public static final long c(int i3) {
        long j = ((long) i3) << 32;
        int i9 = C3098s.f31128h;
        return j;
    }

    public static final long d(long j) {
        long j9 = j << 32;
        int i3 = C3098s.f31128h;
        return j9;
    }

    public static long e(int i3, int i9, int i10) {
        return c(((i3 & 255) << 16) | (-16777216) | ((i9 & 255) << 8) | (i10 & 255));
    }

    public static C3086f f(int i3, int i9, int i10) {
        Bitmap bitmapCreateBitmap;
        q qVar = d.f31736e;
        Bitmap.Config configI = I(i10);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i3, i9, I(i10), true, v.a(qVar));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i3, i9, configI);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new C3086f(bitmapCreateBitmap);
    }

    public static final C0371k g() {
        return new C0371k(new Paint(7));
    }

    public static final long h(float f9, float f10) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
        int i3 = T.f31095c;
        return jFloatToRawIntBits;
    }

    public static final long i(float f9, float f10, float f11, float f12, c cVar) {
        int i3;
        int i9;
        int i10;
        int iFloatToRawIntBits;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iFloatToRawIntBits2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = 31;
        if (cVar.c()) {
            long j = ((long) ((((((int) ((f12 * 255.0f) + 0.5f)) << 24) | (((int) ((f9 * 255.0f) + 0.5f)) << 16)) | (((int) ((f10 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f11) + 0.5f)))) << 32;
            int i26 = C3098s.f31128h;
            return j;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f9);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i29 = iFloatToRawIntBits3 & 8388607;
        int i30 = 0;
        if (i28 == 255) {
            i9 = i29 != 0 ? 512 : 0;
            i3 = 31;
        } else {
            i3 = i28 - 112;
            if (i3 >= 31) {
                i3 = 49;
                i9 = 0;
            } else {
                if (i3 > 0) {
                    int i31 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i10 = (((i3 << 10) | i31) + 1) | (i27 << 15);
                    } else {
                        i9 = i31;
                    }
                    short s9 = (short) i10;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f10);
                    i11 = iFloatToRawIntBits >>> 31;
                    i12 = (iFloatToRawIntBits >>> 23) & 255;
                    i13 = iFloatToRawIntBits & 8388607;
                    if (i12 == 255) {
                        if (i13 != 0) {
                            i16 = 512;
                        } else {
                            i16 = 0;
                        }
                        i14 = 31;
                    } else {
                        i14 = i12 - 112;
                        if (i14 >= 31) {
                            i14 = 49;
                            i16 = 0;
                        } else {
                            if (i14 <= 0) {
                                i15 = i13 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i17 = (((i14 << 10) | i15) + 1) | (i11 << 15);
                                } else {
                                    i16 = i15;
                                }
                                short s10 = (short) i17;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f11);
                                i19 = iFloatToRawIntBits2 >>> 31;
                                i20 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i21 = 8388607 & iFloatToRawIntBits2;
                                if (i20 == 255) {
                                    i30 = i21 == 0 ? 0 : 512;
                                } else {
                                    i22 = i20 - 112;
                                    if (i22 >= 31) {
                                        i25 = 49;
                                    } else {
                                        if (i22 <= 0) {
                                            i30 = i21 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i23 = (((i22 << 10) | i30) + 1) | (i19 << 15);
                                            } else {
                                                i25 = i22;
                                            }
                                            long jMax = ((((long) s9) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((((long) ((short) i23)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31731c) & 63);
                                            int i32 = C3098s.f31128h;
                                            return jMax;
                                        }
                                        if (i22 >= -10) {
                                            i24 = (i21 | 8388608) >> (1 - i22);
                                            if ((i24 & 4096) != 0) {
                                                i24 += 8192;
                                            }
                                            i30 = i24 >> 13;
                                            i25 = 0;
                                        } else {
                                            i25 = 0;
                                        }
                                    }
                                }
                                i23 = (i25 << 10) | (i19 << 15) | i30;
                                long jMax2 = ((((long) s9) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((((long) ((short) i23)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31731c) & 63);
                                int i33 = C3098s.f31128h;
                                return jMax2;
                            }
                            if (i14 >= -10) {
                                i18 = (i13 | 8388608) >> (1 - i14);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i16 = i18 >> 13;
                                i14 = 0;
                            } else {
                                i16 = 0;
                                i14 = 0;
                            }
                        }
                    }
                    i17 = i16 | (i11 << 15) | (i14 << 10);
                    short s11 = (short) i17;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f11);
                    i19 = iFloatToRawIntBits2 >>> 31;
                    i20 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i21 = 8388607 & iFloatToRawIntBits2;
                    if (i20 == 255) {
                        i30 = i21 == 0 ? 0 : 512;
                    } else {
                        i22 = i20 - 112;
                        if (i22 >= 31) {
                            i25 = 49;
                        } else {
                            if (i22 <= 0) {
                                i30 = i21 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i23 = (((i22 << 10) | i30) + 1) | (i19 << 15);
                                } else {
                                    i25 = i22;
                                }
                                long jMax3 = ((((long) s9) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((short) i23)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31731c) & 63);
                                int i34 = C3098s.f31128h;
                                return jMax3;
                            }
                            if (i22 >= -10) {
                                i24 = (i21 | 8388608) >> (1 - i22);
                                if ((i24 & 4096) != 0) {
                                    i24 += 8192;
                                }
                                i30 = i24 >> 13;
                                i25 = 0;
                            } else {
                                i25 = 0;
                            }
                        }
                    }
                    i23 = (i25 << 10) | (i19 << 15) | i30;
                    long jMax4 = ((((long) s9) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((short) i23)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31731c) & 63);
                    int i35 = C3098s.f31128h;
                    return jMax4;
                }
                if (i3 >= -10) {
                    int i36 = (i29 | 8388608) >> (1 - i3);
                    if ((i36 & 4096) != 0) {
                        i36 += 8192;
                    }
                    i9 = i36 >> 13;
                    i3 = 0;
                } else {
                    i9 = 0;
                    i3 = 0;
                }
            }
        }
        i10 = i9 | (i27 << 15) | (i3 << 10);
        short s12 = (short) i10;
        iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        i11 = iFloatToRawIntBits >>> 31;
        i12 = (iFloatToRawIntBits >>> 23) & 255;
        i13 = iFloatToRawIntBits & 8388607;
        if (i12 == 255) {
            if (i13 != 0) {
                i16 = 512;
            } else {
                i16 = 0;
            }
            i14 = 31;
        } else {
            i14 = i12 - 112;
            if (i14 >= 31) {
                i14 = 49;
                i16 = 0;
            } else {
                if (i14 <= 0) {
                    i15 = i13 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i17 = (((i14 << 10) | i15) + 1) | (i11 << 15);
                    } else {
                        i16 = i15;
                    }
                    short s13 = (short) i17;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f11);
                    i19 = iFloatToRawIntBits2 >>> 31;
                    i20 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i21 = 8388607 & iFloatToRawIntBits2;
                    if (i20 == 255) {
                        i30 = i21 == 0 ? 0 : 512;
                    } else {
                        i22 = i20 - 112;
                        if (i22 >= 31) {
                            i25 = 49;
                        } else {
                            if (i22 <= 0) {
                                i30 = i21 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i23 = (((i22 << 10) | i30) + 1) | (i19 << 15);
                                } else {
                                    i25 = i22;
                                }
                                long jMax5 = ((((long) s12) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((((long) ((short) i23)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31731c) & 63);
                                int i37 = C3098s.f31128h;
                                return jMax5;
                            }
                            if (i22 >= -10) {
                                i24 = (i21 | 8388608) >> (1 - i22);
                                if ((i24 & 4096) != 0) {
                                    i24 += 8192;
                                }
                                i30 = i24 >> 13;
                                i25 = 0;
                            } else {
                                i25 = 0;
                            }
                        }
                    }
                    i23 = (i25 << 10) | (i19 << 15) | i30;
                    long jMax6 = ((((long) s12) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((((long) ((short) i23)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31731c) & 63);
                    int i38 = C3098s.f31128h;
                    return jMax6;
                }
                if (i14 >= -10) {
                    i18 = (i13 | 8388608) >> (1 - i14);
                    if ((i18 & 4096) != 0) {
                        i18 += 8192;
                    }
                    i16 = i18 >> 13;
                    i14 = 0;
                } else {
                    i16 = 0;
                    i14 = 0;
                }
            }
        }
        i17 = i16 | (i11 << 15) | (i14 << 10);
        short s14 = (short) i17;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f11);
        i19 = iFloatToRawIntBits2 >>> 31;
        i20 = (iFloatToRawIntBits2 >>> 23) & 255;
        i21 = 8388607 & iFloatToRawIntBits2;
        if (i20 == 255) {
            i30 = i21 == 0 ? 0 : 512;
        } else {
            i22 = i20 - 112;
            if (i22 >= 31) {
                i25 = 49;
            } else {
                if (i22 <= 0) {
                    i30 = i21 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i23 = (((i22 << 10) | i30) + 1) | (i19 << 15);
                    } else {
                        i25 = i22;
                    }
                    long jMax7 = ((((long) s12) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((short) i23)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31731c) & 63);
                    int i39 = C3098s.f31128h;
                    return jMax7;
                }
                if (i22 >= -10) {
                    i24 = (i21 | 8388608) >> (1 - i22);
                    if ((i24 & 4096) != 0) {
                        i24 += 8192;
                    }
                    i30 = i24 >> 13;
                    i25 = 0;
                } else {
                    i25 = 0;
                }
            }
        }
        i23 = (i25 << 10) | (i19 << 15) | i30;
        long jMax8 = ((((long) s12) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((short) i23)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31731c) & 63);
        int i310 = C3098s.f31128h;
        return jMax8;
    }

    public static final Bitmap j(C3086f c3086f) {
        if (c3086f instanceof C3086f) {
            return c3086f.f31108a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long k(long j, long j9) {
        float f9;
        float f10;
        long jB = C3098s.b(j, C3098s.g(j9));
        float fE = C3098s.e(j9);
        float fE2 = C3098s.e(jB);
        float f11 = 1.0f - fE2;
        float f12 = (fE * f11) + fE2;
        float fI = C3098s.i(jB);
        float fI2 = C3098s.i(j9);
        float f13 = 0.0f;
        if (f12 == 0.0f) {
            f9 = 0.0f;
        } else {
            f9 = (((fI2 * fE) * f11) + (fI * fE2)) / f12;
        }
        float fH = C3098s.h(jB);
        float fH2 = C3098s.h(j9);
        if (f12 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((fH2 * fE) * f11) + (fH * fE2)) / f12;
        }
        float f14 = C3098s.f(jB);
        float f15 = C3098s.f(j9);
        if (f12 != 0.0f) {
            f13 = (((f15 * fE) * f11) + (f14 * fE2)) / f12;
        }
        return i(f9, f10, f13, f12, C3098s.g(j9));
    }

    public static final int l(List list) {
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iA0 = p.A0(list);
        for (int i9 = 1; i9 < iA0; i9++) {
            if (C3098s.e(((C3098s) list.get(i9)).f31129a) == 0.0f) {
                i3++;
            }
        }
        return i3;
    }

    public static void m(H h9, z zVar, AbstractC3095o abstractC3095o, float f9, p203z0.c cVar, int i3) {
        p203z0.c cVar2 = (i3 & 8) != 0 ? f.f32132b : cVar;
        if (zVar instanceof G) {
            b bVar = ((G) zVar).f31049f;
            h9.A0(abstractC3095o, (((long) Float.floatToRawIntBits(bVar.f29746a)) << 32) | (((long) Float.floatToRawIntBits(bVar.f29747b)) & 4294967295L), D(bVar), f9, cVar2, 3);
            return;
        }
        if (!(zVar instanceof H)) {
            if (!(zVar instanceof F)) {
                throw new I3.b();
            }
            h9.v(((F) zVar).f31048f, abstractC3095o, f9, cVar2, 3);
            return;
        }
        H h10 = (H) zVar;
        C3088h c3088h = h10.g;
        if (c3088h != null) {
            h9.v(c3088h, abstractC3095o, f9, cVar2, 3);
            return;
        }
        p181w0.c cVar3 = h10.f31050f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar3.f29756h >> 32));
        h9.c(abstractC3095o, (((long) Float.floatToRawIntBits(cVar3.f29751b)) & 4294967295L) | (((long) Float.floatToRawIntBits(cVar3.f29750a)) << 32), (((long) Float.floatToRawIntBits(cVar3.b())) << 32) | (((long) Float.floatToRawIntBits(cVar3.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), f9, cVar2);
    }

    public static void n(p203z0.d dVar, z zVar, long j, float f9, p203z0.c cVar, int i3) {
        float f10 = (i3 & 4) != 0 ? 1.0f : f9;
        p203z0.c cVar2 = (i3 & 8) != 0 ? f.f32132b : cVar;
        if (zVar instanceof G) {
            b bVar = ((G) zVar).f31049f;
            dVar.e(j, (((long) Float.floatToRawIntBits(bVar.f29746a)) << 32) | (((long) Float.floatToRawIntBits(bVar.f29747b)) & 4294967295L), D(bVar), f10, cVar2, 3);
            return;
        }
        if (!(zVar instanceof H)) {
            if (!(zVar instanceof F)) {
                throw new I3.b();
            }
            dVar.w0(((F) zVar).f31048f, j, f10, cVar2);
            return;
        }
        H h9 = (H) zVar;
        C3088h c3088h = h9.g;
        if (c3088h != null) {
            dVar.w0(c3088h, j, f10, cVar2);
            return;
        }
        p181w0.c cVar3 = h9.f31050f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar3.f29756h >> 32));
        p203z0.c cVar4 = cVar2;
        dVar.O(j, (((long) Float.floatToRawIntBits(cVar3.f29750a)) << 32) | (((long) Float.floatToRawIntBits(cVar3.f29751b)) & 4294967295L), (((long) Float.floatToRawIntBits(cVar3.b())) << 32) | (((long) Float.floatToRawIntBits(cVar3.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), cVar4, f10);
    }

    public static void o(Canvas canvas, boolean z6) {
        Method method;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            if (z6) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f31144e) {
            try {
                if (i3 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f31142c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f31143d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f31142c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f31143d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f31142c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f31143d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f31144e = true;
        }
        if (z6) {
            try {
                Method method4 = f31142c;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z6 || (method = f31143d) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static long p() {
        return C3098s.f31123b;
    }

    public static long r() {
        return C3098s.f31124c;
    }

    public static final p137q0.p s(p137q0.p pVar, j jVar) {
        return pVar.d(new C3093m(jVar));
    }

    public static p137q0.p t(float f9, float f10, float f11, float f12, O o8, int i3) {
        float f13 = (i3 & 1) != 0 ? 1.0f : f9;
        float f14 = (i3 & 2) != 0 ? 1.0f : f10;
        float f15 = (i3 & 4) != 0 ? 1.0f : f11;
        float f16 = (i3 & 32) != 0 ? 0.0f : f12;
        long j = T.f31094b;
        O o9 = (i3 & 2048) != 0 ? f31141b : o8;
        long j9 = A.f31041a;
        return new y(f13, f14, f15, f16, j, o9, false, j9, j9);
    }

    public static p137q0.p u(p137q0.p pVar, float f9, float f10, float f11, O o8, int i3) {
        float f12 = (i3 & 1) != 0 ? 1.0f : f9;
        float f13 = (i3 & 2) != 0 ? 1.0f : f10;
        float f14 = (i3 & 4) != 0 ? 1.0f : f11;
        long j = T.f31094b;
        O o9 = (i3 & 2048) != 0 ? f31141b : o8;
        boolean z6 = (i3 & 4096) == 0;
        long j9 = A.f31041a;
        return pVar.d(new y(f12, f13, f14, 0.0f, j, o9, z6, j9, j9));
    }

    public static float v(int i3, float f9, float f10, float f11) {
        float f12 = ((f9 / 60.0f) + i3) % 6.0f;
        return f11 - (Math.max(0.0f, Math.min(f12, Math.min(4 - f12, 1.0f))) * (f10 * f11));
    }

    public static final boolean w(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final long x(long j, long j9, float f9) {
        p196y0.l lVar = d.f31753x;
        long jB = C3098s.b(j, lVar);
        long jB2 = C3098s.b(j9, lVar);
        float fE = C3098s.e(jB);
        float fI = C3098s.i(jB);
        float fH = C3098s.h(jB);
        float f10 = C3098s.f(jB);
        float fE2 = C3098s.e(jB2);
        float fI2 = C3098s.i(jB2);
        float fH2 = C3098s.h(jB2);
        float f11 = C3098s.f(jB2);
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        return C3098s.b(i(U.u0(fI, fI2, f9), U.u0(fH, fH2, f9), U.u0(f10, f11, f9), U.u0(fE, fE2, f9), lVar), C3098s.g(j9));
    }

    public static final float y(long j) {
        c cVarG = C3098s.g(j);
        if (!p196y0.b.a(cVarG.f31730b, p196y0.b.f31724a)) {
            C.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) p196y0.b.b(cVarG.f31730b)));
        }
        double dI = C3098s.i(j);
        p196y0.m mVar = ((q) cVarG).f31789p;
        double dC = mVar.c(dI);
        float fC = (float) ((mVar.c(C3098s.f(j)) * 0.0722d) + (mVar.c(C3098s.h(j)) * 0.7152d) + (dC * 0.2126d));
        if (fC < 0.0f) {
            fC = 0.0f;
        }
        if (fC > 1.0f) {
            return 1.0f;
        }
        return fC;
    }

    public static final int[] z(int i3, List list) {
        int i9;
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i10 < size) {
                iArr[i10] = H(((C3098s) list.get(i10)).f31129a);
                i10++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i3];
        int iA0 = p.A0(list);
        int size2 = list.size();
        int i11 = 0;
        while (i10 < size2) {
            long j = ((C3098s) list.get(i10)).f31129a;
            if (C3098s.e(j) == 0.0f) {
                if (i10 == 0) {
                    i9 = i11 + 1;
                    iArr2[i11] = H(C3098s.c(((C3098s) list.get(1)).f31129a, 0.0f));
                } else if (i10 == iA0) {
                    i9 = i11 + 1;
                    iArr2[i11] = H(C3098s.c(((C3098s) list.get(i10 - 1)).f31129a, 0.0f));
                } else {
                    int i12 = i11 + 1;
                    iArr2[i11] = H(C3098s.c(((C3098s) list.get(i10 - 1)).f31129a, 0.0f));
                    i11 += 2;
                    iArr2[i12] = H(C3098s.c(((C3098s) list.get(i10 + 1)).f31129a, 0.0f));
                }
                i11 = i9;
            } else {
                iArr2[i11] = H(j);
                i11++;
            }
            i10++;
        }
        return iArr2;
    }

    public abstract b q();
}
