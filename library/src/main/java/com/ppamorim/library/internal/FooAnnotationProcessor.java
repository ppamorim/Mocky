package com.ppamorim.library.internal;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;


@SupportedSourceVersion(SourceVersion.RELEASE_6)
@SupportedAnnotationTypes("so.Foo")

public class FooAnnotationProcessor extends AbstractProcessor {

  @Override
  public boolean process(Set<? extends TypeElement> annotations,
      RoundEnvironment roundEnv) {

    TypeElement foo = processingEnv.getElementUtils().getTypeElement("so.Foo");
    Set<? extends Element> classes = roundEnv.getElementsAnnotatedWith(foo);
    Messager messenger = processingEnv.getMessager();
    for (Element e : classes) {
      boolean found = false;
      for (Element method : e.getEnclosedElements()) {
        messenger.printMessage(Diagnostic.Kind.ERROR,
            method.getSimpleName());
        if (method.getKind() == ElementKind.METHOD && method.getSimpleName().toString().equals("getInstance")) {
          found = true;
          break;
        }
      }
      if (!found)
      {
        messenger.printMessage(Diagnostic.Kind.ERROR,
            "The following class does not implement getInstance : " + e.getSimpleName(),e);
      }
    }
    return true;
  }

}