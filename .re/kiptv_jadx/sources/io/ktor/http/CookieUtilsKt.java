package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a%\u0010\u000b\u001a\u00020\t*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0011\u001a\u00020\t*\u00020\r2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0015\u001a\u00020\t*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0017\u001a\u00020\t*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a+\u0010\u0018\u001a\u00020\t*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001b\u0010\u001b\u001a\u00020\t*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"", "", "isDelimiter", "(C)Z", "isNonDelimiter", "isOctet", "isNonDigit", "isDigit", "Lkotlin/Function0;", "Lh6/A;", "block", "otherwise", "(ZLkotlin/jvm/functions/Function0;)V", "", "Lkotlin/Function3;", "", "success", "tryParseTime", "(Ljava/lang/String;Lx6/n;)V", "Lkotlin/Function1;", "Lio/ktor/util/date/Month;", "tryParseMonth", "(Ljava/lang/String;Lx6/j;)V", "tryParseDayOfMonth", "tryParseYear", "Lio/ktor/http/CookieDateBuilder;", "token", "handleToken", "(Lio/ktor/http/CookieDateBuilder;Ljava/lang/String;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CookieUtilsKt {

    /* JADX INFO: renamed from: io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass1 implements p194x6.j {
        public static final io.ktor.http.CookieUtilsKt.AnonymousClass1 INSTANCE = new io.ktor.http.CookieUtilsKt.AnonymousClass1();

        public final java.lang.Boolean invoke(char c9) {
            return java.lang.Boolean.valueOf(io.ktor.http.CookieUtilsKt.isNonDigit(c9));
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            return invoke(((java.lang.Character) obj).charValue());
        }
    }

    /* JADX INFO: renamed from: io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$2, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass2 implements p194x6.j {
        public static final io.ktor.http.CookieUtilsKt.AnonymousClass2 INSTANCE = new io.ktor.http.CookieUtilsKt.AnonymousClass2();

        public final java.lang.Boolean invoke(char c9) {
            return java.lang.Boolean.valueOf(io.ktor.http.CookieUtilsKt.isOctet(c9));
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            return invoke(((java.lang.Character) obj).charValue());
        }
    }

    /* JADX INFO: renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C24101 implements p194x6.j {
        public static final io.ktor.http.CookieUtilsKt.C24101 INSTANCE = new io.ktor.http.CookieUtilsKt.C24101();

        public final java.lang.Boolean invoke(char c9) {
            return java.lang.Boolean.valueOf(c9 == ':');
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            return invoke(((java.lang.Character) obj).charValue());
        }
    }

    /* JADX INFO: renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$3, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass3 implements p194x6.j {
        public static final io.ktor.http.CookieUtilsKt.AnonymousClass3 INSTANCE = new io.ktor.http.CookieUtilsKt.AnonymousClass3();

        public final java.lang.Boolean invoke(char c9) {
            return java.lang.Boolean.valueOf(c9 == ':');
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            return invoke(((java.lang.Character) obj).charValue());
        }
    }

    /* JADX INFO: renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$5, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass5 implements p194x6.j {
        public static final io.ktor.http.CookieUtilsKt.AnonymousClass5 INSTANCE = new io.ktor.http.CookieUtilsKt.AnonymousClass5();

        public final java.lang.Boolean invoke(char c9) {
            return java.lang.Boolean.valueOf(io.ktor.http.CookieUtilsKt.isNonDigit(c9));
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            return invoke(((java.lang.Character) obj).charValue());
        }
    }

    /* JADX INFO: renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$6, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass6 implements p194x6.j {
        public static final io.ktor.http.CookieUtilsKt.AnonymousClass6 INSTANCE = new io.ktor.http.CookieUtilsKt.AnonymousClass6();

        public final java.lang.Boolean invoke(char c9) {
            return java.lang.Boolean.valueOf(io.ktor.http.CookieUtilsKt.isOctet(c9));
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            return invoke(((java.lang.Character) obj).charValue());
        }
    }

    /* JADX INFO: renamed from: io.ktor.http.CookieUtilsKt$tryParseYear$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C24111 implements p194x6.j {
        public static final io.ktor.http.CookieUtilsKt.C24111 INSTANCE = new io.ktor.http.CookieUtilsKt.C24111();

        public final java.lang.Boolean invoke(char c9) {
            return java.lang.Boolean.valueOf(io.ktor.http.CookieUtilsKt.isNonDigit(c9));
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            return invoke(((java.lang.Character) obj).charValue());
        }
    }

    /* JADX INFO: renamed from: io.ktor.http.CookieUtilsKt$tryParseYear$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class C24122 implements p194x6.j {
        public static final io.ktor.http.CookieUtilsKt.C24122 INSTANCE = new io.ktor.http.CookieUtilsKt.C24122();

        public final java.lang.Boolean invoke(char c9) {
            return java.lang.Boolean.valueOf(io.ktor.http.CookieUtilsKt.isOctet(c9));
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            return invoke(((java.lang.Character) obj).charValue());
        }
    }

    public static final void handleToken(io.ktor.http.CookieDateBuilder cookieDateBuilder, java.lang.String token) {
        kotlin.jvm.internal.m.e(cookieDateBuilder, "<this>");
        kotlin.jvm.internal.m.e(token, "token");
        if (cookieDateBuilder.getHours() == null || cookieDateBuilder.getMinutes() == null || cookieDateBuilder.getSeconds() == null) {
            io.ktor.http.StringLexer stringLexer = new io.ktor.http.StringLexer(token);
            int index = stringLexer.getIndex();
            if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$hour$1$1.INSTANCE)) {
                stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$hour$1$3.INSTANCE);
                java.lang.String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
                kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                int i3 = java.lang.Integer.parseInt(strSubstring);
                if (stringLexer.accept(io.ktor.http.CookieUtilsKt.C24101.INSTANCE)) {
                    int index2 = stringLexer.getIndex();
                    if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$minute$1$1.INSTANCE)) {
                        stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$minute$1$3.INSTANCE);
                        java.lang.String strSubstring2 = stringLexer.getSource().substring(index2, stringLexer.getIndex());
                        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                        int i9 = java.lang.Integer.parseInt(strSubstring2);
                        if (stringLexer.accept(io.ktor.http.CookieUtilsKt.AnonymousClass3.INSTANCE)) {
                            int index3 = stringLexer.getIndex();
                            if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$second$1$1.INSTANCE)) {
                                stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$second$1$3.INSTANCE);
                                java.lang.String strSubstring3 = stringLexer.getSource().substring(index3, stringLexer.getIndex());
                                kotlin.jvm.internal.m.d(strSubstring3, "substring(...)");
                                int i10 = java.lang.Integer.parseInt(strSubstring3);
                                if (stringLexer.accept(io.ktor.http.CookieUtilsKt.AnonymousClass5.INSTANCE)) {
                                    stringLexer.acceptWhile(io.ktor.http.CookieUtilsKt.AnonymousClass6.INSTANCE);
                                }
                                cookieDateBuilder.setHours(java.lang.Integer.valueOf(i3));
                                cookieDateBuilder.setMinutes(java.lang.Integer.valueOf(i9));
                                cookieDateBuilder.setSeconds(java.lang.Integer.valueOf(i10));
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (cookieDateBuilder.getDayOfMonth() == null) {
            io.ktor.http.StringLexer stringLexer2 = new io.ktor.http.StringLexer(token);
            int index4 = stringLexer2.getIndex();
            if (stringLexer2.accept(io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$day$1$1.INSTANCE)) {
                stringLexer2.accept(io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$day$1$3.INSTANCE);
                java.lang.String strSubstring4 = stringLexer2.getSource().substring(index4, stringLexer2.getIndex());
                kotlin.jvm.internal.m.d(strSubstring4, "substring(...)");
                int i11 = java.lang.Integer.parseInt(strSubstring4);
                if (stringLexer2.accept(io.ktor.http.CookieUtilsKt.AnonymousClass1.INSTANCE)) {
                    stringLexer2.acceptWhile(io.ktor.http.CookieUtilsKt.AnonymousClass2.INSTANCE);
                }
                cookieDateBuilder.setDayOfMonth(java.lang.Integer.valueOf(i11));
                return;
            }
        }
        if (cookieDateBuilder.getMonth() == null && token.length() >= 3) {
            p078i6.AbstractC2254e abstractC2254e = (p078i6.AbstractC2254e) io.ktor.util.date.Month.getEntries();
            abstractC2254e.getClass();
            D1.X x9 = new D1.X(5, abstractC2254e);
            while (x9.hasNext()) {
                io.ktor.util.date.Month month = (io.ktor.util.date.Month) x9.next();
                if (O7.x.x0(token, month.getValue(), true)) {
                    cookieDateBuilder.setMonth(month);
                    return;
                }
            }
        }
        if (cookieDateBuilder.getYear() == null) {
            io.ktor.http.StringLexer stringLexer3 = new io.ktor.http.StringLexer(token);
            int index5 = stringLexer3.getIndex();
            for (int i12 = 0; i12 < 2; i12++) {
                if (!stringLexer3.accept(io.ktor.http.CookieUtilsKt$tryParseYear$year$1$1$1.INSTANCE)) {
                    return;
                }
            }
            for (int i13 = 0; i13 < 2; i13++) {
                stringLexer3.accept(io.ktor.http.CookieUtilsKt$tryParseYear$year$1$2$1.INSTANCE);
            }
            java.lang.String strSubstring5 = stringLexer3.getSource().substring(index5, stringLexer3.getIndex());
            kotlin.jvm.internal.m.d(strSubstring5, "substring(...)");
            int i14 = java.lang.Integer.parseInt(strSubstring5);
            if (stringLexer3.accept(io.ktor.http.CookieUtilsKt.C24111.INSTANCE)) {
                stringLexer3.acceptWhile(io.ktor.http.CookieUtilsKt.C24122.INSTANCE);
            }
            cookieDateBuilder.setYear(java.lang.Integer.valueOf(i14));
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

    public static final void otherwise(boolean z6, kotlin.jvm.functions.Function0 block) {
        kotlin.jvm.internal.m.e(block, "block");
        if (z6) {
            return;
        }
        block.invoke();
    }

    public static final void tryParseDayOfMonth(java.lang.String str, p194x6.j success) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(success, "success");
        io.ktor.http.StringLexer stringLexer = new io.ktor.http.StringLexer(str);
        int index = stringLexer.getIndex();
        if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$day$1$1.INSTANCE)) {
            stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$day$1$3.INSTANCE);
            java.lang.String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            int i3 = java.lang.Integer.parseInt(strSubstring);
            if (stringLexer.accept(io.ktor.http.CookieUtilsKt.AnonymousClass1.INSTANCE)) {
                stringLexer.acceptWhile(io.ktor.http.CookieUtilsKt.AnonymousClass2.INSTANCE);
            }
            success.invoke(java.lang.Integer.valueOf(i3));
        }
    }

    public static final void tryParseMonth(java.lang.String str, p194x6.j success) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(success, "success");
        if (str.length() < 3) {
            return;
        }
        p078i6.AbstractC2254e abstractC2254e = (p078i6.AbstractC2254e) io.ktor.util.date.Month.getEntries();
        abstractC2254e.getClass();
        D1.X x9 = new D1.X(5, abstractC2254e);
        while (x9.hasNext()) {
            io.ktor.util.date.Month month = (io.ktor.util.date.Month) x9.next();
            if (O7.x.x0(str, month.getValue(), true)) {
                success.invoke(month);
                return;
            }
        }
    }

    public static final void tryParseTime(java.lang.String str, p194x6.n success) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(success, "success");
        io.ktor.http.StringLexer stringLexer = new io.ktor.http.StringLexer(str);
        int index = stringLexer.getIndex();
        if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$hour$1$1.INSTANCE)) {
            stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$hour$1$3.INSTANCE);
            java.lang.String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            int i3 = java.lang.Integer.parseInt(strSubstring);
            if (stringLexer.accept(io.ktor.http.CookieUtilsKt.C24101.INSTANCE)) {
                int index2 = stringLexer.getIndex();
                if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$minute$1$1.INSTANCE)) {
                    stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$minute$1$3.INSTANCE);
                    java.lang.String strSubstring2 = stringLexer.getSource().substring(index2, stringLexer.getIndex());
                    kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                    int i9 = java.lang.Integer.parseInt(strSubstring2);
                    if (stringLexer.accept(io.ktor.http.CookieUtilsKt.AnonymousClass3.INSTANCE)) {
                        int index3 = stringLexer.getIndex();
                        if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$second$1$1.INSTANCE)) {
                            stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$second$1$3.INSTANCE);
                            java.lang.String strSubstring3 = stringLexer.getSource().substring(index3, stringLexer.getIndex());
                            kotlin.jvm.internal.m.d(strSubstring3, "substring(...)");
                            int i10 = java.lang.Integer.parseInt(strSubstring3);
                            if (stringLexer.accept(io.ktor.http.CookieUtilsKt.AnonymousClass5.INSTANCE)) {
                                stringLexer.acceptWhile(io.ktor.http.CookieUtilsKt.AnonymousClass6.INSTANCE);
                            }
                            success.invoke(java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i10));
                        }
                    }
                }
            }
        }
    }

    public static final void tryParseYear(java.lang.String str, p194x6.j success) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(success, "success");
        io.ktor.http.StringLexer stringLexer = new io.ktor.http.StringLexer(str);
        int index = stringLexer.getIndex();
        for (int i3 = 0; i3 < 2; i3++) {
            if (!stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseYear$year$1$1$1.INSTANCE)) {
                return;
            }
        }
        for (int i9 = 0; i9 < 2; i9++) {
            stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseYear$year$1$2$1.INSTANCE);
        }
        java.lang.String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        int i10 = java.lang.Integer.parseInt(strSubstring);
        if (stringLexer.accept(io.ktor.http.CookieUtilsKt.C24111.INSTANCE)) {
            stringLexer.acceptWhile(io.ktor.http.CookieUtilsKt.C24122.INSTANCE);
        }
        success.invoke(java.lang.Integer.valueOf(i10));
    }
}
