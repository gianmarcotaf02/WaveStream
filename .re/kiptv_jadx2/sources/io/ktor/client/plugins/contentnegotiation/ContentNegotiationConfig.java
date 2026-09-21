package io.ktor.client.plugins.contentnegotiation;

import E6.InterfaceC0331d;
import androidx.media3.container.NalUnitUtil;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypeMatcher;
import io.ktor.serialization.Configuration;
import io.ktor.serialization.ContentConverter;
import io.ktor.utils.io.KtorDsl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.I;
import p078i6.o;
import p194x6.j;

@KtorDsl
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0010\u001a\u00020\u000e\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0010\u001a\u00020\u000e\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u000e\"\u0006\b\u0000\u0010\n\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0003J\u0018\u0010\u0016\u001a\u00020\u000e\"\u0006\b\u0000\u0010\n\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0003J\u0019\u0010\u0016\u001a\u00020\u000e2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017¢\u0006\u0004\b\u0016\u0010\u0019J\u0019\u0010\u0015\u001a\u00020\u000e2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0003R$\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Lio/ktor/client/plugins/contentnegotiation/ContentNegotiationConfig;", "Lio/ktor/serialization/Configuration;", "<init>", "()V", "Lio/ktor/http/ContentType;", "pattern", "Lio/ktor/http/ContentTypeMatcher;", "defaultMatcher", "(Lio/ktor/http/ContentType;)Lio/ktor/http/ContentTypeMatcher;", "Lio/ktor/serialization/ContentConverter;", "T", "contentType", "converter", "Lkotlin/Function1;", "Lh6/A;", "configuration", "register", "(Lio/ktor/http/ContentType;Lio/ktor/serialization/ContentConverter;Lx6/j;)V", "contentTypeToSend", "contentTypeMatcher", "(Lio/ktor/http/ContentType;Lio/ktor/serialization/ContentConverter;Lio/ktor/http/ContentTypeMatcher;Lx6/j;)V", "ignoreType", "removeIgnoredType", "LE6/d;", "type", "(LE6/d;)V", "clearIgnoredTypes", "", "ignoredTypes", "Ljava/util/Set;", "getIgnoredTypes$ktor_client_content_negotiation", "()Ljava/util/Set;", "", "Lio/ktor/client/plugins/contentnegotiation/ContentNegotiationConfig$ConverterRegistration;", "registrations", "Ljava/util/List;", "getRegistrations$ktor_client_content_negotiation", "()Ljava/util/List;", "", "defaultAcceptHeaderQValue", "Ljava/lang/Double;", "getDefaultAcceptHeaderQValue", "()Ljava/lang/Double;", "setDefaultAcceptHeaderQValue", "(Ljava/lang/Double;)V", "ConverterRegistration", "ktor-client-content-negotiation"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ContentNegotiationConfig implements Configuration {
    private Double defaultAcceptHeaderQValue;
    private final Set<InterfaceC0331d> ignoredTypes = o.Q1(I.o0(DefaultIgnoredTypesJvmKt.getDefaultIgnoredTypes(), ContentNegotiationKt.getDefaultCommonIgnoredTypes()));
    private final List<ConverterRegistration> registrations = new ArrayList();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/client/plugins/contentnegotiation/ContentNegotiationConfig$ConverterRegistration;", "", "Lio/ktor/serialization/ContentConverter;", "converter", "Lio/ktor/http/ContentType;", "contentTypeToSend", "Lio/ktor/http/ContentTypeMatcher;", "contentTypeMatcher", "<init>", "(Lio/ktor/serialization/ContentConverter;Lio/ktor/http/ContentType;Lio/ktor/http/ContentTypeMatcher;)V", "Lio/ktor/serialization/ContentConverter;", "getConverter", "()Lio/ktor/serialization/ContentConverter;", "Lio/ktor/http/ContentType;", "getContentTypeToSend", "()Lio/ktor/http/ContentType;", "Lio/ktor/http/ContentTypeMatcher;", "getContentTypeMatcher", "()Lio/ktor/http/ContentTypeMatcher;", "ktor-client-content-negotiation"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ConverterRegistration {
        private final ContentTypeMatcher contentTypeMatcher;
        private final ContentType contentTypeToSend;
        private final ContentConverter converter;

        public ConverterRegistration(ContentConverter converter, ContentType contentTypeToSend, ContentTypeMatcher contentTypeMatcher) {
            m.e(converter, "converter");
            m.e(contentTypeToSend, "contentTypeToSend");
            m.e(contentTypeMatcher, "contentTypeMatcher");
            this.converter = converter;
            this.contentTypeToSend = contentTypeToSend;
            this.contentTypeMatcher = contentTypeMatcher;
        }

        public final ContentTypeMatcher getContentTypeMatcher() {
            return this.contentTypeMatcher;
        }

        public final ContentType getContentTypeToSend() {
            return this.contentTypeToSend;
        }

        public final ContentConverter getConverter() {
            return this.converter;
        }
    }

    private final ContentTypeMatcher defaultMatcher(final ContentType pattern) {
        return new ContentTypeMatcher() {
            @Override
            public boolean contains(ContentType contentType) {
                m.e(contentType, "contentType");
                return contentType.match(pattern);
            }
        };
    }

    public final void clearIgnoredTypes() {
        this.ignoredTypes.clear();
    }

    public final Double getDefaultAcceptHeaderQValue() {
        return this.defaultAcceptHeaderQValue;
    }

    public final Set<InterfaceC0331d> getIgnoredTypes$ktor_client_content_negotiation() {
        return this.ignoredTypes;
    }

    public final List<ConverterRegistration> getRegistrations$ktor_client_content_negotiation() {
        return this.registrations;
    }

    public final void ignoreType(InterfaceC0331d type) {
        m.e(type, "type");
        this.ignoredTypes.add(type);
    }

    @Override
    public <T extends ContentConverter> void register(ContentType contentType, T converter, j configuration) {
        m.e(contentType, "contentType");
        m.e(converter, "converter");
        m.e(configuration, "configuration");
        register(contentType, converter, contentType.match(ContentType.Application.INSTANCE.getJson()) ? JsonContentTypeMatcher.INSTANCE : defaultMatcher(contentType), configuration);
    }

    public final void removeIgnoredType(InterfaceC0331d type) {
        m.e(type, "type");
        this.ignoredTypes.remove(type);
    }

    public final void setDefaultAcceptHeaderQValue(Double d4) {
        this.defaultAcceptHeaderQValue = d4;
    }

    public final <T> void ignoreType() {
        m.j();
        throw null;
    }

    public final <T> void removeIgnoredType() {
        m.j();
        throw null;
    }

    public final <T extends ContentConverter> void register(ContentType contentTypeToSend, T converter, ContentTypeMatcher contentTypeMatcher, j configuration) {
        m.e(contentTypeToSend, "contentTypeToSend");
        m.e(converter, "converter");
        m.e(contentTypeMatcher, "contentTypeMatcher");
        m.e(configuration, "configuration");
        configuration.invoke(converter);
        this.registrations.add(new ConverterRegistration(converter, contentTypeToSend, contentTypeMatcher));
    }
}
