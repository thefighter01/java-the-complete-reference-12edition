package TypeAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// this a typeAnnotation and marker One
@Target(ElementType.TYPE_USE)
public @interface TypeAnno {
}
