package io.ktor.util.converters;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0016BO\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u001c\u0010\b\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0004\u0012\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R*\u0010\b\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R*\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Lio/ktor/util/converters/DelegatingConversionService;", "Lio/ktor/util/converters/ConversionService;", "LE6/d;", "klass", "Lkotlin/Function1;", "", "", "", "decoder", "encoder", "<init>", "(LE6/d;Lx6/j;Lx6/j;)V", "values", "Lio/ktor/util/reflect/TypeInfo;", "type", "fromValues", "(Ljava/util/List;Lio/ktor/util/reflect/TypeInfo;)Ljava/lang/Object;", "value", "toValues", "(Ljava/lang/Object;)Ljava/util/List;", "LE6/d;", "Lx6/j;", "Configuration", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DelegatingConversionService implements io.ktor.util.converters.ConversionService {
    private final p194x6.j decoder;
    private final p194x6.j encoder;
    private final E6.InterfaceC0331d klass;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u000b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0004\b\u000e\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R6\u0010\u0012\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\rR6\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lio/ktor/util/converters/DelegatingConversionService$Configuration;", "", "T", "LE6/d;", "klass", "<init>", "(LE6/d;)V", "Lkotlin/Function1;", "", "", "converter", "Lh6/A;", "decode", "(Lx6/j;)V", "encode", "LE6/d;", "getKlass$ktor_utils", "()LE6/d;", "decoder", "Lx6/j;", "getDecoder$ktor_utils", "()Lx6/j;", "setDecoder$ktor_utils", "encoder", "getEncoder$ktor_utils", "setEncoder$ktor_utils", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Configuration<T> {
        private p194x6.j decoder;
        private p194x6.j encoder;
        private final E6.InterfaceC0331d klass;

        public Configuration(E6.InterfaceC0331d klass) {
            kotlin.jvm.internal.m.e(klass, "klass");
            this.klass = klass;
        }

        public final void decode(p194x6.j converter) {
            kotlin.jvm.internal.m.e(converter, "converter");
            if (this.decoder == null) {
                this.decoder = converter;
                return;
            }
            throw new java.lang.IllegalStateException("Decoder has already been set for type '" + this.klass + '\'');
        }

        public final void encode(p194x6.j converter) {
            kotlin.jvm.internal.m.e(converter, "converter");
            if (this.encoder == null) {
                this.encoder = converter;
                return;
            }
            throw new java.lang.IllegalStateException("Encoder has already been set for type '" + this.klass + '\'');
        }

        /* JADX INFO: renamed from: getDecoder$ktor_utils, reason: from getter */
        public final p194x6.j getDecoder() {
            return this.decoder;
        }

        /* JADX INFO: renamed from: getEncoder$ktor_utils, reason: from getter */
        public final p194x6.j getEncoder() {
            return this.encoder;
        }

        /* JADX INFO: renamed from: getKlass$ktor_utils, reason: from getter */
        public final E6.InterfaceC0331d getKlass() {
            return this.klass;
        }

        public final void setDecoder$ktor_utils(p194x6.j jVar) {
            this.decoder = jVar;
        }

        public final void setEncoder$ktor_utils(p194x6.j jVar) {
            this.encoder = jVar;
        }
    }

    public DelegatingConversionService(E6.InterfaceC0331d klass, p194x6.j jVar, p194x6.j jVar2) {
        kotlin.jvm.internal.m.e(klass, "klass");
        this.klass = klass;
        this.decoder = jVar;
        this.encoder = jVar2;
    }

    @Override // io.ktor.util.converters.ConversionService
    public java.lang.Object fromValues(java.util.List<java.lang.String> values, io.ktor.util.reflect.TypeInfo type) {
        kotlin.jvm.internal.m.e(values, "values");
        kotlin.jvm.internal.m.e(type, "type");
        p194x6.j jVar = this.decoder;
        if (jVar != null) {
            return jVar.invoke(values);
        }
        throw new java.lang.IllegalStateException("Decoder was not specified for type '" + this.klass + '\'');
    }

    @Override // io.ktor.util.converters.ConversionService
    public java.util.List<java.lang.String> toValues(java.lang.Object value) {
        p194x6.j jVar = this.encoder;
        if (jVar != null) {
            return (java.util.List) jVar.invoke(value);
        }
        throw new java.lang.IllegalStateException("Encoder was not specified for type '" + this.klass + '\'');
    }
}
