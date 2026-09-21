package Z2;

import U.C0948v;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.C1504k;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Locale;
import p110m7.AbstractC2629b;
import p110m7.AbstractC2632e;

public class M implements N {

    public final int f12782a;

    public int f12783b;

    public int f12784c;

    public Object f12785d;

    public Object f12786e;

    public M(int i3) {
        this.f12782a = i3;
    }

    public static boolean G(int i3) {
        return i3 == 32 || i3 == 10 || i3 == 13 || i3 == 9;
    }

    public static M H(OutputStream outputStream, int i3) {
        return new M(outputStream, new byte[i3]);
    }

    public static int l(int i3, int i9) {
        return n(i9) + s(i3);
    }

    public static int m(int i3, int i9) {
        return n(i9) + s(i3);
    }

    public static int n(int i3) {
        if (i3 >= 0) {
            return q(i3);
        }
        return 10;
    }

    public static int o(int i3, AbstractC2629b abstractC2629b) {
        return p(abstractC2629b) + s(i3);
    }

    public static int p(AbstractC2629b abstractC2629b) {
        int iB = abstractC2629b.b();
        return q(iB) + iB;
    }

    public static int q(int i3) {
        if ((i3 & (-128)) == 0) {
            return 1;
        }
        if ((i3 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i3) == 0) {
            return 3;
        }
        return (i3 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int r(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int s(int i3) {
        return q(i3 << 3);
    }

    public boolean A(int i3) {
        int i9 = this.f12783b + 1;
        if (i3 > this.f12784c || i9 > i3) {
            return false;
        }
        CharSequence charSequence = (CharSequence) this.f12785d;
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i3))) {
            int i10 = i3 - 1;
            if (!Character.isSurrogate(charSequence.charAt(i10))) {
                if (!T1.j.d()) {
                    return false;
                }
                T1.j jVarA = T1.j.a();
                if (jVarA.c() != 1 || jVarA.b(charSequence, i10) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean B(int i3) {
        int i9 = this.f12783b + 1;
        if (i3 > this.f12784c || i9 > i3) {
            return false;
        }
        return AbstractC1864o0.j0(Character.codePointBefore((CharSequence) this.f12785d, i3));
    }

    public boolean C(int i3) {
        i(i3);
        if (!((BreakIterator) this.f12786e).isBoundary(i3)) {
            return false;
        }
        if (E(i3) && E(i3 - 1) && E(i3 + 1)) {
            return false;
        }
        return i3 <= 0 || i3 >= ((CharSequence) this.f12785d).length() - 1 || !(D(i3) || D(i3 + 1));
    }

    public boolean D(int i3) {
        int i9 = i3 - 1;
        CharSequence charSequence = (CharSequence) this.f12785d;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i9));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (kotlin.jvm.internal.m.a(unicodeBlockOf, unicodeBlock) && kotlin.jvm.internal.m.a(Character.UnicodeBlock.of(charSequence.charAt(i3)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return kotlin.jvm.internal.m.a(Character.UnicodeBlock.of(charSequence.charAt(i3)), unicodeBlock) && kotlin.jvm.internal.m.a(Character.UnicodeBlock.of(charSequence.charAt(i9)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean E(int i3) {
        if (i3 >= this.f12784c || this.f12783b > i3) {
            return false;
        }
        CharSequence charSequence = (CharSequence) this.f12785d;
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i3)) && !Character.isSurrogate(charSequence.charAt(i3))) {
            if (!T1.j.d()) {
                return false;
            }
            T1.j jVarA = T1.j.a();
            if (jVarA.c() != 1 || jVarA.b(charSequence, i3) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean F(int i3) {
        if (i3 >= this.f12784c || this.f12783b > i3) {
            return false;
        }
        return AbstractC1864o0.j0(Character.codePointAt((CharSequence) this.f12785d, i3));
    }

    public int I(int i3) {
        i(i3);
        int iFollowing = ((BreakIterator) this.f12786e).following(i3);
        return (E(iFollowing + (-1)) && E(iFollowing) && !D(iFollowing)) ? I(iFollowing) : iFollowing;
    }

    public Integer J() {
        int i3 = this.f12783b;
        if (i3 == this.f12784c) {
            return null;
        }
        this.f12783b = i3 + 1;
        return Integer.valueOf(((String) this.f12785d).charAt(i3));
    }

    public float K() {
        int i3 = this.f12783b;
        int i9 = this.f12784c;
        C1207q c1207q = (C1207q) this.f12786e;
        float fA = c1207q.a(i3, i9, (String) this.f12785d);
        if (!Float.isNaN(fA)) {
            this.f12783b = c1207q.f12915a;
        }
        return fA;
    }

    public F L() {
        float fK = K();
        if (Float.isNaN(fK)) {
            return null;
        }
        int iP = P();
        return iP == 0 ? new F(fK, 1) : new F(fK, iP);
    }

    public String M() {
        if (w()) {
            return null;
        }
        int i3 = this.f12783b;
        String str = (String) this.f12785d;
        char cCharAt = str.charAt(i3);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iG = g();
        while (iG != -1 && iG != cCharAt) {
            iG = g();
        }
        if (iG == -1) {
            this.f12783b = i3;
            return null;
        }
        int i9 = this.f12783b;
        this.f12783b = i9 + 1;
        return str.substring(i3 + 1, i9);
    }

    public String N() {
        return O(' ', false);
    }

    public String O(char c9, boolean z6) {
        if (w()) {
            return null;
        }
        int i3 = this.f12783b;
        String str = (String) this.f12785d;
        char cCharAt = str.charAt(i3);
        if ((!z6 && G(cCharAt)) || cCharAt == c9) {
            return null;
        }
        int i9 = this.f12783b;
        int iG = g();
        while (iG != -1 && iG != c9 && (z6 || !G(iG))) {
            iG = g();
        }
        return str.substring(i9, this.f12783b);
    }

    public int P() {
        if (w()) {
            return 0;
        }
        int i3 = this.f12783b;
        String str = (String) this.f12785d;
        if (str.charAt(i3) == '%') {
            this.f12783b++;
            return 9;
        }
        int i9 = this.f12783b;
        if (i9 > this.f12784c - 2) {
            return 0;
        }
        try {
            int iB = Y6.f.B(str.substring(i9, i9 + 2).toLowerCase(Locale.US));
            this.f12783b += 2;
            return iB;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public void R(Typeface typeface) {
        int i3;
        if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f12783b) != -1) {
            typeface = p103m.T.a(typeface, i3, (this.f12784c & 2) != 0);
        }
        p103m.U u6 = (p103m.U) this.f12786e;
        if (u6.f24976m) {
            u6.f24975l = typeface;
            TextView textView = (TextView) ((WeakReference) this.f12785d).get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new android.support.v4.os.d(textView, typeface, u6.j, 3));
                } else {
                    textView.setTypeface(typeface, u6.j);
                }
            }
        }
    }

    public float S() {
        W();
        int i3 = this.f12783b;
        int i9 = this.f12784c;
        C1207q c1207q = (C1207q) this.f12786e;
        float fA = c1207q.a(i3, i9, (String) this.f12785d);
        if (!Float.isNaN(fA)) {
            this.f12783b = c1207q.f12915a;
        }
        return fA;
    }

    public int T(int i3) {
        i(i3);
        int iPreceding = ((BreakIterator) this.f12786e).preceding(i3);
        return (E(iPreceding) && A(iPreceding) && !D(iPreceding)) ? T(iPreceding) : iPreceding;
    }

    public void U() throws IOException {
        OutputStream outputStream = (OutputStream) this.f12786e;
        if (outputStream == null) {
            throw new C1504k("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write((byte[]) this.f12785d, 0, this.f12784c);
        this.f12784c = 0;
    }

    public void V(int i3, int i9, String str) {
        if (i3 > i9) {
            p065h1.a.a("start index must be less than or equal to end index: " + i3 + " > " + i9);
        }
        if (i3 < 0) {
            p065h1.a.a("start must be non-negative, but was " + i3);
        }
        C0948v c0948v = (C0948v) this.f12786e;
        if (c0948v == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i3, 64);
            int iMin2 = Math.min(((String) this.f12785d).length() - i9, 64);
            String str2 = (String) this.f12785d;
            int i10 = i3 - iMin;
            kotlin.jvm.internal.m.c(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i10, i3, cArr, 0);
            String str3 = (String) this.f12785d;
            int i11 = iMax - iMin2;
            int i12 = iMin2 + i9;
            kotlin.jvm.internal.m.c(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i9, i12, cArr, i11);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C0948v c0948v2 = new C0948v(5);
            c0948v2.f10086b = iMax;
            c0948v2.f10089e = cArr;
            c0948v2.f10087c = length;
            c0948v2.f10088d = i11;
            this.f12786e = c0948v2;
            this.f12783b = i10;
            this.f12784c = i12;
            return;
        }
        int i13 = this.f12783b;
        int i14 = i3 - i13;
        int i15 = i9 - i13;
        if (i14 < 0 || i15 > c0948v.f10086b - c0948v.d()) {
            this.f12785d = toString();
            this.f12786e = null;
            this.f12783b = -1;
            this.f12784c = -1;
            V(i3, i9, str);
            return;
        }
        int length2 = str.length() - (i15 - i14);
        if (length2 > c0948v.d()) {
            int iD = length2 - c0948v.d();
            int i16 = c0948v.f10086b;
            do {
                i16 *= 2;
            } while (i16 - c0948v.f10086b < iD);
            char[] cArr2 = new char[i16];
            p078i6.m.b0((char[]) c0948v.f10089e, cArr2, 0, 0, c0948v.f10087c);
            int i17 = c0948v.f10086b;
            int i18 = c0948v.f10088d;
            int i19 = i17 - i18;
            int i20 = i16 - i19;
            p078i6.m.b0((char[]) c0948v.f10089e, cArr2, i20, i18, i19 + i18);
            c0948v.f10089e = cArr2;
            c0948v.f10086b = i16;
            c0948v.f10088d = i20;
        }
        int i21 = c0948v.f10087c;
        if (i14 < i21 && i15 <= i21) {
            int i22 = i21 - i15;
            char[] cArr3 = (char[]) c0948v.f10089e;
            p078i6.m.b0(cArr3, cArr3, c0948v.f10088d - i22, i15, i21);
            c0948v.f10087c = i14;
            c0948v.f10088d -= i22;
        } else if (i14 >= i21 || i15 < i21) {
            int iD2 = c0948v.d() + i14;
            int iD3 = c0948v.d() + i15;
            int i23 = c0948v.f10088d;
            char[] cArr4 = (char[]) c0948v.f10089e;
            p078i6.m.b0(cArr4, cArr4, c0948v.f10087c, i23, iD2);
            c0948v.f10087c += iD2 - i23;
            c0948v.f10088d = iD3;
        } else {
            c0948v.f10088d = c0948v.d() + i15;
            c0948v.f10087c = i14;
        }
        str.getChars(0, str.length(), (char[]) c0948v.f10089e, c0948v.f10087c);
        c0948v.f10087c = str.length() + c0948v.f10087c;
    }

    public boolean W() {
        X();
        int i3 = this.f12783b;
        if (i3 == this.f12784c || ((String) this.f12785d).charAt(i3) != ',') {
            return false;
        }
        this.f12783b++;
        X();
        return true;
    }

    public void X() {
        while (true) {
            int i3 = this.f12783b;
            if (i3 >= this.f12784c || !G(((String) this.f12785d).charAt(i3))) {
                return;
            } else {
                this.f12783b++;
            }
        }
    }

    public void Y(int i3, int i9) throws IOException {
        k0(i3, 0);
        a0(i9);
    }

    public void Z(int i3, int i9) throws IOException {
        k0(i3, 0);
        a0(i9);
    }

    @Override
    public void a(float f9, float f10, float f11, float f12) {
        f((byte) 3);
        v(4);
        float[] fArr = (float[]) this.f12786e;
        int i3 = this.f12784c;
        int i9 = i3 + 1;
        this.f12784c = i9;
        fArr[i3] = f9;
        int i10 = i3 + 2;
        this.f12784c = i10;
        fArr[i9] = f10;
        int i11 = i3 + 3;
        this.f12784c = i11;
        fArr[i10] = f11;
        this.f12784c = i3 + 4;
        fArr[i11] = f12;
    }

    public void a0(int i3) throws IOException {
        if (i3 >= 0) {
            i0(i3);
        } else {
            j0(i3);
        }
    }

    @Override
    public void b(float f9, float f10) {
        f((byte) 0);
        v(2);
        float[] fArr = (float[]) this.f12786e;
        int i3 = this.f12784c;
        int i9 = i3 + 1;
        this.f12784c = i9;
        fArr[i3] = f9;
        this.f12784c = i3 + 2;
        fArr[i9] = f10;
    }

    public void b0(int i3, AbstractC2629b abstractC2629b) throws IOException {
        k0(i3, 2);
        c0(abstractC2629b);
    }

    @Override
    public void c(float f9, float f10, float f11, float f12, float f13, float f14) {
        f((byte) 2);
        v(6);
        float[] fArr = (float[]) this.f12786e;
        int i3 = this.f12784c;
        int i9 = i3 + 1;
        this.f12784c = i9;
        fArr[i3] = f9;
        int i10 = i3 + 2;
        this.f12784c = i10;
        fArr[i9] = f10;
        int i11 = i3 + 3;
        this.f12784c = i11;
        fArr[i10] = f11;
        int i12 = i3 + 4;
        this.f12784c = i12;
        fArr[i11] = f12;
        int i13 = i3 + 5;
        this.f12784c = i13;
        fArr[i12] = f13;
        this.f12784c = i3 + 6;
        fArr[i13] = f14;
    }

    public void c0(AbstractC2629b abstractC2629b) throws IOException {
        i0(abstractC2629b.b());
        abstractC2629b.e(this);
    }

    @Override
    public void close() {
        f((byte) 8);
    }

    @Override
    public void d(float f9, float f10, float f11, boolean z6, boolean z9, float f12, float f13) {
        f((byte) ((z6 ? 2 : 0) | 4 | (z9 ? 1 : 0)));
        v(5);
        float[] fArr = (float[]) this.f12786e;
        int i3 = this.f12784c;
        int i9 = i3 + 1;
        this.f12784c = i9;
        fArr[i3] = f9;
        int i10 = i3 + 2;
        this.f12784c = i10;
        fArr[i9] = f10;
        int i11 = i3 + 3;
        this.f12784c = i11;
        fArr[i10] = f11;
        int i12 = i3 + 4;
        this.f12784c = i12;
        fArr[i11] = f12;
        this.f12784c = i3 + 5;
        fArr[i12] = f13;
    }

    public void d0(int i3) throws IOException {
        byte b9 = (byte) i3;
        if (this.f12784c == this.f12783b) {
            U();
        }
        int i9 = this.f12784c;
        this.f12784c = i9 + 1;
        ((byte[]) this.f12785d)[i9] = b9;
    }

    @Override
    public void e(float f9, float f10) {
        f((byte) 1);
        v(2);
        float[] fArr = (float[]) this.f12786e;
        int i3 = this.f12784c;
        int i9 = i3 + 1;
        this.f12784c = i9;
        fArr[i3] = f9;
        this.f12784c = i3 + 2;
        fArr[i9] = f10;
    }

    public void e0(AbstractC2632e abstractC2632e) throws IOException {
        int size = abstractC2632e.size();
        int i3 = this.f12784c;
        int i9 = this.f12783b;
        int i10 = i9 - i3;
        byte[] bArr = (byte[]) this.f12785d;
        if (i10 >= size) {
            abstractC2632e.f(0, i3, size, bArr);
            this.f12784c += size;
            return;
        }
        abstractC2632e.f(0, i3, i10, bArr);
        int i11 = size - i10;
        this.f12784c = i9;
        U();
        if (i11 <= i9) {
            abstractC2632e.f(i10, 0, i11, bArr);
            this.f12784c = i11;
            return;
        }
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i10);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= abstractC2632e.size()) {
            if (i11 > 0) {
                abstractC2632e.x((OutputStream) this.f12786e, i10, i11);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public void f(byte b9) {
        int i3 = this.f12783b;
        byte[] bArr = (byte[]) this.f12785d;
        if (i3 == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f12785d = bArr2;
        }
        byte[] bArr3 = (byte[]) this.f12785d;
        int i9 = this.f12783b;
        this.f12783b = i9 + 1;
        bArr3[i9] = b9;
    }

    public void f0(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i3 = this.f12784c;
        int i9 = this.f12783b;
        int i10 = i9 - i3;
        byte[] bArr2 = (byte[]) this.f12785d;
        if (i10 >= length) {
            System.arraycopy(bArr, 0, bArr2, i3, length);
            this.f12784c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i3, i10);
        int i11 = length - i10;
        this.f12784c = i9;
        U();
        if (i11 > i9) {
            ((OutputStream) this.f12786e).write(bArr, i10, i11);
        } else {
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            this.f12784c = i11;
        }
    }

    public int g() {
        int i3 = this.f12783b;
        int i9 = this.f12784c;
        if (i3 == i9) {
            return -1;
        }
        int i10 = i3 + 1;
        this.f12783b = i10;
        if (i10 < i9) {
            return ((String) this.f12785d).charAt(i10);
        }
        return -1;
    }

    public void g0(int i3) throws IOException {
        d0(i3 & 255);
        d0((i3 >> 8) & 255);
        d0((i3 >> 16) & 255);
        d0((i3 >> 24) & 255);
    }

    public void h(int i3) {
        new Handler(Looper.getMainLooper()).post(new S.e(this, i3, 3));
    }

    public void h0(long j) throws IOException {
        d0(((int) j) & 255);
        d0(((int) (j >> 8)) & 255);
        d0(((int) (j >> 16)) & 255);
        d0(((int) (j >> 24)) & 255);
        d0(((int) (j >> 32)) & 255);
        d0(((int) (j >> 40)) & 255);
        d0(((int) (j >> 48)) & 255);
        d0(((int) (j >> 56)) & 255);
    }

    public void i(int i3) {
        boolean z6 = false;
        int i9 = this.f12783b;
        int i10 = this.f12784c;
        if (i3 <= i10 && i9 <= i3) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        StringBuilder sbS = p121o0.p.s(i3, i9, "Invalid offset: ", ". Valid range is [", " , ");
        sbS.append(i10);
        sbS.append(']');
        p065h1.a.a(sbS.toString());
    }

    public void i0(int i3) throws IOException {
        while ((i3 & (-128)) != 0) {
            d0((i3 & 127) | 128);
            i3 >>>= 7;
        }
        d0(i3);
    }

    public Boolean j(Object obj) {
        if (obj == null) {
            return null;
        }
        W();
        int i3 = this.f12783b;
        if (i3 == this.f12784c) {
            return null;
        }
        char cCharAt = ((String) this.f12785d).charAt(i3);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.f12783b++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public void j0(long j) throws IOException {
        while (((-128) & j) != 0) {
            d0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        d0((int) j);
    }

    public float k(float f9) {
        if (Float.isNaN(f9)) {
            return Float.NaN;
        }
        W();
        return K();
    }

    public void k0(int i3, int i9) throws IOException {
        i0((i3 << 3) | i9);
    }

    public boolean t(char c9) {
        int i3 = this.f12783b;
        boolean z6 = i3 < this.f12784c && ((String) this.f12785d).charAt(i3) == c9;
        if (z6) {
            this.f12783b++;
        }
        return z6;
    }

    public String toString() {
        switch (this.f12782a) {
            case 3:
                C0948v c0948v = (C0948v) this.f12786e;
                if (c0948v == null) {
                    return (String) this.f12785d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) this.f12785d, 0, this.f12783b);
                sb.append((char[]) c0948v.f10089e, 0, c0948v.f10087c);
                char[] cArr = (char[]) c0948v.f10089e;
                int i3 = c0948v.f10088d;
                sb.append(cArr, i3, c0948v.f10086b - i3);
                String str = (String) this.f12785d;
                sb.append((CharSequence) str, this.f12784c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(String str) {
        int length = str.length();
        int i3 = this.f12783b;
        boolean z6 = i3 <= this.f12784c - length && ((String) this.f12785d).substring(i3, i3 + length).equals(str);
        if (z6) {
            this.f12783b += length;
        }
        return z6;
    }

    public void v(int i3) {
        float[] fArr = (float[]) this.f12786e;
        if (fArr.length < this.f12784c + i3) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.f12786e = fArr2;
        }
    }

    public boolean w() {
        return this.f12783b == this.f12784c;
    }

    public void x(N n3) {
        int i3 = 0;
        for (int i9 = 0; i9 < this.f12783b; i9++) {
            byte b9 = ((byte[]) this.f12785d)[i9];
            if (b9 == 0) {
                float[] fArr = (float[]) this.f12786e;
                int i10 = i3 + 1;
                float f9 = fArr[i3];
                i3 += 2;
                n3.b(f9, fArr[i10]);
            } else if (b9 == 1) {
                float[] fArr2 = (float[]) this.f12786e;
                int i11 = i3 + 1;
                float f10 = fArr2[i3];
                i3 += 2;
                n3.e(f10, fArr2[i11]);
            } else if (b9 == 2) {
                float[] fArr3 = (float[]) this.f12786e;
                n3.c(fArr3[i3], fArr3[i3 + 1], fArr3[i3 + 2], fArr3[i3 + 3], fArr3[i3 + 4], fArr3[i3 + 5]);
                i3 += 6;
            } else if (b9 == 3) {
                float[] fArr4 = (float[]) this.f12786e;
                float f11 = fArr4[i3];
                float f12 = fArr4[i3 + 1];
                int i12 = i3 + 3;
                float f13 = fArr4[i3 + 2];
                i3 += 4;
                n3.a(f11, f12, f13, fArr4[i12]);
            } else if (b9 != 8) {
                boolean z6 = (b9 & 2) != 0;
                boolean z9 = (b9 & 1) != 0;
                float[] fArr5 = (float[]) this.f12786e;
                n3.d(fArr5[i3], fArr5[i3 + 1], fArr5[i3 + 2], z6, z9, fArr5[i3 + 3], fArr5[i3 + 4]);
                i3 += 5;
            } else {
                n3.close();
            }
        }
    }

    public void y() throws IOException {
        if (((OutputStream) this.f12786e) != null) {
            U();
        }
    }

    public int z() {
        C0948v c0948v = (C0948v) this.f12786e;
        if (c0948v == null) {
            return ((String) this.f12785d).length();
        }
        return (c0948v.f10086b - c0948v.d()) + (((String) this.f12785d).length() - (this.f12784c - this.f12783b));
    }

    public M(CharSequence charSequence, int i3, Locale locale) {
        this.f12782a = 2;
        this.f12785d = charSequence;
        if (charSequence.length() < 0) {
            p065h1.a.a("input start index is outside the CharSequence");
        }
        if (i3 < 0 || i3 > charSequence.length()) {
            p065h1.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f12786e = wordInstance;
        this.f12783b = Math.max(0, -50);
        this.f12784c = Math.min(charSequence.length(), i3 + 50);
        wordInstance.setText(new p021c1.b(charSequence, i3));
    }

    public M(OutputStream outputStream, byte[] bArr) {
        this.f12782a = 5;
        this.f12786e = outputStream;
        this.f12785d = bArr;
        this.f12784c = 0;
        this.f12783b = bArr.length;
    }

    public M(p103m.U u6, int i3, int i9, WeakReference weakReference) {
        this.f12782a = 4;
        this.f12786e = u6;
        this.f12783b = i3;
        this.f12784c = i9;
        this.f12785d = weakReference;
    }

    public M(String str) {
        this.f12782a = 1;
        this.f12783b = 0;
        this.f12784c = 0;
        this.f12786e = new C1207q();
        String strTrim = str.trim();
        this.f12785d = strTrim;
        this.f12784c = strTrim.length();
    }

    public void Q(int i3) {
    }
}
