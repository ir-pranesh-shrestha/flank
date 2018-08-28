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
 * A single iOS device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IosDevice extends com.google.api.client.json.GenericJson {

  /**
   * The id of the iOS device to be used. Use the EnvironmentDiscoveryService to get supported
   * options. Required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iosModelId;

  /**
   * The id of the iOS major software version to be used. Use the EnvironmentDiscoveryService to get
   * supported options. Required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iosVersionId;

  /**
   * The locale the test device used for testing (only "en" is currently supported). Use the
   * EnvironmentDiscoveryService to get supported options (not yet implemented). Required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locale;

  /**
   * How the device is oriented during the test (only "portrait" is currently supported). Use the
   * EnvironmentDiscoveryService to get supported options. (not yet implemented). Required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orientation;

  /**
   * The id of the iOS device to be used. Use the EnvironmentDiscoveryService to get supported
   * options. Required
   * @return value or {@code null} for none
   */
  public java.lang.String getIosModelId() {
    return iosModelId;
  }

  /**
   * The id of the iOS device to be used. Use the EnvironmentDiscoveryService to get supported
   * options. Required
   * @param iosModelId iosModelId or {@code null} for none
   */
  public IosDevice setIosModelId(java.lang.String iosModelId) {
    this.iosModelId = iosModelId;
    return this;
  }

  /**
   * The id of the iOS major software version to be used. Use the EnvironmentDiscoveryService to get
   * supported options. Required
   * @return value or {@code null} for none
   */
  public java.lang.String getIosVersionId() {
    return iosVersionId;
  }

  /**
   * The id of the iOS major software version to be used. Use the EnvironmentDiscoveryService to get
   * supported options. Required
   * @param iosVersionId iosVersionId or {@code null} for none
   */
  public IosDevice setIosVersionId(java.lang.String iosVersionId) {
    this.iosVersionId = iosVersionId;
    return this;
  }

  /**
   * The locale the test device used for testing (only "en" is currently supported). Use the
   * EnvironmentDiscoveryService to get supported options (not yet implemented). Required
   * @return value or {@code null} for none
   */
  public java.lang.String getLocale() {
    return locale;
  }

  /**
   * The locale the test device used for testing (only "en" is currently supported). Use the
   * EnvironmentDiscoveryService to get supported options (not yet implemented). Required
   * @param locale locale or {@code null} for none
   */
  public IosDevice setLocale(java.lang.String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * How the device is oriented during the test (only "portrait" is currently supported). Use the
   * EnvironmentDiscoveryService to get supported options. (not yet implemented). Required
   * @return value or {@code null} for none
   */
  public java.lang.String getOrientation() {
    return orientation;
  }

  /**
   * How the device is oriented during the test (only "portrait" is currently supported). Use the
   * EnvironmentDiscoveryService to get supported options. (not yet implemented). Required
   * @param orientation orientation or {@code null} for none
   */
  public IosDevice setOrientation(java.lang.String orientation) {
    this.orientation = orientation;
    return this;
  }

  @Override
  public IosDevice set(String fieldName, Object value) {
    return (IosDevice) super.set(fieldName, value);
  }

  @Override
  public IosDevice clone() {
    return (IosDevice) super.clone();
  }

}
