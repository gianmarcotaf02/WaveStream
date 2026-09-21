package t5;

public final class A0 implements p194x6.j {

    public final int f27805h = 0;

    public final p194x6.j f27806i;
    public final String j;

    public final p020c0.X f27807k;

    public A0(String str, p194x6.j jVar, p020c0.X x9) {
        this.j = str;
        this.f27806i = jVar;
        this.f27807k = x9;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f27805h) {
            case 0:
                String id = (String) obj;
                kotlin.jvm.internal.m.e(id, "id");
                this.f27807k.setValue(Boolean.FALSE);
                if (!id.equals(this.j)) {
                    this.f27806i.invoke(id);
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                this.f27807k.setValue(bool);
                if (zBooleanValue) {
                    this.f27806i.invoke(this.j);
                }
                break;
        }
        return p070h6.A.f22523a;
    }

    public A0(p194x6.j jVar, String str, p020c0.X x9) {
        this.f27806i = jVar;
        this.j = str;
        this.f27807k = x9;
    }
}
