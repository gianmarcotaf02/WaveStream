package B5;

import com.google.android.gms.internal.play_billing.M0;
import com.kiptv.core.model.TMDBPersonCreditEntry;
import p070h6.A;

public final class s implements p194x6.j {

    public final int f777h;

    public final y f778i;
    public final TMDBPersonCreditEntry j;

    public final p194x6.j f779k;

    public s(y yVar, TMDBPersonCreditEntry tMDBPersonCreditEntry, p194x6.j jVar, int i3) {
        this.f777h = i3;
        this.f778i = yVar;
        this.j = tMDBPersonCreditEntry;
        this.f779k = jVar;
    }

    @Override
    public final Object invoke(Object obj) {
        int i3 = this.f777h;
        Integer num = (Integer) obj;
        num.getClass();
        switch (i3) {
            case 0:
                this.f778i.f809f = M0.l(this.j.f20222a, "tv-");
                this.f779k.invoke(num);
                break;
            default:
                this.f778i.f809f = M0.l(this.j.f20222a, "m-");
                this.f779k.invoke(num);
                break;
        }
        return A.f22523a;
    }
}
