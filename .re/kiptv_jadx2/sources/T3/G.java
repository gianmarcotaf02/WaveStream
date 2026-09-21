package T3;

import Y1.C1017b;
import Y1.C1018c;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.recyclerview.widget.C1638u;
import androidx.recyclerview.widget.c0;
import java.util.ArrayList;

public final class G implements Parcelable.Creator {

    public final int f9752a;

    public G(int i3) {
        this.f9752a = i3;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        Bundle bundle;
        switch (this.f9752a) {
            case 0:
                int iB0 = C2.a.b0(parcel);
                String strO = null;
                Integer numP = null;
                while (parcel.dataPosition() < iB0) {
                    int i3 = parcel.readInt();
                    char c9 = (char) i3;
                    if (c9 == 2) {
                        strO = C2.a.o(parcel, i3);
                    } else if (c9 != 3) {
                        C2.a.V(parcel, i3);
                    } else {
                        numP = C2.a.P(parcel, i3);
                    }
                }
                C2.a.t(parcel, iB0);
                return new o(strO, numP.intValue());
            case 1:
                int iB1 = C2.a.b0(parcel);
                String strO2 = null;
                String strO3 = null;
                String strO4 = null;
                while (parcel.dataPosition() < iB1) {
                    int i9 = parcel.readInt();
                    char c10 = (char) i9;
                    if (c10 == 2) {
                        strO2 = C2.a.o(parcel, i9);
                    } else if (c10 == 3) {
                        strO3 = C2.a.o(parcel, i9);
                    } else if (c10 != 4) {
                        C2.a.V(parcel, i9);
                    } else {
                        strO4 = C2.a.o(parcel, i9);
                    }
                }
                C2.a.t(parcel, iB1);
                return new p(strO2, strO3, strO4);
            case 2:
                try {
                    return r.a(parcel.readString());
                } catch (q e6) {
                    throw new RuntimeException(e6);
                }
            case 3:
                int iB2 = C2.a.b0(parcel);
                byte[] bArrK = null;
                String strO5 = null;
                String strO6 = null;
                String strO7 = null;
                while (parcel.dataPosition() < iB2) {
                    int i10 = parcel.readInt();
                    char c11 = (char) i10;
                    if (c11 == 2) {
                        bArrK = C2.a.k(parcel, i10);
                    } else if (c11 == 3) {
                        strO5 = C2.a.o(parcel, i10);
                    } else if (c11 == 4) {
                        strO6 = C2.a.o(parcel, i10);
                    } else if (c11 != 5) {
                        C2.a.V(parcel, i10);
                    } else {
                        strO7 = C2.a.o(parcel, i10);
                    }
                }
                C2.a.t(parcel, iB2);
                return new s(strO5, strO6, strO7, bArrK);
            case 4:
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                try {
                    return v.a(string);
                } catch (u e9) {
                    throw new RuntimeException(e9);
                }
            case 5:
                int iB3 = C2.a.b0(parcel);
                String strO8 = null;
                while (parcel.dataPosition() < iB3) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        C2.a.V(parcel, i11);
                    } else {
                        strO8 = C2.a.o(parcel, i11);
                    }
                }
                C2.a.t(parcel, iB3);
                return new H(strO8);
            case 6:
                try {
                    return w.a(parcel.readString());
                } catch (x e10) {
                    throw new RuntimeException(e10);
                }
            case 7:
                int iB4 = C2.a.b0(parcel);
                String strO9 = null;
                String strO10 = null;
                while (parcel.dataPosition() < iB4) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 2) {
                        strO9 = C2.a.o(parcel, i12);
                    } else if (c12 != 3) {
                        C2.a.V(parcel, i12);
                    } else {
                        strO10 = C2.a.o(parcel, i12);
                    }
                }
                C2.a.t(parcel, iB4);
                return new y(strO9, strO10);
            case 8:
                try {
                    return EnumC0914e.a(parcel.readString());
                } catch (C0913d e11) {
                    throw new RuntimeException(e11);
                }
            case 9:
                int iB5 = C2.a.b0(parcel);
                boolean zK = false;
                while (parcel.dataPosition() < iB5) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        C2.a.V(parcel, i13);
                    } else {
                        zK = C2.a.K(parcel, i13);
                    }
                }
                C2.a.t(parcel, iB5);
                return new z(zK);
            case 10:
                try {
                    return A.a(parcel.readString());
                } catch (I e12) {
                    throw new RuntimeException(e12);
                }
            case 11:
                int iB6 = C2.a.b0(parcel);
                C0920k c0920k = null;
                K k9 = null;
                z zVar = null;
                M m8 = null;
                B b9 = null;
                C c13 = null;
                L l2 = null;
                D d4 = null;
                C0921l c0921l = null;
                F f9 = null;
                H h9 = null;
                E e13 = null;
                while (parcel.dataPosition() < iB6) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            c0920k = (C0920k) C2.a.n(parcel, i14, C0920k.CREATOR);
                            break;
                        case 3:
                            k9 = (K) C2.a.n(parcel, i14, K.CREATOR);
                            break;
                        case 4:
                            zVar = (z) C2.a.n(parcel, i14, z.CREATOR);
                            break;
                        case 5:
                            m8 = (M) C2.a.n(parcel, i14, M.CREATOR);
                            break;
                        case 6:
                            b9 = (B) C2.a.n(parcel, i14, B.CREATOR);
                            break;
                        case 7:
                            c13 = (C) C2.a.n(parcel, i14, C.CREATOR);
                            break;
                        case '\b':
                            l2 = (L) C2.a.n(parcel, i14, L.CREATOR);
                            break;
                        case '\t':
                            d4 = (D) C2.a.n(parcel, i14, D.CREATOR);
                            break;
                        case '\n':
                            c0921l = (C0921l) C2.a.n(parcel, i14, C0921l.CREATOR);
                            break;
                        case 11:
                            f9 = (F) C2.a.n(parcel, i14, F.CREATOR);
                            break;
                        case '\f':
                            h9 = (H) C2.a.n(parcel, i14, H.CREATOR);
                            break;
                        case '\r':
                            e13 = (E) C2.a.n(parcel, i14, E.CREATOR);
                            break;
                        default:
                            C2.a.V(parcel, i14);
                            break;
                    }
                }
                C2.a.t(parcel, iB6);
                return new C0915f(c0920k, k9, zVar, m8, b9, c13, l2, d4, c0921l, f9, h9, e13);
            case 12:
                int iB7 = C2.a.b0(parcel);
                String strO11 = null;
                Boolean boolL = null;
                String strO12 = null;
                String strO13 = null;
                while (parcel.dataPosition() < iB7) {
                    int i15 = parcel.readInt();
                    char c14 = (char) i15;
                    if (c14 == 2) {
                        strO11 = C2.a.o(parcel, i15);
                    } else if (c14 == 3) {
                        boolL = C2.a.L(parcel, i15);
                    } else if (c14 == 4) {
                        strO12 = C2.a.o(parcel, i15);
                    } else if (c14 != 5) {
                        C2.a.V(parcel, i15);
                    } else {
                        strO13 = C2.a.o(parcel, i15);
                    }
                }
                C2.a.t(parcel, iB7);
                return new C0916g(strO11, boolL, strO12, strO13);
            case 13:
                try {
                    return C0918i.a(parcel.readInt());
                } catch (C0917h e14) {
                    throw new RuntimeException(e14);
                }
            case 14:
                int iB8 = C2.a.b0(parcel);
                byte[] bArrK2 = null;
                byte[] bArrK3 = null;
                byte[] bArrK4 = null;
                long jQ = 0;
                while (parcel.dataPosition() < iB8) {
                    int i16 = parcel.readInt();
                    char c15 = (char) i16;
                    if (c15 == 1) {
                        jQ = C2.a.Q(parcel, i16);
                    } else if (c15 == 2) {
                        bArrK2 = C2.a.k(parcel, i16);
                    } else if (c15 == 3) {
                        bArrK3 = C2.a.k(parcel, i16);
                    } else if (c15 != 4) {
                        C2.a.V(parcel, i16);
                    } else {
                        bArrK4 = C2.a.k(parcel, i16);
                    }
                }
                C2.a.t(parcel, iB8);
                return new J(jQ, bArrK2, bArrK3, bArrK4);
            case 15:
                int iB9 = C2.a.b0(parcel);
                ArrayList arrayListR = null;
                while (parcel.dataPosition() < iB9) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        C2.a.V(parcel, i17);
                    } else {
                        arrayListR = C2.a.r(parcel, i17, J.CREATOR);
                    }
                }
                C2.a.t(parcel, iB9);
                return new K(arrayListR);
            case 16:
                int iB10 = C2.a.b0(parcel);
                while (parcel.dataPosition() < iB10) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        C2.a.V(parcel, i18);
                    } else {
                        C2.a.K(parcel, i18);
                    }
                }
                C2.a.t(parcel, iB10);
                return new L();
            case 17:
                int iB11 = C2.a.b0(parcel);
                String strO14 = null;
                while (parcel.dataPosition() < iB11) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 2) {
                        C2.a.V(parcel, i19);
                    } else {
                        strO14 = C2.a.o(parcel, i19);
                    }
                }
                C2.a.t(parcel, iB11);
                return new C0920k(strO14);
            case 18:
                return new C1017b(parcel);
            case 19:
                return new C1018c(parcel);
            case 20:
                Y1.A a2 = new Y1.A();
                a2.f11150h = parcel.readString();
                a2.f11151i = parcel.readInt();
                return a2;
            case 21:
                Y1.E e15 = new Y1.E();
                e15.f11192l = null;
                e15.f11193m = new ArrayList();
                e15.f11194n = new ArrayList();
                e15.f11189h = parcel.createStringArrayList();
                e15.f11190i = parcel.createStringArrayList();
                e15.j = (C1017b[]) parcel.createTypedArray(C1017b.CREATOR);
                e15.f11191k = parcel.readInt();
                e15.f11192l = parcel.readString();
                e15.f11193m = parcel.createStringArrayList();
                e15.f11194n = parcel.createTypedArrayList(C1018c.CREATOR);
                e15.f11195o = parcel.createTypedArrayList(Y1.A.CREATOR);
                return e15;
            case 22:
                return new Y1.I(parcel);
            case 23:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 24:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = android.support.v4.media.a.g(mediaDescription);
                CharSequence charSequenceI = android.support.v4.media.a.i(mediaDescription);
                CharSequence charSequenceH = android.support.v4.media.a.h(mediaDescription);
                CharSequence charSequenceC = android.support.v4.media.a.c(mediaDescription);
                Bitmap bitmapE = android.support.v4.media.a.e(mediaDescription);
                Uri uriF = android.support.v4.media.a.f(mediaDescription);
                Bundle bundleD = android.support.v4.media.a.d(mediaDescription);
                if (bundleD != null) {
                    bundleD = android.support.v4.media.session.q.R(bundleD);
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable(MediaDescriptionCompat.DESCRIPTION_KEY_MEDIA_URI) : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (bundleD.containsKey(MediaDescriptionCompat.DESCRIPTION_KEY_NULL_BUNDLE_FLAG) && bundleD.size() == 2) {
                    bundle = null;
                } else {
                    bundleD.remove(MediaDescriptionCompat.DESCRIPTION_KEY_MEDIA_URI);
                    bundleD.remove(MediaDescriptionCompat.DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = android.support.v4.media.b.a(mediaDescription);
                }
                android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat = new android.support.v4.media.MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.f15557p = mediaDescription;
                return mediaDescriptionCompat;
            case 25:
                return new MediaMetadataCompat(parcel);
            case 26:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 27:
                return new android.support.v4.os.e(parcel);
            case 28:
                C1638u c1638u = new C1638u();
                c1638u.f17517h = parcel.readInt();
                c1638u.f17518i = parcel.readInt();
                c1638u.j = parcel.readInt() == 1;
                return c1638u;
            default:
                c0 c0Var = new c0();
                c0Var.f17384h = parcel.readInt();
                c0Var.f17385i = parcel.readInt();
                c0Var.f17386k = parcel.readInt() == 1;
                int i20 = parcel.readInt();
                if (i20 > 0) {
                    int[] iArr = new int[i20];
                    c0Var.j = iArr;
                    parcel.readIntArray(iArr);
                }
                return c0Var;
        }
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f9752a) {
            case 0:
                return new o[i3];
            case 1:
                return new p[i3];
            case 2:
                return new r[i3];
            case 3:
                return new s[i3];
            case 4:
                return new v[i3];
            case 5:
                return new H[i3];
            case 6:
                return new w[i3];
            case 7:
                return new y[i3];
            case 8:
                return new EnumC0914e[i3];
            case 9:
                return new z[i3];
            case 10:
                return new A[i3];
            case 11:
                return new C0915f[i3];
            case 12:
                return new C0916g[i3];
            case 13:
                return new C0918i[i3];
            case 14:
                return new J[i3];
            case 15:
                return new K[i3];
            case 16:
                return new L[i3];
            case 17:
                return new C0920k[i3];
            case 18:
                return new C1017b[i3];
            case 19:
                return new C1018c[i3];
            case 20:
                return new Y1.A[i3];
            case 21:
                return new Y1.E[i3];
            case 22:
                return new Y1.I[i3];
            case 23:
                return new MediaBrowserCompat$MediaItem[i3];
            case 24:
                return new android.support.v4.media.MediaDescriptionCompat[i3];
            case 25:
                return new MediaMetadataCompat[i3];
            case 26:
                return new RatingCompat[i3];
            case 27:
                return new android.support.v4.os.e[i3];
            case 28:
                return new C1638u[i3];
            default:
                return new c0[i3];
        }
    }
}
