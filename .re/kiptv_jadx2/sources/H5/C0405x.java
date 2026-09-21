package H5;

public final class C0405x implements p194x6.j {

    public final int f4329h;

    public final K f4330i;
    public final String j;

    public final p194x6.j f4331k;

    public C0405x(K k9, String str, p194x6.j jVar, int i3) {
        this.f4329h = i3;
        this.f4330i = k9;
        this.j = str;
        this.f4331k = jVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f4329h) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                this.f4330i.f4100f = this.j;
                this.f4331k.invoke(Integer.valueOf(iIntValue));
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                this.f4330i.f4100f = this.j;
                this.f4331k.invoke(Integer.valueOf(iIntValue2));
                break;
        }
        return p070h6.A.f22523a;
    }
}
