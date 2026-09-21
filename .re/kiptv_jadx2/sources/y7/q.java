package y7;

public final class q {

    public final Object f32079a;

    public final k7.f f32080b;

    public final k7.f f32081c;

    public final k7.f f32082d;

    public final String f32083e;

    public final p101l7.b f32084f;

    public q(Object obj, k7.f fVar, k7.f fVar2, k7.f fVar3, String filePath, p101l7.b bVar) {
        kotlin.jvm.internal.m.e(filePath, "filePath");
        this.f32079a = obj;
        this.f32080b = fVar;
        this.f32081c = fVar2;
        this.f32082d = fVar3;
        this.f32083e = filePath;
        this.f32084f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f32079a.equals(qVar.f32079a) && kotlin.jvm.internal.m.a(this.f32080b, qVar.f32080b) && kotlin.jvm.internal.m.a(this.f32081c, qVar.f32081c) && this.f32082d.equals(qVar.f32082d) && kotlin.jvm.internal.m.a(this.f32083e, qVar.f32083e) && this.f32084f.equals(qVar.f32084f);
    }

    public final int hashCode() {
        int iHashCode = this.f32079a.hashCode() * 31;
        k7.f fVar = this.f32080b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        k7.f fVar2 = this.f32081c;
        return this.f32084f.hashCode() + B2.a.a((this.f32082d.hashCode() + ((iHashCode2 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31)) * 31, 31, this.f32083e);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f32079a + ", compilerVersion=" + this.f32080b + ", languageVersion=" + this.f32081c + ", expectedVersion=" + this.f32082d + ", filePath=" + this.f32083e + ", classId=" + this.f32084f + ')';
    }
}
