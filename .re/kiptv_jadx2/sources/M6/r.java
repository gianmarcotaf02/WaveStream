package M6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p078i6.I;
import p078i6.u;

public final class r {

    public static final LinkedHashSet f7200a = I.p0(p044e7.f.g("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    public static final LinkedHashSet f7201b;

    public static final LinkedHashSet f7202c;

    public static final LinkedHashSet f7203d;

    public static final LinkedHashSet f7204e;

    public static final LinkedHashSet f7205f;
    public static final LinkedHashSet g;

    static {
        List<p169t7.c> listB0 = p078i6.p.B0(p169t7.c.BOOLEAN, p169t7.c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (p169t7.c cVar : listB0) {
            p101l7.c cVar2 = cVar.f28546k;
            if (cVar2 == null) {
                p169t7.c.a(15);
                throw null;
            }
            String strB = cVar2.f24829a.f().b();
            kotlin.jvm.internal.m.d(strB, "asString(...)");
            u.M0(linkedHashSet, p044e7.f.f(strB, cVar.f28545i + "Value()" + cVar.c()));
        }
        f7201b = I.o0(I.o0(I.o0(I.o0(I.o0(I.o0(linkedHashSet, p044e7.f.g("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), p044e7.f.f("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), p044e7.f.f("Double", "isInfinite()Z", "isNaN()Z")), p044e7.f.f("Float", "isInfinite()Z", "isNaN()Z")), p044e7.f.f("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), p044e7.f.f("CharSequence", "isEmpty()Z"));
        f7202c = p044e7.f.g("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f7203d = I.o0(I.o0(I.o0(I.o0(I.o0(I.o0(p044e7.f.f("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), p044e7.f.g("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), p044e7.f.f("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), p044e7.f.f("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), p044e7.f.g("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), p044e7.f.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), p044e7.f.g("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f7204e = I.o0(I.o0(p044e7.f.g("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), p044e7.f.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), p044e7.f.g("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        p169t7.c cVar3 = p169t7.c.BOOLEAN;
        p169t7.c cVar4 = p169t7.c.BYTE;
        List listB1 = p078i6.p.B0(cVar3, cVar4, p169t7.c.DOUBLE, p169t7.c.FLOAT, cVar4, p169t7.c.INT, p169t7.c.LONG, p169t7.c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            p101l7.c cVar5 = ((p169t7.c) it.next()).f28546k;
            if (cVar5 == null) {
                p169t7.c.a(15);
                throw null;
            }
            String strB2 = cVar5.f24829a.f().b();
            kotlin.jvm.internal.m.d(strB2, "asString(...)");
            String[] strArrA = p044e7.f.a("Ljava/lang/String;");
            u.M0(linkedHashSet2, p044e7.f.f(strB2, (String[]) Arrays.copyOf(strArrA, strArrA.length)));
        }
        String[] strArrA2 = p044e7.f.a("D");
        LinkedHashSet linkedHashSetO0 = I.o0(linkedHashSet2, p044e7.f.f("Float", (String[]) Arrays.copyOf(strArrA2, strArrA2.length)));
        String[] strArrA3 = p044e7.f.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f7205f = I.o0(linkedHashSetO0, p044e7.f.f("String", (String[]) Arrays.copyOf(strArrA3, strArrA3.length)));
        String[] strArrA4 = p044e7.f.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        g = p044e7.f.f("Throwable", (String[]) Arrays.copyOf(strArrA4, strArrA4.length));
    }
}
