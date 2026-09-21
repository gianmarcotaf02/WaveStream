package p055f8;

import O7.q;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.play_billing.M0;
import kotlin.jvm.internal.m;

public final class a implements Comparable {

    public final int f21745h;

    public final int f21746i;

    public a(int i3, int i9) {
        this.f21745h = i3;
        this.f21746i = i9;
        if (i9 < 0) {
            throw new IllegalArgumentException(M0.l(i9, "Digits must be non-negative, but was ").toString());
        }
    }

    public final int a(int i3) {
        int i9 = this.f21745h;
        int i10 = this.f21746i;
        if (i3 == i10) {
            return i9;
        }
        int[] iArr = b.f21747a;
        return i3 > i10 ? i9 * iArr[i3 - i10] : i9 / iArr[i10 - i3];
    }

    @Override
    public final int compareTo(Object obj) {
        a other = (a) obj;
        m.e(other, "other");
        int iMax = Math.max(this.f21746i, other.f21746i);
        return m.f(a(iMax), other.a(iMax));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a other = (a) obj;
        m.e(other, "other");
        int iMax = Math.max(this.f21746i, other.f21746i);
        return m.f(a(iMax), other.a(iMax)) == 0;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i3 = b.f21747a[this.f21746i];
        int i9 = this.f21745h;
        sb.append(i9 / i3);
        sb.append('.');
        sb.append(q.V0(String.valueOf((i9 % i3) + i3), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }
}
