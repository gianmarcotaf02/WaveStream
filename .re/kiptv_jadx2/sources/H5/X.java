package H5;

import com.kiptv.core.model.TMDBPersonSearchResult;
import kotlin.jvm.functions.Function0;

public final class X implements Function0 {

    public final int f4156h;

    public final p194x6.j f4157i;
    public final TMDBPersonSearchResult j;

    public X(p194x6.j jVar, TMDBPersonSearchResult tMDBPersonSearchResult, int i3) {
        this.f4156h = i3;
        this.f4157i = jVar;
        this.j = tMDBPersonSearchResult;
    }

    @Override
    public final Object invoke() {
        switch (this.f4156h) {
            case 0:
                this.f4157i.invoke(Integer.valueOf(this.j.f20266a));
                break;
            default:
                this.f4157i.invoke(Integer.valueOf(this.j.f20266a));
                break;
        }
        return p070h6.A.f22523a;
    }
}
