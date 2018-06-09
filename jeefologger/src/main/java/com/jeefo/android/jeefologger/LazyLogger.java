/*
 * Copyright 2018 Alexandru Iustin Dochioiu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.jeefo.android.jeefologger;

/**
 * Created by Alexandru Iustin Dochioiu on 6/9/2018
 *
 * Static class used for accessing the power of the {@link LazyLoggerInternal}
 * NOTE: In order to use those static methods, you NEED to initialize the lazy logger beforehand
 *  --JeefoLogger.initLazyLogger(Context)--
 */
public class LazyLogger {
    private static final ILog lazyLoggerImplementation = new LazyLoggerInternal();

    /**
     * @param messageToLog the message to be logged
     * @param args         arguments for messageToLog
     * @throws ExceptionInInitializerError if this method is called before JeefoLogger.initLazyLogger(Context)
     */
    public static void Debug(String messageToLog, Object... args) {
        lazyLoggerImplementation.Debug(messageToLog, args);
    }

    /**
     * @param exception    the exception to be logged
     * @param messageToLog the message to be logged
     * @param args         arguments for messageToLog
     * @throws ExceptionInInitializerError if this method is called before JeefoLogger.initLazyLogger(Context)
     */
    public static void Debug(Exception exception, String messageToLog, Object... args) {
        lazyLoggerImplementation.Debug(exception, messageToLog, args);
    }

    /**
     * @param messageToLog the message to be logged
     * @param args         arguments for messageToLog
     * @throws ExceptionInInitializerError if this method is called before JeefoLogger.initLazyLogger(Context)
     */
    public static void Info(String messageToLog, Object... args) {
        lazyLoggerImplementation.Info(messageToLog, args);
    }

    /**
     * @param messageToLog the message to be logged
     * @param args         arguments for messageToLog
     * @throws ExceptionInInitializerError if this method is called before JeefoLogger.initLazyLogger(Context)
     */
    public static void Warn(String messageToLog, Object... args) {
        lazyLoggerImplementation.Warn(messageToLog, args);
    }

    /**
     * @param exception    the exception to be logged
     * @param messageToLog the message to be logged
     * @param args         arguments for messageToLog
     * @throws ExceptionInInitializerError if this method is called before JeefoLogger.initLazyLogger(Context)
     */
    public static void Warn(Exception exception, String messageToLog, Object... args) {
        lazyLoggerImplementation.Warn(exception, messageToLog, args);
    }

    /**
     * @param messageToLog the message to be logged
     * @param args         arguments for messageToLog
     * @throws ExceptionInInitializerError if this method is called before JeefoLogger.initLazyLogger(Context)
     */
    public static void Error(String messageToLog, Object... args) {
        lazyLoggerImplementation.Error(messageToLog, args);
    }

    /**
     * @param exception    the exception to be logged
     * @param messageToLog the message to be logged
     * @param args         arguments for messageToLog
     * @throws ExceptionInInitializerError if this method is called before JeefoLogger.initLazyLogger(Context)
     */
    public static void Error(Exception exception, String messageToLog, Object... args) {
        lazyLoggerImplementation.Error(exception, messageToLog, args);
    }

    /**
     * @param exception the exception to be logged
     * @throws ExceptionInInitializerError if this method is called before JeefoLogger.initLazyLogger(Context)
     */
    public static void Error(Exception exception) {
        lazyLoggerImplementation.Error(exception);
    }

    /**
     * Private Constructor to avoid initialization
     */
    private LazyLogger() {
    }
}
