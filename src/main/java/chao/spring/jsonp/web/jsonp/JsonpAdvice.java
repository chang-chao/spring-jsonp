package chao.spring.jsonp.web.jsonp;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

@ControllerAdvice(basePackageClasses = FooJsonpController.class)
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {
  public JsonpAdvice() {
    super("callback");
  }
}
