package com.nantech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

  private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);

  public static void main(String[] args) {
    LOGGER.debug("Hello from Log4j2");
    LOGGER.debug("{}", getNumber());
    LOGGER.info("inside HelloWorld main ()");
  }

  private static int getNumber() {
    return 5;
  }
}
