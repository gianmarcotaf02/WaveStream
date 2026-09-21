package p013b3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f17865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f17866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p013b3.c f17867c;

    public a(java.lang.Integer num, java.lang.Object obj, p013b3.c cVar) {
        this.f17865a = num;
        this.f17866b = obj;
        this.f17867c = cVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p013b3.a) {
            p013b3.a aVar = (p013b3.a) obj;
            java.lang.Integer num = this.f17865a;
            if (num != null ? num.equals(aVar.f17865a) : aVar.f17865a == null) {
                if (this.f17866b.equals(aVar.f17866b) && this.f17867c.equals(aVar.f17867c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer num = this.f17865a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f17866b.hashCode()) * 1000003) ^ this.f17867c.hashCode();
    }

    public final java.lang.String toString() {
        return "Event{code=" + this.f17865a + ", payload=" + this.f17866b + ", priority=" + this.f17867c + "}";
    }
}
