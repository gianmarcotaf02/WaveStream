package y7;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f32079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7.f f32080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k7.f f32081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k7.f f32082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f32083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p101l7.b f32084f;

    public q(java.lang.Object obj, k7.f fVar, k7.f fVar2, k7.f fVar3, java.lang.String filePath, p101l7.b bVar) {
        kotlin.jvm.internal.m.e(filePath, "filePath");
        this.f32079a = obj;
        this.f32080b = fVar;
        this.f32081c = fVar2;
        this.f32082d = fVar3;
        this.f32083e = filePath;
        this.f32084f = bVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7.q)) {
            return false;
        }
        y7.q qVar = (y7.q) obj;
        return this.f32079a.equals(qVar.f32079a) && kotlin.jvm.internal.m.a(this.f32080b, qVar.f32080b) && kotlin.jvm.internal.m.a(this.f32081c, qVar.f32081c) && this.f32082d.equals(qVar.f32082d) && kotlin.jvm.internal.m.a(this.f32083e, qVar.f32083e) && this.f32084f.equals(qVar.f32084f);
    }

    public final int hashCode() {
        int iHashCode = this.f32079a.hashCode() * 31;
        k7.f fVar = this.f32080b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        k7.f fVar2 = this.f32081c;
        return this.f32084f.hashCode() + B2.a.a((this.f32082d.hashCode() + ((iHashCode2 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31)) * 31, 31, this.f32083e);
    }

    public final java.lang.String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f32079a + ", compilerVersion=" + this.f32080b + ", languageVersion=" + this.f32081c + ", expectedVersion=" + this.f32082d + ", filePath=" + this.f32083e + ", classId=" + this.f32084f + ')';
    }
}
