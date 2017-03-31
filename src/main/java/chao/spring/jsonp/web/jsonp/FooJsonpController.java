package chao.spring.jsonp.web.jsonp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chao.spring.jsonp.data.FooDto;

@RestController
public class FooJsonpController {
  @RequestMapping(value = "/foo/jsonp", produces = MediaType.APPLICATION_JSON_VALUE)
  public FooDto bookInfo1() {
    FooDto result = new FooDto();
    return result;
  }
}
