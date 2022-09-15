/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.47
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * AdminCreateIdentityImportCredentialsOidcProvider
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-15T10:52:22.064462360Z[Etc/UTC]")
public class AdminCreateIdentityImportCredentialsOidcProvider {
  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public AdminCreateIdentityImportCredentialsOidcProvider() { 
  }

  public AdminCreateIdentityImportCredentialsOidcProvider provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * The OpenID Connect provider to link the subject to. Usually something like &#x60;google&#x60; or &#x60;github&#x60;.
   * @return provider
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The OpenID Connect provider to link the subject to. Usually something like `google` or `github`.")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public AdminCreateIdentityImportCredentialsOidcProvider subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The subject (&#x60;sub&#x60;) of the OpenID Connect connection. Usually the &#x60;sub&#x60; field of the ID Token.
   * @return subject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The subject (`sub`) of the OpenID Connect connection. Usually the `sub` field of the ID Token.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminCreateIdentityImportCredentialsOidcProvider adminCreateIdentityImportCredentialsOidcProvider = (AdminCreateIdentityImportCredentialsOidcProvider) o;
    return Objects.equals(this.provider, adminCreateIdentityImportCredentialsOidcProvider.provider) &&
        Objects.equals(this.subject, adminCreateIdentityImportCredentialsOidcProvider.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCreateIdentityImportCredentialsOidcProvider {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("provider");
    openapiFields.add("subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("provider");
    openapiRequiredFields.add("subject");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdminCreateIdentityImportCredentialsOidcProvider
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdminCreateIdentityImportCredentialsOidcProvider.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdminCreateIdentityImportCredentialsOidcProvider is not found in the empty JSON string", AdminCreateIdentityImportCredentialsOidcProvider.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdminCreateIdentityImportCredentialsOidcProvider.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdminCreateIdentityImportCredentialsOidcProvider` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdminCreateIdentityImportCredentialsOidcProvider.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("provider") != null && !jsonObj.get("provider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider").toString()));
      }
      if (jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdminCreateIdentityImportCredentialsOidcProvider.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdminCreateIdentityImportCredentialsOidcProvider' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdminCreateIdentityImportCredentialsOidcProvider> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdminCreateIdentityImportCredentialsOidcProvider.class));

       return (TypeAdapter<T>) new TypeAdapter<AdminCreateIdentityImportCredentialsOidcProvider>() {
           @Override
           public void write(JsonWriter out, AdminCreateIdentityImportCredentialsOidcProvider value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdminCreateIdentityImportCredentialsOidcProvider read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdminCreateIdentityImportCredentialsOidcProvider given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdminCreateIdentityImportCredentialsOidcProvider
  * @throws IOException if the JSON string is invalid with respect to AdminCreateIdentityImportCredentialsOidcProvider
  */
  public static AdminCreateIdentityImportCredentialsOidcProvider fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdminCreateIdentityImportCredentialsOidcProvider.class);
  }

 /**
  * Convert an instance of AdminCreateIdentityImportCredentialsOidcProvider to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

