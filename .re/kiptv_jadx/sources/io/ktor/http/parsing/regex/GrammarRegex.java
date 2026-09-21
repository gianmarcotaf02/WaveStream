package io.ktor.http.parsing.regex;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/http/parsing/regex/GrammarRegex;", "", "", "regexRaw", "", "groupsCountRaw", "", "group", "<init>", "(Ljava/lang/String;IZ)V", "regex", "Ljava/lang/String;", "getRegex", "()Ljava/lang/String;", "groupsCount", "I", "getGroupsCount", "()I", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class GrammarRegex {
    private final int groupsCount;
    private final java.lang.String regex;

    public GrammarRegex(java.lang.String regexRaw, int i3, boolean z6) {
        kotlin.jvm.internal.m.e(regexRaw, "regexRaw");
        this.regex = z6 ? B2.a.i(')', "(", regexRaw) : regexRaw;
        this.groupsCount = z6 ? i3 + 1 : i3;
    }

    public final int getGroupsCount() {
        return this.groupsCount;
    }

    public final java.lang.String getRegex() {
        return this.regex;
    }

    public /* synthetic */ GrammarRegex(java.lang.String str, int i3, boolean z6, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, (i9 & 2) != 0 ? 0 : i3, (i9 & 4) != 0 ? false : z6);
    }
}
