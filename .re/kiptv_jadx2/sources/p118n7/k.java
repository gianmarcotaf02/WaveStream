package p118n7;

import B2.a;
import E6.u;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.r;
import p078i6.y;

public final class k implements i {

    public static final u[] f25882Y;

    public final j f25883A;

    public final j f25884B;

    public final j f25885C;

    public final j f25886D;

    public final j f25887E;

    public final j f25888F;

    public final j f25889G;
    public final j H;

    public final j f25890I;

    public final j f25891J;

    public final j f25892K;

    public final j f25893L;

    public final j f25894M;

    public final j f25895N;

    public final j f25896O;

    public final j f25897P;

    public final j f25898Q;

    public final j f25899R;

    public final j f25900S;

    public final j f25901T;

    public final j f25902U;
    public final j V;
    public final j W;
    public final j X;

    public boolean f25903a;

    public final j f25904b = new j(b.f25840d, this);

    public final j f25905c;

    public final j f25906d;

    public final j f25907e;

    public final j f25908f;
    public final j g;

    public final j f25909h;

    public final j f25910i;
    public final j j;

    public final j f25911k;

    public final j f25912l;

    public final j f25913m;

    public final j f25914n;

    public final j f25915o;

    public final j f25916p;

    public final j f25917q;

    public final j f25918r;

    public final j f25919s;

    public final j f25920t;

    public final j f25921u;

    public final j f25922v;

    public final j f25923w;

    public final j f25924x;
    public final j y;

    public final j f25925z;

    static {
        r rVar = new r(k.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0);
        C c9 = B.f24540a;
        f25882Y = new u[]{c9.f(rVar), a.d(k.class, "withDefinedIn", "getWithDefinedIn()Z", 0, c9), a.d(k.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0, c9), a.d(k.class, "modifiers", "getModifiers()Ljava/util/Set;", 0, c9), a.d(k.class, "startFromName", "getStartFromName()Z", 0, c9), a.d(k.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0, c9), a.d(k.class, "debugMode", "getDebugMode()Z", 0, c9), a.d(k.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0, c9), a.d(k.class, "verbose", "getVerbose()Z", 0, c9), a.d(k.class, "unitReturnType", "getUnitReturnType()Z", 0, c9), a.d(k.class, "withoutReturnType", "getWithoutReturnType()Z", 0, c9), a.d(k.class, "enhancedTypes", "getEnhancedTypes()Z", 0, c9), a.d(k.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0, c9), a.d(k.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0, c9), a.d(k.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0, c9), a.d(k.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0, c9), a.d(k.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0, c9), a.d(k.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0, c9), a.d(k.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0, c9), a.d(k.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0, c9), a.d(k.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0, c9), a.d(k.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0, c9), a.d(k.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0, c9), a.d(k.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0, c9), a.d(k.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0, c9), a.d(k.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0, c9), a.d(k.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0, c9), a.d(k.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0, c9), a.d(k.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0, c9), a.d(k.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0, c9), a.d(k.class, "receiverAfterName", "getReceiverAfterName()Z", 0, c9), a.d(k.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0, c9), a.d(k.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0, c9), a.d(k.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0, c9), a.d(k.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0, c9), a.d(k.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0, c9), a.d(k.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0, c9), a.d(k.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0, c9), a.d(k.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0, c9), a.d(k.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0, c9), c9.f(new r(k.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), a.d(k.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0, c9), a.d(k.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0, c9), a.d(k.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0, c9), a.d(k.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0, c9), a.d(k.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0, c9), a.d(k.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0, c9), a.d(k.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0, c9), a.d(k.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0, c9), a.d(k.class, "informativeErrorType", "getInformativeErrorType()Z", 0, c9)};
    }

    public k() {
        Boolean bool = Boolean.TRUE;
        this.f25905c = new j(bool, this);
        this.f25906d = new j(bool, this);
        this.f25907e = new j(h.f25865i, this);
        Boolean bool2 = Boolean.FALSE;
        this.f25908f = new j(bool2, this);
        this.g = new j(bool2, this);
        this.f25909h = new j(bool2, this);
        this.f25910i = new j(bool2, this);
        this.j = new j(bool2, this);
        this.f25911k = new j(bool, this);
        this.f25912l = new j(bool2, this);
        this.f25913m = new j(bool2, this);
        this.f25914n = new j(bool2, this);
        this.f25915o = new j(bool, this);
        this.f25916p = new j(bool, this);
        this.f25917q = new j(bool2, this);
        this.f25918r = new j(bool2, this);
        this.f25919s = new j(bool2, this);
        this.f25920t = new j(bool2, this);
        this.f25921u = new j(bool2, this);
        this.f25922v = new j(null, this);
        this.f25923w = new j(bool2, this);
        this.f25924x = new j(bool2, this);
        this.y = new j(d.f25854v, this);
        this.f25925z = new j(d.f25855w, this);
        this.f25883A = new j(bool, this);
        this.f25884B = new j(n.f25929i, this);
        this.f25885C = new j(e.f25857a, this);
        this.f25886D = new j(s.f25935h, this);
        this.f25887E = new j(o.f25930h, this);
        this.f25888F = new j(bool2, this);
        this.f25889G = new j(bool2, this);
        this.H = new j(p.f25933h, this);
        this.f25890I = new j(bool2, this);
        this.f25891J = new j(bool2, this);
        this.f25892K = new j(y.f23207h, this);
        this.f25893L = new j(l.f25926a, this);
        this.f25894M = new j(null, this);
        this.f25895N = new j(a.NO_ARGUMENTS, this);
        this.f25896O = new j(bool2, this);
        this.f25897P = new j(bool, this);
        this.f25898Q = new j(bool, this);
        this.f25899R = new j(bool2, this);
        this.f25900S = new j(bool2, this);
        this.f25901T = new j(bool, this);
        this.f25902U = new j(bool, this);
        this.V = new j(bool2, this);
        this.W = new j(bool2, this);
        this.X = new j(bool, this);
    }

    @Override
    public final void a() {
        this.f25888F.setValue(this, f25882Y[30], Boolean.TRUE);
    }

    @Override
    public final void b() {
        this.f25909h.setValue(this, f25882Y[6], Boolean.TRUE);
    }

    @Override
    public final void c() {
        this.f25889G.setValue(this, f25882Y[31], Boolean.TRUE);
    }

    @Override
    public final void d(Set set) {
        m.e(set, "<set-?>");
        this.f25907e.setValue(this, f25882Y[3], set);
    }

    @Override
    public final void e(LinkedHashSet linkedHashSet) {
        this.f25893L.setValue(this, f25882Y[36], linkedHashSet);
    }

    @Override
    public final void f() {
        this.f25923w.setValue(this, f25882Y[21], Boolean.TRUE);
    }

    @Override
    public final void g(o oVar) {
        this.f25887E.setValue(this, f25882Y[29], oVar);
    }

    @Override
    public final void h() {
        this.f25908f.setValue(this, f25882Y[4], Boolean.TRUE);
    }

    @Override
    public final void i() {
        this.f25905c.setValue(this, f25882Y[1], Boolean.FALSE);
    }

    @Override
    public final Set j() {
        return (Set) this.f25893L.getValue(this, f25882Y[36]);
    }

    @Override
    public final void k(c cVar) {
        this.f25904b.setValue(this, f25882Y[0], cVar);
    }

    @Override
    public final void l() {
        q qVar = s.f25936i;
        this.f25886D.setValue(this, f25882Y[28], qVar);
    }

    @Override
    public final void m() {
        this.f25924x.setValue(this, f25882Y[22], Boolean.TRUE);
    }

    public final boolean n() {
        return ((Boolean) this.f25909h.getValue(this, f25882Y[6])).booleanValue();
    }
}
