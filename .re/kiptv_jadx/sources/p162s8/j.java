package p162s8;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f27412f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f27413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f27414i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p162s8.a f27415k;

    public j(boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, java.lang.String prettyPrintIndent, boolean z13, java.lang.String classDiscriminator, boolean z14, boolean z15, p162s8.a classDiscriminatorMode) {
        kotlin.jvm.internal.m.e(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.m.e(classDiscriminator, "classDiscriminator");
        kotlin.jvm.internal.m.e(classDiscriminatorMode, "classDiscriminatorMode");
        this.f27407a = z6;
        this.f27408b = z9;
        this.f27409c = z10;
        this.f27410d = z11;
        this.f27411e = z12;
        this.f27412f = prettyPrintIndent;
        this.g = z13;
        this.f27413h = classDiscriminator;
        this.f27414i = z14;
        this.j = z15;
        this.f27415k = classDiscriminatorMode;
    }

    public final java.lang.String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f27407a + ", ignoreUnknownKeys=" + this.f27408b + ", isLenient=" + this.f27409c + ", allowStructuredMapKeys=" + this.f27410d + ", prettyPrint=false, explicitNulls=" + this.f27411e + ", prettyPrintIndent='" + this.f27412f + "', coerceInputValues=" + this.g + ", useArrayPolymorphism=false, classDiscriminator='" + this.f27413h + "', allowSpecialFloatingPointValues=" + this.f27414i + ", useAlternativeNames=" + this.j + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f27415k + ')';
    }
}
