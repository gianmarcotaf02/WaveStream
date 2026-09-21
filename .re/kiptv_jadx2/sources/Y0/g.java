package Y0;

import java.util.Comparator;

public final class g implements Comparator {

    public static final g f11032i = new g(0);
    public static final g j = new g(1);

    public static final g f11033k = new g(2);

    public final int f11034h;

    public g(int i3) {
        this.f11034h = i3;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f11034h) {
            case 0:
                p181w0.b bVarH = ((p) obj).h();
                p181w0.b bVarH2 = ((p) obj2).h();
                int iCompare = Float.compare(bVarH.f29746a, bVarH2.f29746a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(bVarH.f29747b, bVarH2.f29747b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(bVarH.f29749d, bVarH2.f29749d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(bVarH.f29748c, bVarH2.f29748c);
            case 1:
                p181w0.b bVarH3 = ((p) obj).h();
                p181w0.b bVarH4 = ((p) obj2).h();
                int iCompare4 = Float.compare(bVarH4.f29748c, bVarH3.f29748c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(bVarH3.f29747b, bVarH4.f29747b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(bVarH3.f29749d, bVarH4.f29749d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(bVarH4.f29746a, bVarH3.f29746a);
            default:
                p070h6.k kVar = (p070h6.k) obj;
                p070h6.k kVar2 = (p070h6.k) obj2;
                int iCompare7 = Float.compare(((p181w0.b) kVar.f22539h).f29747b, ((p181w0.b) kVar2.f22539h).f29747b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((p181w0.b) kVar.f22539h).f29749d, ((p181w0.b) kVar2.f22539h).f29749d);
        }
    }
}
