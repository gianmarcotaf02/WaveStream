package p186w5;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class EnumC2986i {

    public static final EnumC2986i f30241h;

    public static final EnumC2986i f30242i;
    public static final EnumC2986i j;

    public static final EnumC2986i[] f30243k;

    EnumC2986i EF0;

    static {
        EnumC2986i enumC2986i = new EnumC2986i("PARAMS", 0);
        EnumC2986i enumC2986i2 = new EnumC2986i("TOGGLE", 1);
        f30241h = enumC2986i2;
        EnumC2986i enumC2986i3 = new EnumC2986i("UP", 2);
        f30242i = enumC2986i3;
        EnumC2986i enumC2986i4 = new EnumC2986i("DOWN", 3);
        j = enumC2986i4;
        EnumC2986i[] enumC2986iArr = {enumC2986i, enumC2986i2, enumC2986i3, enumC2986i4};
        f30243k = enumC2986iArr;
        q0.t(enumC2986iArr);
    }

    public static EnumC2986i valueOf(String str) {
        return (EnumC2986i) Enum.valueOf(EnumC2986i.class, str);
    }

    public static EnumC2986i[] values() {
        return (EnumC2986i[]) f30243k.clone();
    }
}
