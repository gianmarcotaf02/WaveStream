package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f11024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p070h6.e f11025b;

    public a(java.lang.String str, p070h6.e eVar) {
        this.f11024a = str;
        this.f11025b = eVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0.a)) {
            return false;
        }
        Y0.a aVar = (Y0.a) obj;
        return kotlin.jvm.internal.m.a(this.f11024a, aVar.f11024a) && kotlin.jvm.internal.m.a(this.f11025b, aVar.f11025b);
    }

    public final int hashCode() {
        java.lang.String str = this.f11024a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        p070h6.e eVar = this.f11025b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "AccessibilityAction(label=" + this.f11024a + ", action=" + this.f11025b + ')';
    }
}
