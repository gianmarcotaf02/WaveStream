package U;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f9941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.textclassifier.TextClassification f9943c;

    public V(java.lang.CharSequence charSequence, long j, android.view.textclassifier.TextClassification textClassification) {
        this.f9941a = charSequence;
        this.f9942b = j;
        this.f9943c = textClassification;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U.V)) {
            return false;
        }
        U.V v6 = (U.V) obj;
        return kotlin.jvm.internal.m.a(this.f9941a, v6.f9941a) && p011b1.L.b(this.f9942b, v6.f9942b) && kotlin.jvm.internal.m.a(this.f9943c, v6.f9943c);
    }

    public final int hashCode() {
        int iHashCode = this.f9941a.hashCode() * 31;
        int i3 = p011b1.L.f17783c;
        return this.f9943c.hashCode() + p121o0.p.e(iHashCode, 31, this.f9942b);
    }

    public final java.lang.String toString() {
        return "TextClassificationResult(text=" + ((java.lang.Object) this.f9941a) + ", selection=" + ((java.lang.Object) p011b1.L.h(this.f9942b)) + ", textClassification=" + this.f9943c + ')';
    }
}
