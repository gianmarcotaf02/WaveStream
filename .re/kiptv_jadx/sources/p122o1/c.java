package p122o1;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p122o1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f26044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f26045b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f26044a = fArr;
        this.f26045b = fArr2;
    }

    @Override // p122o1.a
    public final float a(float f9) {
        return V1.b.a(f9, this.f26045b, this.f26044a);
    }

    @Override // p122o1.a
    public final float b(float f9) {
        return V1.b.a(f9, this.f26044a, this.f26045b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p122o1.c)) {
            return false;
        }
        p122o1.c cVar = (p122o1.c) obj;
        return java.util.Arrays.equals(this.f26044a, cVar.f26044a) && java.util.Arrays.equals(this.f26045b, cVar.f26045b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f26045b) + (java.util.Arrays.hashCode(this.f26044a) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FontScaleConverter{fromSpValues=");
        java.lang.String string = java.util.Arrays.toString(this.f26044a);
        kotlin.jvm.internal.m.d(string, "toString(...)");
        sb.append(string);
        sb.append(", toDpValues=");
        java.lang.String string2 = java.util.Arrays.toString(this.f26045b);
        kotlin.jvm.internal.m.d(string2, "toString(...)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
