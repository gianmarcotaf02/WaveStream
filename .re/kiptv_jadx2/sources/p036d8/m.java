package p036d8;

import j$.time.format.DateTimeFormatterBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

public final class m extends o implements Function0 {

    public static final m f21308i = new m(0, 0);
    public static final m j = new m(0, 1);

    public static final m f21309k = new m(0, 2);

    public final int f21310h;

    public m(int i3, int i9) {
        super(i3);
        this.f21310h = i9;
    }

    @Override
    public final Object invoke() {
        switch (this.f21310h) {
            case 0:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 1:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            default:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
        }
    }
}
