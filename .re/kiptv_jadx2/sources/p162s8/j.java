package p162s8;

import kotlin.jvm.internal.m;

public final class j {

    public final boolean f27407a;

    public final boolean f27408b;

    public final boolean f27409c;

    public final boolean f27410d;

    public final boolean f27411e;

    public final String f27412f;
    public final boolean g;

    public final String f27413h;

    public final boolean f27414i;
    public final boolean j;

    public final a f27415k;

    public j(boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, String prettyPrintIndent, boolean z13, String classDiscriminator, boolean z14, boolean z15, a classDiscriminatorMode) {
        m.e(prettyPrintIndent, "prettyPrintIndent");
        m.e(classDiscriminator, "classDiscriminator");
        m.e(classDiscriminatorMode, "classDiscriminatorMode");
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

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f27407a + ", ignoreUnknownKeys=" + this.f27408b + ", isLenient=" + this.f27409c + ", allowStructuredMapKeys=" + this.f27410d + ", prettyPrint=false, explicitNulls=" + this.f27411e + ", prettyPrintIndent='" + this.f27412f + "', coerceInputValues=" + this.g + ", useArrayPolymorphism=false, classDiscriminator='" + this.f27413h + "', allowSpecialFloatingPointValues=" + this.f27414i + ", useAlternativeNames=" + this.j + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f27415k + ')';
    }
}
