package p163t;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class EnumC2760i {

    public static final EnumC2760i f27614h;

    public static final EnumC2760i f27615i;
    public static final EnumC2760i[] j;

    static {
        EnumC2760i enumC2760i = new EnumC2760i("BoundReached", 0);
        f27614h = enumC2760i;
        EnumC2760i enumC2760i2 = new EnumC2760i("Finished", 1);
        f27615i = enumC2760i2;
        EnumC2760i[] enumC2760iArr = {enumC2760i, enumC2760i2};
        j = enumC2760iArr;
        q0.t(enumC2760iArr);
    }

    public static EnumC2760i valueOf(String str) {
        return (EnumC2760i) Enum.valueOf(EnumC2760i.class, str);
    }

    public static EnumC2760i[] values() {
        return (EnumC2760i[]) j.clone();
    }
}
