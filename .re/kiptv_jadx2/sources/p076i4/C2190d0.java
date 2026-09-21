package p076i4;

public final class C2190d0 {

    public final Object f22882a;

    public final Object f22883b;

    public final Object f22884c;

    public C2190d0(Object obj, Object obj2, Object obj3) {
        this.f22882a = obj;
        this.f22883b = obj2;
        this.f22884c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f22882a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f22883b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f22884c);
        return new IllegalArgumentException(sb.toString());
    }
}
