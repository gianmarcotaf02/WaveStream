package p099l5;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class A {

    public static final A f24746h;

    public static final A f24747i;
    public static final A j;

    public static final A f24748k;

    public static final A f24749l;

    public static final A f24750m;

    public static final A f24751n;

    public static final A f24752o;

    public static final A f24753p;

    public static final A f24754q;

    public static final A f24755r;

    public static final A f24756s;

    public static final A f24757t;

    public static final A[] f24758u;

    static {
        A a2 = new A("Unknown", 0);
        f24746h = a2;
        A a9 = new A("Mono", 1);
        f24747i = a9;
        A a10 = new A("Stereo", 2);
        j = a10;
        A a11 = new A("Surround", 3);
        f24748k = a11;
        A a12 = new A("DolbyDigital", 4);
        f24749l = a12;
        A a13 = new A("DolbyDigitalPlus", 5);
        f24750m = a13;
        A a14 = new A("DolbyAtmos", 6);
        f24751n = a14;
        A a15 = new A("DolbyTrueHD", 7);
        f24752o = a15;
        A a16 = new A("Dts", 8);
        f24753p = a16;
        A a17 = new A("DtsHd", 9);
        f24754q = a17;
        A a18 = new A("Aac", 10);
        f24755r = a18;
        A a19 = new A("Opus", 11);
        f24756s = a19;
        A a20 = new A("Flac", 12);
        f24757t = a20;
        A[] aArr = {a2, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20};
        f24758u = aArr;
        q0.t(aArr);
    }

    public static String a(int i3) {
        if (i3 >= 8) {
            return "7.1";
        }
        if (i3 >= 6) {
            return "5.1";
        }
        if (i3 >= 2) {
            return "Stereo";
        }
        if (i3 == 1) {
            return "Mono";
        }
        return null;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f24758u.clone();
    }
}
