package p064h0;

/* JADX INFO: loaded from: classes.dex */
public class a implements java.util.Map.Entry, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f22429i;
    public final java.lang.Object j;

    public /* synthetic */ a(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f22428h = i3;
        this.f22429i = obj;
        this.j = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        switch (this.f22428h) {
            case 0:
                java.util.Map.Entry entry = obj instanceof java.util.Map.Entry ? (java.util.Map.Entry) obj : null;
                return entry != null && kotlin.jvm.internal.m.a(entry.getKey(), this.f22429i) && kotlin.jvm.internal.m.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        switch (this.f22428h) {
            case 0:
                break;
        }
        return this.f22429i;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        switch (this.f22428h) {
            case 0:
                break;
        }
        return this.j;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f22428h) {
            case 0:
                java.lang.Object obj = this.f22429i;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                java.lang.Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        switch (this.f22428h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public java.lang.String toString() {
        switch (this.f22428h) {
            case 0:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.f22429i);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
