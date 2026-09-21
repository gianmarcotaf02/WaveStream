package Y4;

public final class O1 {

    public final String f11691a;

    public final String f11692b;

    public O1(String str, String str2) {
        this.f11691a = str;
        this.f11692b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O1)) {
            return false;
        }
        O1 o8 = (O1) obj;
        return kotlin.jvm.internal.m.a(this.f11691a, o8.f11691a) && kotlin.jvm.internal.m.a(this.f11692b, o8.f11692b);
    }

    public final int hashCode() {
        int iHashCode = this.f11691a.hashCode() * 31;
        String str = this.f11692b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XMLTVChannelMeta(displayName=");
        sb.append(this.f11691a);
        sb.append(", iconUrl=");
        return Y6.f.m(sb, this.f11692b, ")");
    }
}
