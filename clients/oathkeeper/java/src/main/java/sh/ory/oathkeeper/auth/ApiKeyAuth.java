/*
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.48
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.oathkeeper.auth;

import sh.ory.oathkeeper.Pair;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-24T07:59:30.898598164Z[GMT]")
public class ApiKeyAuth implements Authentication {
  private final String location;
  private final String paramName;

  private String apiKey;
  private String apiKeyPrefix;

  public ApiKeyAuth(String location, String paramName) {
    this.location = location;
    this.paramName = paramName;
  }

  public String getLocation() {
    return location;
  }

  public String getParamName() {
    return paramName;
  }

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public String getApiKeyPrefix() {
    return apiKeyPrefix;
  }

  public void setApiKeyPrefix(String apiKeyPrefix) {
    this.apiKeyPrefix = apiKeyPrefix;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams) {
    if (apiKey == null) {
      return;
    }
    String value;
    if (apiKeyPrefix != null) {
      value = apiKeyPrefix + " " + apiKey;
    } else {
      value = apiKey;
    }
    if ("query".equals(location)) {
      queryParams.add(new Pair(paramName, value));
    } else if ("header".equals(location)) {
      headerParams.put(paramName, value);
    } else if ("cookie".equals(location)) {
      cookieParams.put(paramName, value);
    }
  }
}
