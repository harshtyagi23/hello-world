package com.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;

@Component
public class StaticServer extends AbstractVerticle {

  @Autowired
  AppConfiguration configuration;

  @Override
  public void start() throws Exception {
    Router router = Router.router(vertx);

    // Serve the static pages
    router.route().handler(StaticHandler.create());

    vertx.createHttpServer().requestHandler(router::accept).listen(configuration.httpPort());
  }
}
