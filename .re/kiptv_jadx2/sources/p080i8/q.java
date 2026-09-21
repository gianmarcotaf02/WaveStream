package p080i8;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

public final class q extends o implements Function0 {

    public final r f23277h;

    public final String f23278i;
    public final int j;

    public final int f23279k;

    public q(r rVar, String str, int i3, int i9) {
        super(0);
        this.f23277h = rVar;
        this.f23278i = str;
        this.j = i3;
        this.f23279k = i9;
    }

    @Override
    public final Object invoke() {
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(this.f23277h.f23280a);
        sb.append(" but got ");
        int i3 = this.f23279k;
        int i9 = this.j;
        sb.append(this.f23278i.subSequence(i9, i3 + i9 + 1).toString());
        return sb.toString();
    }
}
