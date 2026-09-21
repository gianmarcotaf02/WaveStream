package p076i4;

import java.io.Serializable;
import java.util.ArrayList;
import p068h4.v;

public final class H0 implements v, Serializable {

    public final int f22799h;

    public H0() {
        AbstractC2230y.d(2, "expectedValuesPerKey");
        this.f22799h = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f22799h);
    }
}
