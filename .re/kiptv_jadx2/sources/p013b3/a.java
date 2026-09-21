package p013b3;

public final class a {

    public final Integer f17865a;

    public final Object f17866b;

    public final c f17867c;

    public a(Integer num, Object obj, c cVar) {
        this.f17865a = num;
        this.f17866b = obj;
        this.f17867c = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f17865a;
            if (num != null ? num.equals(aVar.f17865a) : aVar.f17865a == null) {
                if (this.f17866b.equals(aVar.f17866b) && this.f17867c.equals(aVar.f17867c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f17865a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f17866b.hashCode()) * 1000003) ^ this.f17867c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f17865a + ", payload=" + this.f17866b + ", priority=" + this.f17867c + "}";
    }
}
