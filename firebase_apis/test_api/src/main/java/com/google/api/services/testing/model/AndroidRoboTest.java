/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.testing.model;

/**
 * A test of an android application that explores the application on a virtual or physical Android
 * Device, finding culprits and crashes as it goes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidRoboTest extends com.google.api.client.json.GenericJson {

  /**
   * The APK for the application under test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FileReference appApk;

  /**
   * The initial activity that should be used to start the app. Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appInitialActivity;

  /**
   * The java package for the application under test. Optional, default is determined by examining
   * the application's manifest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appPackageId;

  /**
   * The max depth of the traversal stack Robo can explore. Needs to be at least 2 to make Robo
   * explore the app beyond the first activity. Default is 50. Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxDepth;

  /**
   * The max number of steps Robo can execute. Default is no limit. Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxSteps;

  /**
   * A set of directives Robo should apply during the crawl. This allows users to customize the
   * crawl. For example, the username and password for a test account can be provided. Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RoboDirective> roboDirectives;

  /**
   * A JSON file with a sequence of actions Robo should perform as a prologue for the crawl.
   * Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FileReference roboScript;

  /**
   * The intents used to launch the app for the crawl. If none are provided, then the main launcher
   * activity is launched. If some are provided, then only those provided are launched (the main
   * launcher activity must be provided explicitly).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RoboStartingIntent> startingIntents;

  /**
   * The APK for the application under test.
   * @return value or {@code null} for none
   */
  public FileReference getAppApk() {
    return appApk;
  }

  /**
   * The APK for the application under test.
   * @param appApk appApk or {@code null} for none
   */
  public AndroidRoboTest setAppApk(FileReference appApk) {
    this.appApk = appApk;
    return this;
  }

  /**
   * The initial activity that should be used to start the app. Optional
   * @return value or {@code null} for none
   */
  public java.lang.String getAppInitialActivity() {
    return appInitialActivity;
  }

  /**
   * The initial activity that should be used to start the app. Optional
   * @param appInitialActivity appInitialActivity or {@code null} for none
   */
  public AndroidRoboTest setAppInitialActivity(java.lang.String appInitialActivity) {
    this.appInitialActivity = appInitialActivity;
    return this;
  }

  /**
   * The java package for the application under test. Optional, default is determined by examining
   * the application's manifest.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppPackageId() {
    return appPackageId;
  }

  /**
   * The java package for the application under test. Optional, default is determined by examining
   * the application's manifest.
   * @param appPackageId appPackageId or {@code null} for none
   */
  public AndroidRoboTest setAppPackageId(java.lang.String appPackageId) {
    this.appPackageId = appPackageId;
    return this;
  }

  /**
   * The max depth of the traversal stack Robo can explore. Needs to be at least 2 to make Robo
   * explore the app beyond the first activity. Default is 50. Optional
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxDepth() {
    return maxDepth;
  }

  /**
   * The max depth of the traversal stack Robo can explore. Needs to be at least 2 to make Robo
   * explore the app beyond the first activity. Default is 50. Optional
   * @param maxDepth maxDepth or {@code null} for none
   */
  public AndroidRoboTest setMaxDepth(java.lang.Integer maxDepth) {
    this.maxDepth = maxDepth;
    return this;
  }

  /**
   * The max number of steps Robo can execute. Default is no limit. Optional
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxSteps() {
    return maxSteps;
  }

  /**
   * The max number of steps Robo can execute. Default is no limit. Optional
   * @param maxSteps maxSteps or {@code null} for none
   */
  public AndroidRoboTest setMaxSteps(java.lang.Integer maxSteps) {
    this.maxSteps = maxSteps;
    return this;
  }

  /**
   * A set of directives Robo should apply during the crawl. This allows users to customize the
   * crawl. For example, the username and password for a test account can be provided. Optional
   * @return value or {@code null} for none
   */
  public java.util.List<RoboDirective> getRoboDirectives() {
    return roboDirectives;
  }

  /**
   * A set of directives Robo should apply during the crawl. This allows users to customize the
   * crawl. For example, the username and password for a test account can be provided. Optional
   * @param roboDirectives roboDirectives or {@code null} for none
   */
  public AndroidRoboTest setRoboDirectives(java.util.List<RoboDirective> roboDirectives) {
    this.roboDirectives = roboDirectives;
    return this;
  }

  /**
   * A JSON file with a sequence of actions Robo should perform as a prologue for the crawl.
   * Optional
   * @return value or {@code null} for none
   */
  public FileReference getRoboScript() {
    return roboScript;
  }

  /**
   * A JSON file with a sequence of actions Robo should perform as a prologue for the crawl.
   * Optional
   * @param roboScript roboScript or {@code null} for none
   */
  public AndroidRoboTest setRoboScript(FileReference roboScript) {
    this.roboScript = roboScript;
    return this;
  }

  /**
   * The intents used to launch the app for the crawl. If none are provided, then the main launcher
   * activity is launched. If some are provided, then only those provided are launched (the main
   * launcher activity must be provided explicitly).
   * @return value or {@code null} for none
   */
  public java.util.List<RoboStartingIntent> getStartingIntents() {
    return startingIntents;
  }

  /**
   * The intents used to launch the app for the crawl. If none are provided, then the main launcher
   * activity is launched. If some are provided, then only those provided are launched (the main
   * launcher activity must be provided explicitly).
   * @param startingIntents startingIntents or {@code null} for none
   */
  public AndroidRoboTest setStartingIntents(java.util.List<RoboStartingIntent> startingIntents) {
    this.startingIntents = startingIntents;
    return this;
  }

  @Override
  public AndroidRoboTest set(String fieldName, Object value) {
    return (AndroidRoboTest) super.set(fieldName, value);
  }

  @Override
  public AndroidRoboTest clone() {
    return (AndroidRoboTest) super.clone();
  }

}
