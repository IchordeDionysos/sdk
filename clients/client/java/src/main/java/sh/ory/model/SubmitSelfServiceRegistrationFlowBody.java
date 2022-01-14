/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.45
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import sh.ory.model.SubmitSelfServiceRegistrationFlowWithOidcMethodBody;
import sh.ory.model.SubmitSelfServiceRegistrationFlowWithPasswordMethodBody;

/**
 * SubmitSelfServiceRegistrationFlowBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T15:07:22.446521956Z[Etc/UTC]")
public class SubmitSelfServiceRegistrationFlowBody {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  protected String method;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public SubmitSelfServiceRegistrationFlowBody() {
    this.method = this.getClass().getSimpleName();
  }

  public SubmitSelfServiceRegistrationFlowBody csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * The CSRF Token
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The CSRF Token")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public SubmitSelfServiceRegistrationFlowBody method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method to use  This field must be set to &#x60;oidc&#x60; when using the oidc method.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method to use  This field must be set to `oidc` when using the oidc method.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public SubmitSelfServiceRegistrationFlowBody password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password to sign the user up with
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Password to sign the user up with")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public SubmitSelfServiceRegistrationFlowBody traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * The identity traits
   * @return traits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identity traits")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public SubmitSelfServiceRegistrationFlowBody provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * The provider to register with
   * @return provider
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The provider to register with")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceRegistrationFlowBody submitSelfServiceRegistrationFlowBody = (SubmitSelfServiceRegistrationFlowBody) o;
    return Objects.equals(this.csrfToken, submitSelfServiceRegistrationFlowBody.csrfToken) &&
        Objects.equals(this.method, submitSelfServiceRegistrationFlowBody.method) &&
        Objects.equals(this.password, submitSelfServiceRegistrationFlowBody.password) &&
        Objects.equals(this.traits, submitSelfServiceRegistrationFlowBody.traits) &&
        Objects.equals(this.provider, submitSelfServiceRegistrationFlowBody.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, method, password, traits, provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceRegistrationFlowBody {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
