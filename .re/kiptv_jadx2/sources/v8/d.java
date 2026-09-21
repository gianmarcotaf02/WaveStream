package v8;

import java.util.Map;
import kotlin.jvm.internal.m;

public final class d extends e {

    public final Object f29707a;

    public final Object f29708b;

    public final Object f29709c;

    public final Object f29710d;

    public final Object f29711e;

    public final boolean f29712f;

    public d(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z6) {
        m.e(class2ContextualFactory, "class2ContextualFactory");
        m.e(polyBase2Serializers, "polyBase2Serializers");
        m.e(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        m.e(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        m.e(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f29707a = class2ContextualFactory;
        this.f29708b = polyBase2Serializers;
        this.f29709c = polyBase2DefaultSerializerProvider;
        this.f29710d = polyBase2NamedSerializers;
        this.f29711e = polyBase2DefaultDeserializerProvider;
        this.f29712f = z6;
    }
}
