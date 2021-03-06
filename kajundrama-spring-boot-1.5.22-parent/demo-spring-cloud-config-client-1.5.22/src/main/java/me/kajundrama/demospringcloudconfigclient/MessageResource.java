package me.kajundrama.demospringcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/message")
public class MessageResource {

  @Value("${message: default Message}")
  private String message;

  @GetMapping("/get")
  public String getMessage() {
    return message;
  }
}
