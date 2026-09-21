package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lio/ktor/network/sockets/SocketOptionsPlatformCapabilities;", "", "<init>", "()V", "", "name", "socketOption", "(Ljava/lang/String;)Ljava/lang/Object;", "Ljava/nio/channels/SocketChannel;", "channel", "Lh6/A;", "setReusePort", "(Ljava/nio/channels/SocketChannel;)V", "Ljava/nio/channels/ServerSocketChannel;", "(Ljava/nio/channels/ServerSocketChannel;)V", "Ljava/nio/channels/DatagramChannel;", "(Ljava/nio/channels/DatagramChannel;)V", "", "Ljava/lang/reflect/Field;", "standardSocketOptions", "Ljava/util/Map;", "Ljava/lang/reflect/Method;", "channelSetOption", "Ljava/lang/reflect/Method;", "serverChannelSetOption", "datagramSetOption", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SocketOptionsPlatformCapabilities {
    public static final io.ktor.network.sockets.SocketOptionsPlatformCapabilities INSTANCE;
    private static final java.lang.reflect.Method channelSetOption;
    private static final java.lang.reflect.Method datagramSetOption;
    private static final java.lang.reflect.Method serverChannelSetOption;
    private static final java.util.Map<java.lang.String, java.lang.reflect.Field> standardSocketOptions;

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.Class<?> cls;
        java.lang.reflect.Method[] methods;
        int length;
        int i3;
        java.lang.Class<?> cls2;
        java.lang.reflect.Method[] methods2;
        int length2;
        int i9;
        java.util.Map map = p078i6.x.f23206h;
        INSTANCE = new io.ktor.network.sockets.SocketOptionsPlatformCapabilities();
        try {
            try {
                try {
                    java.lang.reflect.Field[] fields = java.lang.Class.forName("java.net.StandardSocketOptions").getFields();
                    if (fields != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.reflect.Field field : fields) {
                            int modifiers = field.getModifiers();
                            if (java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers) && java.lang.reflect.Modifier.isPublic(modifiers)) {
                                arrayList.add(field);
                            }
                        }
                        int iI0 = p078i6.D.I0(p078i6.q.I0(arrayList, 10));
                        if (iI0 < 16) {
                            iI0 = 16;
                        }
                        java.util.Map linkedHashMap = new java.util.LinkedHashMap(iI0);
                        for (java.lang.Object obj : arrayList) {
                            java.lang.String name = ((java.lang.reflect.Field) obj).getName();
                            kotlin.jvm.internal.m.d(name, "getName(...)");
                            linkedHashMap.put(name, obj);
                        }
                        map = linkedHashMap;
                    }
                    while (true) {
                        if (i9 >= length2) {
                            method = null;
                            break;
                        }
                        method = methods2[i9];
                        int modifiers2 = method.getModifiers();
                        if (java.lang.reflect.Modifier.isPublic(modifiers2) && !java.lang.reflect.Modifier.isStatic(modifiers2) && kotlin.jvm.internal.m.a(method.getName(), "setOption") && method.getParameterTypes().length == 2 && kotlin.jvm.internal.m.a(method.getReturnType(), cls2) && kotlin.jvm.internal.m.a(method.getParameterTypes()[0], java.net.SocketOption.class) && kotlin.jvm.internal.m.a(method.getParameterTypes()[1], java.lang.Object.class)) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    while (true) {
                        if (i3 >= length) {
                            method2 = null;
                            break;
                        }
                        method2 = methods[i3];
                        int modifiers3 = method2.getModifiers();
                        if (java.lang.reflect.Modifier.isPublic(modifiers3) && !java.lang.reflect.Modifier.isStatic(modifiers3) && kotlin.jvm.internal.m.a(method2.getName(), "setOption") && method2.getParameterTypes().length == 2 && kotlin.jvm.internal.m.a(method2.getReturnType(), cls) && kotlin.jvm.internal.m.a(method2.getParameterTypes()[0], java.net.SocketOption.class) && kotlin.jvm.internal.m.a(method2.getParameterTypes()[1], java.lang.Object.class)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                } catch (java.lang.Throwable unused) {
                }
                cls2 = java.lang.Class.forName("java.nio.channels.SocketChannel");
                methods2 = cls2.getMethods();
                kotlin.jvm.internal.m.d(methods2, "getMethods(...)");
                length2 = methods2.length;
                i9 = 0;
            } catch (java.lang.Throwable unused2) {
            }
            cls = java.lang.Class.forName("java.nio.channels.ServerSocketChannel");
            methods = cls.getMethods();
            kotlin.jvm.internal.m.d(methods, "getMethods(...)");
            length = methods.length;
            i3 = 0;
        } catch (java.lang.Throwable unused3) {
        }
        standardSocketOptions = map;
        java.lang.reflect.Method method3 = null;
        channelSetOption = method;
        serverChannelSetOption = method2;
        try {
            java.lang.Class<?> cls3 = java.lang.Class.forName("java.nio.channels.DatagramChannel");
            java.lang.reflect.Method[] methods3 = cls3.getMethods();
            kotlin.jvm.internal.m.d(methods3, "getMethods(...)");
            for (java.lang.reflect.Method method4 : methods3) {
                int modifiers4 = method4.getModifiers();
                if (java.lang.reflect.Modifier.isPublic(modifiers4) && !java.lang.reflect.Modifier.isStatic(modifiers4) && kotlin.jvm.internal.m.a(method4.getName(), "setOption") && method4.getParameterTypes().length == 2 && kotlin.jvm.internal.m.a(method4.getReturnType(), cls3) && kotlin.jvm.internal.m.a(method4.getParameterTypes()[0], java.net.SocketOption.class) && kotlin.jvm.internal.m.a(method4.getParameterTypes()[1], java.lang.Object.class)) {
                    method3 = method4;
                    break;
                }
            }
        } catch (java.lang.Throwable unused4) {
        }
        datagramSetOption = method3;
    }

    private SocketOptionsPlatformCapabilities() {
    }

    private final java.lang.Object socketOption(java.lang.String name) throws java.io.IOException {
        java.lang.Object obj;
        java.lang.reflect.Field field = standardSocketOptions.get(name);
        if (field == null || (obj = field.get(null)) == null) {
            throw new java.io.IOException(Y6.f.h("Socket option ", name, " is not supported"));
        }
        return obj;
    }

    public final void setReusePort(java.nio.channels.SocketChannel channel) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        kotlin.jvm.internal.m.e(channel, "channel");
        java.lang.Object objSocketOption = socketOption("SO_REUSEPORT");
        java.lang.reflect.Method method = channelSetOption;
        kotlin.jvm.internal.m.b(method);
        method.invoke(channel, objSocketOption, java.lang.Boolean.TRUE);
    }

    public final void setReusePort(java.nio.channels.ServerSocketChannel channel) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        kotlin.jvm.internal.m.e(channel, "channel");
        java.lang.Object objSocketOption = socketOption("SO_REUSEPORT");
        java.lang.reflect.Method method = serverChannelSetOption;
        kotlin.jvm.internal.m.b(method);
        method.invoke(channel, objSocketOption, java.lang.Boolean.TRUE);
    }

    public final void setReusePort(java.nio.channels.DatagramChannel channel) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        kotlin.jvm.internal.m.e(channel, "channel");
        java.lang.Object objSocketOption = socketOption("SO_REUSEPORT");
        java.lang.reflect.Method method = datagramSetOption;
        kotlin.jvm.internal.m.b(method);
        method.invoke(channel, objSocketOption, java.lang.Boolean.TRUE);
    }
}
