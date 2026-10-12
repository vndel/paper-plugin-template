# paper-plugin-template

A deliberately small Java 21 starter for Paper plugins. It includes a lifecycle class, default configuration, plugin metadata and Maven build; no runtime libraries are bundled by default.

## Build and install
Run `mvn verify`; copy `target/paper-plugin-template-1.0.0.jar` to a test server's `plugins/` directory. Review console output on startup and shutdown.

## Configuration
```yaml
messages:
  prefix: '&8[&bExample&8] '
features:
  metrics: false
```

Keep Bukkit API calls on the server thread unless the API explicitly documents async safety. Test against the exact Paper version you deploy. MIT licensed.
