package io.ktor.http;

import D1.X;
import O7.x;
import androidx.media3.container.NalUnitUtil;
import io.ktor.util.date.Month;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p078i6.AbstractC2254e;
import p194x6.j;
import p194x6.n;

@Metadata(d1 = {"\u0000<\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a%\u0010\u000b\u001a\u00020\t*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0011\u001a\u00020\t*\u00020\r2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0015\u001a\u00020\t*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0017\u001a\u00020\t*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a+\u0010\u0018\u001a\u00020\t*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001b\u0010\u001b\u001a\u00020\t*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"", "", "isDelimiter", "(C)Z", "isNonDelimiter", "isOctet", "isNonDigit", "isDigit", "Lkotlin/Function0;", "Lh6/A;", "block", "otherwise", "(ZLkotlin/jvm/functions/Function0;)V", "", "Lkotlin/Function3;", "", "success", "tryParseTime", "(Ljava/lang/String;Lx6/n;)V", "Lkotlin/Function1;", "Lio/ktor/util/date/Month;", "tryParseMonth", "(Ljava/lang/String;Lx6/j;)V", "tryParseDayOfMonth", "tryParseYear", "Lio/ktor/http/CookieDateBuilder;", "token", "handleToken", "(Lio/ktor/http/CookieDateBuilder;Ljava/lang/String;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CookieUtilsKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass1 implements j {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public final Boolean invoke(char c9) {
            return Boolean.valueOf(CookieUtilsKt.isNonDigit(c9));
        }

        @Override
        public Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass2 implements j {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public final Boolean invoke(char c9) {
            return Boolean.valueOf(CookieUtilsKt.isOctet(c9));
        }

        @Override
        public Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C24101 implements j {
        public static final C24101 INSTANCE = new C24101();

        public final Boolean invoke(char c9) {
            return Boolean.valueOf(c9 == ':');
        }

        @Override
        public Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass3 implements j {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public final Boolean invoke(char c9) {
            return Boolean.valueOf(c9 == ':');
        }

        @Override
        public Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass5 implements j {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public final Boolean invoke(char c9) {
            return Boolean.valueOf(CookieUtilsKt.isNonDigit(c9));
        }

        @Override
        public Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass6 implements j {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public final Boolean invoke(char c9) {
            return Boolean.valueOf(CookieUtilsKt.isOctet(c9));
        }

        @Override
        public Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C24111 implements j {
        public static final C24111 INSTANCE = new C24111();

        public final Boolean invoke(char c9) {
            return Boolean.valueOf(CookieUtilsKt.isNonDigit(c9));
        }

        @Override
        public Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C24122 implements j {
        public static final C24122 INSTANCE = new C24122();

        public final Boolean invoke(char c9) {
            return Boolean.valueOf(CookieUtilsKt.isOctet(c9));
        }

        @Override
        public Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    public static final void handleToken(CookieDateBuilder cookieDateBuilder, String token) {
        m.e(cookieDateBuilder, "<this>");
        m.e(token, "token");
        if (cookieDateBuilder.getHours() == null || cookieDateBuilder.getMinutes() == null || cookieDateBuilder.getSeconds() == null) {
            StringLexer stringLexer = new StringLexer(token);
            int index = stringLexer.getIndex();
            if (stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$1.INSTANCE)) {
                stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$3.INSTANCE);
                String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
                m.d(strSubstring, "substring(...)");
                int i3 = Integer.parseInt(strSubstring);
                if (stringLexer.accept(C24101.INSTANCE)) {
                    int index2 = stringLexer.getIndex();
                    if (stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$1.INSTANCE)) {
                        stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$3.INSTANCE);
                        String strSubstring2 = stringLexer.getSource().substring(index2, stringLexer.getIndex());
                        m.d(strSubstring2, "substring(...)");
                        int i9 = Integer.parseInt(strSubstring2);
                        if (stringLexer.accept(AnonymousClass3.INSTANCE)) {
                            int index3 = stringLexer.getIndex();
                            if (stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$1.INSTANCE)) {
                                stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$3.INSTANCE);
                                String strSubstring3 = stringLexer.getSource().substring(index3, stringLexer.getIndex());
                                m.d(strSubstring3, "substring(...)");
                                int i10 = Integer.parseInt(strSubstring3);
                                if (stringLexer.accept(AnonymousClass5.INSTANCE)) {
                                    stringLexer.acceptWhile(AnonymousClass6.INSTANCE);
                                }
                                cookieDateBuilder.setHours(Integer.valueOf(i3));
                                cookieDateBuilder.setMinutes(Integer.valueOf(i9));
                                cookieDateBuilder.setSeconds(Integer.valueOf(i10));
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (cookieDateBuilder.getDayOfMonth() == null) {
            StringLexer stringLexer2 = new StringLexer(token);
            int index4 = stringLexer2.getIndex();
            if (stringLexer2.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$1.INSTANCE)) {
                stringLexer2.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$3.INSTANCE);
                String strSubstring4 = stringLexer2.getSource().substring(index4, stringLexer2.getIndex());
                m.d(strSubstring4, "substring(...)");
                int i11 = Integer.parseInt(strSubstring4);
                if (stringLexer2.accept(AnonymousClass1.INSTANCE)) {
                    stringLexer2.acceptWhile(AnonymousClass2.INSTANCE);
                }
                cookieDateBuilder.setDayOfMonth(Integer.valueOf(i11));
                return;
            }
        }
        if (cookieDateBuilder.getMonth() == null && token.length() >= 3) {
            AbstractC2254e abstractC2254e = (AbstractC2254e) Month.getEntries();
            abstractC2254e.getClass();
            X x9 = new X(5, abstractC2254e);
            while (x9.hasNext()) {
                Month month = (Month) x9.next();
                if (x.x0(token, month.getValue(), true)) {
                    cookieDateBuilder.setMonth(month);
                    return;
                }
            }
        }
        if (cookieDateBuilder.getYear() == null) {
            StringLexer stringLexer3 = new StringLexer(token);
            int index5 = stringLexer3.getIndex();
            for (int i12 = 0; i12 < 2; i12++) {
                if (!stringLexer3.accept(CookieUtilsKt$tryParseYear$year$1$1$1.INSTANCE)) {
                    return;
                }
            }
            for (int i13 = 0; i13 < 2; i13++) {
                stringLexer3.accept(CookieUtilsKt$tryParseYear$year$1$2$1.INSTANCE);
            }
            String strSubstring5 = stringLexer3.getSource().substring(index5, stringLexer3.getIndex());
            m.d(strSubstring5, "substring(...)");
            int i14 = Integer.parseInt(strSubstring5);
            if (stringLexer3.accept(C24111.INSTANCE)) {
                stringLexer3.acceptWhile(C24122.INSTANCE);
            }
            cookieDateBuilder.setYear(Integer.valueOf(i14));
        }
    }

    public static final boolean isDelimiter(char c9) {
        if (c9 == '\t') {
            return true;
        }
        if (' ' <= c9 && c9 < '0') {
            return true;
        }
        if (';' <= c9 && c9 < 'A') {
            return true;
        }
        if ('[' > c9 || c9 >= 'a') {
            return '{' <= c9 && c9 < 127;
        }
        return true;
    }

    public static final boolean isDigit(char c9) {
        return '0' <= c9 && c9 < ':';
    }

    public static final boolean isNonDelimiter(char c9) {
        if (c9 >= 0 && c9 < '\t') {
            return true;
        }
        if ('\n' <= c9 && c9 < ' ') {
            return true;
        }
        if (('0' <= c9 && c9 < ':') || c9 == ':') {
            return true;
        }
        if ('a' <= c9 && c9 < '{') {
            return true;
        }
        if ('A' > c9 || c9 >= '[') {
            return 127 <= c9 && c9 < 256;
        }
        return true;
    }

    public static final boolean isNonDigit(char c9) {
        if (c9 < 0 || c9 >= '0') {
            return 'J' <= c9 && c9 < 256;
        }
        return true;
    }

    public static final boolean isOctet(char c9) {
        return c9 >= 0 && c9 < 256;
    }

    public static final void otherwise(boolean z6, Function0 block) {
        m.e(block, "block");
        if (z6) {
            return;
        }
        block.invoke();
    }

    public static final void tryParseDayOfMonth(String str, j success) {
        m.e(str, "<this>");
        m.e(success, "success");
        StringLexer stringLexer = new StringLexer(str);
        int index = stringLexer.getIndex();
        if (stringLexer.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$1.INSTANCE)) {
            stringLexer.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$3.INSTANCE);
            String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
            m.d(strSubstring, "substring(...)");
            int i3 = Integer.parseInt(strSubstring);
            if (stringLexer.accept(AnonymousClass1.INSTANCE)) {
                stringLexer.acceptWhile(AnonymousClass2.INSTANCE);
            }
            success.invoke(Integer.valueOf(i3));
        }
    }

    public static final void tryParseMonth(String str, j success) {
        m.e(str, "<this>");
        m.e(success, "success");
        if (str.length() < 3) {
            return;
        }
        AbstractC2254e abstractC2254e = (AbstractC2254e) Month.getEntries();
        abstractC2254e.getClass();
        X x9 = new X(5, abstractC2254e);
        while (x9.hasNext()) {
            Month month = (Month) x9.next();
            if (x.x0(str, month.getValue(), true)) {
                success.invoke(month);
                return;
            }
        }
    }

    public static final void tryParseTime(String str, n success) {
        m.e(str, "<this>");
        m.e(success, "success");
        StringLexer stringLexer = new StringLexer(str);
        int index = stringLexer.getIndex();
        if (stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$1.INSTANCE)) {
            stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$3.INSTANCE);
            String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
            m.d(strSubstring, "substring(...)");
            int i3 = Integer.parseInt(strSubstring);
            if (stringLexer.accept(C24101.INSTANCE)) {
                int index2 = stringLexer.getIndex();
                if (stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$1.INSTANCE)) {
                    stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$3.INSTANCE);
                    String strSubstring2 = stringLexer.getSource().substring(index2, stringLexer.getIndex());
                    m.d(strSubstring2, "substring(...)");
                    int i9 = Integer.parseInt(strSubstring2);
                    if (stringLexer.accept(AnonymousClass3.INSTANCE)) {
                        int index3 = stringLexer.getIndex();
                        if (stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$1.INSTANCE)) {
                            stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$3.INSTANCE);
                            String strSubstring3 = stringLexer.getSource().substring(index3, stringLexer.getIndex());
                            m.d(strSubstring3, "substring(...)");
                            int i10 = Integer.parseInt(strSubstring3);
                            if (stringLexer.accept(AnonymousClass5.INSTANCE)) {
                                stringLexer.acceptWhile(AnonymousClass6.INSTANCE);
                            }
                            success.invoke(Integer.valueOf(i3), Integer.valueOf(i9), Integer.valueOf(i10));
                        }
                    }
                }
            }
        }
    }

    public static final void tryParseYear(String str, j success) {
        m.e(str, "<this>");
        m.e(success, "success");
        StringLexer stringLexer = new StringLexer(str);
        int index = stringLexer.getIndex();
        for (int i3 = 0; i3 < 2; i3++) {
            if (!stringLexer.accept(CookieUtilsKt$tryParseYear$year$1$1$1.INSTANCE)) {
                return;
            }
        }
        for (int i9 = 0; i9 < 2; i9++) {
            stringLexer.accept(CookieUtilsKt$tryParseYear$year$1$2$1.INSTANCE);
        }
        String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
        m.d(strSubstring, "substring(...)");
        int i10 = Integer.parseInt(strSubstring);
        if (stringLexer.accept(C24111.INSTANCE)) {
            stringLexer.acceptWhile(C24122.INSTANCE);
        }
        success.invoke(Integer.valueOf(i10));
    }
}
