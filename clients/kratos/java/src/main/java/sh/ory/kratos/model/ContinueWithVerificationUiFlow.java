/*
 * Ory Identities API
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.13.1
 * Contact: office@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.kratos.JSON;

/**
 * ContinueWithVerificationUiFlow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-29T16:30:11.172323687Z[Etc/UTC]")
public class ContinueWithVerificationUiFlow {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_VERIFIABLE_ADDRESS = "verifiable_address";
  @SerializedName(SERIALIZED_NAME_VERIFIABLE_ADDRESS)
  private String verifiableAddress;

  public ContinueWithVerificationUiFlow() {
  }

  public ContinueWithVerificationUiFlow id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the verification flow
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the verification flow")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ContinueWithVerificationUiFlow url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL of the verification flow
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the verification flow")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ContinueWithVerificationUiFlow verifiableAddress(String verifiableAddress) {
    
    this.verifiableAddress = verifiableAddress;
    return this;
  }

   /**
   * The address that should be verified in this flow
   * @return verifiableAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The address that should be verified in this flow")

  public String getVerifiableAddress() {
    return verifiableAddress;
  }


  public void setVerifiableAddress(String verifiableAddress) {
    this.verifiableAddress = verifiableAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContinueWithVerificationUiFlow continueWithVerificationUiFlow = (ContinueWithVerificationUiFlow) o;
    return Objects.equals(this.id, continueWithVerificationUiFlow.id) &&
        Objects.equals(this.url, continueWithVerificationUiFlow.url) &&
        Objects.equals(this.verifiableAddress, continueWithVerificationUiFlow.verifiableAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, verifiableAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContinueWithVerificationUiFlow {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    verifiableAddress: ").append(toIndentedString(verifiableAddress)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("url");
    openapiFields.add("verifiable_address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("verifiable_address");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContinueWithVerificationUiFlow
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContinueWithVerificationUiFlow.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContinueWithVerificationUiFlow is not found in the empty JSON string", ContinueWithVerificationUiFlow.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContinueWithVerificationUiFlow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContinueWithVerificationUiFlow` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContinueWithVerificationUiFlow.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("verifiable_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verifiable_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verifiable_address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContinueWithVerificationUiFlow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContinueWithVerificationUiFlow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContinueWithVerificationUiFlow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContinueWithVerificationUiFlow.class));

       return (TypeAdapter<T>) new TypeAdapter<ContinueWithVerificationUiFlow>() {
           @Override
           public void write(JsonWriter out, ContinueWithVerificationUiFlow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContinueWithVerificationUiFlow read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContinueWithVerificationUiFlow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContinueWithVerificationUiFlow
  * @throws IOException if the JSON string is invalid with respect to ContinueWithVerificationUiFlow
  */
  public static ContinueWithVerificationUiFlow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContinueWithVerificationUiFlow.class);
  }

 /**
  * Convert an instance of ContinueWithVerificationUiFlow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
