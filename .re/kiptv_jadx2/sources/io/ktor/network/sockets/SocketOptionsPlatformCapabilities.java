package io.ktor.network.sockets;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.SocketOption;
import java.nio.channels.DatagramChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.D;
import p078i6.q;
import p078i6.x;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lio/ktor/network/sockets/SocketOptionsPlatformCapabilities;", "", "<init>", "()V", "", "name", "socketOption", "(Ljava/lang/String;)Ljava/lang/Object;", "Ljava/nio/channels/SocketChannel;", "channel", "Lh6/A;", "setReusePort", "(Ljava/nio/channels/SocketChannel;)V", "Ljava/nio/channels/ServerSocketChannel;", "(Ljava/nio/channels/ServerSocketChannel;)V", "Ljava/nio/channels/DatagramChannel;", "(Ljava/nio/channels/DatagramChannel;)V", "", "Ljava/lang/reflect/Field;", "standardSocketOptions", "Ljava/util/Map;", "Ljava/lang/reflect/Method;", "channelSetOption", "Ljava/lang/reflect/Method;", "serverChannelSetOption", "datagramSetOption", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SocketOptionsPlatformCapabilities {
    public static final SocketOptionsPlatformCapabilities INSTANCE;
    private static final Method channelSetOption;
    private static final Method datagramSetOption;
    private static final Method serverChannelSetOption;
    private static final Map<String, Field> standardSocketOptions;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Method[] methods;
        int length;
        int i3;
        Class<?> cls2;
        Method[] methods2;
        int length2;
        int i9;
        Map map = x.f23206h;
        INSTANCE = new SocketOptionsPlatformCapabilities();
        try {
            try {
                try {
                    Field[] fields = Class.forName("java.net.StandardSocketOptions").getFields();
                    if (fields != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Field field : fields) {
                            int modifiers = field.getModifiers();
                            if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers) && Modifier.isPublic(modifiers)) {
                                arrayList.add(field);
                            }
                        }
                        int iI0 = D.I0(q.I0(arrayList, 10));
                        if (iI0 < 16) {
                            iI0 = 16;
                        }
                        Map linkedHashMap = new LinkedHashMap(iI0);
                        for (Object obj : arrayList) {
                            String name = ((Field) obj).getName();
                            m.d(name, "getName(...)");
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
                        if (Modifier.isPublic(modifiers2) && !Modifier.isStatic(modifiers2) && m.a(method.getName(), "setOption") && method.getParameterTypes().length == 2 && m.a(method.getReturnType(), cls2) && m.a(method.getParameterTypes()[0], SocketOption.class) && m.a(method.getParameterTypes()[1], Object.class)) {
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
                        if (Modifier.isPublic(modifiers3) && !Modifier.isStatic(modifiers3) && m.a(method2.getName(), "setOption") && method2.getParameterTypes().length == 2 && m.a(method2.getReturnType(), cls) && m.a(method2.getParameterTypes()[0], SocketOption.class) && m.a(method2.getParameterTypes()[1], Object.class)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                } catch (Throwable unused) {
                }
                cls2 = Class.forName("java.nio.channels.SocketChannel");
                methods2 = cls2.getMethods();
                m.d(methods2, "getMethods(...)");
                length2 = methods2.length;
                i9 = 0;
            } catch (Throwable unused2) {
            }
            cls = Class.forName("java.nio.channels.ServerSocketChannel");
            methods = cls.getMethods();
            m.d(methods, "getMethods(...)");
            length = methods.length;
            i3 = 0;
        } catch (Throwable unused3) {
        }
        standardSocketOptions = map;
        Method method3 = null;
        channelSetOption = method;
        serverChannelSetOption = method2;
        try {
            Class<?> cls3 = Class.forName("java.nio.channels.DatagramChannel");
            Method[] methods3 = cls3.getMethods();
            m.d(methods3, "getMethods(...)");
            for (Method method4 : methods3) {
                int modifiers4 = method4.getModifiers();
                if (Modifier.isPublic(modifiers4) && !Modifier.isStatic(modifiers4) && m.a(method4.getName(), "setOption") && method4.getParameterTypes().length == 2 && m.a(method4.getReturnType(), cls3) && m.a(method4.getParameterTypes()[0], SocketOption.class) && m.a(method4.getParameterTypes()[1], Object.class)) {
                    method3 = method4;
                    break;
                }
            }
        } catch (Throwable unused4) {
        }
        datagramSetOption = method3;
    }

    private SocketOptionsPlatformCapabilities() {
    }

    private final Object socketOption(String name) throws IOException {
        Object obj;
        Field field = standardSocketOptions.get(name);
        if (field == null || (obj = field.get(null)) == null) {
            throw new IOException(f.h("Socket option ", name, " is not supported"));
        }
        return obj;
    }

    public final void setReusePort(SocketChannel channel) throws IllegalAccessException, IOException, InvocationTargetException {
        m.e(channel, "channel");
        Object objSocketOption = socketOption("SO_REUSEPORT");
        Method method = channelSetOption;
        m.b(method);
        method.invoke(channel, objSocketOption, Boolean.TRUE);
    }

    public final void setReusePort(ServerSocketChannel channel) throws IllegalAccessException, IOException, InvocationTargetException {
        m.e(channel, "channel");
        Object objSocketOption = socketOption("SO_REUSEPORT");
        Method method = serverChannelSetOption;
        m.b(method);
        method.invoke(channel, objSocketOption, Boolean.TRUE);
    }

    public final void setReusePort(DatagramChannel channel) throws IllegalAccessException, IOException, InvocationTargetException {
        m.e(channel, "channel");
        Object objSocketOption = socketOption("SO_REUSEPORT");
        Method method = datagramSetOption;
        m.b(method);
        method.invoke(channel, objSocketOption, Boolean.TRUE);
    }
}
