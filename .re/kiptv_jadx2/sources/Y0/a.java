package Y0;

public final class a {

    public final String f11024a;

    public final p070h6.e f11025b;

    public a(String str, p070h6.e eVar) {
        this.f11024a = str;
        this.f11025b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f11024a, aVar.f11024a) && kotlin.jvm.internal.m.a(this.f11025b, aVar.f11025b);
    }

    public final int hashCode() {
        String str = this.f11024a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        p070h6.e eVar = this.f11025b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f11024a + ", action=" + this.f11025b + ')';
    }
}
