package com.farhank501.demo.di.scopes

import javax.inject.Scope

/**
 * Scope used in the ApplicationModule, classes annotated with this scope will live for the lifetime
 * of the application class
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationScoped