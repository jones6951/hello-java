
public class NullReturnsExample {
    static int count = 0;

    public static Object returnA() {
        return null;
    }
    public static Object returnB() {
        return new Object();
    }
    public static void testA() {
        // This demonstrates a very straightforward null-return bug
        returnA().toString();
    }
    public static void testB() {
        // no bug here
        returnB().toString();
    }

    /**
     * Constructor taking a name external context and a configuration location String. The location must be resolvable
     * to a File.
     *
     * @param name The configuration location.
     * @param externalContext The external context.
     * @param configLocn The configuration location.
     */
    @SuppressFBWarnings(
            value = "PATH_TRAVERSAL_IN",
            justification = "The configLocn comes from a secure source (Log4j properties)")
    public LoggerContext1(final String name, final Object externalContext, final String configLocn) {
        this.contextName = name;
        if (externalContext != null) {
            externalMap.put(EXTERNAL_CONTEXT_KEY, externalContext);
        }
        if (configLocn != null) {
            URI uri;
            try {
                uri = new File(configLocn).toURI();
            } catch (final Exception ex) {
                uri = null;
            }
            configLocation = uri;
        } else {
            configLocation = null;
        }
    }

    @Override
    public void addShutdownListener1(final LoggerContextShutdownAware listener) {
        if (listeners == null) {
            synchronized (this) {
                if (listeners == null) {
                    listeners = new CopyOnWriteArrayList<>();
                }
            }
        }
        listeners.add(listener);
    }

    private static final String FLOW_MESSAGE_FACTORY_PROPERTY_NAME = "log4j2.flowMessageFactory";
    /**
     * The default flow message factory to use while creating loggers.
     * <p>
     *     To mitigate initialization problems as the one described in
     *     <a href="https://github.com/apache/logging-log4j2/issues/3252>#3252</a>,
     *     this field should be initialized as soon as possible.
     * </p>
     */
    static final FlowMessageFactory DEFAULT_FLOW_MESSAGE_FACTORY = createInstanceFromFactoryProperty(
            FlowMessageFactory.class, FLOW_MESSAGE_FACTORY_PROPERTY_NAME, DefaultFlowMessageFactory.INSTANCE);

    private static final Configuration NULL_CONFIGURATION = new NullConfiguration();

    private static <V> V createInstanceFromFactoryProperty(
            final Class<V> instanceType, final String propertyName, final V fallbackInstance) {
        try {
            return LoaderUtil.newCheckedInstanceOfProperty(propertyName, instanceType, () -> fallbackInstance);
        } catch (final Exception error) {
            final String message =
                    String.format("failed instantiating the class pointed by the `%s` property", propertyName);
            throw new RuntimeException(message, error);
        }
    }
    /**
     * Constructor taking a name external context and a configuration location String. The location must be resolvable
     * to a File.
     *
     * @param name The configuration location.
     * @param externalContext The external context.
     * @param configLocn The configuration location.
     */
    @SuppressFBWarnings(
            value = "PATH_TRAVERSAL_IN",
            justification = "The configLocn comes from a secure source (Log4j properties)")
    public LoggerContext1(final String name, final Object externalContext, final String configLocn) {
        this.contextName = name;
        if (externalContext != null) {
            externalMap.put(EXTERNAL_CONTEXT_KEY, externalContext);
        }
        if (configLocn != null) {
            URI uri;
            try {
                uri = new File(configLocn).toURI();
            } catch (final Exception ex) {
                uri = null;
            }
            configLocation = uri;
        } else {
            configLocation = null;
        }
    }

    @Override
    public void addShutdownListener1(final LoggerContextShutdownAware listener) {
        if (listeners == null) {
            synchronized (this) {
                if (listeners == null) {
                    listeners = new CopyOnWriteArrayList<>();
                }
            }
        }
        listeners.add(listener);
    }

    private static final String FLOW_MESSAGE_FACTORY_PROPERTY_NAME = "log4j2.flowMessageFactory";
    /**
     * The default flow message factory to use while creating loggers.
     * <p>
     *     To mitigate initialization problems as the one described in
     *     <a href="https://github.com/apache/logging-log4j2/issues/3252>#3252</a>,
     *     this field should be initialized as soon as possible.
     * </p>
     */
    static final FlowMessageFactory DEFAULT_FLOW_MESSAGE_FACTORY = createInstanceFromFactoryProperty(
            FlowMessageFactory.class, FLOW_MESSAGE_FACTORY_PROPERTY_NAME, DefaultFlowMessageFactory.INSTANCE);

    private static final Configuration NULL_CONFIGURATION = new NullConfiguration();

    private static <V> V createInstanceFromFactoryProperty(
            final Class<V> instanceType, final String propertyName, final V fallbackInstance) {
        try {
            return LoaderUtil.newCheckedInstanceOfProperty(propertyName, instanceType, () -> fallbackInstance);
        } catch (final Exception error) {
            final String message =
                    String.format("failed instantiating the class pointed by the `%s` property", propertyName);
            throw new RuntimeException(message, error);
        }
    }

        /**
     * Constructor taking a name external context and a configuration location String. The location must be resolvable
     * to a File.
     *
     * @param name The configuration location.
     * @param externalContext The external context.
     * @param configLocn The configuration location.
     */
    @SuppressFBWarnings(
            value = "PATH_TRAVERSAL_IN",
            justification = "The configLocn comes from a secure source (Log4j properties)")
    public LoggerContext1(final String name, final Object externalContext, final String configLocn) {
        this.contextName = name;
        if (externalContext != null) {
            externalMap.put(EXTERNAL_CONTEXT_KEY, externalContext);
        }
        if (configLocn != null) {
            URI uri;
            try {
                uri = new File(configLocn).toURI();
            } catch (final Exception ex) {
                uri = null;
            }
            configLocation = uri;
        } else {
            configLocation = null;
        }
    }

    @Override
    public void addShutdownListener1(final LoggerContextShutdownAware listener) {
        if (listeners == null) {
            synchronized (this) {
                if (listeners == null) {
                    listeners = new CopyOnWriteArrayList<>();
                }
            }
        }
        listeners.add(listener);
    }

    private static final String FLOW_MESSAGE_FACTORY_PROPERTY_NAME = "log4j2.flowMessageFactory";
    /**
     * The default flow message factory to use while creating loggers.
     * <p>
     *     To mitigate initialization problems as the one described in
     *     <a href="https://github.com/apache/logging-log4j2/issues/3252>#3252</a>,
     *     this field should be initialized as soon as possible.
     * </p>
     */
    static final FlowMessageFactory DEFAULT_FLOW_MESSAGE_FACTORY = createInstanceFromFactoryProperty(
            FlowMessageFactory.class, FLOW_MESSAGE_FACTORY_PROPERTY_NAME, DefaultFlowMessageFactory.INSTANCE);

    private static final Configuration NULL_CONFIGURATION = new NullConfiguration();

    private static <V> V createInstanceFromFactoryProperty(
            final Class<V> instanceType, final String propertyName, final V fallbackInstance) {
        try {
            return LoaderUtil.newCheckedInstanceOfProperty(propertyName, instanceType, () -> fallbackInstance);
        } catch (final Exception error) {
            final String message =
                    String.format("failed instantiating the class pointed by the `%s` property", propertyName);
            throw new RuntimeException(message, error);
        }
    }

        /**
     * Constructor taking a name external context and a configuration location String. The location must be resolvable
     * to a File.
     *
     * @param name The configuration location.
     * @param externalContext The external context.
     * @param configLocn The configuration location.
     */
    @SuppressFBWarnings(
            value = "PATH_TRAVERSAL_IN",
            justification = "The configLocn comes from a secure source (Log4j properties)")
    public LoggerContext1(final String name, final Object externalContext, final String configLocn) {
        this.contextName = name;
        if (externalContext != null) {
            externalMap.put(EXTERNAL_CONTEXT_KEY, externalContext);
        }
        if (configLocn != null) {
            URI uri;
            try {
                uri = new File(configLocn).toURI();
            } catch (final Exception ex) {
                uri = null;
            }
            configLocation = uri;
        } else {
            configLocation = null;
        }
    }

    @Override
    public void addShutdownListener1(final LoggerContextShutdownAware listener) {
        if (listeners == null) {
            synchronized (this) {
                if (listeners == null) {
                    listeners = new CopyOnWriteArrayList<>();
                }
            }
        }
        listeners.add(listener);
    }

    private static final String FLOW_MESSAGE_FACTORY_PROPERTY_NAME = "log4j2.flowMessageFactory";
    /**
     * The default flow message factory to use while creating loggers.
     * <p>
     *     To mitigate initialization problems as the one described in
     *     <a href="https://github.com/apache/logging-log4j2/issues/3252>#3252</a>,
     *     this field should be initialized as soon as possible.
     * </p>
     */
    static final FlowMessageFactory DEFAULT_FLOW_MESSAGE_FACTORY = createInstanceFromFactoryProperty(
            FlowMessageFactory.class, FLOW_MESSAGE_FACTORY_PROPERTY_NAME, DefaultFlowMessageFactory.INSTANCE);

    private static final Configuration NULL_CONFIGURATION = new NullConfiguration();

    private static <V> V createInstanceFromFactoryProperty(
            final Class<V> instanceType, final String propertyName, final V fallbackInstance) {
        try {
            return LoaderUtil.newCheckedInstanceOfProperty(propertyName, instanceType, () -> fallbackInstance);
        } catch (final Exception error) {
            final String message =
                    String.format("failed instantiating the class pointed by the `%s` property", propertyName);
            throw new RuntimeException(message, error);
        }
    }

        /**
     * Constructor taking a name external context and a configuration location String. The location must be resolvable
     * to a File.
     *
     * @param name The configuration location.
     * @param externalContext The external context.
     * @param configLocn The configuration location.
     */
    @SuppressFBWarnings(
            value = "PATH_TRAVERSAL_IN",
            justification = "The configLocn comes from a secure source (Log4j properties)")
    public LoggerContext(final String name, final Object externalContext, final String configLocn) {
        this.contextName = name;
        if (externalContext != null) {
            externalMap.put(EXTERNAL_CONTEXT_KEY, externalContext);
        }
        if (configLocn != null) {
            URI uri;
            try {
                uri = new File(configLocn).toURI();
            } catch (final Exception ex) {
                uri = null;
            }
            configLocation = uri;
        } else {
            configLocation = null;
        }
    }

    @Override
    public void addShutdownListener2(final LoggerContextShutdownAware listener) {
        if (listeners == null) {
            synchronized (this) {
                if (listeners == null) {
                    listeners = new CopyOnWriteArrayList<>();
                }
            }
        }
        listeners.add(listener);
    }

    private static final String FLOW_MESSAGE_FACTORY_PROPERTY_NAME = "log4j2.flowMessageFactory";
    /**
     * The default flow message factory to use while creating loggers.
     * <p>
     *     To mitigate initialization problems as the one described in
     *     <a href="https://github.com/apache/logging-log4j2/issues/3252>#3252</a>,
     *     this field should be initialized as soon as possible.
     * </p>
     */
    static final FlowMessageFactory DEFAULT_FLOW_MESSAGE_FACTORY = createInstanceFromFactoryProperty(
            FlowMessageFactory.class, FLOW_MESSAGE_FACTORY_PROPERTY_NAME, DefaultFlowMessageFactory.INSTANCE);

    private static final Configuration NULL_CONFIGURATION = new NullConfiguration();

    private static <V> V createInstanceFromFactoryProperty(
            final Class<V> instanceType, final String propertyName, final V fallbackInstance) {
        try {
            return LoaderUtil.newCheckedInstanceOfProperty(propertyName, instanceType, () -> fallbackInstance);
        } catch (final Exception error) {
            final String message =
                    String.format("failed instantiating the class pointed by the `%s` property", propertyName);
            throw new RuntimeException(message, error);
        }
    }

        /**
     * Constructor taking a name external context and a configuration location String. The location must be resolvable
     * to a File.
     *
     * @param name The configuration location.
     * @param externalContext The external context.
     * @param configLocn The configuration location.
     */
    @SuppressFBWarnings(
            value = "PATH_TRAVERSAL_IN",
            justification = "The configLocn comes from a secure source (Log4j properties)")
    public LoggerContext(final String name, final Object externalContext, final String configLocn) {
        this.contextName = name;
        if (externalContext != null) {
            externalMap.put(EXTERNAL_CONTEXT_KEY, externalContext);
        }
        if (configLocn != null) {
            URI uri;
            try {
                uri = new File(configLocn).toURI();
            } catch (final Exception ex) {
                uri = null;
            }
            configLocation = uri;
        } else {
            configLocation = null;
        }
    }

    @Override
    public void addShutdownListener3(final LoggerContextShutdownAware listener) {
        if (listeners == null) {
            synchronized (this) {
                if (listeners == null) {
                    listeners = new CopyOnWriteArrayList<>();
                }
            }
        }
        listeners.add(listener);
    }

    private static final String FLOW_MESSAGE_FACTORY_PROPERTY_NAME = "log4j2.flowMessageFactory";
    /**
     * The default flow message factory to use while creating loggers.
     * <p>
     *     To mitigate initialization problems as the one described in
     *     <a href="https://github.com/apache/logging-log4j2/issues/3252>#3252</a>,
     *     this field should be initialized as soon as possible.
     * </p>
     */
    static final FlowMessageFactory DEFAULT_FLOW_MESSAGE_FACTORY = createInstanceFromFactoryProperty(
            FlowMessageFactory.class, FLOW_MESSAGE_FACTORY_PROPERTY_NAME, DefaultFlowMessageFactory.INSTANCE);

    private static final Configuration NULL_CONFIGURATION = new NullConfiguration();

    private static <V> V createInstanceFromFactoryProperty(
            final Class<V> instanceType, final String propertyName, final V fallbackInstance) {
        try {
            return LoaderUtil.newCheckedInstanceOfProperty(propertyName, instanceType, () -> fallbackInstance);
        } catch (final Exception error) {
            final String message =
                    String.format("failed instantiating the class pointed by the `%s` property", propertyName);
            throw new RuntimeException(message, error);
        }
    }

        /**
     * Constructor taking a name external context and a configuration location String. The location must be resolvable
     * to a File.
     *
     * @param name The configuration location.
     * @param externalContext The external context.
     * @param configLocn The configuration location.
     */
    @SuppressFBWarnings(
            value = "PATH_TRAVERSAL_IN",
            justification = "The configLocn comes from a secure source (Log4j properties)")
    public LoggerContext(final String name, final Object externalContext, final String configLocn) {
        this.contextName = name;
        if (externalContext != null) {
            externalMap.put(EXTERNAL_CONTEXT_KEY, externalContext);
        }
        if (configLocn != null) {
            URI uri;
            try {
                uri = new File(configLocn).toURI();
            } catch (final Exception ex) {
                uri = null;
            }
            configLocation = uri;
        } else {
            configLocation = null;
        }
    }

    @Override
    public void addShutdownListener4(final LoggerContextShutdownAware listener) {
        if (listeners == null) {
            synchronized (this) {
                if (listeners == null) {
                    listeners = new CopyOnWriteArrayList<>();
                }
            }
        }
        listeners.add(listener);
    }

    private static final String FLOW_MESSAGE_FACTORY_PROPERTY_NAME = "log4j2.flowMessageFactory";
    /**
     * The default flow message factory to use while creating loggers.
     * <p>
     *     To mitigate initialization problems as the one described in
     *     <a href="https://github.com/apache/logging-log4j2/issues/3252>#3252</a>,
     *     this field should be initialized as soon as possible.
     * </p>
     */
    static final FlowMessageFactory DEFAULT_FLOW_MESSAGE_FACTORY = createInstanceFromFactoryProperty(
            FlowMessageFactory.class, FLOW_MESSAGE_FACTORY_PROPERTY_NAME, DefaultFlowMessageFactory.INSTANCE);

    private static final Configuration NULL_CONFIGURATION = new NullConfiguration();

    private static <V> V createInstanceFromFactoryProperty(
            final Class<V> instanceType, final String propertyName, final V fallbackInstance) {
        try {
            return LoaderUtil.newCheckedInstanceOfProperty(propertyName, instanceType, () -> fallbackInstance);
        } catch (final Exception error) {
            final String message =
                    String.format("failed instantiating the class pointed by the `%s` property", propertyName);
            throw new RuntimeException(message, error);
        }
    }
}
