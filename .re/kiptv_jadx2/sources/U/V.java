package U;

import android.view.textclassifier.TextClassification;

public final class V {

    public final CharSequence f9941a;

    public final long f9942b;

    public final TextClassification f9943c;

    public V(CharSequence charSequence, long j, TextClassification textClassification) {
        this.f9941a = charSequence;
        this.f9942b = j;
        this.f9943c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v6 = (V) obj;
        return kotlin.jvm.internal.m.a(this.f9941a, v6.f9941a) && p011b1.L.b(this.f9942b, v6.f9942b) && kotlin.jvm.internal.m.a(this.f9943c, v6.f9943c);
    }

    public final int hashCode() {
        int iHashCode = this.f9941a.hashCode() * 31;
        int i3 = p011b1.L.f17783c;
        return this.f9943c.hashCode() + p121o0.p.e(iHashCode, 31, this.f9942b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f9941a) + ", selection=" + ((Object) p011b1.L.h(this.f9942b)) + ", textClassification=" + this.f9943c + ')';
    }
}
